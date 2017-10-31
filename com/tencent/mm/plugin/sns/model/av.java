package com.tencent.mm.plugin.sns.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.g.a.pk;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.sns.b.l;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.aku;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.protocal.c.amk;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amo;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.amq;
import com.tencent.mm.protocal.c.bes;
import com.tencent.mm.protocal.c.bhc;
import com.tencent.mm.protocal.c.bpn;
import com.tencent.mm.protocal.c.cr;
import com.tencent.mm.protocal.c.nn;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class av
  implements com.tencent.mm.ac.e, l
{
  public static int pZQ;
  private String gCs;
  public Set<a> gFw;
  public r qfl;
  public ab.a qfm;
  
  static
  {
    GMTrace.i(8120306761728L, 60501);
    pZQ = 0;
    GMTrace.o(8120306761728L, 60501);
  }
  
  public av()
  {
    GMTrace.i(8116817100800L, 60475);
    this.gCs = "";
    this.qfl = null;
    this.gFw = new HashSet();
    this.qfm = new ab.a()
    {
      public final void hA(boolean paramAnonymousBoolean)
      {
        GMTrace.i(8051050414080L, 59985);
        if (!paramAnonymousBoolean) {
          av.this.bgd();
        }
        GMTrace.o(8051050414080L, 59985);
      }
    };
    GMTrace.o(8116817100800L, 60475);
  }
  
  private void G(final int paramInt, final boolean paramBoolean)
  {
    GMTrace.i(8118696148992L, 60489);
    ae.aCa().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8070646202368L, 60131);
        if (ae.bgY())
        {
          w.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
          GMTrace.o(8070646202368L, 60131);
          return;
        }
        Iterator localIterator = av.this.gFw.iterator();
        while (localIterator.hasNext())
        {
          av.a locala = (av.a)localIterator.next();
          if (locala != null) {
            locala.H(paramInt, paramBoolean);
          }
        }
        GMTrace.o(8070646202368L, 60131);
      }
    });
    GMTrace.o(8118696148992L, 60489);
  }
  
  private int a(final int paramInt1, final boolean paramBoolean, final amo paramamo, final int paramInt2)
  {
    GMTrace.i(8118830366720L, 60490);
    if (paramInt1 == -1)
    {
      w.e("MicroMsg.UploadManager", "uploading depend localMediaId can not get the media");
      paramInt1 = b.qfz;
      GMTrace.o(8118830366720L, 60490);
      return paramInt1;
    }
    final Object localObject = ae.bhe().dQ(paramInt1);
    amq localamq;
    try
    {
      localamq = (amq)new amq().aC(((com.tencent.mm.plugin.sns.storage.q)localObject).qvA);
      w.i("MicroMsg.UploadManager", "state " + localamq.uiy + " pic isMuti: " + paramBoolean);
      if (localamq.uiy == 1)
      {
        paramInt1 = b.qfz;
        GMTrace.o(8118830366720L, 60490);
        return paramInt1;
      }
    }
    catch (Exception paramamo)
    {
      w.e("MicroMsg.UploadManager", "parse uploadInfo error");
      paramInt1 = b.qfz;
      GMTrace.o(8118830366720L, 60490);
      return paramInt1;
    }
    String str = i.FZ(((com.tencent.mm.plugin.sns.storage.q)localObject).qvw);
    str = am.dt(ae.getAccSnsPath(), ((com.tencent.mm.plugin.sns.storage.q)localObject).qvw) + str;
    if (FileOp.kI(str) == 0L)
    {
      w.i("MicroMsg.UploadManager", "path not exist  " + str);
      paramInt1 = b.qfz;
      GMTrace.o(8118830366720L, 60490);
      return paramInt1;
    }
    if (localamq.uiy == 0)
    {
      paramInt1 = b.qfA;
      GMTrace.o(8118830366720L, 60490);
      return paramInt1;
    }
    if (ae.bho().ua(paramInt1))
    {
      ae.bhe().a(paramInt1, (com.tencent.mm.plugin.sns.storage.q)localObject);
      localObject = com.tencent.mm.a.g.n((bg.Pq() + " " + System.currentTimeMillis()).getBytes());
      ae.aCa().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8142318469120L, 60665);
          if (ae.bgY())
          {
            w.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
            GMTrace.o(8142318469120L, 60665);
            return;
          }
          y localy = new y(paramInt1, localObject, paramBoolean, paramInt2);
          ae.bho().cU(paramInt1, localy.hashCode());
          com.tencent.mm.kernel.h.xA();
          com.tencent.mm.kernel.h.xy().gQO.a(localy, 0);
          GMTrace.o(8142318469120L, 60665);
        }
      });
    }
    paramInt1 = b.qfB;
    GMTrace.o(8118830366720L, 60490);
    return paramInt1;
  }
  
  public static aw a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(8117622407168L, 60481);
    w.d("MicroMsg.UploadManager", "appmsg.description " + paramWXMediaMessage.description);
    w.d("MicroMsg.UploadManager", "appmsg.title " + paramWXMediaMessage.title);
    Object localObject = paramWXMediaMessage.mediaObject;
    int i;
    switch (((WXMediaMessage.IMediaObject)localObject).type())
    {
    default: 
      i = -1;
    }
    aw localaw;
    for (;;)
    {
      localaw = new aw(i);
      localaw.GX(bg.ap(paramString2, "")).GY(bg.ap(paramString3, ""));
      localaw.uo(5);
      w.d("MicroMsg.UploadManager", "TimeLineType " + i);
      if (i != -1) {
        break;
      }
      w.d("MicroMsg.UploadManager", "timeLineType is invalid");
      GMTrace.o(8117622407168L, 60481);
      return null;
      i = 2;
      continue;
      i = 4;
      continue;
      i = 1;
      continue;
      i = 3;
      continue;
      i = 5;
      continue;
      i = 3;
    }
    if (!bg.mZ(paramString1)) {
      localaw.GR(paramString1);
    }
    localaw.GW(bg.ap(paramWXMediaMessage.title, "")).GU(bg.ap(paramWXMediaMessage.description, ""));
    switch (((WXMediaMessage.IMediaObject)localObject).type())
    {
    default: 
      w.e("MicroMsg.UploadManager", "none type not support!");
      GMTrace.o(8117622407168L, 60481);
      return null;
    case 1: 
      paramWXMediaMessage = (WXTextObject)localObject;
      localaw.GU("");
      localaw.GR(paramWXMediaMessage.text);
    }
    for (;;)
    {
      GMTrace.o(8117622407168L, 60481);
      return localaw;
      paramString3 = (WXMusicObject)localObject;
      if (!bg.mZ(paramString3.musicUrl))
      {
        paramString1 = paramString3.musicUrl;
        paramString2 = bg.ap(paramString1, "");
        if (bg.mZ(paramString3.musicDataUrl)) {
          break label483;
        }
      }
      label483:
      for (paramString1 = paramString3.musicDataUrl;; paramString1 = paramString3.musicUrl)
      {
        localObject = bg.ap(paramString1, "");
        localaw.GW("").GU("");
        i = ui(3);
        if (i != -1) {
          break label491;
        }
        w.d("MicroMsg.UploadManager", "mediaType is invalid");
        GMTrace.o(8117622407168L, 60481);
        return null;
        paramString1 = paramString3.musicLowBandUrl;
        break;
      }
      label491:
      if (!bg.mZ(paramString3.musicLowBandDataUrl)) {}
      for (paramString1 = paramString3.musicLowBandDataUrl;; paramString1 = paramString3.musicLowBandUrl)
      {
        paramString1 = bg.ap(paramString1, "");
        if (localaw.a(paramWXMediaMessage.thumbData, paramString2, paramString1, (String)localObject, i, bg.ap(paramWXMediaMessage.title, ""), bg.ap(paramWXMediaMessage.description, ""))) {
          break;
        }
        GMTrace.o(8117622407168L, 60481);
        return null;
      }
      paramWXMediaMessage = (WXImageObject)localObject;
      if (!bg.bp(paramWXMediaMessage.imageData))
      {
        if (!localaw.a(paramWXMediaMessage.imageData, "", ""))
        {
          GMTrace.o(8117622407168L, 60481);
          return null;
        }
      }
      else if (!bg.mZ(paramWXMediaMessage.imagePath))
      {
        if (!localaw.dx(paramWXMediaMessage.imagePath, ""))
        {
          GMTrace.o(8117622407168L, 60481);
          return null;
        }
      }
      else
      {
        w.e("MicroMsg.UploadManager", "share img but no res is exist!");
        GMTrace.o(8117622407168L, 60481);
        return null;
        paramString1 = (WXWebpageObject)localObject;
        if (!bg.bp(paramWXMediaMessage.thumbData)) {
          localaw.a(paramWXMediaMessage.thumbData, bg.ap(paramWXMediaMessage.description, ""), bg.ap(paramWXMediaMessage.title, ""));
        }
        localaw.GU(paramString1.webpageUrl).GV(paramString1.webpageUrl);
        paramWXMediaMessage = paramString1.webpageUrl;
        localaw.qfI.uyu.mDo = paramWXMediaMessage;
        localaw.GT(paramString1.canvasPageXml);
        continue;
        w.e("MicroMsg.UploadManager", "file is not support!");
        GMTrace.o(8117622407168L, 60481);
        return null;
        paramString2 = (WXVideoObject)localObject;
        localaw.GW("").GU("");
        i = ui(4);
        if (i == -1)
        {
          w.d("MicroMsg.UploadManager", "mediaType is invalid");
          GMTrace.o(8117622407168L, 60481);
          return null;
        }
        if (!bg.mZ(paramString2.videoUrl)) {}
        for (paramString1 = paramString2.videoUrl;; paramString1 = paramString2.videoLowBandUrl)
        {
          paramString1 = bg.ap(paramString1, "");
          if (localaw.a(paramWXMediaMessage.thumbData, paramString1, paramString2.videoLowBandUrl, paramString2.videoUrl, i, bg.ap(paramWXMediaMessage.title, ""), bg.ap(paramWXMediaMessage.description, ""))) {
            break;
          }
          GMTrace.o(8117622407168L, 60481);
          return null;
        }
        paramWXMediaMessage = (WXAppExtendObject)localObject;
        if ((bg.mZ(paramWXMediaMessage.filePath)) || (!paramWXMediaMessage.filePath.startsWith("http"))) {
          break;
        }
        localaw.GW(paramWXMediaMessage.filePath);
        localaw.GU(paramWXMediaMessage.filePath);
      }
    }
    w.e("MicroMsg.UploadManager", "appdata is not support!");
    GMTrace.o(8117622407168L, 60481);
    return null;
  }
  
  private void a(m paramm, int paramInt1, int paramInt2, String paramString)
  {
    GMTrace.i(8117085536256L, 60477);
    w.i("MicroMsg.UploadManager", "localId " + paramm.bkg() + "processError " + paramInt2 + " errMsg: " + paramString);
    com.tencent.mm.plugin.report.service.g.paX.a(22L, 129L, 1L, true);
    if (paramInt1 != 0) {
      paramString = ae.bhe().dQ(paramInt1);
    }
    for (;;)
    {
      int i;
      try
      {
        i = ((amq)new amq().aC(paramString.qvA)).uig;
      }
      catch (Exception paramString)
      {
        paramInt1 = 0;
      }
      try
      {
        paramString = paramm.bjY();
        paramInt1 = i;
        if (paramString != null)
        {
          paramString.uig = i;
          paramm.field_postBuf = paramString.toByteArray();
          paramInt1 = i;
        }
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          paramInt1 = i;
        }
        paramInt1 = 0;
      }
    }
    w.d("MicroMsg.UploadManager", "post error " + paramInt1);
    paramm.bkk();
    ae.bhp().b(paramm.quQ, paramm);
    w.d("MicroMsg.UploadManager", "processError, publish SnsPostFailEvent, snsInfoLocalId:" + paramm.quQ);
    paramString = new pk();
    paramString.fNn.fNo = paramm.quQ;
    com.tencent.mm.sdk.b.a.uLm.m(paramString);
    switch (paramInt2)
    {
    }
    for (;;)
    {
      G(paramm.quQ, false);
      GMTrace.o(8117085536256L, 60477);
      return;
      w.e("MicroMsg.UploadManager", "parse uploadInfo error");
      break;
      paramString = paramm.bjY();
      if (paramString == null) {
        break label399;
      }
      paramInt1 = paramString.uig;
      break;
      w.e("MicroMsg.UploadManager", "upload find timeLine is null delete this item");
      continue;
      w.e("MicroMsg.UploadManager", "parser protobuf error");
      continue;
      w.e("MicroMsg.UploadManager", "local id is not in db");
      continue;
      w.e("MicroMsg.UploadManager", "arg is error");
      continue;
      w.e("MicroMsg.UploadManager", "pullTimeLineXml  error");
      continue;
      w.e("MicroMsg.UploadManager", "errtle  error");
    }
  }
  
  private static void a(amo paramamo)
  {
    GMTrace.i(8118964584448L, 60491);
    if (paramamo == null)
    {
      GMTrace.o(8118964584448L, 60491);
      return;
    }
    paramamo = paramamo.uhY.iterator();
    while (paramamo.hasNext())
    {
      aku localaku = (aku)paramamo.next();
      ae.bho().ub(localaku.ufH);
    }
    GMTrace.o(8118964584448L, 60491);
  }
  
  private void b(m paramm, int paramInt, String paramString)
  {
    GMTrace.i(8117219753984L, 60478);
    a(paramm, 0, paramInt, paramString);
    GMTrace.o(8117219753984L, 60478);
  }
  
  private boolean q(m paramm)
  {
    GMTrace.i(8117890842624L, 60483);
    if (paramm == null)
    {
      GMTrace.o(8117890842624L, 60483);
      return false;
    }
    Object localObject1 = paramm.bjL();
    if (((bhc)localObject1).uyu.tKc == 8)
    {
      GMTrace.o(8117890842624L, 60483);
      return true;
    }
    if (((bhc)localObject1).uyu.tKc == 2)
    {
      GMTrace.o(8117890842624L, 60483);
      return true;
    }
    if ((localObject1 == null) || (((bhc)localObject1).uyu.tKd == null))
    {
      b(paramm, 1, "timeline or timelineObjList is null");
      GMTrace.o(8117890842624L, 60483);
      return false;
    }
    if (((bhc)localObject1).uyu.tKd.size() == 0)
    {
      GMTrace.o(8117890842624L, 60483);
      return true;
    }
    for (;;)
    {
      Object localObject2;
      int i;
      try
      {
        localObject2 = (amo)new amo().aC(paramm.field_postBuf);
        if (((bhc)localObject1).uyu.tKc != 1) {
          break label501;
        }
        if (((amo)localObject2).uhY.size() > 1)
        {
          bool = true;
          if (((bhc)localObject1).uyu.tKc != 21) {
            break label498;
          }
          bool = false;
          if (((bhc)localObject1).uyu.tKc != 15) {
            break label384;
          }
          localObject1 = ((amo)localObject2).uhY.iterator();
          if (!((Iterator)localObject1).hasNext()) {
            break label373;
          }
          localObject2 = (aku)((Iterator)localObject1).next();
          i = uj(((aku)localObject2).ufH);
          if (i != b.qfz) {
            break label355;
          }
          a(paramm, ((aku)localObject2).ufH, 2, "upload has set it fail");
          GMTrace.o(8117890842624L, 60483);
          return false;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.UploadManager", "error to parser postinfo in canPost " + paramm.bkg());
        b(paramm, 2, "mediaPostInfo parser error " + localException.getMessage());
        GMTrace.o(8117890842624L, 60483);
        return false;
      }
      boolean bool = false;
      continue;
      label355:
      if (i == b.qfB)
      {
        GMTrace.o(8117890842624L, 60483);
        return false;
        label373:
        GMTrace.o(8117890842624L, 60483);
        return true;
        label384:
        Iterator localIterator = ((amo)localObject2).uhY.iterator();
        while (localIterator.hasNext())
        {
          aku localaku = (aku)localIterator.next();
          i = a(localaku.ufH, bool, (amo)localObject2, localException.uyu.tKc);
          if (i == b.qfz)
          {
            a(paramm, localaku.ufH, 2, "upload has set it fail");
            GMTrace.o(8117890842624L, 60483);
            return false;
          }
          if (i == b.qfB)
          {
            GMTrace.o(8117890842624L, 60483);
            return false;
          }
        }
        GMTrace.o(8117890842624L, 60483);
        return true;
        label498:
        continue;
        label501:
        bool = true;
      }
    }
  }
  
  private static bhc s(m paramm)
  {
    GMTrace.i(8118427713536L, 60487);
    Object localObject = paramm.bjL();
    akv localakv = ((bhc)localObject).uys;
    String str1 = ((bhc)localObject).uyr;
    String str2 = ((bhc)localObject).tbH;
    String str3 = ((bhc)localObject).tbI;
    String str4 = ((bhc)localObject).uyu.mCK;
    String str5 = ((bhc)localObject).uyu.fuw;
    String str6 = ((bhc)localObject).uyu.mDo;
    cr localcr = ((bhc)localObject).uyt;
    bpn localbpn = ((bhc)localObject).uyA;
    int i = ((bhc)localObject).uyu.tKc;
    int j = ((bhc)localObject).uyu.tKe;
    bhc localbhc = com.tencent.mm.modelsns.e.LM();
    localbhc.jWW = paramm.field_userName;
    localbhc.uhC = paramm.field_pravited;
    localbhc.uyr = str1;
    localbhc.tbH = bg.mY(str2);
    localbhc.tbI = bg.mY(str3);
    localbhc.uyw = ((bhc)localObject).uyw;
    localbhc.uyx = ((bhc)localObject).uyx;
    localbhc.haU = ((bhc)localObject).haU;
    localbhc.uyy = ((bhc)localObject).uyy;
    localbhc.qAC = ((bhc)localObject).qAC;
    localbhc.uyu.mCK = str4;
    localbhc.uyu.fuw = str5;
    localbhc.uyu.tKc = i;
    localbhc.uyu.tKe = j;
    localbhc.uyu.mDo = str6;
    localbhc.uys = localakv;
    localbhc.uyz = ((bhc)localObject).uyz;
    localbhc.qBT = ((bhc)localObject).qBT;
    if (((bhc)localObject).qfM != null) {
      localbhc.qfM = ((bhc)localObject).qfM;
    }
    if (localcr != null) {
      localbhc.uyt = localcr;
    }
    if (localbpn != null) {
      localbhc.uyA = localbpn;
    }
    paramm = ((bhc)localObject).uyu.tKd.iterator();
    while (paramm.hasNext())
    {
      localObject = (amn)paramm.next();
      if (((amn)localObject).uhG == 1) {
        localbhc.uyu.tKd.add(localObject);
      }
    }
    GMTrace.o(8118427713536L, 60487);
    return localbhc;
  }
  
  private static int ui(int paramInt)
  {
    GMTrace.i(8117353971712L, 60479);
    switch (paramInt)
    {
    default: 
      GMTrace.o(8117353971712L, 60479);
      return -1;
    case 1: 
      GMTrace.o(8117353971712L, 60479);
      return 1;
    case 3: 
      GMTrace.o(8117353971712L, 60479);
      return 3;
    case 2: 
      GMTrace.o(8117353971712L, 60479);
      return 2;
    }
    GMTrace.o(8117353971712L, 60479);
    return 4;
  }
  
  private int uj(int paramInt)
  {
    GMTrace.i(8119098802176L, 60492);
    if (paramInt == -1)
    {
      w.e("MicroMsg.UploadManager", "uploading depend localMediaId can not get the media doUploadSight");
      paramInt = b.qfz;
      GMTrace.o(8119098802176L, 60492);
      return paramInt;
    }
    com.tencent.mm.plugin.sns.storage.q localq = ae.bhe().dQ(paramInt);
    amq localamq;
    try
    {
      localamq = (amq)new amq().aC(localq.qvA);
      w.i("MicroMsg.UploadManager", "state " + localamq.uiy + " doUploadSight, serverErr:" + localamq.uig);
      if (localamq.uiy == 1)
      {
        paramInt = b.qfz;
        GMTrace.o(8119098802176L, 60492);
        return paramInt;
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.UploadManager", "parse uploadInfo error doUploadSight");
      paramInt = b.qfz;
      GMTrace.o(8119098802176L, 60492);
      return paramInt;
    }
    if (FileOp.kI(localamq.fML) == 0L)
    {
      w.i("MicroMsg.UploadManager", "path not fileexist  " + localamq.fML);
      paramInt = b.qfz;
      GMTrace.o(8119098802176L, 60492);
      return paramInt;
    }
    if (FileOp.kI(localamq.uiA) == 0L)
    {
      w.i("MicroMsg.UploadManager", "thumbpath not fileexist  " + localamq.uiA);
      paramInt = b.qfz;
      GMTrace.o(8119098802176L, 60492);
      return paramInt;
    }
    if (localamq.uiy == 0)
    {
      paramInt = b.qfA;
      GMTrace.o(8119098802176L, 60492);
      return paramInt;
    }
    if (ae.bho().ua(paramInt))
    {
      ae.bhe().a(paramInt, localException);
      new ab(paramInt, localException, localamq.fML, localamq.uiA, this.qfm).bgO();
    }
    paramInt = b.qfB;
    GMTrace.o(8119098802176L, 60492);
    return paramInt;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8119367237632L, 60494);
    w.i("MicroMsg.UploadManager", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType() + " @" + hashCode());
    switch (paramk.getType())
    {
    }
    while ((paramInt1 != 0) || (paramInt2 != 0))
    {
      GMTrace.o(8119367237632L, 60494);
      return;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        bgd();
        continue;
        paramString = (r)paramk;
        int i = paramString.pYt;
        if (paramString.kFb)
        {
          long l = paramString.qby;
          w.i("MicroMsg.UploadManager", "get the del post come back %d " + l, new Object[] { Integer.valueOf(i) });
          if (l != 0L)
          {
            ae.bho().dB(l);
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.a(new q(l, 1), 0);
          }
          ae.bhp().uJ(i);
          if (l != 0L) {
            ae.bht().dK(l);
          }
        }
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          G(paramString.pYt, false);
        }
        for (;;)
        {
          this.qfl = null;
          break;
          G(paramString.pYt, true);
          aj.dF(paramString.qby);
        }
      }
    }
    GMTrace.o(8119367237632L, 60494);
  }
  
  public final boolean a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3, int paramInt)
  {
    GMTrace.i(8117756624896L, 60482);
    paramString1 = a(paramWXMediaMessage, paramString1, paramString2, paramString3);
    if (paramString1 == null)
    {
      GMTrace.o(8117756624896L, 60482);
      return false;
    }
    paramString1.GS(paramWXMediaMessage.mediaTagName);
    paramString1.S(paramString2, paramWXMediaMessage.messageExt, paramWXMediaMessage.messageAction);
    if (paramInt > com.tencent.mm.plugin.sns.c.a.pXZ) {
      paramString1.uk(1);
    }
    paramInt = paramString1.commit();
    w.d("MicroMsg.UploadManager", "shareAppMsg set and the result: " + paramInt);
    GMTrace.o(8117756624896L, 60482);
    return true;
  }
  
  public final String bgV()
  {
    GMTrace.i(8116951318528L, 60476);
    if ((this.gCs == null) || (this.gCs.equals("")))
    {
      com.tencent.mm.kernel.h.xA();
      this.gCs = ((String)com.tencent.mm.kernel.h.xz().xi().get(2, null));
    }
    String str = this.gCs;
    GMTrace.o(8116951318528L, 60476);
    return str;
  }
  
  public final void bgd()
  {
    GMTrace.i(8118159278080L, 60485);
    ae.aCa().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8076954435584L, 60178);
        av localav = av.this;
        if (ae.bgZ() != null)
        {
          if (!ae.bgY())
          {
            com.tencent.mm.kernel.h.xA();
            if (com.tencent.mm.kernel.h.xz().isSDCardAvailable()) {}
          }
          else
          {
            GMTrace.o(8076954435584L, 60178);
            return;
          }
          ae.bgZ().post(new av.2(localav));
        }
        GMTrace.o(8076954435584L, 60178);
      }
    }, 1000L);
    GMTrace.o(8118159278080L, 60485);
  }
  
  public final boolean bhW()
  {
    GMTrace.i(8118293495808L, 60486);
    Object localObject1 = ae.bhp();
    localObject2 = "select *,rowid from SnsInfo  where " + com.tencent.mm.plugin.sns.storage.n.qvl + " order by SnsInfo.rowid" + " asc ";
    localObject1 = ((com.tencent.mm.plugin.sns.storage.n)localObject1).gMB.rawQuery((String)localObject2, null);
    w.d("MicroMsg.SnsInfoStorage", "getLastUpload " + (String)localObject2);
    if (((Cursor)localObject1).getCount() == 0)
    {
      ((Cursor)localObject1).close();
      localObject1 = null;
    }
    for (;;)
    {
      localObject2 = new m();
      if (localObject1 != null) {
        break;
      }
      GMTrace.o(8118293495808L, 60486);
      return false;
      ((Cursor)localObject1).moveToFirst();
    }
    ((Cursor)localObject1).moveToFirst();
    do
    {
      ((m)localObject2).b((Cursor)localObject1);
      try
      {
        amo localamo = (amo)new amo().aC(((m)localObject2).field_postBuf);
        int i = localamo.hkI;
        if (m.dO(localamo.uib))
        {
          a(localamo);
          b((m)localObject2, 6, "snsinfo is tle");
          w.i("MicroMsg.UploadManager", "checkTLE snsinfo localId it time limit " + ((m)localObject2).bkg() + " is die ");
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          w.e("MicroMsg.UploadManager", "startPost parseFrom MediaPostInfo Exception");
          b((m)localObject2, 2, "MediaPostInfo parser error");
        }
      }
    } while (((Cursor)localObject1).moveToNext());
    ((Cursor)localObject1).close();
    GMTrace.o(8118293495808L, 60486);
    return true;
  }
  
  public final void bhX()
  {
    GMTrace.i(8119233019904L, 60493);
    Iterator localIterator = this.gFw.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala != null) {
        locala.bhY();
      }
    }
    GMTrace.o(8119233019904L, 60493);
  }
  
  public final boolean jdMethod_do(String paramString1, String paramString2)
  {
    GMTrace.i(8117488189440L, 60480);
    w.d("MicroMsg.UploadManager", "imgPath " + paramString1 + " text " + paramString2);
    String str = ae.getAccSnsTmpPath() + com.tencent.mm.a.g.n(paramString1.getBytes());
    FileOp.o(paramString1, str);
    paramString1 = new aw(1);
    paramString1.GR(paramString2);
    paramString1.uo(6);
    paramString2 = new LinkedList();
    paramString2.add(new com.tencent.mm.plugin.sns.data.h(str, 2));
    paramString1.br(paramString2);
    if (paramString1.commit() > 0)
    {
      GMTrace.o(8117488189440L, 60480);
      return true;
    }
    GMTrace.o(8117488189440L, 60480);
    return false;
  }
  
  public final void r(m paramm)
  {
    GMTrace.i(8118025060352L, 60484);
    if (paramm == null)
    {
      GMTrace.o(8118025060352L, 60484);
      return;
    }
    w.i("MicroMsg.UploadManager", "cancel snsinfo " + paramm.bkg());
    try
    {
      Object localObject1 = (amo)new amo().aC(paramm.field_postBuf);
      if ((localObject1 != null) && (((amo)localObject1).uhY != null))
      {
        localObject1 = ((amo)localObject1).uhY.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          aku localaku = (aku)((Iterator)localObject1).next();
          int i = ae.bho().ud(localaku.ufH);
          ae.bho().uc(localaku.ufH);
          w.i("MicroMsg.UploadManager", "cancel upload %d", new Object[] { Integer.valueOf(i) });
          if ((paramm.field_type != 15) && (i >= 0))
          {
            com.tencent.mm.kernel.h.xA();
            com.tencent.mm.kernel.h.xy().gQO.cancel(i);
            ae.bho().ub(localaku.ufH);
          }
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.UploadManager", "error to parser postinfo in canPost " + paramm.bkg());
        b(paramm, 2, "mediaPostInfo parser error " + localException.getMessage());
        localObject2 = null;
      }
      if ((ae.bho().tX(paramm.quQ)) && (this.qfl != null))
      {
        w.i("MicroMsg.UploadManager", "cancel post");
        this.qfl.kFb = true;
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.c(this.qfl);
        ae.bho().tZ(paramm.quQ);
      }
      Object localObject2 = ae.bhp().uI(paramm.quQ);
      if ((localObject2 != null) && (((m)localObject2).field_snsId != 0L))
      {
        ae.bho().dB(((m)localObject2).field_snsId);
        com.tencent.mm.kernel.h.xA();
        com.tencent.mm.kernel.h.xy().gQO.a(new q(((m)localObject2).field_snsId, 1), 0);
      }
      ae.bhp().uJ(paramm.quQ);
      if (paramm.field_type == 21) {
        com.tencent.mm.plugin.sns.lucky.a.g.bgi().bgk();
      }
      w.d("MicroMsg.UploadManager", "cancelPost, publish SnsPostFailEvent, snsInfoLocalId " + paramm.bkg());
      localObject2 = new pk();
      ((pk)localObject2).fNn.fNo = paramm.quQ;
      com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
      GMTrace.o(8118025060352L, 60484);
    }
  }
  
  public final boolean t(m paramm)
  {
    GMTrace.i(8118561931264L, 60488);
    final amo localamo;
    final int i;
    try
    {
      localamo = (amo)new amo().aC(paramm.field_postBuf);
      localamo.hkI += 1;
      paramm.field_postBuf = localamo.toByteArray();
      ae.bhp().b(paramm.quQ, paramm);
      i = localamo.hkI;
      if (m.dO(localamo.uib))
      {
        b(paramm, 6, "this item isTimeLimit");
        w.i("MicroMsg.UploadManager", "snsinfo localId it time limit " + paramm.bkg() + " is die ");
        GMTrace.o(8118561931264L, 60488);
        return false;
      }
    }
    catch (Exception localException1)
    {
      w.e("MicroMsg.UploadManager", "startPost parseFrom MediaPostInfo Exception");
      b(paramm, 2, "MediaPostInfo parser error:" + localException1.getMessage());
      GMTrace.o(8118561931264L, 60488);
      return false;
    }
    w.i("MicroMsg.UploadManager", "try start post " + paramm.bkg());
    final bhc localbhc;
    final Object localObject2;
    int j;
    com.tencent.mm.plugin.sns.storage.q localq;
    final Object localObject3;
    String str;
    final Object localObject5;
    int k;
    final Object localObject4;
    final Object localObject1;
    if (q(paramm))
    {
      localbhc = paramm.bjL();
      localObject2 = s(paramm);
      i = 0;
      if (i < localamo.uhY.size())
      {
        j = ((aku)localamo.uhY.get(i)).ufH;
        localq = ae.bhe().dQ(j);
        if (localq == null)
        {
          b(paramm, 3, "can not get the media from db ,localMediaId: " + j);
          GMTrace.o(8118561931264L, 60488);
          return false;
        }
        try
        {
          localObject3 = (amq)new amq().aC(localq.qvA);
          if ((((amq)localObject3).uiv == null) || (((amq)localObject3).uix.size() <= 0))
          {
            w.e("MicroMsg.UploadManager", "item with not url" + paramm.field_type);
            if (paramm.field_type == 3) {
              break label824;
            }
            b(paramm, 4, "buf url is null");
            GMTrace.o(8118561931264L, 60488);
            return false;
          }
        }
        catch (Exception localException2)
        {
          w.e("MicroMsg.UploadManager", "MediaUploadInfo parseFrom MediaUploadInfo Exception");
          b(paramm, 2, "mediaUploadInfo parser error " + localException2.getMessage());
          GMTrace.o(8118561931264L, 60488);
          return false;
        }
        str = ((amq)localObject3).uiv.mDo;
        localObject5 = ((amk)((amq)localObject3).uix.get(0)).mDo;
        j = ((amq)localObject3).uiv.jXP;
        k = ((amk)((amq)localObject3).uix.get(0)).jXP;
        localObject4 = ((amq)localObject3).fwU;
        localObject1 = null;
        if (i < localbhc.uyu.tKd.size()) {
          localObject1 = ((amn)localbhc.uyu.tKd.get(i)).uhD;
        }
        if ((localbhc.uyu.tKc == 4) || (localbhc.uyu.tKc == 5))
        {
          if (i >= localbhc.uyu.tKd.size()) {
            break label1174;
          }
          localObject1 = (amn)localbhc.uyu.tKd.get(i);
          ((amn)localObject1).uhA = ((String)localObject5);
          ((amn)localObject1).uhB = k;
        }
      }
    }
    for (;;)
    {
      if ((localObject1 != null) && (((bhc)localObject2).uyu.tKc == 1)) {
        ((amn)localObject1).fwU = ((String)localObject4);
      }
      if ((localObject1 != null) && (((bhc)localObject2).uyu.tKc == 15))
      {
        ((amn)localObject1).fwU = ((amq)localObject3).fwU;
        ((amn)localObject1).uhV = ((amq)localObject3).uhV;
      }
      if (i < localbhc.uyu.tKd.size())
      {
        localObject3 = (amn)localbhc.uyu.tKd.get(i);
        ((amn)localObject1).fuw = ((amn)localObject3).fuw;
        ((amn)localObject1).mCK = ((amn)localObject3).mCK;
        ((amn)localObject1).fvu = ((amn)localObject3).fvu;
        ((amn)localObject1).qyB = ((amn)localObject3).qyB;
      }
      if (localObject1 == null)
      {
        b(paramm, 3, "make media error");
        GMTrace.o(8118561931264L, 60488);
        return false;
        localObject1 = com.tencent.mm.modelsns.e.a(localq.qvz, localq.type, str, (String)localObject5, j, k, ((amq)localObject3).uhC, "", (amp)localObject1);
      }
      else
      {
        ((bhc)localObject2).uyu.tKd.add(localObject1);
        i += 1;
        break;
        label824:
        if (!ae.bho().tY(paramm.quQ))
        {
          w.d("MicroMsg.UploadManager", "this snsinfo is posting");
          GMTrace.o(8118561931264L, 60488);
          return false;
        }
        localObject1 = new LinkedList();
        localObject3 = localamo.uhZ.iterator();
        while (((Iterator)localObject3).hasNext()) {
          ((List)localObject1).add(((bes)((Iterator)localObject3).next()).jWW);
        }
        localObject3 = com.tencent.mm.plugin.sns.g.j.b((bhc)localObject2);
        w.d("MicroMsg.UploadManager", "timeLine contentDescScene ：  " + ((bhc)localObject2).uyx + " contentDescShowType: " + ((bhc)localObject2).uyw);
        if (paramm.field_pravited == 1) {
          w.i("MicroMsg.UploadManager", "content private xml is null ? " + bg.mZ((String)localObject3));
        }
        while ((localObject3 == null) || (((String)localObject3).equals("")))
        {
          b(paramm, 5, "content is error");
          ae.bho().tZ(paramm.quQ);
          GMTrace.o(8118561931264L, 60488);
          return false;
          w.i("MicroMsg.UploadManager", "upload xmlsns: %s", new Object[] { localObject3 });
        }
        if (localamo.uii == 1) {}
        for (final boolean bool = true;; bool = false)
        {
          i = paramm.quQ;
          localObject4 = localamo.uij;
          localObject5 = ((bhc)localObject2).uys.ufM;
          localObject2 = ((bhc)localObject2).uyu.fuw;
          ae.aCa().post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8090644643840L, 60280);
              if (ae.bgY())
              {
                w.e("MicroMsg.UploadManager", "is invalid to getSnsInfoStorage");
                GMTrace.o(8090644643840L, 60280);
                return;
              }
              av.this.qfl = new r(localObject3, localamo.uhC, localamo.uhX, localObject1, localbhc, i, localamo.tvh, localamo.uic, localamo.uie, localamo.uif, localamo, bool, localObject4, localamo.uik, localObject5, localObject2);
              com.tencent.mm.kernel.h.xA();
              com.tencent.mm.kernel.h.xy().gQO.a(av.this.qfl, 0);
              GMTrace.o(8090644643840L, 60280);
            }
          });
          w.d("MicroMsg.UploadManager", "startPost, canPost is false, snsInfoId: " + paramm.bkg());
          GMTrace.o(8118561931264L, 60488);
          return true;
        }
        label1174:
        localObject1 = null;
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void H(int paramInt, boolean paramBoolean);
    
    public abstract void bhY();
  }
  
  public static enum b
  {
    static
    {
      GMTrace.i(8107556077568L, 60406);
      qfz = 1;
      qfA = 2;
      qfB = 3;
      qfC = new int[] { qfz, qfA, qfB };
      GMTrace.o(8107556077568L, 60406);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/model/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */