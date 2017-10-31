package com.tencent.mm.plugin.appbrand.media;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.g.a.kx;
import com.tencent.mm.g.a.kx.a;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.media.encode.c.a;
import com.tencent.mm.plugin.appbrand.media.record.RecordParam;
import com.tencent.mm.plugin.appbrand.media.record.a.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;

public final class d
{
  private aj jgX;
  public com.tencent.mm.plugin.appbrand.media.record.a jhj;
  public boolean jhk;
  public Object jhl;
  public RecordParam jhm;
  public int jhn;
  public com.tencent.mm.plugin.appbrand.media.encode.c jho;
  public boolean jhp;
  public int jhq;
  public long jhr;
  private int jhs;
  private ae jht;
  private a.a jhu;
  private c.a jhv;
  private long mDuration;
  private String mFilePath;
  private long mStartTime;
  
  public d()
  {
    GMTrace.i(19858318163968L, 147956);
    this.jhj = null;
    this.jhk = false;
    this.jhl = new Object();
    this.jhn = a.jhx;
    this.jho = null;
    this.jhp = false;
    this.jhq = 0;
    this.jgX = null;
    this.mDuration = 0L;
    this.jhr = 0L;
    this.jhs = 0;
    this.mStartTime = 0L;
    this.jhu = new a.a()
    {
      public final void aw(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(19847446528000L, 147875);
        w.i("MicroMsg.AudioRecordMgr", "onRecError state:%d, detailState:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        d.this.onError(1);
        GMTrace.o(19847446528000L, 147875);
      }
      
      public final void d(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        GMTrace.i(19847312310272L, 147874);
        if ((d.this.jho != null) && (d.this.jhj != null))
        {
          d locald = d.this;
          int j = d.this.jhq;
          com.tencent.mm.plugin.appbrand.media.record.a locala = d.this.jhj;
          if (locala.fqh != null) {}
          for (int i = locala.fqh.fqA;; i = 20)
          {
            locald.jhq = (i + j);
            try
            {
              if (!d.this.jho.a(d.this.jhp, paramAnonymousArrayOfByte, paramAnonymousInt)) {
                w.e("MicroMsg.AudioRecordMgr", "encode pcm fail!");
              }
              GMTrace.o(19847312310272L, 147874);
              return;
            }
            catch (Exception paramAnonymousArrayOfByte)
            {
              w.printErrStackTrace("MicroMsg.AudioRecordMgr", paramAnonymousArrayOfByte, "onRecPcmDataReady", new Object[0]);
              if ((d.this.jhm == null) || (!"mp3".equalsIgnoreCase(d.this.jhm.iSt))) {
                break;
              }
              g.iT(19);
              GMTrace.o(19847312310272L, 147874);
              return;
              if ((d.this.jhm == null) || (!"aac".equalsIgnoreCase(d.this.jhm.iSt))) {
                break label212;
              }
              g.iT(23);
            }
          }
        }
        label212:
        GMTrace.o(19847312310272L, 147874);
      }
    };
    this.jhv = new c.a()
    {
      public final void a(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        GMTrace.i(19846909657088L, 147871);
        w.i("MicroMsg.AudioRecordMgr", "onFrameRecorded  buffSize:%d, isLastFrameL:%b", new Object[] { Integer.valueOf(paramAnonymousInt), Boolean.valueOf(paramAnonymousBoolean) });
        kx localkx = new kx();
        localkx.fIs.state = "frameRecorded";
        localkx.fIs.action = 5;
        byte[] arrayOfByte = new byte[paramAnonymousInt];
        System.arraycopy(paramAnonymousArrayOfByte, 0, arrayOfByte, 0, paramAnonymousInt);
        localkx.fIs.fIt = arrayOfByte;
        localkx.fIs.fIu = paramAnonymousBoolean;
        com.tencent.mm.sdk.b.a.uLm.a(localkx, Looper.getMainLooper());
        GMTrace.o(19846909657088L, 147871);
      }
    };
    GMTrace.o(19858318163968L, 147956);
  }
  
  private boolean Yp()
  {
    GMTrace.i(19858720817152L, 147959);
    w.i("MicroMsg.AudioRecordMgr", "startRecordInternal");
    if (this.jhj != null)
    {
      this.jhj.qr();
      this.jhj = null;
      w.i("MicroMsg.AudioRecordMgr", "mRecorder is not null, stop it, and not callback stop event");
    }
    if (this.jhj == null)
    {
      this.jhj = new com.tencent.mm.plugin.appbrand.media.record.a(this.jhm);
      this.jhj.jhT = this.jhu;
    }
    com.tencent.mm.plugin.appbrand.media.record.a locala = this.jhj;
    w.i("MicroMsg.AppBrandRecorder", "startRecord");
    if (locala.fqh != null)
    {
      locala.fqh.qr();
      locala.fqh = null;
    }
    locala.jhS = System.currentTimeMillis();
    w.i("MicroMsg.AppBrandRecorder", "start time ticket:%d", new Object[] { Long.valueOf(locala.jhS) });
    locala.fqh = new com.tencent.mm.e.b.c(locala.sampleRate, locala.jhR, locala.fqE);
    if ("mp3".equalsIgnoreCase(locala.jhQ.iSt))
    {
      locala.fqh.de(40);
      locala.fqh.aA(false);
      locala.fqh.fqQ = locala.jhU;
      if (!locala.fqh.qA()) {
        break label253;
      }
    }
    label253:
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.AudioRecordMgr", "record start:%b", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(19858720817152L, 147959);
      return bool;
      locala.fqh.de(20);
      break;
    }
  }
  
  private boolean Yr()
  {
    GMTrace.i(19858989252608L, 147961);
    w.i("MicroMsg.AudioRecordMgr", "initEncode");
    if (this.jho != null)
    {
      this.jho.close();
      this.jho = null;
    }
    Object localObject1 = this.jhm.iSt;
    Object localObject2 = this.jhm.gKm;
    File localFile = new File(h.xz().gRr, "audio");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    localObject2 = new StringBuilder("audio").append(aa.QW((String)localObject2));
    if (!TextUtils.isEmpty((CharSequence)localObject1)) {
      if ("aac".equalsIgnoreCase((String)localObject1))
      {
        localObject1 = ".m4a";
        localObject1 = (String)localObject1;
        localFile = new File(localFile, (String)localObject1);
        w.d("MicroMsg.AudioRecordUtil", "getAudioFilePath audio name %s path %s", new Object[] { localObject1, localFile.getAbsoluteFile() });
        this.mFilePath = localFile.getAbsolutePath();
        w.i("MicroMsg.AudioRecordMgr", "mFilePath:%s", new Object[] { this.mFilePath });
        localObject1 = this.jhm.iSt;
        w.i("MicroMsg.AudioEncodeFactory", "createEncodeByType:%s", new Object[] { localObject1 });
        if (!e.qS((String)localObject1)) {
          break label365;
        }
        if (!"aac".equalsIgnoreCase((String)localObject1)) {
          break label324;
        }
        localObject1 = new com.tencent.mm.plugin.appbrand.media.encode.a();
      }
    }
    boolean bool;
    for (;;)
    {
      this.jho = ((com.tencent.mm.plugin.appbrand.media.encode.c)localObject1);
      if (this.jho == null) {
        break label447;
      }
      bool = e.qT(this.mFilePath);
      if (bool) {
        break label370;
      }
      w.e("MicroMsg.AudioRecordMgr", "prepare cache file fail");
      GMTrace.o(19858989252608L, 147961);
      return bool;
      if ("mp3".equalsIgnoreCase((String)localObject1))
      {
        localObject1 = ".mp3";
        break;
      }
      if ("wav".equalsIgnoreCase((String)localObject1))
      {
        localObject1 = ".wav";
        break;
      }
      localObject1 = "";
      break;
      label324:
      if ("mp3".equalsIgnoreCase((String)localObject1)) {
        localObject1 = new com.tencent.mm.plugin.appbrand.media.encode.d();
      } else if ("wav".equalsIgnoreCase((String)localObject1)) {
        localObject1 = new com.tencent.mm.plugin.appbrand.media.encode.e();
      } else {
        label365:
        localObject1 = null;
      }
    }
    try
    {
      label370:
      bool = this.jho.e(this.mFilePath, this.jhm.sampleRate, this.jhm.jhW, this.jhm.jhX);
      this.jho.a(this.jhv);
      GMTrace.o(19858989252608L, 147961);
      return bool;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.AudioRecordMgr", localException, "init encoder fail", new Object[0]);
        bool = false;
      }
    }
    label447:
    GMTrace.o(19858989252608L, 147961);
    return false;
  }
  
  private ae Yv()
  {
    GMTrace.i(19859526123520L, 147965);
    if (this.jht == null) {
      this.jht = new ae(Looper.getMainLooper());
    }
    ae localae = this.jht;
    GMTrace.o(19859526123520L, 147965);
    return localae;
  }
  
  public final void MM()
  {
    GMTrace.i(19858049728512L, 147954);
    w.i("MicroMsg.AudioRecordMgr", "stopTimer");
    if (this.jgX != null) {
      this.jgX.MM();
    }
    this.jgX = null;
    GMTrace.o(19858049728512L, 147954);
  }
  
  public final void Yq()
  {
    GMTrace.i(19858855034880L, 147960);
    for (;;)
    {
      try
      {
        w.i("MicroMsg.AudioRecordMgr", "_start in runnable");
        if (!Yr())
        {
          onError(2);
          w.e("MicroMsg.AudioRecordMgr", "init encoder fail");
          GMTrace.o(19858855034880L, 147960);
          return;
        }
        this.jhp = false;
        this.jhq = 0;
        if (!Yp()) {
          break;
        }
        Object localObject = this.jho;
        com.tencent.mm.plugin.appbrand.media.record.a locala = this.jhj;
        if (locala.fqh != null)
        {
          i = locala.fqh.qz();
          ((com.tencent.mm.plugin.appbrand.media.encode.c)localObject).iU(i);
          this.jho.iV(this.jhm.jhY);
          this.jhs = 0;
          this.mDuration = this.jhm.duration;
          this.mStartTime = System.currentTimeMillis();
          this.jhr = this.mDuration;
          w.i("MicroMsg.AudioRecordMgr", "mDuration:%d, mCurrentTime:%d", new Object[] { Long.valueOf(this.mDuration), Long.valueOf(this.mStartTime) });
          Yv().post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19853486325760L, 147920);
              d.this.aM(d.this.jhr);
              GMTrace.o(19853486325760L, 147920);
            }
          });
          w.i("MicroMsg.AudioRecordMgr", "onStart");
          this.jhn = a.jhy;
          this.jhk = true;
          localObject = new kx();
          ((kx)localObject).fIs.action = 0;
          ((kx)localObject).fIs.state = "start";
          com.tencent.mm.sdk.b.a.uLm.a((b)localObject, Looper.getMainLooper());
          w.i("MicroMsg.AudioRecordMgr", "start record success");
          GMTrace.o(19858855034880L, 147960);
          return;
        }
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.AudioRecordMgr", localException, "_start", new Object[0]);
        onError(4);
        GMTrace.o(19858855034880L, 147960);
        return;
      }
      int i = 0;
    }
    onError(6);
    w.e("MicroMsg.AudioRecordMgr", "start record fail");
    GMTrace.o(19858855034880L, 147960);
  }
  
  public final void Ys()
  {
    GMTrace.i(19859123470336L, 147962);
    try
    {
      w.i("MicroMsg.AudioRecordMgr", "_resume in runnable");
      if (this.jho == null)
      {
        onError(3);
        w.e("MicroMsg.AudioRecordMgr", "resume record fail");
        GMTrace.o(19859123470336L, 147962);
        return;
      }
      if (this.jhr <= 0L)
      {
        Yu();
        w.e("MicroMsg.AudioRecordMgr", "resume record fail, record time reach max time, to stop record");
        GMTrace.o(19859123470336L, 147962);
        return;
      }
      if (Yp())
      {
        this.mStartTime = System.currentTimeMillis();
        w.i("MicroMsg.AudioRecordMgr", "mLimitTime:%d, currentTime:%d", new Object[] { Long.valueOf(this.jhr), Long.valueOf(this.mStartTime) });
        Yv().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19853217890304L, 147918);
            d.this.aM(d.this.jhr);
            GMTrace.o(19853217890304L, 147918);
          }
        });
        w.i("MicroMsg.AudioRecordMgr", "onResume");
        this.jhn = a.jhz;
        this.jhk = true;
        kx localkx = new kx();
        localkx.fIs.action = 1;
        localkx.fIs.state = "resume";
        com.tencent.mm.sdk.b.a.uLm.a(localkx, Looper.getMainLooper());
        w.i("MicroMsg.AudioRecordMgr", "resume record success");
        GMTrace.o(19859123470336L, 147962);
        return;
      }
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.AudioRecordMgr", localException, "_resume", new Object[0]);
      onError(5);
      GMTrace.o(19859123470336L, 147962);
      return;
    }
    onError(7);
    w.e("MicroMsg.AudioRecordMgr", "resume record fail");
    GMTrace.o(19859123470336L, 147962);
  }
  
  final void Yt()
  {
    GMTrace.i(19859257688064L, 147963);
    w.i("MicroMsg.AudioRecordMgr", "pause record in runnable");
    for (;;)
    {
      try
      {
        if (this.jhj == null) {
          break label307;
        }
        bool = this.jhj.qr();
        this.jhj = null;
        Yv().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19860868300800L, 147975);
            d.this.MM();
            GMTrace.o(19860868300800L, 147975);
          }
        });
        long l1 = System.currentTimeMillis();
        long l2 = l1 - this.mStartTime;
        w.i("MicroMsg.AudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(this.jhs) });
        this.jhs = ((int)(this.jhs + l2));
        this.jhr = (this.mDuration - this.jhs);
        w.i("MicroMsg.AudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", new Object[] { Long.valueOf(this.jhr), Integer.valueOf(this.jhs) });
      }
      catch (Exception localException)
      {
        kx localkx;
        w.printErrStackTrace("MicroMsg.AudioRecordMgr", localException, "_pause", new Object[0]);
        bool = false;
        continue;
        onError(8);
        w.e("MicroMsg.AudioRecordMgr", "pause record fail");
        GMTrace.o(19859257688064L, 147963);
        return;
      }
      w.i("MicroMsg.AudioRecordMgr", "stop:%b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        w.i("MicroMsg.AudioRecordMgr", "onPause");
        this.jhn = a.jhA;
        this.jhk = false;
        localkx = new kx();
        localkx.fIs.action = 3;
        localkx.fIs.state = "pause";
        com.tencent.mm.sdk.b.a.uLm.a(localkx, Looper.getMainLooper());
        w.i("MicroMsg.AudioRecordMgr", "pause record success");
        GMTrace.o(19859257688064L, 147963);
        return;
      }
      label307:
      boolean bool = false;
    }
  }
  
  public final void Yu()
  {
    GMTrace.i(19859391905792L, 147964);
    w.i("MicroMsg.AudioRecordMgr", "stop record in runnable");
    for (;;)
    {
      try
      {
        if (this.jhj == null) {
          continue;
        }
        bool = this.jhj.qr();
        this.jhj = null;
        this.jhp = true;
        w.i("MicroMsg.AudioRecordMgr", "mPcmDuration:%d", new Object[] { Integer.valueOf(this.jhq) });
        if (this.jho != null)
        {
          this.jho.flush();
          this.jho.close();
          this.jho = null;
        }
        Yv().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19853754761216L, 147922);
            d.this.MM();
            GMTrace.o(19853754761216L, 147922);
          }
        });
        l1 = System.currentTimeMillis();
        long l2 = System.currentTimeMillis() - this.mStartTime;
        w.i("MicroMsg.AudioRecordMgr", "currentTime:%d, interval:%d, mRealRecordedTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(this.jhs) });
        this.jhs = ((int)(this.jhs + l2));
        this.jhr = (this.mDuration - this.jhs);
        w.i("MicroMsg.AudioRecordMgr", "mLimitTime:%d, mRealRecordTime:%d", new Object[] { Long.valueOf(this.jhr), Integer.valueOf(this.jhs) });
      }
      catch (Exception localException)
      {
        kx localkx;
        kx.a locala;
        String str;
        File localFile;
        w.printErrStackTrace("MicroMsg.AudioRecordMgr", localException, "_stop", new Object[0]);
        boolean bool = false;
        continue;
        w.i("MicroMsg.AudioRecordUtil", "audio file not exit, path:%s", new Object[] { str });
        long l1 = -1L;
        continue;
        onError(9);
        w.e("MicroMsg.AudioRecordMgr", "stop record fail");
        continue;
      }
      w.i("MicroMsg.AudioRecordMgr", "stop:%b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        continue;
      }
      w.i("MicroMsg.AudioRecordMgr", "onStop");
      this.jhn = a.jhB;
      this.jhk = false;
      localkx = new kx();
      localkx.fIs.action = 2;
      localkx.fIs.state = "stop";
      localkx.fIs.duration = this.jhs;
      localkx.fIs.filePath = this.mFilePath;
      locala = localkx.fIs;
      str = this.mFilePath;
      localFile = new File(str);
      if (!localFile.exists()) {
        continue;
      }
      w.i("MicroMsg.AudioRecordUtil", "exist audio file");
      l1 = localFile.length();
      locala.fileSize = ((int)l1);
      com.tencent.mm.sdk.b.a.uLm.a(localkx, Looper.getMainLooper());
      w.i("MicroMsg.AudioRecordMgr", "stop record success");
      this.jhm = null;
      GMTrace.o(19859391905792L, 147964);
      return;
      w.e("MicroMsg.AudioRecordMgr", "mRecorder is null, has stop record!");
      bool = true;
    }
  }
  
  public final void aM(long paramLong)
  {
    GMTrace.i(19858183946240L, 147955);
    MM();
    w.i("MicroMsg.AudioRecordMgr", "startTimer");
    this.jgX = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(19856573333504L, 147943);
        w.i("MicroMsg.AudioRecordMgr", "timer, onTimerExpired to stop record");
        d.this.qr();
        GMTrace.o(19856573333504L, 147943);
        return true;
      }
    }, false);
    this.jgX.w(paramLong, paramLong);
    GMTrace.o(19858183946240L, 147955);
  }
  
  protected final void onError(int paramInt)
  {
    GMTrace.i(19859660341248L, 147966);
    w.i("MicroMsg.AudioRecordMgr", "onError errType:%d", new Object[] { Integer.valueOf(paramInt) });
    if (this.jhn != a.jhC)
    {
      localObject1 = new ArrayList();
      localObject2 = new IDKey();
      ((IDKey)localObject2).SetID(689);
      ((IDKey)localObject2).SetKey(1);
      ((IDKey)localObject2).SetValue(1L);
      localObject3 = new IDKey();
      ((IDKey)localObject3).SetID(689);
      ((IDKey)localObject3).SetKey(f.iS(paramInt));
      ((IDKey)localObject3).SetValue(1L);
      ((ArrayList)localObject1).add(localObject2);
      ((ArrayList)localObject1).add(localObject3);
      com.tencent.mm.plugin.report.service.g.paX.b((ArrayList)localObject1, true);
    }
    this.jhn = a.jhC;
    this.jhk = false;
    Object localObject1 = new kx();
    ((kx)localObject1).fIs.action = 4;
    ((kx)localObject1).fIs.state = "error";
    ((kx)localObject1).fIs.errCode = paramInt;
    Object localObject2 = ((kx)localObject1).fIs;
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("errType:" + paramInt + ", err:");
    switch (paramInt)
    {
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    default: 
      ((StringBuilder)localObject3).append("unknow error");
    }
    for (;;)
    {
      ((kx.a)localObject2).ftU = ((StringBuilder)localObject3).toString();
      com.tencent.mm.sdk.b.a.uLm.a((b)localObject1, Looper.getMainLooper());
      GMTrace.o(19859660341248L, 147966);
      return;
      ((StringBuilder)localObject3).append("error PCM record callback");
      continue;
      ((StringBuilder)localObject3).append("init encoder fail, occur exception");
      continue;
      ((StringBuilder)localObject3).append("encoder un initial occur exception");
      continue;
      ((StringBuilder)localObject3).append("start record occur exception");
      continue;
      ((StringBuilder)localObject3).append("resume record occur exception");
      continue;
      ((StringBuilder)localObject3).append("fail to start record");
      continue;
      ((StringBuilder)localObject3).append("fail to resume record");
      continue;
      ((StringBuilder)localObject3).append("fail to pause record");
      continue;
      ((StringBuilder)localObject3).append("fail to stop record");
      continue;
      ((StringBuilder)localObject3).append("check param invalid");
      continue;
      ((StringBuilder)localObject3).append("not support format type");
      continue;
      ((StringBuilder)localObject3).append("fail to init mp3 encoder");
      continue;
      ((StringBuilder)localObject3).append("mp3 file not found exception");
      continue;
      ((StringBuilder)localObject3).append("mp3 encode exception");
      continue;
      ((StringBuilder)localObject3).append("mp3 write buffer exception");
      continue;
      ((StringBuilder)localObject3).append("fail to init aac encoder");
      continue;
      ((StringBuilder)localObject3).append("fail to create mp4 file");
      continue;
      ((StringBuilder)localObject3).append("aac encode exception");
      continue;
      ((StringBuilder)localObject3).append("create cache file fail");
      continue;
      ((StringBuilder)localObject3).append("init encoder fail");
      continue;
      ((StringBuilder)localObject3).append("not support sample rate");
    }
  }
  
  public final boolean qp()
  {
    GMTrace.i(19858452381696L, 147957);
    if (this.jhn == a.jhA)
    {
      GMTrace.o(19858452381696L, 147957);
      return true;
    }
    GMTrace.o(19858452381696L, 147957);
    return false;
  }
  
  public final boolean qr()
  {
    GMTrace.i(19858586599424L, 147958);
    w.i("MicroMsg.AudioRecordMgr", "stopRecord");
    if ((this.jhj == null) && (this.jho == null))
    {
      w.e("MicroMsg.AudioRecordMgr", "mRecord is null and mAudioEncoder is null, stop fail");
      GMTrace.o(19858586599424L, 147958);
      return false;
    }
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19856841768960L, 147945);
        synchronized (d.this.jhl)
        {
          d.this.Yu();
          GMTrace.o(19856841768960L, 147945);
          return;
        }
      }
    }, "app_brand_stop_record");
    GMTrace.o(19858586599424L, 147958);
    return true;
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(19847043874816L, 147872);
      jhx = 1;
      jhy = 2;
      jhz = 3;
      jhA = 4;
      jhB = 5;
      jhC = 6;
      jhD = new int[] { jhx, jhy, jhz, jhA, jhB, jhC };
      GMTrace.o(19847043874816L, 147872);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */