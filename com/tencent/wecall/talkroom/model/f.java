package com.tencent.wecall.talkroom.model;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.mm.plugin.multi.talk;
import com.tencent.mm.plugin.multi.talk.a;
import com.tencent.pb.common.b.a.a.aa;
import com.tencent.pb.common.b.a.a.ac;
import com.tencent.pb.common.b.a.a.ae;
import com.tencent.pb.common.b.a.a.ag;
import com.tencent.pb.common.b.a.a.ah;
import com.tencent.pb.common.b.a.a.ap;
import com.tencent.pb.common.b.a.a.aq;
import com.tencent.pb.common.b.a.a.ar;
import com.tencent.pb.common.b.a.a.as;
import com.tencent.pb.common.b.a.a.at;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.n;
import com.tencent.pb.common.b.a.a.o;
import com.tencent.pb.common.b.a.a.p;
import com.tencent.pb.common.b.a.a.v;
import com.tencent.pb.common.b.a.a.x;
import com.tencent.pb.common.b.a.a.y;
import com.tencent.pb.common.b.a.a.z;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.wecall.talkroom.a.l;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public final class f
  implements Handler.Callback, com.tencent.e.a.d, com.tencent.pb.common.b.b
{
  public static List<Integer> xLW;
  public static String[] xMA = { "GLOBAL_TOPIC_NETWORK_CHANGE", "topic_bind_mobile_other" };
  private static int xMd;
  private static com.tencent.pb.talkroom.sdk.e xnt = null;
  public boolean frc = false;
  public Handler mHandler;
  public String mHz;
  public int ndF;
  public boolean nnu = false;
  boolean rpz = false;
  public int state = 0;
  f xLV;
  private Map<String, e> xLX = new HashMap();
  private final int xLY = 1;
  private final int xLZ = 2;
  private com.tencent.e.a.a xLy;
  public String xMB = null;
  HashSet<Long> xMC = new HashSet();
  public boolean xMD = false;
  public boolean xME = true;
  public boolean xMF = true;
  private short[] xMG = null;
  private int[] xMH = null;
  private short[] xMI = null;
  private int[] xMJ = null;
  private int xMK = 0;
  public boolean xML = false;
  public boolean xMM = true;
  private Runnable xMN = new Runnable()
  {
    public final void run()
    {
      if ((f.this.brT()) && (f.this.nnu))
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "syscall", "finishtalk becos holdtimeout" });
        h.FD(63533);
        f.this.xMp.FG(401);
        f.this.Z(f.this.mHz, 3, 108);
      }
    }
  };
  public com.tencent.pb.common.b.d xMO = null;
  public Runnable xMP = new Runnable()
  {
    public final void run()
    {
      Object localObject2 = null;
      int i = f.this.state;
      if (f.this.xMO == null) {}
      for (Object localObject1 = null;; localObject1 = Integer.valueOf(f.this.xMO.getType()))
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "beginSenceCircle state: ", Integer.valueOf(i), " mCircleScene: ", localObject1, " mIsAck: ", Boolean.valueOf(f.this.xMe) });
        if (f.this.xMO != null) {
          break;
        }
        f.this.mHandler.removeCallbacks(f.this.xMP);
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "beginSenceCircle removeCallbacks" });
        return;
      }
      if (!f.this.brT())
      {
        f.this.mHandler.removeCallbacks(f.this.xMP);
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "beginSenceCircle removeCallbacks" });
        return;
      }
      localObject1 = localObject2;
      if (f.this.xMO != null)
      {
        localObject1 = localObject2;
        if (f.this.xMO.getType() == 202)
        {
          localObject1 = localObject2;
          if (f.this.state == 3)
          {
            com.tencent.wecall.talkroom.a.e locale = (com.tencent.wecall.talkroom.a.e)f.this.xMO;
            localObject1 = localObject2;
            if (f.this.b(locale.mHz, locale.ndF, locale.xMh, f.FB(locale.xNY)))
            {
              localObject1 = new com.tencent.wecall.talkroom.a.e(locale);
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "beginSenceCircle enter" });
            }
          }
        }
      }
      if (localObject1 != null)
      {
        com.tencent.pb.common.b.e.cjz().a((com.tencent.pb.common.b.d)localObject1);
        return;
      }
      f.this.mHandler.removeCallbacks(f.this.xMP);
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "beginSenceCircle removeCallbacks" });
    }
  };
  private final int xMa = 3;
  private final int xMb = 4;
  public final int xMc = 6;
  public boolean xMe = false;
  public boolean xMf = false;
  public String xMg;
  public long xMh;
  public int xMi = 0;
  public int xMj = 0;
  public int xMk = 0;
  private long xMl = 0L;
  private boolean xMm = true;
  public int xMn = 0;
  public int xMo = -1;
  public h xMp = h.xNw;
  public b xMq;
  private talk.a xMr;
  private TimerTask xMs;
  TimerTask xMt;
  Timer xMu = new Timer("TalkRoomService_HelloTimer");
  private TimerTask xMv;
  private Timer xMw = new Timer("TalkRoomService_talkDurationTimer");
  public g xMx = new g();
  private int xMy = 0;
  public boolean xMz = false;
  int xnh;
  
  static
  {
    xLW = new ArrayList();
    xMd = 30000;
  }
  
  public f()
  {
    com.tencent.pb.common.b.e.cjz().a(201, this);
    com.tencent.pb.common.b.e.cjz().a(202, this);
    com.tencent.pb.common.b.e.cjz().a(203, this);
    com.tencent.pb.common.b.e.cjz().a(204, this);
    com.tencent.pb.common.b.e.cjz().a(205, this);
    com.tencent.pb.common.b.e.cjz().a(206, this);
    com.tencent.pb.common.b.e.cjz().a(207, this);
    com.tencent.pb.common.b.e.cjz().a(208, this);
    com.tencent.pb.common.b.e.cjz().a(210, this);
    com.tencent.pb.common.b.e.cjz().a(209, this);
    com.tencent.pb.common.b.e.cjz().a(211, this);
    com.tencent.pb.common.b.e.cjz().a(212, this);
    com.tencent.pb.common.b.e.cjz().a(213, this);
    com.tencent.pb.common.b.e.cjz().a(214, this);
    Object localObject = c.cnZ();
    g localg = this.xMx;
    Throwable localThrowable = new Throwable("trace caller");
    try
    {
      localThrowable.getStackTrace();
      ((c)localObject).xLN = localg;
      localObject = new HandlerThread("TalkRoomService");
      ((HandlerThread)localObject).start();
      this.mHandler = new Handler(((HandlerThread)localObject).getLooper(), this);
      if (this.xLy == null) {
        this.xLy = ((com.tencent.e.a.a)com.tencent.e.f.XS("EventCenter"));
      }
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "syscall", "register", Boolean.valueOf(true) });
      this.xLy.a(this, xMA);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "setTalkServerCallback caller stack: ", localThrowable });
      }
    }
  }
  
  public static boolean FB(int paramInt)
  {
    return paramInt != 1;
  }
  
  private void a(int paramInt1, int paramInt2, Object paramObject, com.tencent.wecall.talkroom.a.h paramh)
  {
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleRedirectResp", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt2 != 0) || (paramObject == null))
    {
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "handleRedirectResp err", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (b(paramh.groupId, paramh.mXg, paramh.mXh, false)) {
        this.xMp.N(new String[] { "redirect", "resp", "-1", String.valueOf(this.state) });
      }
      return;
    }
    paramObject = (a.ag)paramObject;
    if (!b(((a.ag)paramObject).groupId, ((a.ag)paramObject).rph, ((a.ag)paramObject).rpi, false))
    {
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "handleRedirectResp roomid error", Integer.valueOf(((a.ag)paramObject).rph), Integer.valueOf(this.ndF) });
      return;
    }
    this.xMp.N(new String[] { "redirect", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
    a(((a.ag)paramObject).groupId, null, this.xnh, ((a.ag)paramObject).rph, ((a.ag)paramObject).rpi, ((a.ag)paramObject).xpe, ((a.ag)paramObject).xpg, ((a.ag)paramObject).xnP, false, false);
    paramh = new byte[((a.ag)paramObject).xpi.length];
    paramInt1 = 0;
    while (paramInt1 < ((a.ag)paramObject).xpi.length)
    {
      paramh[paramInt1] = ((byte)paramObject.xpi[paramInt1]);
      paramInt1 += 1;
    }
    a(((a.ag)paramObject).xpf, ((a.ag)paramObject).xpm, ((a.ag)paramObject).xpn);
    this.xMq.Close();
    a.as[] arrayOfas = ((a.ag)paramObject).xpe;
    a.ap localap = ((a.ag)paramObject).xou;
    if ((((a.ag)paramObject).xph & 0x2) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      a(0, arrayOfas, localap, paramh, bool, ((a.ag)paramObject).groupId, ((a.ag)paramObject).rph, ((a.ag)paramObject).rpi);
      return;
    }
  }
  
  private void a(int paramInt, a.ae paramae)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleGetGroupInfoBatch errCode: ", Integer.valueOf(paramInt) });
    if (paramInt != 0)
    {
      this.xMx.de(null);
      return;
    }
    paramae = paramae.xpq;
    if ((paramae == null) || (paramae.length == 0))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleGetGroupInfoBatch resp.groupInfoList is null" });
      return;
    }
    ArrayList localArrayList = new ArrayList();
    int i = paramae.length;
    paramInt = 0;
    while (paramInt < i)
    {
      Object localObject = paramae[paramInt];
      if (localObject != null)
      {
        a(((a.ar)localObject).groupId, null, 0, ((a.ar)localObject).rph, ((a.ar)localObject).rpi, ((a.ar)localObject).xpe, null, null, false, false);
        localArrayList.add(c.cnZ().Yb(((a.ar)localObject).groupId));
      }
      paramInt += 1;
    }
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleGetGroupInfoBatch multiTalkGrouplist size: ", Integer.valueOf(localArrayList.size()) });
    this.xMx.de(localArrayList);
  }
  
  private void a(int paramInt, a.y paramy, com.tencent.wecall.talkroom.a.e parame)
  {
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd", parame.mHz, Integer.valueOf(parame.ndF), Long.valueOf(parame.xMh), " errCode: ", Integer.valueOf(paramInt), " state: ", Integer.valueOf(this.state) });
    Object localObject = com.tencent.pb.common.c.b.x(new Integer[] { Integer.valueOf(14200), Integer.valueOf(64435), Integer.valueOf(14201), Integer.valueOf(64434), Integer.valueOf(14202), Integer.valueOf(64433), Integer.valueOf(14203), Integer.valueOf(64432), Integer.valueOf(14204), Integer.valueOf(64431), Integer.valueOf(14205), Integer.valueOf(64425) });
    if (((Map)localObject).containsKey(Integer.valueOf(paramInt))) {
      h.FC(((Integer)((Map)localObject).get(Integer.valueOf(paramInt))).intValue());
    }
    if (paramInt == 14255)
    {
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd errCode =%d, groupId=%s,roomid=%d,roomkey=%s", Integer.valueOf(14255), paramy.groupId, Integer.valueOf(paramy.rph), Long.valueOf(paramy.rpi) });
      this.xMx.e(51281, paramy);
      return;
    }
    if (paramInt == 14256)
    {
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd errCode =%d, groupId=%s,roomid=%d,roomkey=%s", Integer.valueOf(14256), paramy.groupId, Integer.valueOf(paramy.rph), Long.valueOf(paramy.rpi) });
      this.xMx.e(51280, paramy);
      return;
    }
    if ((paramInt != 0) && (paramInt != 14204))
    {
      if (!b(parame.mHz, parame.ndF, parame.xMh, FB(parame.xNY)))
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd isCurrentRoom is false errCode:", Integer.valueOf(paramInt), " enterScene.mGroupId: ", parame.mHz, " mGroupId: ", this.mHz, Integer.valueOf(parame.ndF), Integer.valueOf(this.ndF), Long.valueOf(parame.xMh), Long.valueOf(this.xMh) });
        return;
      }
      if (3 != this.state)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd state is error: ", Integer.valueOf(this.state), " errCode: ", Integer.valueOf(paramInt), parame.mHz, Integer.valueOf(parame.ndF), Long.valueOf(parame.xMh) });
        return;
      }
      this.xMp.N(new String[] { "enter", "resp", String.valueOf(paramInt), String.valueOf(this.state) });
      this.xMp.FG(322);
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom handleEnterTalkRoomEnd fail errCode: ", Integer.valueOf(paramInt), parame.mHz, Integer.valueOf(parame.ndF), Long.valueOf(parame.xMh) });
      a(parame.mHz, parame.ndF, parame.xMh, true);
      if (paramInt == 14251)
      {
        this.xMx.e(64536, null);
        return;
      }
      if (paramInt == 14252)
      {
        this.xMx.e(64336, null);
        return;
      }
      if (paramInt == 14253)
      {
        parame = Integer.valueOf(60);
        if (paramy != null) {
          parame = Integer.valueOf(paramy.xpk);
        }
        this.xMx.e(64036, parame);
        return;
      }
      this.xMx.e(65336, null);
      return;
    }
    if ((paramInt == 14204) && (this.state == 4))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd errCode == EmRetCode.E_Talk_Enter_AlreadyEnter", paramy.groupId, Integer.valueOf(paramy.rph), Long.valueOf(paramy.rpi) });
      return;
    }
    if (!b(paramy.groupId, paramy.rph, paramy.rpi, FB(paramy.xnZ)))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd isCurrentRoom is false,state: ", Integer.valueOf(this.state), " resp.groupId锟斤拷", paramy.groupId, " mGroupId: ", this.mHz, Integer.valueOf(paramy.rph), Integer.valueOf(this.ndF), Long.valueOf(paramy.rpi), Long.valueOf(this.xMh) });
      a(paramy.groupId, paramy.rph, paramy.rpi, 111, false);
      h.FC(64426);
      return;
    }
    if (this.state != 3)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd state is error: ", Integer.valueOf(this.state), paramy.groupId, Integer.valueOf(paramy.rph), Long.valueOf(paramy.rpi) });
      return;
    }
    this.xMp.N(new String[] { "enter", "resp", String.valueOf(paramInt), String.valueOf(this.state) });
    if ((paramy.xpf == null) || (paramy.xpf.length == 0))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleEnterTalkRoomEnd resp.addrlist is null,errCode: ", Integer.valueOf(paramInt), paramy.groupId, Integer.valueOf(paramy.rph), Long.valueOf(paramy.rpi) });
      h.FC(63931);
      this.xMp.rzK = 329;
      a(paramy.groupId, paramy.rph, paramy.rpi, 116, true);
      this.xMx.e(65336, null);
      return;
    }
    this.mHz = paramy.groupId;
    this.xMB = paramy.groupId;
    this.ndF = paramy.rph;
    this.xMh = paramy.rpi;
    setState(4);
    a(paramy.xpf, paramy.xpm, paramy.xpn);
    a(paramy.groupId, null, this.xnh, paramy.rph, paramy.rpi, paramy.xpe, paramy.xpg, paramy.xnP, false, true);
    parame = this.xMx;
    localObject = new g.5(parame, c.cnZ().Yb(paramy.groupId));
    if (Looper.myLooper() == Looper.getMainLooper()) {
      ((Runnable)localObject).run();
    }
    for (;;)
    {
      parame = new byte[paramy.xpi.length];
      paramInt = 0;
      while (paramInt < paramy.xpi.length)
      {
        parame[paramInt] = ((byte)paramy.xpi[paramInt]);
        paramInt += 1;
      }
      parame.handler.post((Runnable)localObject);
    }
    localObject = paramy.xpe;
    a.ap localap = paramy.xou;
    if ((paramy.xph & 0x2) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      a(0, (a.as[])localObject, localap, parame, bool, paramy.groupId, paramy.rph, paramy.rpi);
      if (paramy.xpl != 0)
      {
        com.tencent.pb.common.c.c.j("TalkRoomService", new Object[] { "get helloFreqSeconds:" + paramy.xpl });
        xMd = paramy.xpl * 1000;
      }
      con();
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVoiceGroupMemberChange handleEnterTalkRoomEnd", this.mHz, Integer.valueOf(this.ndF), Long.valueOf(this.xMh) });
      return;
    }
  }
  
  public static void a(com.tencent.pb.talkroom.sdk.e parame)
  {
    xnt = parame;
  }
  
  private void a(String paramString, int paramInt, long paramLong, boolean paramBoolean)
  {
    a(paramString, paramInt, paramLong, paramBoolean, true, true);
  }
  
  private void a(String paramString1, String paramString2, int paramInt1, int paramInt2, long paramLong, a.as[] paramArrayOfas, a.at[] paramArrayOfat, a.aq paramaq, boolean paramBoolean1, boolean paramBoolean2)
  {
    c localc;
    Object localObject2;
    label66:
    boolean bool;
    if (paramArrayOfas == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "printMembersLog members is null groupId: ", paramString1, "  roomid: ", Integer.valueOf(paramInt2), "  roomKey", Long.valueOf(paramLong) });
      localc = c.cnZ();
      if (paramInt1 != 0) {
        break label690;
      }
      localObject2 = null;
      if ((this.mHz == null) || (!this.mHz.equals(paramString1))) {
        break label699;
      }
      bool = true;
      label87:
      com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "newOrUpdateGroup groupId: ", paramString1, " isActive: ", Boolean.valueOf(bool) });
      if (!TextUtils.isEmpty(paramString1)) {
        break label1281;
      }
    }
    label196:
    label451:
    label456:
    label690:
    label699:
    label792:
    label820:
    label1157:
    label1162:
    label1233:
    label1281:
    for (String str = paramString2;; str = paramString1)
    {
      if (TextUtils.isEmpty(str)) {
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "newOrUpdateGroup invalid groupId" });
      }
      long l;
      Object localObject1;
      for (paramBoolean1 = false;; paramBoolean1 = false)
      {
        paramString2 = this.mHz;
        int i = this.ndF;
        l = this.xMh;
        bool = b(paramString1, paramInt2, paramLong, false);
        if (paramArrayOfas == null) {
          break label1157;
        }
        paramInt1 = paramArrayOfas.length;
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "engine handleVoiceGroupMemberChange", paramString1, paramString2, Integer.valueOf(paramInt2), Integer.valueOf(i), Long.valueOf(paramLong), Long.valueOf(l), Boolean.valueOf(paramBoolean1), " isCurrentRoom: ", Boolean.valueOf(bool), " members.length: ", Integer.valueOf(paramInt1), " isCallBackEngine: ", Boolean.valueOf(paramBoolean2), " mFirstGetAudioData: ", Boolean.valueOf(this.xMm) });
        if (c.cnZ().bi(this.mHz, false))
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVoiceGroupMemberChange isGroupActive mFirstGetAudioData: ", Boolean.valueOf(this.xMm), " mGroupId: ", this.mHz, " roomId: ", Integer.valueOf(paramInt2) });
          if (this.xMm)
          {
            this.xMm = false;
            this.nnu = true;
            this.xMz = k.coy();
            this.xMk = this.xMi;
            if (this.xMv == null) {
              break label1162;
            }
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "refreashTalkingTime mTalkDurationTimerTask is null" });
          }
        }
        if (paramArrayOfas != null) {
          break label1233;
        }
        return;
        localObject1 = new StringBuffer();
        int j = paramArrayOfas.length;
        i = 0;
        while (i < j)
        {
          localObject2 = paramArrayOfas[i];
          if (localObject2 != null) {
            ((StringBuffer)localObject1).append(" memberId:" + ((a.as)localObject2).mXM + " uuid: " + ((a.as)localObject2).xps + " status: " + ((a.as)localObject2).status + "   mem.inviteTime:" + ((a.as)localObject2).xqm + "  mem.reason: " + ((a.as)localObject2).fFs + "  mem.inviteuuid: " + ((a.as)localObject2).xqy + "\n");
          }
          i += 1;
        }
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "printMembersLog groupId: ", paramString1, "  romid: ", Integer.valueOf(paramInt2), "  roomKey", Long.valueOf(paramLong), "  members.length: ", Integer.valueOf(paramArrayOfas.length), "  ", ((StringBuffer)localObject1).toString() });
        break;
        localObject2 = Integer.valueOf(paramInt1);
        break label66;
        bool = false;
        break label87;
        if (j.Yi(paramString2)) {
          localc.xLM.put(paramString2, str);
        }
        localObject1 = (TalkRoom)localc.xLL.get(str);
        if ((TextUtils.isEmpty(paramString2)) || (localObject1 == null) || (paramaq == null) || (paramaq.fBu == 100)) {
          break label792;
        }
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "newOrUpdateGroup clientGroupId is not empty , room is not null" });
      }
      if (localObject1 == null) {
        if (j.Yi(paramString2))
        {
          localObject1 = (TalkRoom)localc.xLL.get(paramString2);
          localObject3 = localObject1;
          if (localObject1 != null) {
            localc.xLL.put(str, localObject1);
          }
        }
      }
      for (Object localObject3 = localObject1;; localObject3 = localObject1)
      {
        if ((localObject3 != null) && (bool))
        {
          paramInt1 = j.cow();
          l = j.cox();
          com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "check current active group roomId: ", Integer.valueOf(paramInt1), " and roomKey: ", Long.valueOf(paramLong) });
          if ((paramInt1 != 0) && (paramInt1 != paramInt2))
          {
            com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "diff roomId: ", Integer.valueOf(paramInt1), " -> ", Integer.valueOf(paramInt2) });
            paramBoolean1 = false;
            break;
          }
          if ((0L != l) && (l != paramLong))
          {
            com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "diff roomKey: ", Long.valueOf(l), " -> ", Long.valueOf(paramLong) });
            paramBoolean1 = false;
            break;
          }
        }
        if (localObject3 == null)
        {
          com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "newOrUpdateGroup create groupId: ", str });
          paramString2 = TalkRoom.a(str, paramString2, (Integer)localObject2, paramInt2, paramLong, paramaq, paramArrayOfas, paramArrayOfat);
          localc.xLL.put(str, paramString2);
        }
        for (;;)
        {
          if ((localc.xLN != null) && (paramBoolean1)) {
            localc.xLN.g(localc.Yb(str));
          }
          c.coa();
          paramBoolean1 = true;
          break;
          com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "newOrUpdateGroup update groupId: ", str });
          TalkRoom.a((TalkRoom)localObject3, str, paramString2, (Integer)localObject2, paramInt2, paramLong, paramaq, paramArrayOfas, paramArrayOfat);
        }
        paramInt1 = 0;
        break label196;
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "refreashTalkingTime mTalkRoomTalkingCallBack: ", this.xLV, " mIsHoldOn: ", Boolean.valueOf(this.xML) });
        this.xMv = new TimerTask()
        {
          public final void run()
          {
            if (!f.this.xML)
            {
              f.this.xMi += 1;
              if (f.this.xMz) {
                f.this.xMk += 1;
              }
              if ((f.this.xMo == 3) || (f.this.xMo == 2))
              {
                f.this.xMj += 1;
                f.this.xMp.rzY = (f.this.xMj * 1000);
              }
              f.this.xMp.xNB = (f.this.xMi * 1000);
              f.this.xMp.rzX = f.this.xMp.xNB;
            }
            if (f.this.xLV != null)
            {
              f.f localf = f.this.xLV;
              boolean bool = f.this.xML;
              int i = f.this.xMi;
            }
          }
        };
        this.xMw.scheduleAtFixedRate(this.xMv, 1000L, 1000L);
        break label451;
        if ((!paramBoolean2) || (!b(paramString1, paramInt2, paramLong, false)) || (paramArrayOfas.length <= 0) || (this.xMq == null)) {
          break label456;
        }
        a(paramArrayOfas);
        return;
        break label820;
      }
    }
  }
  
  private void a(a.as[] paramArrayOfas)
  {
    if (paramArrayOfas == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "onMebersChangedToEngine members is null" });
      return;
    }
    int[] arrayOfInt = new int[paramArrayOfas.length];
    StringBuffer localStringBuffer = new StringBuffer();
    int i = 0;
    while (i < paramArrayOfas.length)
    {
      arrayOfInt[i] = paramArrayOfas[i].mXM;
      localStringBuffer.append(paramArrayOfas[i].mXM);
      localStringBuffer.append(",");
      i += 1;
    }
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "engine handleVoiceGroupMemberChange engine.OnMembersChanged memberid: ", localStringBuffer.toString() });
    if (this.xMq == null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "onMebersChangedToEngine engine is null" });
      return;
    }
    this.xMq.OnMembersChanged(arrayOfInt);
  }
  
  private void a(a.n[] paramArrayOfn1, a.n[] paramArrayOfn2, int paramInt)
  {
    if (paramArrayOfn1 == null) {}
    for (int i = 0;; i = paramArrayOfn1.length)
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleRelayData addrs length: ", Integer.valueOf(i) });
      if ((paramArrayOfn1 != null) && (paramArrayOfn1.length > 0)) {
        break;
      }
      return;
    }
    this.xMH = new int[paramArrayOfn1.length];
    this.xMG = new short[paramArrayOfn1.length];
    this.xMJ = new int[paramArrayOfn2.length];
    this.xMI = new short[paramArrayOfn2.length];
    this.xMK = paramInt;
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleRelayData tcpStartTime: ", Integer.valueOf(this.xMK) });
    int j = paramArrayOfn1.length;
    paramInt = 0;
    i = 0;
    while (paramInt < j)
    {
      a.n localn = paramArrayOfn1[paramInt];
      this.xMH[i] = localn.xoq;
      this.xMG[i] = ((short)localn.port);
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleRelayData ip: ", Integer.valueOf(localn.xoq), " addr.port: ", Integer.valueOf(localn.port) });
      i += 1;
      paramInt += 1;
    }
    j = paramArrayOfn2.length;
    paramInt = 0;
    i = 0;
    while (paramInt < j)
    {
      paramArrayOfn1 = paramArrayOfn2[paramInt];
      this.xMJ[i] = paramArrayOfn1.xoq;
      this.xMI[i] = ((short)paramArrayOfn1.port);
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleRelayData tcpIp: ", Integer.valueOf(paramArrayOfn1.xoq), " tcpAddr.port: ", Integer.valueOf(paramArrayOfn1.port) });
      i += 1;
      paramInt += 1;
    }
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleRelayData", Arrays.toString(this.xMH), Arrays.toString(this.xMG), this.mHz, this.mHz, Integer.valueOf(this.ndF), Long.valueOf(this.xMh), Arrays.toString(this.xMJ), Arrays.toString(this.xMI), Integer.valueOf(this.xMK) });
  }
  
  private boolean a(a.as[] paramArrayOfas, a.ap paramap, byte[] paramArrayOfByte, boolean paramBoolean, int paramInt, long paramLong)
  {
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "connectToCompenent myRoomMemId roomid:", Integer.valueOf(paramInt), " roomKey: ", Long.valueOf(paramLong), " groupId: ", this.mHz, " ip: ", Arrays.toString(this.xMH), " ports: ", Arrays.toString(this.xMG), " tcpIp: ", Arrays.toString(this.xMJ), " tcpPorts: ", Arrays.toString(this.xMI), " tcpStartTime: ", Integer.valueOf(this.xMK) });
    Object localObject2 = com.tencent.pb.b.a.a.cjV();
    int i = -1;
    Object localObject1;
    if ((paramArrayOfas != null) && (paramArrayOfas.length > 0))
    {
      localObject1 = new int[paramArrayOfas.length];
      j = 0;
      while (j < paramArrayOfas.length)
      {
        localObject1[j] = paramArrayOfas[j].mXM;
        if (com.tencent.pb.common.c.h.equals(paramArrayOfas[j].xps, (String)localObject2)) {
          i = paramArrayOfas[j].mXM;
        }
        j += 1;
      }
      paramArrayOfas = (a.as[])localObject1;
    }
    for (int j = i;; j = -1)
    {
      int k = c.cnZ().XX(this.mHz);
      this.xMp.mXM = j;
      for (;;)
      {
        try
        {
          localObject2 = this.xMq;
          talk.a locala = this.xMr;
          localObject3 = c.cnZ();
          localObject1 = this.mHz;
          localObject3 = ((c)localObject3).XW((String)localObject1);
          if (localObject3 != null) {
            continue;
          }
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMyUuid TalkRoom is null  groupId: ", localObject1 });
          i = 0;
          localObject3 = this.xMH;
          short[] arrayOfShort1 = this.xMG;
          int[] arrayOfInt = this.xMJ;
          short[] arrayOfShort2 = this.xMI;
          int m = this.xMK;
          com.tencent.pb.common.c.c.d("simon:TalkRoomContext", new Object[] { "Open" });
          localObject1 = null;
          if (paramap == null) {
            continue;
          }
          paramap = new i(paramap.xpE, paramap.htD, paramap.htE, paramap.xpF, paramap.xpG, paramap.xpH, paramap.xpI, paramap.xpJ, paramap.xpK, paramap.xpL, paramap.xpM, paramap.xpN);
          int n = k.il(com.tencent.pb.common.c.d.rwf);
          paramInt = ((b)localObject2).xLI.Open(locala, paramap, i, j, paramInt, paramLong, (int[])localObject3, arrayOfShort1, 0, paramArrayOfas, paramArrayOfByte, paramBoolean, n, arrayOfInt, arrayOfShort2, m);
        }
        catch (Throwable paramArrayOfas)
        {
          Object localObject3;
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "connectToCompenent", paramArrayOfas });
          paramInt = -99999;
          continue;
          paramArrayOfas.handler.post(paramap);
          continue;
        }
        paramArrayOfas = this.xMx;
        paramap = new g.18(paramArrayOfas, paramInt);
        if (Looper.myLooper() != Looper.getMainLooper()) {
          continue;
        }
        paramap.run();
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "connectToCompenent ret =", Integer.valueOf(paramInt), Integer.valueOf(j), Integer.valueOf(k) });
        if (paramInt < 0) {
          h.FF(62534);
        }
        if (paramInt == 0) {
          this.xMp.rzN = 1;
        }
        if (paramInt != 0) {
          break label758;
        }
        return true;
        localObject3 = ((TalkRoom)localObject3).XV(com.tencent.pb.b.a.a.cjV());
        if (localObject3 == null)
        {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMyUuid talkRoomMember is null  groupId: ", localObject1 });
          i = 0;
        }
        else
        {
          localObject3 = ((d)localObject3).xLO;
          if (localObject3 == null)
          {
            com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMyUuid voiceGroupMem is null  groupId: ", localObject1 });
            i = 0;
          }
          else
          {
            com.tencent.pb.common.c.c.d("TalkRoomManager", new Object[] { "getMyUuid groupId: ", localObject1, " uuid: ", Integer.valueOf(((a.as)localObject3).trb) });
            i = ((a.as)localObject3).trb;
            continue;
            com.tencent.pb.common.c.c.k("simon:TalkRoomContext", new Object[] { "voiceConf is null" });
            paramap = (a.ap)localObject1;
          }
        }
      }
      label758:
      return false;
      paramArrayOfas = null;
    }
  }
  
  private static int b(int paramInt1, int paramInt2, com.tencent.pb.talkroom.sdk.b paramb)
  {
    j = -100;
    try
    {
      com.tencent.pb.talkroom.sdk.e locale = xnt;
      i = j;
      if (locale != null) {
        i = locale.a(paramInt1, paramInt2, paramb);
      }
    }
    catch (Exception paramb)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "startPlayer: ", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramb });
        int i = j;
      }
    }
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "startPlayer samplerate: ", " frameDuration: ", Integer.valueOf(paramInt2), " ret: ", Integer.valueOf(i) });
    return i;
  }
  
  private static int b(int paramInt1, int paramInt2, com.tencent.pb.talkroom.sdk.c paramc)
  {
    j = -100;
    try
    {
      com.tencent.pb.talkroom.sdk.e locale = xnt;
      i = j;
      if (locale != null) {
        i = locale.a(paramInt1, paramInt2, paramc);
      }
    }
    catch (Exception paramc)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "startRecord: ", paramc });
        int i = j;
      }
    }
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "startRecord samplerate: ", " frameDuration: ", Integer.valueOf(paramInt2), " ret: ", Integer.valueOf(i) });
    return i;
  }
  
  private void b(String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "sendEnterGroupScence groupId: ", paramString, " roomId: ", Integer.valueOf(paramInt1), " roomKey: ", Long.valueOf(paramLong), " enterType: ", Integer.valueOf(paramInt3), " isSenceCircle: ", Boolean.valueOf(true) });
    if ((paramInt1 == 0) || (paramLong == 0L))
    {
      com.tencent.pb.common.c.c.e("TalkRoomService", new Object[] { "roomId or roomkey is 0..return." });
      return;
    }
    h localh;
    if (!FB(paramInt3))
    {
      localh = this.xMp;
      com.tencent.pb.common.c.c.d(h.TAG, new Object[] { "endAnswerTime", Long.valueOf(localh.xNM) });
      if (localh.xNM != 0L) {
        break label231;
      }
    }
    label231:
    for (localh.mYC = 0L;; localh.mYC = (System.currentTimeMillis() - localh.xNM))
    {
      this.xMp.cou();
      paramString = new com.tencent.wecall.talkroom.a.e(paramString, paramInt1, paramLong, this.xMq.cnX(), paramInt2, paramInt3);
      com.tencent.pb.common.b.e.cjz().a(paramString);
      this.mHandler.removeCallbacks(this.xMP);
      this.xMO = paramString;
      this.mHandler.postDelayed(this.xMP, 3000L);
      return;
    }
  }
  
  private void b(String paramString1, int paramInt, long paramLong, String paramString2)
  {
    this.ndF = paramInt;
    this.xMh = paramLong;
    this.mHz = paramString2;
    this.xMg = paramString1;
  }
  
  private boolean cok()
  {
    try
    {
      com.tencent.pb.talkroom.sdk.e locale = xnt;
      if (locale == null) {
        break label74;
      }
      this.xMp.rsj = locale.aPX();
      bool = locale.aPV();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "stopPlayer: ", localException });
        label74:
        boolean bool = false;
      }
    }
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "stopPlayer ret: ", Boolean.valueOf(bool) });
    return bool;
  }
  
  private void con()
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "hello timer start~~" });
    if (this.xMs != null)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "dealWithInit enter talkroom not first time" });
      return;
    }
    try
    {
      this.xMs = new TimerTask()
      {
        public final void run()
        {
          if ((f.this.ndF == 0) || (f.this.mHz == null))
          {
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "talkNoopTimer error: roomId %d, talkUsername %s", Integer.valueOf(f.this.ndF), f.this.mHz });
            f.this.cop();
          }
          f localf;
          l locall;
          do
          {
            return;
            localf = f.this;
            locall = f.this.com();
          } while (localf.xMt != null);
          localf.xMt = new f.3(localf, locall);
          localf.xMu.schedule(localf.xMt, 120000L);
        }
      };
      this.xMu.schedule(this.xMs, 0L, xMd);
      return;
    }
    catch (Exception localException)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "startNooper: ", localException });
    }
  }
  
  private void coo()
  {
    try
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelHelloTimeOutTask" });
      if (this.xMt != null) {
        this.xMt.cancel();
      }
      this.xMt = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelHelloTimeOutTask: ", localException });
      }
    }
  }
  
  public static com.tencent.pb.talkroom.sdk.e cor()
  {
    return xnt;
  }
  
  static String[] df(List<String> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      String[] arrayOfString = new String[paramList.size()];
      paramList = paramList.iterator();
      int i = 0;
      while (paramList.hasNext())
      {
        arrayOfString[i] = ((String)paramList.next());
        i += 1;
      }
      return arrayOfString;
    }
    return new String[0];
  }
  
  private boolean dt(String paramString, int paramInt)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelCreateTalkRoom clientGroupId: ", paramString });
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    com.tencent.wecall.talkroom.a.c localc = new com.tencent.wecall.talkroom.a.c(paramString, paramInt, this.xnh);
    boolean bool = com.tencent.pb.common.b.e.cjz().a(localc);
    this.xMp.N(new String[] { "cancel", "req", String.valueOf(bool), String.valueOf(this.state) });
    a(paramString, this.ndF, this.xMh, true);
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelCreateTalkRoom ret: ", Boolean.valueOf(bool) });
    return bool;
  }
  
  private void h(String paramString, int paramInt, long paramLong)
  {
    Object localObject1 = null;
    for (;;)
    {
      Object localObject2;
      try
      {
        localObject2 = c.cnZ();
        if ((paramInt == 0) && (paramLong == 0L))
        {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMsgKeyByGroupId roomId and roomKey is 0,groupId: ", paramString });
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "addCallLog groupId: ", paramString, " mIsOutCall: ", Boolean.valueOf(this.rpz), " mTalkDuration: ", Integer.valueOf(this.xMi), " msgKey: ", localObject1 });
          return;
        }
        localObject2 = ((c)localObject2).XW(paramString);
        if (localObject2 == null)
        {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMsgKeyByGroupId talkRoom is null,groupId: ", paramString });
          continue;
        }
        localObject2 = ((TalkRoom)localObject2).XV(com.tencent.pb.b.a.a.cjV());
      }
      catch (Throwable paramString)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleRoomExit: ", paramString });
        return;
      }
      if (localObject2 == null)
      {
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMsgKeyByGroupId talkRoomMember is null,groupId: ", paramString });
      }
      else
      {
        localObject2 = ((d)localObject2).xLO;
        if (localObject2 == null)
        {
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMsgKeyByGroupId voiceGroupMem is null,groupId: ", paramString });
        }
        else
        {
          localObject1 = new StringBuffer();
          ((StringBuffer)localObject1).append(paramString);
          ((StringBuffer)localObject1).append(",");
          ((StringBuffer)localObject1).append(paramInt);
          ((StringBuffer)localObject1).append(",");
          ((StringBuffer)localObject1).append(paramLong);
          ((StringBuffer)localObject1).append(",");
          ((StringBuffer)localObject1).append(((a.as)localObject2).xqo);
          com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "getMsgKeyByGroupId msgKey is", ((StringBuffer)localObject1).toString() });
          localObject1 = ((StringBuffer)localObject1).toString();
        }
      }
    }
  }
  
  private boolean qr()
  {
    try
    {
      com.tencent.pb.talkroom.sdk.e locale = xnt;
      if (locale == null) {
        break label74;
      }
      this.xMp.rsc = locale.aPY();
      bool = locale.aPW();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "stopRecord: ", localException });
        label74:
        boolean bool = false;
      }
    }
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "stopRecord ret: ", Boolean.valueOf(bool) });
    return bool;
  }
  
  public static boolean sr()
  {
    try
    {
      bool = ((AudioManager)com.tencent.pb.common.c.d.rwf.getSystemService("audio")).isSpeakerphoneOn();
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "isSpeakerOn ret: ", Boolean.valueOf(bool) });
      return bool;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "isSpeakerOn ", localException });
        boolean bool = false;
      }
    }
  }
  
  public final e Yc(String paramString)
  {
    return (e)this.xLX.get(paramString);
  }
  
  public final boolean Yd(String paramString)
  {
    return (e)this.xLX.get(paramString) != null;
  }
  
  public final boolean Z(String paramString, int paramInt1, int paramInt2)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "finishCurrentTalk groupId: ", paramString, " rejectReason: ", Integer.valueOf(paramInt1), " exitReason: ", Integer.valueOf(paramInt2) });
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    if ((paramInt1 == 1) || (paramInt2 == 100))
    {
      localObject = this.xMp;
      com.tencent.pb.common.c.c.d(h.TAG, new Object[] { "endCancelCreate", Long.valueOf(System.currentTimeMillis() - ((h)localObject).xNK), Long.valueOf(((h)localObject).xNz) });
      if (((h)localObject).xNz <= 0L)
      {
        ((h)localObject).rzR = 1;
        if (((h)localObject).xNK != 0L) {
          break label195;
        }
      }
    }
    int i;
    long l;
    int j;
    label195:
    for (((h)localObject).rzS = 0L;; ((h)localObject).rzS = (System.currentTimeMillis() - ((h)localObject).xNK))
    {
      i = this.ndF;
      l = this.xMh;
      j = a.cnN().state;
      if (!j.Yi(paramString)) {
        break;
      }
      this.xMp.FG(327);
      return a.cnN().dt(paramString, 1000);
    }
    if (j == 2) {
      return a.cnN().b(paramString, i, l, paramInt1);
    }
    Object localObject = new ArrayList();
    paramInt1 = 0;
    while (paramInt1 < 7)
    {
      ((List)localObject).add(new Integer[] { Integer.valueOf(102), Integer.valueOf(103), Integer.valueOf(104), Integer.valueOf(105), Integer.valueOf(106), Integer.valueOf(107), Integer.valueOf(108) }[paramInt1]);
      paramInt1 += 1;
    }
    ((List)localObject).contains(Integer.valueOf(paramInt2));
    return a.cnN().a(paramString, i, l, paramInt2, true);
  }
  
  public final b a(Activity paramActivity, String paramString, int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "enterTalkRoom", paramString, Integer.valueOf(this.ndF), Integer.valueOf(paramInt1), Long.valueOf(this.xMh), Long.valueOf(paramLong), Integer.valueOf(paramInt3), "needConfirm", Boolean.valueOf(false) });
    if (!com.tencent.pb.b.a.a.cjW())
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "enterTalkRoom isAuthed: ", Boolean.valueOf(com.tencent.pb.b.a.a.cjW()), " isBindMobile: ", Boolean.valueOf(true) });
      h.a(paramString, "", this.ndF, this.xMh, new String[] { "enter", "req", "false", String.valueOf(paramInt3), "noAuth" });
      return b.xNg;
    }
    com.tencent.pb.common.b.h.isNetworkConnected();
    if ((FB(paramInt3)) && (paramInt3 != 100) && (brT()))
    {
      h.a(paramString, "", this.ndF, this.xMh, new String[] { "enter", "req", "false", String.valueOf(paramInt3), "isBusy" });
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "enterTalkRoom isBusy" });
      return b.xNk;
    }
    boolean bool;
    if (paramInt3 == 100) {
      bool = true;
    }
    while (!bool)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom enterTalkRoom isValidEnterState is false enterType: ", Integer.valueOf(paramInt3), " state: ", Integer.valueOf(this.state) });
      h.a(paramString, "", this.ndF, this.xMh, new String[] { "enter", "req", "false", String.valueOf(paramInt3), "isNotValidEnterState" });
      return b.xNl;
      if (FB(paramInt3))
      {
        if (this.state == 0) {
          bool = true;
        } else {
          bool = false;
        }
      }
      else if (paramInt3 == 1) {
        bool = Yd(paramString);
      } else {
        bool = false;
      }
    }
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom enterTalkRoom groupId is null" });
      h.a(paramString, "", this.ndF, this.xMh, new String[] { "enter", "req", "false", String.valueOf(paramInt3), "groupIdnull" });
      return b.xNm;
    }
    if (FB(paramInt3))
    {
      col();
      mR(false);
    }
    coi();
    if (!bqA())
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom enterTalkRoom initEngine fail" });
      if (FB(paramInt3))
      {
        h.a(paramString, "", this.ndF, this.xMh, new String[] { "enter", "req", "false", "initEnginefail" });
        mR(false);
      }
      for (;;)
      {
        return b.xNo;
        this.xMp.N(new String[] { "enter", "req", "false", "initEnginefail" });
      }
    }
    this.mHz = paramString;
    int i;
    long l;
    if (!FB(paramInt3))
    {
      paramActivity = Yc(paramString);
      if (paramActivity == null)
      {
        i = 0;
        this.ndF = i;
        if (paramActivity != null) {
          break label843;
        }
        l = 0L;
        label695:
        this.xMh = l;
        label701:
        this.xMB = paramString;
        this.xnh = paramInt2;
        setState(3);
        if (!FB(paramInt3)) {
          break label866;
        }
        bool = true;
        label728:
        this.rpz = bool;
        if (this.rpz) {
          this.xMp.cot();
        }
        if ((!this.rpz) || (c.cnZ().bi(this.mHz, true))) {
          break label872;
        }
        paramActivity = new c();
        paramActivity.groupId = paramString;
        paramActivity.mXg = paramInt1;
        paramActivity.mXh = paramLong;
        paramActivity.xnZ = paramInt3;
        paramActivity.xnS = paramInt2;
        paramString = Message.obtain();
        paramString.what = 3;
        paramString.obj = paramActivity;
        this.mHandler.sendMessageDelayed(paramString, 0L);
      }
    }
    for (;;)
    {
      return b.xNf;
      i = paramActivity.mXg;
      break;
      label843:
      l = paramActivity.mXh;
      break label695;
      this.ndF = paramInt1;
      this.xMh = paramLong;
      break label701;
      label866:
      bool = false;
      break label728;
      label872:
      b(paramString, this.ndF, this.xMh, paramInt2, paramInt3);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.pb.common.b.d paramd)
  {
    int i;
    if (paramd != null)
    {
      paramString = Integer.valueOf(paramd.getType());
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "CLTNOT onNetSceneEnd errCode:", Integer.valueOf(paramInt2), " errType: ", Integer.valueOf(paramInt1), " scene.getType(): ", paramString });
      if ((paramInt1 == 1) || (paramInt1 == 2))
      {
        paramString = com.tencent.pb.common.c.b.x(new Integer[] { Integer.valueOf(201), Integer.valueOf(64532), Integer.valueOf(202), Integer.valueOf(64429), Integer.valueOf(203), Integer.valueOf(64331), Integer.valueOf(204), Integer.valueOf(64232), Integer.valueOf(205), Integer.valueOf(64133), Integer.valueOf(207), Integer.valueOf(64034), Integer.valueOf(209), Integer.valueOf(64024), Integer.valueOf(206), Integer.valueOf(64014), Integer.valueOf(208), Integer.valueOf(64004), Integer.valueOf(210), Integer.valueOf(63994) });
        i = paramd.getType();
        if (paramString.containsKey(Integer.valueOf(i))) {
          h.FC(((Integer)paramString.get(Integer.valueOf(i))).intValue());
        }
      }
      if (paramInt2 != -1) {
        break label994;
      }
    }
    label994:
    label1283:
    label1951:
    label2209:
    label2759:
    label2765:
    label3024:
    label3026:
    label3584:
    label3889:
    label3900:
    label4063:
    label4106:
    label4121:
    label4489:
    label4502:
    label4524:
    label4623:
    label4722:
    for (;;)
    {
      try
      {
        if (paramd.getType() == 201)
        {
          paramString = (com.tencent.wecall.talkroom.a.d)paramd;
          if (com.tencent.pb.common.c.h.fi(this.xMg, paramString.xMg))
          {
            this.xMp.FG(301);
            this.xMp.N(new String[] { "create", "resp", "-1", String.valueOf(this.state) });
            dt(paramString.xMg, 1001);
            if (!paramString.xNX) {
              this.xLy.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
            }
            this.xMx.e(-100, null);
          }
          return;
          paramString = "";
          break;
        }
        if (paramd.getType() == 209)
        {
          paramString = (com.tencent.wecall.talkroom.a.g)paramd;
          this.xMx.ds(paramString.mHz, paramInt2);
          return;
        }
      }
      catch (Exception paramString)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelCreateTalkRoom: ", paramString });
        return;
      }
      if (paramd.getType() == 206)
      {
        paramString = (com.tencent.wecall.talkroom.a.a)paramd;
        if (!b(paramString.mHz, paramString.ndF, paramString.xMh, false)) {
          h.a(paramString.mHz, paramString.ndF, paramString.xMh, new String[] { "ack", "resp", "-1", String.valueOf(this.state) });
        }
        this.xMx.a(paramString.xNW, c.cnZ().Yb(paramString.mHz));
        return;
      }
      if (paramd.getType() == 204)
      {
        paramString = (com.tencent.wecall.talkroom.a.b)paramd;
        if (b(paramString.mHz, paramString.ndF, paramString.xMh, false))
        {
          this.xMp.N(new String[] { "add", "resp", "-1", String.valueOf(this.state) });
          this.xMx.e(65236, null);
        }
      }
      else if (paramd.getType() == 202)
      {
        paramString = (com.tencent.wecall.talkroom.a.e)paramd;
        if ((b(paramString.mHz, paramString.ndF, paramString.xMh, FB(paramString.xNY))) && (this.state == 3))
        {
          this.xMp.FG(302);
          this.xMx.e(65336, null);
        }
      }
      else
      {
        if (paramd.getType() == 212)
        {
          this.xMx.de(null);
          return;
        }
        if (paramd.getType() == 213)
        {
          if (com.tencent.pb.common.c.h.equals(((com.tencent.wecall.talkroom.a.j)paramd).mHz, this.mHz))
          {
            this.xMp.N(new String[] { "sendmsg", "resp", "-1", String.valueOf(this.state) });
            this.xMx.e(64836, null);
          }
        }
        else if (paramd.getType() == 211)
        {
          paramString = (com.tencent.wecall.talkroom.a.h)paramd;
          if (b(paramString.groupId, paramString.mXg, paramString.mXh, false)) {
            this.xMp.N(new String[] { "redirect", "resp", "-1", String.valueOf(this.state) });
          }
        }
        else if (paramd.getType() == 214)
        {
          paramString = (com.tencent.wecall.talkroom.a.k)paramd;
          if (b(paramString.mHz, paramString.ndF, paramString.xMh, false))
          {
            this.xMx.e(64736, null);
            return;
            Object localObject1;
            Object localObject2;
            if (paramd.getType() == 201)
            {
              localObject1 = (com.tencent.wecall.talkroom.a.d)paramd;
              if ((localObject1 != null) && (((com.tencent.pb.common.b.d)localObject1).xnf != null))
              {
                paramString = (a.x)((com.tencent.pb.common.b.d)localObject1).xnf;
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd errCode: ", Integer.valueOf(paramInt2), Integer.valueOf(((com.tencent.wecall.talkroom.a.d)localObject1).mType), ((com.tencent.wecall.talkroom.a.d)localObject1).xMg });
                if (((com.tencent.wecall.talkroom.a.d)localObject1).xNX) {
                  break label2759;
                }
                i = 1;
                localObject2 = com.tencent.pb.common.c.b.x(new Integer[] { Integer.valueOf(14000), Integer.valueOf(64535), Integer.valueOf(14001), Integer.valueOf(64534), Integer.valueOf(14002), Integer.valueOf(64527) });
                if (((Map)localObject2).containsKey(Integer.valueOf(paramInt2))) {
                  h.FC(((Integer)((Map)localObject2).get(Integer.valueOf(paramInt2))).intValue());
                }
                if (paramInt2 != 14002)
                {
                  xLW = null;
                  if (paramInt2 == 0) {
                    break label3026;
                  }
                  if (com.tencent.pb.common.c.h.fi(this.xMg, ((com.tencent.wecall.talkroom.a.d)localObject1).xMg)) {
                    break label2765;
                  }
                  com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd mClientGroupId is not same mClientGroupId: ", this.xMg, " createScene.mClientGroupId: ", ((com.tencent.wecall.talkroom.a.d)localObject1).xMg, " errCode: ", Integer.valueOf(paramInt2) });
                  if (i != 0) {
                    this.xLy.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
                  }
                }
              }
            }
            if (paramd.getType() == 202)
            {
              paramString = (com.tencent.wecall.talkroom.a.e)paramd;
              if ((paramString != null) && (paramString.xnf != null)) {
                a(paramInt2, (a.y)paramString.xnf, paramString);
              }
            }
            if (paramd.getType() == 204)
            {
              paramString = (com.tencent.wecall.talkroom.a.b)paramd;
              if ((paramString != null) && (paramString.xnf != null))
              {
                localObject1 = (a.v)paramString.xnf;
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleAddVoiceGroupMemberEnd", this.mHz, Integer.valueOf(this.ndF), Long.valueOf(this.xMh), " errCode: ", Integer.valueOf(paramInt2) });
                localObject2 = com.tencent.pb.common.c.b.x(new Integer[] { Integer.valueOf(14600), Integer.valueOf(64235), Integer.valueOf(14601), Integer.valueOf(64234), Integer.valueOf(14602), Integer.valueOf(64233) });
                if (((Map)localObject2).containsKey(Integer.valueOf(paramInt2))) {
                  h.FC(((Integer)((Map)localObject2).get(Integer.valueOf(paramInt2))).intValue());
                }
                if (paramInt2 == 0) {
                  break label3889;
                }
                if (b(paramString.mHz, paramString.ndF, paramString.xMh, false))
                {
                  this.xMp.N(new String[] { "add", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
                  this.xMx.e(65236, null);
                }
              }
            }
            if (paramd.getType() == 203)
            {
              paramString = (com.tencent.wecall.talkroom.a.f)paramd;
              if ((paramString != null) && (paramString.xnf != null))
              {
                com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleExitVoiceRoomEnd", ((a.z)paramString.xnf).groupId, this.mHz, Integer.valueOf(this.ndF), Long.valueOf(this.xMh), " errCode: ", Integer.valueOf(paramInt2) });
                paramString = com.tencent.pb.common.c.b.x(new Integer[] { Integer.valueOf(14400), Integer.valueOf(64335), Integer.valueOf(14401), Integer.valueOf(64334), Integer.valueOf(14402), Integer.valueOf(64333), Integer.valueOf(14403), Integer.valueOf(64332) });
                if (paramString.containsKey(Integer.valueOf(paramInt2))) {
                  h.FC(((Integer)paramString.get(Integer.valueOf(paramInt2))).intValue());
                }
                if (paramInt2 != 0) {
                  com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleExitVoiceRoomEnd fail errCode is ", Integer.valueOf(paramInt2) });
                }
              }
            }
            if (paramd.getType() == 205)
            {
              paramString = (l)paramd;
              if ((paramString != null) && (paramString.xnf != null))
              {
                com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleHelloEnd", ((a.ah)paramString.xnf).groupId, this.mHz, Integer.valueOf(this.ndF), Long.valueOf(this.xMh), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
                coo();
                i = 0;
                if (paramInt2 != 14800) {
                  break label4106;
                }
                i = 64135;
                if (i != 0)
                {
                  this.xMp.FG(324);
                  h.FC(i);
                }
              }
            }
            if (paramd.getType() == 206)
            {
              paramString = (com.tencent.wecall.talkroom.a.a)paramd;
              if ((paramString != null) && (paramString.xnf != null))
              {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handleAckEnd errCode is ", Integer.valueOf(paramInt2), " groupId: ", paramString.mHz, " roomid: ", Integer.valueOf(paramString.ndF), " roomKey: ", Long.valueOf(paramString.xMh) });
                if (paramInt2 != 18950) {
                  break label4121;
                }
                if (!b(paramString.mHz, paramString.ndF, paramString.xMh, false)) {
                  h.a(paramString.mHz, paramString.ndF, paramString.xMh, new String[] { "ack", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
                }
                localObject1 = c.cnZ().Yb(paramString.mHz);
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handleAckEnd onMisscMultiTalk mGroupId:", paramString.mHz, " multiTalkGroup: ", localObject1 });
                if (localObject1 != null) {
                  this.xMx.a(paramString.xNW, (MultiTalkGroup)localObject1);
                }
              }
            }
            if (paramd.getType() == 207)
            {
              paramString = (com.tencent.wecall.talkroom.a.i)paramd;
              if ((paramString != null) && (paramString.xnf != null))
              {
                if (paramInt2 == 18100) {
                  h.FC(64035);
                }
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleRejectEnd  errCode is ", Integer.valueOf(paramInt2) });
              }
            }
            if (paramd.getType() == 208)
            {
              paramString = (com.tencent.wecall.talkroom.a.c)paramd;
              if ((paramString != null) && (paramString.xnf != null))
              {
                if (paramInt2 == 18300) {
                  h.FC(64005);
                }
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCancelCreateEnd errCode is ", Integer.valueOf(paramInt2) });
              }
            }
            if (paramd.getType() == 209)
            {
              localObject1 = (com.tencent.wecall.talkroom.a.g)paramd;
              if ((localObject1 != null) && (((com.tencent.pb.common.b.d)localObject1).xnf != null))
              {
                paramString = (a.aa)((com.tencent.pb.common.b.d)localObject1).xnf;
                if (paramInt2 == 17900) {
                  h.FC(64025);
                }
                if (paramInt2 == 0) {
                  break label4524;
                }
                this.xMx.ds(((com.tencent.wecall.talkroom.a.g)localObject1).mHz, paramInt2);
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleNetSceneModifyVoiceGroupEnd fail errCode is ", Integer.valueOf(paramInt2) });
              }
            }
            if (paramd.getType() == 210)
            {
              com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "talkHoldonResp", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
              if (paramInt2 == 19100) {
                h.FC(63995);
              }
            }
            if (paramd.getType() == 211)
            {
              paramString = (com.tencent.wecall.talkroom.a.h)paramd;
              if (paramString != null) {
                a(paramInt1, paramInt2, paramd.xnf, paramString);
              }
            }
            if (paramd.getType() == 212) {
              a(paramInt2, (a.ae)paramd.xnf);
            }
            if (paramd.getType() == 213)
            {
              paramString = (com.tencent.wecall.talkroom.a.j)paramd;
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleSendMsg errCode: ", Integer.valueOf(paramInt2) });
              if (paramInt2 == 0) {
                break label4623;
              }
              if (com.tencent.pb.common.c.h.equals(paramString.mHz, this.mHz))
              {
                this.xMp.N(new String[] { "sendmsg", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
                this.xMx.e(64836, null);
              }
            }
            for (;;)
            {
              if (paramd.getType() != 214) {
                break label4722;
              }
              paramString = (a.ac)paramd.xnf;
              paramd = (com.tencent.wecall.talkroom.a.k)paramd;
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleSwitchVideoGroup errCode: ", Integer.valueOf(paramInt2) });
              if (b(paramd.mHz, paramd.ndF, paramd.xMh, false)) {
                break label4724;
              }
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleSwitchVideoGroup isCurrentRoom is not same", paramd.mHz, Integer.valueOf(paramd.ndF) });
              return;
              i = 0;
              break;
              if (paramInt2 != -1)
              {
                this.xMp.FG(321);
                this.xMp.N(new String[] { "create", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
              }
              if (this.state != 1)
              {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd state is error: ", Integer.valueOf(this.state), "  errCode: ", Integer.valueOf(paramInt2), ((com.tencent.wecall.talkroom.a.d)localObject1).xMg });
                if (i == 0) {
                  break label1283;
                }
                this.xLy.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
                break label1283;
              }
              a(this.mHz, this.ndF, this.xMh, true);
              if (paramInt2 == 14051) {
                this.xMx.e(64636, null);
              }
              for (;;)
              {
                if (i == 0) {
                  break label3024;
                }
                this.xLy.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
                break;
                if (paramInt2 == 14052) {
                  this.xMx.e(64436, null);
                } else if (paramInt2 == 14053) {
                  this.xMx.e(64236, paramString);
                } else if (paramInt2 == 14504) {
                  this.xMx.e(64136, null);
                } else {
                  this.xMx.e(-100, null);
                }
              }
              break label1283;
              if (!com.tencent.pb.common.c.h.fi(this.xMg, paramString.xnN))
              {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd mClientGroupId is not same mClientGroupId: ", this.xMg, " resp.clientGroupId: ", paramString.xnN, Integer.valueOf(paramString.rph), Long.valueOf(paramString.rpi) });
                a(paramString.groupId, paramString.rph, paramString.rpi, 110, false);
                if (i == 0) {
                  break label1283;
                }
                this.xLy.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
                break label1283;
              }
              this.xMp.N(new String[] { "create", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
              if (this.state != 1)
              {
                h.FC(64533);
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd state != STATE_CREATING_TAKLROOM: ", Integer.valueOf(this.state), paramString.xnN, Integer.valueOf(paramString.rph), Long.valueOf(paramString.rpi) });
                if (i == 0) {
                  break label1283;
                }
                this.xLy.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
                break label1283;
              }
              if ((paramString.xpf == null) || (paramString.xpf.length == 0))
              {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd resp.addrlist is null,errCode: ", Integer.valueOf(paramInt2), paramString.xnN, Integer.valueOf(paramString.rph), Long.valueOf(paramString.rpi) });
                h.FC(63931);
                this.xMp.rzK = 329;
                a(paramString.groupId, paramString.rph, paramString.rpi, 116, true);
                if (i != 0) {
                  this.xLy.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, null);
                }
                this.xMx.e(-100, null);
                break label1283;
              }
              b(paramString.xnN, paramString.rph, paramString.rpi, paramString.groupId);
              this.xMB = paramString.groupId;
              this.xnh = paramString.xnS;
              setState(4);
              a(paramString.xpf, paramString.xpm, paramString.xpn);
              a(paramString.groupId, paramString.xnN, paramString.xnS, paramString.rph, paramString.rpi, paramString.xot, paramString.xpg, paramString.xnP, false, true);
              if (this.xMx != null)
              {
                localObject1 = this.xMx;
                localObject2 = new g.4((g)localObject1, c.cnZ().Yb(paramString.groupId));
                if (Looper.myLooper() != Looper.getMainLooper()) {
                  break label3584;
                }
                ((Runnable)localObject2).run();
              }
              for (;;)
              {
                localObject1 = new byte[paramString.xpi.length];
                int j = 0;
                while (j < paramString.xpi.length)
                {
                  localObject1[j] = ((byte)paramString.xpi[j]);
                  j += 1;
                }
                ((g)localObject1).handler.post((Runnable)localObject2);
              }
              localObject2 = paramString.xot;
              a.ap localap = paramString.xou;
              if ((paramString.xph & 0x2) != 0) {}
              for (boolean bool = true;; bool = false)
              {
                a(0, (a.as[])localObject2, localap, (byte[])localObject1, bool, paramString.groupId, paramString.rph, paramString.rpi);
                if (paramString.xpl != 0)
                {
                  com.tencent.pb.common.c.c.j("TalkRoomService", new Object[] { "get helloFreqSeconds:" + paramString.xpl });
                  xMd = paramString.xpl * 1000;
                }
                con();
                h(paramString.groupId, paramString.rph, paramString.rpi);
                if (i != 0)
                {
                  localObject1 = new HashMap();
                  ((Map)localObject1).put("result", Boolean.valueOf(true));
                  ((Map)localObject1).put("shareUrl", new String(paramString.xnP.xpR, Charset.forName("utf-8")));
                  ((Map)localObject1).put("smsShortUrl", new String(paramString.xnP.xpS, Charset.forName("utf-8")));
                  ((Map)localObject1).put("groupId", paramString.groupId);
                  this.xLy.b("TOPIC_ASYNC_CREATE_ROOM_DONE", 0, localObject1);
                }
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCreateVoiceGroupEnd", this.mHz, Integer.valueOf(this.ndF), Long.valueOf(this.xMh) });
                break;
              }
              if (((a.v)localObject1).xpe == null)
              {
                i = 0;
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleAddVoiceGroupMemberEnd  resp.members length: ", Integer.valueOf(i) });
                if (b(((a.v)localObject1).groupId, ((a.v)localObject1).rph, ((a.v)localObject1).rpi, false)) {
                  break label4063;
                }
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleAddVoiceGroupMemberEnd isCurrentRoom false resp.groupId: ", ((a.v)localObject1).groupId, this.mHz, " resp.roomid: ", Integer.valueOf(((a.v)localObject1).rph), Integer.valueOf(this.ndF) });
                h.FC(64228);
              }
              for (;;)
              {
                a(((a.v)localObject1).groupId, null, this.xnh, ((a.v)localObject1).rph, ((a.v)localObject1).rpi, ((a.v)localObject1).xpe, null, ((a.v)localObject1).xnP, true, true);
                break;
                i = ((a.v)localObject1).xpe.length;
                break label3900;
                this.xMp.N(new String[] { "add", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
              }
              if (paramInt2 != 14801) {
                break label1951;
              }
              i = 64134;
              break label1951;
              if (paramInt2 == 0) {
                this.xMe = true;
              }
              if (!brT())
              {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handleAckEnd is working groupId: ", paramString.mHz });
                col();
                mR(false);
                this.xMp.N(new String[] { "ack", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
                this.rpz = false;
                this.mHz = paramString.mHz;
                this.xMB = this.mHz;
                this.ndF = paramString.ndF;
                this.xMh = paramString.xMh;
                this.xnh = paramString.xnh;
                setState(2);
                this.xMl = System.currentTimeMillis();
                localObject1 = this.xMp;
                com.tencent.pb.common.c.c.d(h.TAG, new Object[] { "beginNotifyTime" });
                ((h)localObject1).xNM = System.currentTimeMillis();
                if (paramInt2 == 18900) {
                  h.FC(64015);
                }
              }
              while (!com.tencent.pb.common.c.h.equals(paramString.mHz, this.mHz))
              {
                localObject1 = new e();
                ((e)localObject1).groupId = paramString.mHz;
                ((e)localObject1).mXg = paramString.ndF;
                ((e)localObject1).mXh = paramString.xMh;
                this.xLX.put(paramString.mHz, localObject1);
                localObject1 = c.cnZ().Yb(paramString.mHz);
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handleAckEnd onInviteMultiTalk mGroupId:", paramString.mHz, " multiTalkGroup: ", localObject1 });
                if (localObject1 == null) {
                  break label4502;
                }
                paramString = this.xMx;
                localObject1 = new g.16(paramString, (MultiTalkGroup)localObject1);
                if (Looper.myLooper() != Looper.getMainLooper()) {
                  break label4489;
                }
                ((Runnable)localObject1).run();
                break;
              }
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handleAckEnd groupid same return ", this.mHz });
              break label2209;
              paramString.handler.post((Runnable)localObject1);
              break label2209;
              a(paramString.mHz, paramString.ndF, paramString.xMh, false, false, false);
              break label2209;
              localObject1 = c.cnZ().XW(paramString.groupId);
              if (localObject1 != null)
              {
                com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVoiceGroupMemberChange handleModifyVoiceGroupEnd" });
                a(paramString.groupId, null, ((TalkRoom)localObject1).cnQ(), TalkRoom.cnR(), TalkRoom.bsR(), null, null, paramString.xnP, true, false);
              }
              for (;;)
              {
                this.xMx.ds(paramString.groupId, 0);
                break;
                a(paramString.groupId, null, 0, 0, 0L, null, null, paramString.xnP, true, false);
              }
              if (com.tencent.pb.common.c.h.equals(paramString.mHz, this.mHz))
              {
                this.xMp.N(new String[] { "sendmsg", "resp", String.valueOf(paramInt2), String.valueOf(this.state) });
                paramString = this.xMx;
                localObject1 = new g.14(paramString);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                  ((Runnable)localObject1).run();
                } else {
                  paramString.handler.post((Runnable)localObject1);
                }
              }
            }
          }
        }
      }
    }
    label4724:
    if (paramInt2 == 0)
    {
      paramd = this.xMx;
      paramString = new g.10(paramd, paramString.xpp);
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        paramString.run();
        return;
      }
      paramd.handler.post(paramString);
      return;
    }
    this.xMx.e(64736, null);
  }
  
  public final void a(final int paramInt1, final a.as[] paramArrayOfas, final a.ap paramap, final byte[] paramArrayOfByte, final boolean paramBoolean, final String paramString, final int paramInt2, final long paramLong)
  {
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "dealWithInit", Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2), Long.valueOf(paramLong), Integer.valueOf(this.state) });
    if (this.xMq != null) {
      for (;;)
      {
        try
        {
          if (this.state != 4)
          {
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "dealWithInit state is error: ", Integer.valueOf(this.state) });
            bool = false;
          }
        }
        catch (Exception localException1)
        {
          boolean bool = false;
        }
        try
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "dealWithInit ret: ", Boolean.valueOf(bool) });
          if (!bool) {
            break;
          }
          return;
        }
        catch (Exception localException2)
        {
          for (;;) {}
        }
        bool = a(paramArrayOfas, paramap, paramArrayOfByte, paramBoolean, paramInt2, paramLong);
        continue;
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "dealWithInit ", localException1 });
      }
    }
    if (paramInt1 <= 0)
    {
      this.xMp.FG(202);
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom dealWithInit fail" });
      a(paramString, paramInt2, paramLong, 102, true);
      this.xMx.e(65136, null);
      return;
    }
    this.mHandler.postDelayed(new Runnable()
    {
      public final void run()
      {
        f.this.a(paramInt1 - 1, paramArrayOfas, paramap, paramArrayOfByte, paramBoolean, paramString, paramInt2, paramLong);
      }
    }, 50L);
  }
  
  public final void a(String paramString, int paramInt, long paramLong, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "closeVoiceGroup groupId: ", paramString, " mGroupId: ", this.mHz, " roomId: ", Integer.valueOf(paramInt), " mRoomId: ", Integer.valueOf(this.ndF), " roomKey: ", Long.valueOf(paramLong), " mRoomKey: ", Long.valueOf(this.xMh) });
    Object localObject1 = c.cnZ();
    for (;;)
    {
      try
      {
        localObject1 = ((c)localObject1).XW(paramString);
        if (localObject1 != null) {
          continue;
        }
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "handleRoomExit assert failed: current TalkRoom MUST exists" });
      }
      catch (Throwable localThrowable)
      {
        Object localObject2;
        com.tencent.pb.common.c.c.k("TalkRoomManager", new Object[] { "handleRoomExit: ", localThrowable });
        continue;
        String str = localThrowable.xri;
        continue;
        str.handler.post((Runnable)localObject2);
        continue;
      }
      if (paramBoolean1) {
        h(paramString, paramInt, paramLong);
      }
      this.xLX.remove(paramString);
      if (b(paramString, paramInt, paramLong, false))
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "closeVoiceGroup isCurrentRoom groupId: ", paramString, " roomId: ", Integer.valueOf(paramInt), " roomKey: ", Long.valueOf(paramLong) });
        mR(true);
        localObject1 = this.xMx;
        localObject2 = new g.6((g)localObject1, paramString, paramBoolean2);
        if (Looper.myLooper() != Looper.getMainLooper()) {
          continue;
        }
        ((Runnable)localObject2).run();
      }
      if (paramBoolean3)
      {
        paramString = c.cnZ().Yb(paramString);
        if (paramString != null) {
          this.xMx.g(paramString);
        }
      }
      return;
      localObject2 = ((TalkRoom)localObject1).XV(com.tencent.pb.b.a.a.cjV());
      if (localObject2 != null)
      {
        ((d)localObject2).xLO.status = 20;
        ((d)localObject2).xLO.mXM = -1;
      }
      if (((TalkRoom)localObject1).xri != null) {
        continue;
      }
      localObject1 = "";
      com.tencent.pb.common.c.c.d("tagorewang:TalkRoom", new Object[] { "resetRoomTempInfo groupId: ", localObject1 });
      c.coa();
    }
  }
  
  public final boolean a(String paramString, int paramInt1, long paramLong, int paramInt2, boolean paramBoolean)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom", paramString, Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(paramInt2) });
    if (TextUtils.isEmpty(paramString))
    {
      com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "exitTalkRoom: has exited" });
      return false;
    }
    com.tencent.wecall.talkroom.a.f localf = new com.tencent.wecall.talkroom.a.f(paramString, paramInt1, paramLong, paramInt2);
    boolean bool = com.tencent.pb.common.b.e.cjz().a(localf);
    this.xMp.N(new String[] { "exit", "req", String.valueOf(bool), String.valueOf(this.state) });
    a(paramString, paramInt1, paramLong, paramBoolean);
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "exitTalkRoom ret: ", Boolean.valueOf(bool) });
    return bool;
  }
  
  final void aHE()
  {
    qr();
    int i = b(talk.nZw, talk.nZx, new com.tencent.pb.talkroom.sdk.c()
    {
      public final void C(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        try
        {
          if (!f.this.xMf) {
            return;
          }
          if (f.this.frc)
          {
            int i = 0;
            while (i < paramAnonymousArrayOfByte.length)
            {
              paramAnonymousArrayOfByte[i] = 0;
              i += 1;
            }
          }
          if (f.this.xMf)
          {
            b localb = f.this.xMq;
            short s = (short)paramAnonymousInt;
            if (com.tencent.pb.common.a.a.xmH) {
              localb.xLI.SendAudio(paramAnonymousArrayOfByte, s, 0);
            }
            if (f.this.xME)
            {
              f.this.xME = false;
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "onRecPcmDataCallBack len: ", Integer.valueOf(paramAnonymousInt) });
              return;
            }
          }
        }
        catch (Exception paramAnonymousArrayOfByte)
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "initMediaComponent record", paramAnonymousArrayOfByte });
        }
      }
    });
    if (i <= 0)
    {
      this.xMp.FG(101);
      h.FD(63535);
      this.xMx.e(65036, null);
    }
    h localh;
    if (i > 0) {
      localh = this.xMp;
    }
    for (localh.xNx &= 0xFFFFFFFE;; localh.xNx |= 0x1)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "audioAdapter startRecord ret: ", Integer.valueOf(i) });
      return;
      localh = this.xMp;
    }
  }
  
  public final boolean b(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "rejectTalkRoom groupId: ", paramString, " mGroupId: ", this.mHz, " roomId: ", Integer.valueOf(paramInt1), " roomKey: ", Long.valueOf(paramLong), " reason: ", Integer.valueOf(paramInt2) });
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    int i;
    boolean bool;
    if (1 == paramInt2)
    {
      i = 1;
      if ((3 == i) && (paramInt2 != 7) && (this.xMl != 0L)) {
        System.currentTimeMillis();
      }
      com.tencent.wecall.talkroom.a.i locali = new com.tencent.wecall.talkroom.a.i(paramString, paramInt1, paramLong, paramInt2);
      bool = com.tencent.pb.common.b.e.cjz().a(locali);
      if (!b(paramString, paramInt1, paramLong, false)) {
        break label239;
      }
      this.xMp.N(new String[] { "reject", "req", String.valueOf(bool), String.valueOf(this.state) });
    }
    for (;;)
    {
      a(paramString, paramInt1, paramLong, false);
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "rejectTalkRoom ret: ", Boolean.valueOf(bool) });
      return bool;
      i = 3;
      break;
      label239:
      h.a(paramString, paramInt1, paramLong, new String[] { "reject", "req", String.valueOf(bool), String.valueOf(this.state) });
    }
  }
  
  public final boolean b(String paramString, int paramInt, long paramLong, boolean paramBoolean)
  {
    boolean bool = true;
    if (paramBoolean) {
      paramBoolean = com.tencent.pb.common.c.h.fi(paramString, this.mHz);
    }
    do
    {
      return paramBoolean;
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "isCurrentRoom groupId: ", paramString, " mGroupId: ", this.mHz, "roomId: ", Integer.valueOf(paramInt), " mRoomId: ", Integer.valueOf(this.ndF), " roomKey: ", Long.valueOf(paramLong), " mRoomKey: ", Long.valueOf(this.xMh) });
      if ((!com.tencent.pb.common.c.h.fi(paramString, this.mHz)) || (paramInt != this.ndF)) {
        break;
      }
      paramBoolean = bool;
    } while (paramLong == this.xMh);
    return false;
  }
  
  public final int bK(byte[] paramArrayOfByte)
  {
    long l;
    int i;
    try
    {
      paramArrayOfByte = (a.o)com.google.a.a.e.a(new a.o(), paramArrayOfByte, paramArrayOfByte.length);
      if (paramArrayOfByte == null) {
        if ((!TextUtils.isEmpty(this.mHz)) || (!TextUtils.isEmpty(this.xMg)))
        {
          this.xMp.N(new String[] { "notify", "pasrefail" });
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT onVoiceGroupChange groupChg null" });
          return -2;
        }
      }
    }
    catch (Exception paramArrayOfByte)
    {
      for (;;)
      {
        h.FC(63935);
        paramArrayOfByte = null;
        continue;
        h.a(this.ndF, this.xMh, new String[] { "notify", "pasrefail" });
      }
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT onVoiceGroupChange", this.mHz, Integer.valueOf(this.ndF), Long.valueOf(this.xMh), Long.valueOf(paramArrayOfByte.fxK), Integer.valueOf(paramArrayOfByte.xor) });
      l = paramArrayOfByte.fxK;
      if (this.xMC.contains(Long.valueOf(l)))
      {
        i = 1;
        if (i == 0) {
          break label350;
        }
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "CLTNOT onVoiceGroupChange isMsgDouble error" });
        if (!b(paramArrayOfByte.groupId, paramArrayOfByte.rph, paramArrayOfByte.rpi, false)) {
          break label306;
        }
        this.xMp.N(new String[] { "notify", "repeat", String.valueOf(paramArrayOfByte.xor) });
      }
      for (;;)
      {
        return -3;
        this.xMC.add(Long.valueOf(l));
        i = 0;
        break;
        label306:
        h.a(paramArrayOfByte.groupId, paramArrayOfByte.rph, paramArrayOfByte.rpi, new String[] { "notify", "repeat", String.valueOf(paramArrayOfByte.xor) });
      }
      label350:
      if (b(paramArrayOfByte.groupId, paramArrayOfByte.rph, paramArrayOfByte.rpi, false)) {
        this.xMp.N(new String[] { "notify", "succ", String.valueOf(paramArrayOfByte.xor) });
      }
      if (paramArrayOfByte.xor == 4) {
        break label419;
      }
    }
    if (paramArrayOfByte.xor == 2) {
      label419:
      a(paramArrayOfByte.groupId, null, paramArrayOfByte.xnS, paramArrayOfByte.rph, paramArrayOfByte.rpi, paramArrayOfByte.xot, paramArrayOfByte.xos, paramArrayOfByte.xnP, true, true);
    }
    for (;;)
    {
      return 0;
      if (paramArrayOfByte.xor == 16)
      {
        a(paramArrayOfByte.groupId, null, paramArrayOfByte.xnS, paramArrayOfByte.rph, paramArrayOfByte.rpi, paramArrayOfByte.xot, paramArrayOfByte.xos, paramArrayOfByte.xnP, true, false);
      }
      else
      {
        Object localObject1;
        int j;
        if (paramArrayOfByte.xor == 1)
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerCreateGroupChange groupChg.groupId: ", paramArrayOfByte.groupId, " roomId: ", Integer.valueOf(paramArrayOfByte.rph), " roomkey: ", Long.valueOf(paramArrayOfByte.rpi) });
          if (!com.tencent.pb.b.a.a.cjW())
          {
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handlerCreateGroupChange isAuthed is false" });
          }
          else if ((brT()) && (com.tencent.pb.common.c.h.equals(paramArrayOfByte.groupId, this.mHz)))
          {
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT handlerCreateGroupChange return is same groupId: ", this.mHz });
          }
          else
          {
            a(paramArrayOfByte.groupId, null, paramArrayOfByte.xnS, paramArrayOfByte.rph, paramArrayOfByte.rpi, paramArrayOfByte.xot, paramArrayOfByte.xos, paramArrayOfByte.xnP, false, true);
            localObject1 = paramArrayOfByte.groupId;
            i = paramArrayOfByte.rph;
            l = paramArrayOfByte.rpi;
            j = paramArrayOfByte.xnS;
            int k = paramArrayOfByte.xov;
            if (TextUtils.isEmpty((CharSequence)localObject1)) {
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "CLTNOT ackTalkRoom groupId is null" });
            }
            for (;;)
            {
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerCreateGroupChange start ui" });
              break;
              paramArrayOfByte = new com.tencent.wecall.talkroom.a.a((String)localObject1, i, l, j, k);
              com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "CLTNOT ackTalkRoom groupId: ", localObject1, Integer.valueOf(i), Long.valueOf(l), Integer.valueOf(k), Boolean.valueOf(com.tencent.pb.common.b.e.cjz().a(paramArrayOfByte)) });
            }
          }
        }
        else if (paramArrayOfByte.xor == 8)
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleCancelCreateVoiceGroupChange groupChg.groupId: ", paramArrayOfByte.groupId, " mGroupId: ", this.mHz });
          if (b(paramArrayOfByte.groupId, paramArrayOfByte.rph, paramArrayOfByte.rpi, false))
          {
            a(paramArrayOfByte.groupId, null, paramArrayOfByte.xnS, paramArrayOfByte.rph, paramArrayOfByte.rpi, paramArrayOfByte.xot, paramArrayOfByte.xos, paramArrayOfByte.xnP, true, false);
            a(paramArrayOfByte.groupId, paramArrayOfByte.rph, paramArrayOfByte.rpi, false, false, true);
          }
          else
          {
            a(paramArrayOfByte.groupId, null, paramArrayOfByte.xnS, paramArrayOfByte.rph, paramArrayOfByte.rpi, paramArrayOfByte.xot, paramArrayOfByte.xos, paramArrayOfByte.xnP, true, false);
          }
        }
        else
        {
          String str;
          if (paramArrayOfByte.xor == 128)
          {
            localObject1 = paramArrayOfByte.groupId;
            str = this.mHz;
            if (paramArrayOfByte.xow == null) {}
            for (i = 0;; i = paramArrayOfByte.xow.length)
            {
              com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleMemberWhisper groupChg.groupChg.groupId: ", localObject1, " mGroupId: ", str, " groupChg.whisperBuf size: ", Integer.valueOf(i) });
              localObject1 = this.xMx;
              paramArrayOfByte = new g.13((g)localObject1, paramArrayOfByte.groupId, paramArrayOfByte.xow);
              if (Looper.myLooper() != Looper.getMainLooper()) {
                break label1110;
              }
              paramArrayOfByte.run();
              break;
            }
            label1110:
            ((g)localObject1).handler.post(paramArrayOfByte);
          }
          else if (paramArrayOfByte.xor == 256)
          {
            if (!b(paramArrayOfByte.groupId, paramArrayOfByte.rph, paramArrayOfByte.rpi, false)) {
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVideoMember is not same room ", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.rph) });
            } else if (paramArrayOfByte.xow == null) {
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVideoMember whisperBuf is null", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.rph) });
            } else {
              try
              {
                localObject1 = paramArrayOfByte.xow;
                localObject1 = (a.p)com.google.a.a.e.a(new a.p(), (byte[])localObject1, localObject1.length);
                if ((localObject1 == null) || (((a.p)localObject1).xoz == null)) {
                  com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVideoMember notify is null", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.rph) });
                }
              }
              catch (com.google.a.a.d locald)
              {
                for (;;)
                {
                  com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleVideoMember ", locald });
                  localObject2 = null;
                }
                paramArrayOfByte = new ArrayList();
                Object localObject2 = ((a.p)localObject2).xoz;
                j = localObject2.length;
                i = 0;
                while (i < j)
                {
                  str = localObject2[i];
                  if (str != null) {
                    paramArrayOfByte.add(str);
                  }
                  i += 1;
                }
                com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handleVideoMember groupid: ", this.mHz, " roomId: ", Integer.valueOf(this.ndF), " videoUserNames: ", paramArrayOfByte });
                localObject2 = this.xMx;
                paramArrayOfByte = new g.1((g)localObject2, paramArrayOfByte);
                if (Looper.myLooper() == Looper.getMainLooper())
                {
                  paramArrayOfByte.run();
                  continue;
                }
                ((g)localObject2).handler.post(paramArrayOfByte);
              }
            }
          }
          else if (paramArrayOfByte.xor == 1024)
          {
            if (!b(paramArrayOfByte.groupId, paramArrayOfByte.rph, paramArrayOfByte.rpi, false))
            {
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handleOtherDevice is not same room ", paramArrayOfByte.groupId, Integer.valueOf(paramArrayOfByte.rph) });
            }
            else if ((this.state != 3) && (this.state != 4))
            {
              b(paramArrayOfByte.groupId, paramArrayOfByte.rph, paramArrayOfByte.rpi, 1);
              this.xMx.e(64136, null);
            }
          }
        }
      }
    }
  }
  
  final boolean bqA()
  {
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "initEngine", this.mHz, Integer.valueOf(this.ndF), Long.valueOf(this.xMh), Integer.valueOf(this.state) });
    try
    {
      localb = this.xMq;
      boolean bool = com.tencent.pb.common.a.a.xmH;
      if (bool) {
        break label119;
      }
      i = 0;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        b localb;
        label119:
        String str;
        com.tencent.pb.talkroom.sdk.e locale;
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "initEngine", localException });
        i = -99999;
        continue;
        i = localException.xLI.field_capInfo.length;
      }
    }
    if (i < 0)
    {
      h.FF(62535);
      this.xMp.FG(201);
      this.xMq = null;
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "initEngine engine.protocalInit error", Integer.valueOf(i) });
      return false;
      str = com.tencent.pb.common.c.d.rwf.getDir("lib", 0).getAbsolutePath();
      locale = xnt;
      if (locale == null) {
        break label338;
      }
    }
    label338:
    for (int i = locale.sP();; i = 0)
    {
      int j = k.il(com.tencent.pb.common.c.d.rwf);
      com.tencent.pb.common.c.c.d("simon:TalkRoomContext", new Object[] { "protocalInit netType:", Integer.valueOf(j), " cpuFlag:", Integer.valueOf(i), "libPath:", str });
      j = localb.xLI.init(j, i, str + "/");
      if (localb.xLI.field_capInfo == null)
      {
        i = 0;
        com.tencent.pb.common.c.c.d("simon:TalkRoomContext", new Object[] { "protocalInit", Integer.valueOf(j), "field_capInfo length: ", Integer.valueOf(i) });
        i = j;
        break;
      }
      return true;
    }
  }
  
  public final boolean brT()
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "state: ", Integer.valueOf(this.state) });
    return this.state != 0;
  }
  
  final boolean coi()
  {
    com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "initService" });
    com.tencent.pb.talkroom.sdk.e locale = xnt;
    if (locale != null) {
      locale.aPT();
    }
    this.xMq = new b();
    this.xMB = this.mHz;
    this.xMr = new talk.a()
    {
      public final void keep_OnError(int paramAnonymousInt)
      {
        int j = 207;
        int i = 62529;
        int k = 103;
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          h.FF(i);
          f.this.xMp.FG(j);
          com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "engine exitTalkRoom engineCallback OnError:", Integer.valueOf(paramAnonymousInt) });
          f.this.a(f.this.mHz, f.this.ndF, f.this.xMh, k, true);
          f.this.xMx.e(65136, null);
          return;
          j = 203;
          i = 62533;
          k = 112;
          continue;
          j = 204;
          i = 62532;
          k = 113;
          continue;
          j = 205;
          i = 62531;
          k = 114;
          continue;
          j = 206;
          i = 62530;
          k = 115;
        }
      }
      
      public final void keep_OnNotify(int paramAnonymousInt)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "keep_OnNotify eventCode: ", Integer.valueOf(paramAnonymousInt) });
        h localh;
        if (paramAnonymousInt == 5)
        {
          f.this.xMp.xNy = 1;
          localh = f.this.xMp;
          if (localh.xNL != 0L) {
            break label111;
          }
        }
        label111:
        for (localh.xNz = 0L;; localh.xNz = (System.currentTimeMillis() - localh.xNL))
        {
          com.tencent.pb.common.c.c.d(h.TAG, new Object[] { "endRecvFirstPcm", Long.valueOf(localh.xNL), Long.valueOf(localh.xNz) });
          f.this.xMn = 1;
          f.this.com();
          return;
        }
      }
      
      /* Error */
      public final void keep_OnOpenSuccess()
      {
        // Byte code:
        //   0: aload_0
        //   1: getfield 17	com/tencent/wecall/talkroom/model/f$1:xMQ	Lcom/tencent/wecall/talkroom/model/f;
        //   4: getfield 32	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
        //   7: iconst_1
        //   8: putfield 121	com/tencent/wecall/talkroom/model/h:mYD	I
        //   11: ldc 37
        //   13: iconst_1
        //   14: anewarray 4	java/lang/Object
        //   17: dup
        //   18: iconst_0
        //   19: ldc 123
        //   21: aastore
        //   22: invokestatic 51	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   25: aload_0
        //   26: getfield 17	com/tencent/wecall/talkroom/model/f$1:xMQ	Lcom/tencent/wecall/talkroom/model/f;
        //   29: getfield 126	com/tencent/wecall/talkroom/model/f:state	I
        //   32: iconst_4
        //   33: if_icmpeq +31 -> 64
        //   36: ldc 37
        //   38: iconst_2
        //   39: anewarray 4	java/lang/Object
        //   42: dup
        //   43: iconst_0
        //   44: ldc -128
        //   46: aastore
        //   47: dup
        //   48: iconst_1
        //   49: aload_0
        //   50: getfield 17	com/tencent/wecall/talkroom/model/f$1:xMQ	Lcom/tencent/wecall/talkroom/model/f;
        //   53: getfield 126	com/tencent/wecall/talkroom/model/f:state	I
        //   56: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   59: aastore
        //   60: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   63: return
        //   64: aload_0
        //   65: getfield 17	com/tencent/wecall/talkroom/model/f$1:xMQ	Lcom/tencent/wecall/talkroom/model/f;
        //   68: astore 5
        //   70: invokestatic 134	com/tencent/wecall/talkroom/model/c:cnZ	()Lcom/tencent/wecall/talkroom/model/c;
        //   73: astore 4
        //   75: aload_0
        //   76: getfield 17	com/tencent/wecall/talkroom/model/f$1:xMQ	Lcom/tencent/wecall/talkroom/model/f;
        //   79: getfield 55	com/tencent/wecall/talkroom/model/f:mHz	Ljava/lang/String;
        //   82: astore 6
        //   84: aload 6
        //   86: invokestatic 140	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
        //   89: ifeq +352 -> 441
        //   92: aconst_null
        //   93: astore 4
        //   95: aload 4
        //   97: ifnonnull +491 -> 588
        //   100: ldc 37
        //   102: iconst_1
        //   103: anewarray 4	java/lang/Object
        //   106: dup
        //   107: iconst_0
        //   108: ldc -114
        //   110: aastore
        //   111: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   114: aload_0
        //   115: getfield 17	com/tencent/wecall/talkroom/model/f$1:xMQ	Lcom/tencent/wecall/talkroom/model/f;
        //   118: getfield 146	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
        //   121: ifnull +38 -> 159
        //   124: aload_0
        //   125: getfield 17	com/tencent/wecall/talkroom/model/f$1:xMQ	Lcom/tencent/wecall/talkroom/model/f;
        //   128: getfield 146	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
        //   131: astore 4
        //   133: invokestatic 149	com/tencent/wecall/talkroom/model/f:sr	()Z
        //   136: istore_3
        //   137: getstatic 155	com/tencent/pb/common/a/a:xmH	Z
        //   140: ifeq +19 -> 159
        //   143: iload_3
        //   144: ifeq +519 -> 663
        //   147: aload 4
        //   149: getfield 161	com/tencent/wecall/talkroom/model/b:xLI	Lcom/tencent/mm/plugin/multi/talk;
        //   152: sipush 401
        //   155: invokevirtual 167	com/tencent/mm/plugin/multi/talk:qO	(I)I
        //   158: pop
        //   159: aload_0
        //   160: getfield 17	com/tencent/wecall/talkroom/model/f$1:xMQ	Lcom/tencent/wecall/talkroom/model/f;
        //   163: iconst_1
        //   164: putfield 170	com/tencent/wecall/talkroom/model/f:xMf	Z
        //   167: aload_0
        //   168: getfield 17	com/tencent/wecall/talkroom/model/f$1:xMQ	Lcom/tencent/wecall/talkroom/model/f;
        //   171: getfield 146	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
        //   174: astore 4
        //   176: invokestatic 174	com/tencent/wecall/talkroom/model/f:cor	()Lcom/tencent/pb/talkroom/sdk/e;
        //   179: astore 4
        //   181: aload 4
        //   183: ifnull +11 -> 194
        //   186: aload 4
        //   188: invokeinterface 180 1 0
        //   193: pop
        //   194: aload_0
        //   195: getfield 17	com/tencent/wecall/talkroom/model/f$1:xMQ	Lcom/tencent/wecall/talkroom/model/f;
        //   198: getfield 146	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
        //   201: getfield 161	com/tencent/wecall/talkroom/model/b:xLI	Lcom/tencent/mm/plugin/multi/talk;
        //   204: astore 6
        //   206: getstatic 155	com/tencent/pb/common/a/a:xmH	Z
        //   209: ifeq +83 -> 292
        //   212: new 182	java/util/concurrent/atomic/AtomicInteger
        //   215: dup
        //   216: invokespecial 183	java/util/concurrent/atomic/AtomicInteger:<init>	()V
        //   219: astore 4
        //   221: new 182	java/util/concurrent/atomic/AtomicInteger
        //   224: dup
        //   225: invokespecial 183	java/util/concurrent/atomic/AtomicInteger:<init>	()V
        //   228: astore 5
        //   230: aload 6
        //   232: aload 4
        //   234: aload 5
        //   236: invokevirtual 187	com/tencent/mm/plugin/multi/talk:getSampleRate	(Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicInteger;)I
        //   239: pop
        //   240: aload 4
        //   242: invokevirtual 190	java/util/concurrent/atomic/AtomicInteger:get	()I
        //   245: istore_1
        //   246: aload 5
        //   248: invokevirtual 190	java/util/concurrent/atomic/AtomicInteger:get	()I
        //   251: istore_2
        //   252: iload_1
        //   253: putstatic 193	com/tencent/mm/plugin/multi/talk:nZw	I
        //   256: iload_2
        //   257: putstatic 196	com/tencent/mm/plugin/multi/talk:nZx	I
        //   260: ldc -58
        //   262: iconst_3
        //   263: anewarray 4	java/lang/Object
        //   266: dup
        //   267: iconst_0
        //   268: ldc -56
        //   270: aastore
        //   271: dup
        //   272: iconst_1
        //   273: getstatic 193	com/tencent/mm/plugin/multi/talk:nZw	I
        //   276: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   279: aastore
        //   280: dup
        //   281: iconst_2
        //   282: getstatic 196	com/tencent/mm/plugin/multi/talk:nZx	I
        //   285: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   288: aastore
        //   289: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   292: aload_0
        //   293: getfield 17	com/tencent/wecall/talkroom/model/f$1:xMQ	Lcom/tencent/wecall/talkroom/model/f;
        //   296: astore 4
        //   298: aload 4
        //   300: getfield 146	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
        //   303: ifnonnull +400 -> 703
        //   306: ldc 37
        //   308: iconst_1
        //   309: anewarray 4	java/lang/Object
        //   312: dup
        //   313: iconst_0
        //   314: ldc -54
        //   316: aastore
        //   317: invokestatic 204	com/tencent/pb/common/c/c:e	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   320: aload_0
        //   321: getfield 17	com/tencent/wecall/talkroom/model/f$1:xMQ	Lcom/tencent/wecall/talkroom/model/f;
        //   324: getfield 32	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
        //   327: astore 4
        //   329: aload 4
        //   331: getfield 89	com/tencent/wecall/talkroom/model/h:xNL	J
        //   334: lconst_0
        //   335: lcmp
        //   336: ifne +430 -> 766
        //   339: aload 4
        //   341: lconst_0
        //   342: putfield 207	com/tencent/wecall/talkroom/model/h:xNA	J
        //   345: getstatic 95	com/tencent/wecall/talkroom/model/h:TAG	Ljava/lang/String;
        //   348: iconst_3
        //   349: anewarray 4	java/lang/Object
        //   352: dup
        //   353: iconst_0
        //   354: ldc -47
        //   356: aastore
        //   357: dup
        //   358: iconst_1
        //   359: aload 4
        //   361: getfield 207	com/tencent/wecall/talkroom/model/h:xNA	J
        //   364: invokestatic 102	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   367: aastore
        //   368: dup
        //   369: iconst_2
        //   370: aload 4
        //   372: getfield 89	com/tencent/wecall/talkroom/model/h:xNL	J
        //   375: invokestatic 102	java/lang/Long:valueOf	(J)Ljava/lang/Long;
        //   378: aastore
        //   379: invokestatic 51	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   382: aload_0
        //   383: getfield 17	com/tencent/wecall/talkroom/model/f$1:xMQ	Lcom/tencent/wecall/talkroom/model/f;
        //   386: getfield 71	com/tencent/wecall/talkroom/model/f:xMx	Lcom/tencent/wecall/talkroom/model/g;
        //   389: astore 4
        //   391: new 211	com/tencent/wecall/talkroom/model/g$19
        //   394: dup
        //   395: aload 4
        //   397: invokespecial 214	com/tencent/wecall/talkroom/model/g$19:<init>	(Lcom/tencent/wecall/talkroom/model/g;)V
        //   400: astore 5
        //   402: invokestatic 220	android/os/Looper:myLooper	()Landroid/os/Looper;
        //   405: invokestatic 223	android/os/Looper:getMainLooper	()Landroid/os/Looper;
        //   408: if_acmpne +375 -> 783
        //   411: aload 5
        //   413: invokeinterface 228 1 0
        //   418: return
        //   419: astore 4
        //   421: ldc 37
        //   423: iconst_2
        //   424: anewarray 4	java/lang/Object
        //   427: dup
        //   428: iconst_0
        //   429: ldc -26
        //   431: aastore
        //   432: dup
        //   433: iconst_1
        //   434: aload 4
        //   436: aastore
        //   437: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   440: return
        //   441: aload 4
        //   443: aload 6
        //   445: invokevirtual 234	com/tencent/wecall/talkroom/model/c:XW	(Ljava/lang/String;)Lcom/tencent/wecall/talkroom/model/TalkRoom;
        //   448: astore 4
        //   450: aload 4
        //   452: ifnonnull +9 -> 461
        //   455: aconst_null
        //   456: astore 4
        //   458: goto -363 -> 95
        //   461: aload 4
        //   463: invokevirtual 240	com/tencent/wecall/talkroom/model/TalkRoom:cnT	()Ljava/util/List;
        //   466: astore 6
        //   468: aload 6
        //   470: ifnonnull +9 -> 479
        //   473: aconst_null
        //   474: astore 4
        //   476: goto -381 -> 95
        //   479: aload 6
        //   481: invokeinterface 245 1 0
        //   486: newarray <illegal type>
        //   488: astore 4
        //   490: new 247	java/lang/StringBuffer
        //   493: dup
        //   494: invokespecial 248	java/lang/StringBuffer:<init>	()V
        //   497: astore 7
        //   499: iconst_0
        //   500: istore_1
        //   501: iload_1
        //   502: aload 6
        //   504: invokeinterface 245 1 0
        //   509: if_icmpge +52 -> 561
        //   512: aload 6
        //   514: iload_1
        //   515: invokeinterface 251 2 0
        //   520: checkcast 253	com/tencent/wecall/talkroom/model/d
        //   523: astore 8
        //   525: aload 8
        //   527: ifnull +268 -> 795
        //   530: aload 4
        //   532: iload_1
        //   533: aload 8
        //   535: invokevirtual 256	com/tencent/wecall/talkroom/model/d:coc	()I
        //   538: iastore
        //   539: aload 7
        //   541: aload 4
        //   543: iload_1
        //   544: iaload
        //   545: invokevirtual 260	java/lang/StringBuffer:append	(I)Ljava/lang/StringBuffer;
        //   548: pop
        //   549: aload 7
        //   551: ldc_w 262
        //   554: invokevirtual 265	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   557: pop
        //   558: goto +237 -> 795
        //   561: ldc_w 267
        //   564: iconst_2
        //   565: anewarray 4	java/lang/Object
        //   568: dup
        //   569: iconst_0
        //   570: ldc_w 269
        //   573: aastore
        //   574: dup
        //   575: iconst_1
        //   576: aload 7
        //   578: invokevirtual 273	java/lang/StringBuffer:toString	()Ljava/lang/String;
        //   581: aastore
        //   582: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   585: goto -490 -> 95
        //   588: aload 4
        //   590: ifnonnull +53 -> 643
        //   593: iconst_0
        //   594: istore_1
        //   595: ldc 37
        //   597: iconst_2
        //   598: anewarray 4	java/lang/Object
        //   601: dup
        //   602: iconst_0
        //   603: ldc_w 275
        //   606: aastore
        //   607: dup
        //   608: iconst_1
        //   609: iload_1
        //   610: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
        //   613: aastore
        //   614: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   617: aload 5
        //   619: getfield 146	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
        //   622: ifnonnull +28 -> 650
        //   625: ldc 37
        //   627: iconst_1
        //   628: anewarray 4	java/lang/Object
        //   631: dup
        //   632: iconst_0
        //   633: ldc_w 277
        //   636: aastore
        //   637: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   640: goto -526 -> 114
        //   643: aload 4
        //   645: arraylength
        //   646: istore_1
        //   647: goto -52 -> 595
        //   650: aload 5
        //   652: getfield 146	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
        //   655: aload 4
        //   657: invokevirtual 281	com/tencent/wecall/talkroom/model/b:OnMembersChanged	([I)V
        //   660: goto -546 -> 114
        //   663: aload 4
        //   665: getfield 161	com/tencent/wecall/talkroom/model/b:xLI	Lcom/tencent/mm/plugin/multi/talk;
        //   668: sipush 402
        //   671: invokevirtual 167	com/tencent/mm/plugin/multi/talk:qO	(I)I
        //   674: pop
        //   675: goto -516 -> 159
        //   678: astore 6
        //   680: ldc -58
        //   682: iconst_2
        //   683: anewarray 4	java/lang/Object
        //   686: dup
        //   687: iconst_0
        //   688: ldc_w 283
        //   691: aastore
        //   692: dup
        //   693: iconst_1
        //   694: aload 6
        //   696: aastore
        //   697: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   700: goto -460 -> 240
        //   703: ldc 37
        //   705: iconst_1
        //   706: anewarray 4	java/lang/Object
        //   709: dup
        //   710: iconst_0
        //   711: ldc_w 285
        //   714: aastore
        //   715: invokestatic 51	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   718: sipush 411
        //   721: iconst_1
        //   722: ldc_w 287
        //   725: invokestatic 293	com/tencent/pb/common/c/g:z	(IILjava/lang/String;)V
        //   728: aload 4
        //   730: invokevirtual 296	com/tencent/wecall/talkroom/model/f:coq	()V
        //   733: aload 4
        //   735: invokevirtual 299	com/tencent/wecall/talkroom/model/f:aHE	()V
        //   738: goto -418 -> 320
        //   741: astore 4
        //   743: ldc 37
        //   745: iconst_2
        //   746: anewarray 4	java/lang/Object
        //   749: dup
        //   750: iconst_0
        //   751: ldc_w 301
        //   754: aastore
        //   755: dup
        //   756: iconst_1
        //   757: aload 4
        //   759: aastore
        //   760: invokestatic 83	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
        //   763: goto -443 -> 320
        //   766: aload 4
        //   768: invokestatic 115	java/lang/System:currentTimeMillis	()J
        //   771: aload 4
        //   773: getfield 89	com/tencent/wecall/talkroom/model/h:xNL	J
        //   776: lsub
        //   777: putfield 207	com/tencent/wecall/talkroom/model/h:xNA	J
        //   780: goto -435 -> 345
        //   783: aload 4
        //   785: getfield 305	com/tencent/wecall/talkroom/model/g:handler	Landroid/os/Handler;
        //   788: aload 5
        //   790: invokevirtual 311	android/os/Handler:post	(Ljava/lang/Runnable;)Z
        //   793: pop
        //   794: return
        //   795: iload_1
        //   796: iconst_1
        //   797: iadd
        //   798: istore_1
        //   799: goto -298 -> 501
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	802	0	this	1
        //   245	554	1	i	int
        //   251	6	2	j	int
        //   136	8	3	bool	boolean
        //   73	323	4	localObject1	Object
        //   419	23	4	localThrowable1	Throwable
        //   448	286	4	localObject2	Object
        //   741	43	4	localThrowable2	Throwable
        //   68	721	5	localObject3	Object
        //   82	431	6	localObject4	Object
        //   678	17	6	localThrowable3	Throwable
        //   497	80	7	localStringBuffer	StringBuffer
        //   523	11	8	locald	d
        // Exception table:
        //   from	to	target	type
        //   64	92	419	java/lang/Throwable
        //   100	114	419	java/lang/Throwable
        //   114	143	419	java/lang/Throwable
        //   147	159	419	java/lang/Throwable
        //   159	181	419	java/lang/Throwable
        //   186	194	419	java/lang/Throwable
        //   194	230	419	java/lang/Throwable
        //   240	292	419	java/lang/Throwable
        //   320	345	419	java/lang/Throwable
        //   345	418	419	java/lang/Throwable
        //   441	450	419	java/lang/Throwable
        //   461	468	419	java/lang/Throwable
        //   479	499	419	java/lang/Throwable
        //   501	525	419	java/lang/Throwable
        //   530	558	419	java/lang/Throwable
        //   561	585	419	java/lang/Throwable
        //   595	640	419	java/lang/Throwable
        //   643	647	419	java/lang/Throwable
        //   650	660	419	java/lang/Throwable
        //   663	675	419	java/lang/Throwable
        //   680	700	419	java/lang/Throwable
        //   743	763	419	java/lang/Throwable
        //   766	780	419	java/lang/Throwable
        //   783	794	419	java/lang/Throwable
        //   230	240	678	java/lang/Throwable
        //   292	320	741	java/lang/Throwable
        //   703	738	741	java/lang/Throwable
      }
      
      public final void keep_OnReportChannel(String paramAnonymousString)
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "keep_OnReportChannel:", paramAnonymousString });
        StringBuilder localStringBuilder = new StringBuilder(com.tencent.pb.common.c.h.WO(f.this.xMB));
        localStringBuilder.append(",");
        localStringBuilder.append(paramAnonymousString);
        h.Yh(localStringBuilder.toString());
      }
      
      public final void keep_OnReportEngineRecv(String paramAnonymousString, int paramAnonymousInt)
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "keep_OnReportEngineRecv:", Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        StringBuilder localStringBuilder = new StringBuilder(com.tencent.pb.common.c.h.WO(f.this.xMB));
        localStringBuilder.append(",");
        localStringBuilder.append(paramAnonymousString);
        h.Yf(localStringBuilder.toString());
      }
      
      public final void keep_OnReportEngineSend(String paramAnonymousString)
      {
        com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "keep_OnReportEngineSend:", paramAnonymousString });
        StringBuilder localStringBuilder = new StringBuilder(com.tencent.pb.common.c.h.WO(f.this.xMB));
        localStringBuilder.append(",");
        localStringBuilder.append(paramAnonymousString);
        h.Yg(localStringBuilder.toString());
      }
    };
    return true;
  }
  
  public final void coj()
  {
    try
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "stopHoldeOnPusher " });
      if (this.xMN != null) {
        this.mHandler.removeCallbacks(this.xMN);
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { " stopTimer: ", localThrowable });
    }
  }
  
  public final void col()
  {
    h localh = this.xMp;
    com.tencent.pb.common.c.c.d(h.TAG, new Object[] { "reset" });
    localh.xNM = 0L;
    localh.xNL = 0L;
    localh.xNK = 0L;
    localh.groupId = "";
    localh.xnN = "";
    localh.rrV = 1;
    localh.mXg = 0;
    localh.mXh = 0L;
    localh.mXM = -1;
    localh.rzK = 0;
    localh.rzR = 0;
    localh.rzN = 0;
    localh.mYD = 0;
    localh.xNx = 0;
    localh.xNy = 0;
    localh.xNz = 0L;
    localh.xNA = 0L;
    localh.xNB = 0;
    localh.xNC = 0;
    localh.xND = 0;
    localh.xNE = 0L;
    localh.rzS = 0L;
    localh.mYC = 0L;
    localh.rzX = 0;
    localh.rzY = 0;
    localh.netType = -1;
    localh.xNF = 0;
    localh.xNG = 0;
    localh.xNH = "";
    localh.deviceModel = "";
    localh.xNI = -1;
    localh.rAd = "";
    localh.xNJ.setLength(0);
    localh.rsj = -1;
    localh.rsc = 0;
  }
  
  public final l com()
  {
    if (TextUtils.isEmpty(this.mHz))
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "doHelloVoiceRoom mGroupId is null" });
      return null;
    }
    int i = c.cnZ().XX(this.mHz);
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "doHelloVoiceRoom mGroupId: ", this.mHz, " mRoomId: ", Integer.valueOf(this.ndF), " mRoomKey: ", Long.valueOf(this.xMh), " selfMemberId: ", Integer.valueOf(i), " mCallData: ", Integer.valueOf(this.xMn) });
    l locall = new l(this.mHz, this.ndF, this.xMh, i, this.xMn);
    com.tencent.pb.common.b.e.cjz().a(locall);
    return locall;
  }
  
  public final void cop()
  {
    try
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelHelloTimerTask" });
      if (this.xMs != null) {
        this.xMs.cancel();
      }
      this.xMs = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "cancelHelloTimerTask: ", localException });
      }
    }
  }
  
  final void coq()
  {
    cok();
    final Object localObject = new AtomicInteger();
    final AtomicInteger localAtomicInteger = new AtomicInteger();
    int i = b(talk.nZw, talk.nZx, new com.tencent.pb.talkroom.sdk.b()
    {
      public final int B(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        if (!f.this.xMf) {
          return 0;
        }
        try
        {
          b localb = f.this.xMq;
          int i = (short)paramAnonymousInt;
          AtomicInteger localAtomicInteger1 = localObject;
          AtomicInteger localAtomicInteger2 = localAtomicInteger;
          if (!com.tencent.pb.common.a.a.xmH) {}
          for (i = 1; (f.this.xMF) && (i >= 0); i = localb.xLI.GetAudioData(paramAnonymousArrayOfByte, i, localAtomicInteger1, localAtomicInteger2))
          {
            f.this.xMF = false;
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "onPlayPcmDataCallBack len: ", Integer.valueOf(paramAnonymousInt), " ret: ", Integer.valueOf(i) });
            break;
          }
          return i;
        }
        catch (Exception paramAnonymousArrayOfByte)
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "initMediaComponent play", paramAnonymousArrayOfByte });
          return -1;
        }
      }
    });
    if (i <= 0)
    {
      this.xMp.FG(101);
      h.FD(63535);
      localObject = this.xMp;
      ((h)localObject).xNx |= 0x1;
      this.xMx.e(65036, null);
    }
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "audioAdapter startPlayer ret: ", Integer.valueOf(i) });
  }
  
  public final void dr(String paramString, int paramInt)
  {
    if ((com.tencent.pb.common.c.h.equals("GLOBAL_TOPIC_NETWORK_CHANGE", paramString)) && (brT()) && ((this.nnu) || (this.xMf))) {
      switch (paramInt)
      {
      }
    }
    do
    {
      return;
      switch (k.il(com.tencent.pb.common.c.d.rwf))
      {
      }
      for (this.xMz = false; (this.ndF == 0) || (this.xMh == 0L); this.xMz = true)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "sendRedirect mRoomId valid(session ended)" });
        return;
      }
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "sendRedirect", this.mHz, Integer.valueOf(this.ndF) });
      this.xMp.cou();
      paramString = new com.tencent.wecall.talkroom.a.h(this.mHz, this.ndF, this.xMh, c.cnZ().XX(this.mHz));
      boolean bool = com.tencent.pb.common.b.e.cjz().a(paramString);
      this.xMp.N(new String[] { "redirect", "req", String.valueOf(bool), String.valueOf(this.state) });
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "sendRedirect ret: ", Boolean.valueOf(bool) });
      return;
      paramString = this.xMq;
      paramInt = k.il(com.tencent.pb.common.c.d.rwf);
    } while (!com.tencent.pb.common.a.a.xmH);
    paramString.xLI.onNetworkChange(paramInt);
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return true;
      paramMessage = paramMessage.obj;
      if (this.state == 4)
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerInviteTimeOut state: ", Integer.valueOf(this.state) });
      }
      else if (!(paramMessage instanceof d))
      {
        com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerInviteTimeOut obj is not GroupRoomInfo" });
      }
      else
      {
        paramMessage = (d)paramMessage;
        if (paramMessage.mHz == null)
        {
          com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerInviteTimeOut groupRoomInfo.mGroupId is null" });
        }
        else
        {
          com.tencent.pb.common.c.c.d("TalkRoomService", new Object[] { "handlerInviteTimeOut" });
          if ((paramMessage.mHz.equals(this.mHz)) && (paramMessage.ndF == this.ndF) && (paramMessage.xMh == this.xMh))
          {
            h.cov();
            this.xMp.FG(501);
            b(paramMessage.mHz, paramMessage.ndF, paramMessage.xMh, 7);
            com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerInviteTimeOut groupRoomInfo.mGroupId: ", paramMessage.mHz });
            continue;
            paramMessage = paramMessage.obj;
            if (this.state != 1)
            {
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerCreateGroup state: ", Integer.valueOf(this.state) });
            }
            else if (!(paramMessage instanceof a))
            {
              com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerCreateGroup obj is not CreateGroupObj" });
            }
            else
            {
              paramMessage = (a)paramMessage;
              if (com.tencent.pb.common.c.h.fi(paramMessage.groupId, this.mHz))
              {
                String str1 = paramMessage.groupId;
                Object localObject1 = paramMessage.xMZ;
                a.av localav = paramMessage.xNa;
                int i = paramMessage.xnS;
                int j = paramMessage.type;
                long l = paramMessage.xNb;
                String str2 = paramMessage.xNc;
                boolean bool = paramMessage.xNd;
                String str3 = paramMessage.xNe;
                this.xMp.cou();
                Object localObject2 = c.cnZ();
                paramMessage = "";
                localObject2 = ((c)localObject2).XW(str1);
                if (localObject2 != null) {
                  if (((TalkRoom)localObject2).xLG != null) {
                    break label608;
                  }
                }
                label608:
                for (paramMessage = "";; paramMessage = ((TalkRoom)localObject2).xLG.name)
                {
                  localObject1 = new com.tencent.wecall.talkroom.a.d(str1, (String[])localObject1, this.xMq.cnX(), paramMessage, localav, i, j, l, str2, bool, str3);
                  bool = com.tencent.pb.common.b.e.cjz().a((com.tencent.pb.common.b.d)localObject1);
                  this.xMp.N(new String[] { "create", "req", String.valueOf(bool), String.valueOf(this.state) });
                  com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "sendCreateSence groupId: ", str1, " routeId:", Integer.valueOf(i), " type: ", Integer.valueOf(j), " playId: ", Long.valueOf(l), " name: ", paramMessage, " ret: ", Boolean.valueOf(bool) });
                  break;
                }
                paramMessage = paramMessage.obj;
                if (this.state != 3)
                {
                  com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerEnterGroup state: ", Integer.valueOf(this.state) });
                }
                else if (!(paramMessage instanceof c))
                {
                  com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "handlerCreateGroup obj is not CreateGroupObj" });
                }
                else
                {
                  paramMessage = (c)paramMessage;
                  if (b(paramMessage.groupId, paramMessage.mXg, paramMessage.mXh, false))
                  {
                    b(paramMessage.groupId, paramMessage.mXg, paramMessage.mXh, paramMessage.xnS, paramMessage.xnZ);
                    continue;
                    com.tencent.pb.common.c.g.cjU();
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  /* Error */
  public final void mR(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 199	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
    //   4: aload_0
    //   5: getfield 547	com/tencent/wecall/talkroom/model/f:mHz	Ljava/lang/String;
    //   8: putfield 1869	com/tencent/wecall/talkroom/model/h:groupId	Ljava/lang/String;
    //   11: aload_0
    //   12: getfield 199	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
    //   15: aload_0
    //   16: getfield 1080	com/tencent/wecall/talkroom/model/f:xMg	Ljava/lang/String;
    //   19: putfield 1870	com/tencent/wecall/talkroom/model/h:xnN	Ljava/lang/String;
    //   22: aload_0
    //   23: getfield 199	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
    //   26: getfield 1869	com/tencent/wecall/talkroom/model/h:groupId	Ljava/lang/String;
    //   29: invokestatic 2046	com/tencent/pb/common/c/h:xJ	(Ljava/lang/String;)Z
    //   32: ifeq +13 -> 45
    //   35: aload_0
    //   36: getfield 199	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
    //   39: ldc_w 1265
    //   42: putfield 1869	com/tencent/wecall/talkroom/model/h:groupId	Ljava/lang/String;
    //   45: aload_0
    //   46: getfield 199	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
    //   49: getfield 1870	com/tencent/wecall/talkroom/model/h:xnN	Ljava/lang/String;
    //   52: invokestatic 2046	com/tencent/pb/common/c/h:xJ	(Ljava/lang/String;)Z
    //   55: ifeq +13 -> 68
    //   58: aload_0
    //   59: getfield 199	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
    //   62: ldc_w 1265
    //   65: putfield 1870	com/tencent/wecall/talkroom/model/h:xnN	Ljava/lang/String;
    //   68: aload_0
    //   69: getfield 199	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
    //   72: iconst_1
    //   73: putfield 1873	com/tencent/wecall/talkroom/model/h:rrV	I
    //   76: aload_0
    //   77: getfield 199	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
    //   80: aload_0
    //   81: getfield 394	com/tencent/wecall/talkroom/model/f:ndF	I
    //   84: putfield 1874	com/tencent/wecall/talkroom/model/h:mXg	I
    //   87: aload_0
    //   88: getfield 199	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
    //   91: aload_0
    //   92: getfield 548	com/tencent/wecall/talkroom/model/f:xMh	J
    //   95: putfield 1875	com/tencent/wecall/talkroom/model/h:mXh	J
    //   98: ldc_w 291
    //   101: iconst_2
    //   102: anewarray 4	java/lang/Object
    //   105: dup
    //   106: iconst_0
    //   107: ldc_w 2048
    //   110: aastore
    //   111: dup
    //   112: iconst_1
    //   113: iload_1
    //   114: invokestatic 328	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   117: aastore
    //   118: invokestatic 333	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   121: ldc_w 291
    //   124: iconst_1
    //   125: anewarray 4	java/lang/Object
    //   128: dup
    //   129: iconst_0
    //   130: ldc_w 2050
    //   133: aastore
    //   134: invokestatic 333	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   137: aload_0
    //   138: invokespecial 1671	com/tencent/wecall/talkroom/model/f:qr	()Z
    //   141: pop
    //   142: aload_0
    //   143: invokespecial 1949	com/tencent/wecall/talkroom/model/f:cok	()Z
    //   146: pop
    //   147: aload_0
    //   148: getfield 158	com/tencent/wecall/talkroom/model/f:xLX	Ljava/util/Map;
    //   151: aload_0
    //   152: getfield 547	com/tencent/wecall/talkroom/model/f:mHz	Ljava/lang/String;
    //   155: invokeinterface 1643 2 0
    //   160: pop
    //   161: aload_0
    //   162: iconst_0
    //   163: putfield 219	com/tencent/wecall/talkroom/model/f:xMy	I
    //   166: aload_0
    //   167: iconst_0
    //   168: putfield 246	com/tencent/wecall/talkroom/model/f:frc	Z
    //   171: aload_0
    //   172: iconst_0
    //   173: invokevirtual 584	com/tencent/wecall/talkroom/model/f:setState	(I)V
    //   176: aload_0
    //   177: iconst_0
    //   178: putfield 176	com/tencent/wecall/talkroom/model/f:xMf	Z
    //   181: aload_0
    //   182: aload_0
    //   183: getfield 1080	com/tencent/wecall/talkroom/model/f:xMg	Ljava/lang/String;
    //   186: iconst_0
    //   187: lconst_0
    //   188: aconst_null
    //   189: invokespecial 1522	com/tencent/wecall/talkroom/model/f:b	(Ljava/lang/String;IJLjava/lang/String;)V
    //   192: aload_0
    //   193: aconst_null
    //   194: putfield 1080	com/tencent/wecall/talkroom/model/f:xMg	Ljava/lang/String;
    //   197: aload_0
    //   198: iconst_0
    //   199: putfield 396	com/tencent/wecall/talkroom/model/f:xnh	I
    //   202: aload_0
    //   203: iconst_0
    //   204: putfield 180	com/tencent/wecall/talkroom/model/f:xMi	I
    //   207: aload_0
    //   208: iconst_0
    //   209: putfield 182	com/tencent/wecall/talkroom/model/f:xMj	I
    //   212: aload_0
    //   213: iconst_0
    //   214: putfield 184	com/tencent/wecall/talkroom/model/f:xMk	I
    //   217: aload_0
    //   218: iconst_1
    //   219: putfield 188	com/tencent/wecall/talkroom/model/f:xMm	Z
    //   222: aload_0
    //   223: iconst_1
    //   224: putfield 232	com/tencent/wecall/talkroom/model/f:xME	Z
    //   227: aload_0
    //   228: lconst_0
    //   229: putfield 186	com/tencent/wecall/talkroom/model/f:xMl	J
    //   232: aload_0
    //   233: iconst_0
    //   234: putfield 190	com/tencent/wecall/talkroom/model/f:xMn	I
    //   237: aload_0
    //   238: iconst_0
    //   239: putfield 174	com/tencent/wecall/talkroom/model/f:xMe	Z
    //   242: aload_0
    //   243: iconst_0
    //   244: putfield 248	com/tencent/wecall/talkroom/model/f:xML	Z
    //   247: aload_0
    //   248: iconst_1
    //   249: putfield 250	com/tencent/wecall/talkroom/model/f:xMM	Z
    //   252: aload_0
    //   253: invokevirtual 2052	com/tencent/wecall/talkroom/model/f:coj	()V
    //   256: aload_0
    //   257: getfield 306	com/tencent/wecall/talkroom/model/f:mHandler	Landroid/os/Handler;
    //   260: iconst_1
    //   261: invokevirtual 2055	android/os/Handler:removeMessages	(I)V
    //   264: aload_0
    //   265: getfield 429	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
    //   268: ifnull +24 -> 292
    //   271: aload_0
    //   272: getfield 429	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
    //   275: astore 4
    //   277: getstatic 1813	com/tencent/pb/common/a/a:xmH	Z
    //   280: ifeq +12 -> 292
    //   283: aload 4
    //   285: getfield 967	com/tencent/wecall/talkroom/model/b:xLI	Lcom/tencent/mm/plugin/multi/talk;
    //   288: aconst_null
    //   289: putfield 1845	com/tencent/mm/plugin/multi/talk:field_capInfo	[B
    //   292: aload_0
    //   293: invokevirtual 2057	com/tencent/wecall/talkroom/model/f:cop	()V
    //   296: aload_0
    //   297: invokespecial 1471	com/tencent/wecall/talkroom/model/f:coo	()V
    //   300: ldc_w 291
    //   303: iconst_1
    //   304: anewarray 4	java/lang/Object
    //   307: dup
    //   308: iconst_0
    //   309: ldc_w 2059
    //   312: aastore
    //   313: invokestatic 451	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   316: aload_0
    //   317: getfield 692	com/tencent/wecall/talkroom/model/f:xMv	Ljava/util/TimerTask;
    //   320: ifnull +11 -> 331
    //   323: aload_0
    //   324: getfield 692	com/tencent/wecall/talkroom/model/f:xMv	Ljava/util/TimerTask;
    //   327: invokevirtual 1116	java/util/TimerTask:cancel	()Z
    //   330: pop
    //   331: aload_0
    //   332: aconst_null
    //   333: putfield 692	com/tencent/wecall/talkroom/model/f:xMv	Ljava/util/TimerTask;
    //   336: aload_0
    //   337: getfield 306	com/tencent/wecall/talkroom/model/f:mHandler	Landroid/os/Handler;
    //   340: aload_0
    //   341: getfield 260	com/tencent/wecall/talkroom/model/f:xMP	Ljava/lang/Runnable;
    //   344: invokevirtual 1066	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   347: aload_0
    //   348: aconst_null
    //   349: putfield 257	com/tencent/wecall/talkroom/model/f:xMO	Lcom/tencent/pb/common/b/d;
    //   352: aload_0
    //   353: iconst_0
    //   354: putfield 178	com/tencent/wecall/talkroom/model/f:nnu	Z
    //   357: aload_0
    //   358: iconst_0
    //   359: putfield 230	com/tencent/wecall/talkroom/model/f:xMD	Z
    //   362: ldc_w 1009
    //   365: istore_3
    //   366: iload_3
    //   367: istore_2
    //   368: aload_0
    //   369: getfield 429	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
    //   372: ifnull +45 -> 417
    //   375: aload_0
    //   376: aload_0
    //   377: getfield 429	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
    //   380: invokevirtual 2062	com/tencent/wecall/talkroom/model/b:cnY	()I
    //   383: putfield 219	com/tencent/wecall/talkroom/model/f:xMy	I
    //   386: aload_0
    //   387: getfield 429	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
    //   390: invokevirtual 435	com/tencent/wecall/talkroom/model/b:Close	()I
    //   393: istore_2
    //   394: ldc_w 291
    //   397: iconst_2
    //   398: anewarray 4	java/lang/Object
    //   401: dup
    //   402: iconst_0
    //   403: ldc_w 2064
    //   406: aastore
    //   407: dup
    //   408: iconst_1
    //   409: iload_2
    //   410: invokestatic 350	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   413: aastore
    //   414: invokestatic 451	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   417: aload_0
    //   418: getfield 429	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
    //   421: ifnull +301 -> 722
    //   424: aload_0
    //   425: getfield 429	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
    //   428: invokevirtual 2067	com/tencent/wecall/talkroom/model/b:uninitLive	()I
    //   431: istore_3
    //   432: iload_3
    //   433: istore_2
    //   434: aload_0
    //   435: aconst_null
    //   436: putfield 429	com/tencent/wecall/talkroom/model/f:xMq	Lcom/tencent/wecall/talkroom/model/b;
    //   439: iload_1
    //   440: ifeq +129 -> 569
    //   443: aload_0
    //   444: getfield 199	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
    //   447: invokevirtual 2070	com/tencent/wecall/talkroom/model/h:cos	()Ljava/lang/String;
    //   450: astore 4
    //   452: aload_0
    //   453: getfield 199	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
    //   456: getfield 1869	com/tencent/wecall/talkroom/model/h:groupId	Ljava/lang/String;
    //   459: invokestatic 664	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   462: ifeq +16 -> 478
    //   465: aload_0
    //   466: getfield 199	com/tencent/wecall/talkroom/model/f:xMp	Lcom/tencent/wecall/talkroom/model/h;
    //   469: getfield 1870	com/tencent/wecall/talkroom/model/h:xnN	Ljava/lang/String;
    //   472: invokestatic 664	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   475: ifne +26 -> 501
    //   478: aload 4
    //   480: invokestatic 2073	com/tencent/wecall/talkroom/model/h:Ye	(Ljava/lang/String;)V
    //   483: aload_0
    //   484: getfield 306	com/tencent/wecall/talkroom/model/f:mHandler	Landroid/os/Handler;
    //   487: iconst_4
    //   488: invokevirtual 2055	android/os/Handler:removeMessages	(I)V
    //   491: aload_0
    //   492: getfield 306	com/tencent/wecall/talkroom/model/f:mHandler	Landroid/os/Handler;
    //   495: iconst_4
    //   496: lconst_0
    //   497: invokevirtual 2077	android/os/Handler:sendEmptyMessageDelayed	(IJ)Z
    //   500: pop
    //   501: aload_0
    //   502: invokevirtual 1310	com/tencent/wecall/talkroom/model/f:col	()V
    //   505: getstatic 959	com/tencent/pb/common/c/d:rwf	Landroid/content/Context;
    //   508: ldc_w 1199
    //   511: invokevirtual 1204	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   514: checkcast 1206	android/media/AudioManager
    //   517: astore 4
    //   519: aload 4
    //   521: iconst_0
    //   522: invokevirtual 2080	android/media/AudioManager:setMode	(I)V
    //   525: ldc_w 291
    //   528: iconst_4
    //   529: anewarray 4	java/lang/Object
    //   532: dup
    //   533: iconst_0
    //   534: ldc_w 2082
    //   537: aastore
    //   538: dup
    //   539: iconst_1
    //   540: aload 4
    //   542: invokevirtual 2085	android/media/AudioManager:getMode	()I
    //   545: invokestatic 350	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   548: aastore
    //   549: dup
    //   550: iconst_2
    //   551: ldc_w 2087
    //   554: aastore
    //   555: dup
    //   556: iconst_3
    //   557: aload 4
    //   559: invokevirtual 1209	android/media/AudioManager:isSpeakerphoneOn	()Z
    //   562: invokestatic 328	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   565: aastore
    //   566: invokestatic 451	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   569: ldc_w 291
    //   572: iconst_2
    //   573: anewarray 4	java/lang/Object
    //   576: dup
    //   577: iconst_0
    //   578: ldc_w 2089
    //   581: aastore
    //   582: dup
    //   583: iconst_1
    //   584: iload_2
    //   585: invokestatic 350	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   588: aastore
    //   589: invokestatic 333	com/tencent/pb/common/c/c:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   592: return
    //   593: astore 4
    //   595: ldc_w 291
    //   598: iconst_2
    //   599: anewarray 4	java/lang/Object
    //   602: dup
    //   603: iconst_0
    //   604: ldc_w 2091
    //   607: aastore
    //   608: dup
    //   609: iconst_1
    //   610: aload 4
    //   612: aastore
    //   613: invokestatic 451	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   616: goto -474 -> 142
    //   619: astore 4
    //   621: ldc_w 291
    //   624: iconst_2
    //   625: anewarray 4	java/lang/Object
    //   628: dup
    //   629: iconst_0
    //   630: ldc_w 2091
    //   633: aastore
    //   634: dup
    //   635: iconst_1
    //   636: aload 4
    //   638: aastore
    //   639: invokestatic 451	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   642: goto -495 -> 147
    //   645: astore 4
    //   647: ldc_w 291
    //   650: iconst_2
    //   651: anewarray 4	java/lang/Object
    //   654: dup
    //   655: iconst_0
    //   656: ldc_w 2093
    //   659: aastore
    //   660: dup
    //   661: iconst_1
    //   662: aload 4
    //   664: aastore
    //   665: invokestatic 451	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   668: goto -337 -> 331
    //   671: astore 4
    //   673: ldc_w 291
    //   676: iconst_2
    //   677: anewarray 4	java/lang/Object
    //   680: dup
    //   681: iconst_0
    //   682: ldc_w 2095
    //   685: aastore
    //   686: dup
    //   687: iconst_1
    //   688: aload 4
    //   690: aastore
    //   691: invokestatic 451	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   694: iload_3
    //   695: istore_2
    //   696: goto -302 -> 394
    //   699: astore 4
    //   701: ldc_w 291
    //   704: iconst_2
    //   705: anewarray 4	java/lang/Object
    //   708: dup
    //   709: iconst_0
    //   710: ldc_w 2097
    //   713: aastore
    //   714: dup
    //   715: iconst_1
    //   716: aload 4
    //   718: aastore
    //   719: invokestatic 451	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   722: goto -288 -> 434
    //   725: astore 4
    //   727: ldc_w 291
    //   730: iconst_2
    //   731: anewarray 4	java/lang/Object
    //   734: dup
    //   735: iconst_0
    //   736: ldc_w 2099
    //   739: aastore
    //   740: dup
    //   741: iconst_1
    //   742: aload 4
    //   744: aastore
    //   745: invokestatic 451	com/tencent/pb/common/c/c:k	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   748: goto -179 -> 569
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	751	0	this	f
    //   0	751	1	paramBoolean	boolean
    //   367	329	2	i	int
    //   365	330	3	j	int
    //   275	283	4	localObject	Object
    //   593	18	4	localThrowable1	Throwable
    //   619	18	4	localThrowable2	Throwable
    //   645	18	4	localException1	Exception
    //   671	18	4	localThrowable3	Throwable
    //   699	18	4	localException2	Exception
    //   725	18	4	localThrowable4	Throwable
    // Exception table:
    //   from	to	target	type
    //   137	142	593	java/lang/Throwable
    //   142	147	619	java/lang/Throwable
    //   300	331	645	java/lang/Exception
    //   375	394	671	java/lang/Throwable
    //   424	432	699	java/lang/Exception
    //   505	569	725	java/lang/Throwable
  }
  
  public final void mS(boolean paramBoolean)
  {
    try
    {
      qr();
      cok();
      if (paramBoolean)
      {
        coq();
        aHE();
      }
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "setRecordDevActive active: ", Boolean.valueOf(paramBoolean) });
      return;
    }
    catch (Throwable localThrowable)
    {
      com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "setRecordDevActive active: ", Boolean.valueOf(paramBoolean), localThrowable });
    }
  }
  
  final void setState(int paramInt)
  {
    com.tencent.pb.common.c.c.k("TalkRoomService", new Object[] { "setState newState: ", Integer.valueOf(paramInt) });
    if (this.state == paramInt) {
      return;
    }
    this.state = paramInt;
    g localg = this.xMx;
    g.7 local7 = new g.7(localg, paramInt);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      local7.run();
      return;
    }
    localg.handler.post(local7);
  }
  
  final class a
  {
    String groupId;
    int type;
    String[] xMZ;
    a.av xNa;
    long xNb;
    String xNc;
    boolean xNd;
    String xNe;
    int xnS;
    
    a() {}
  }
  
  public static enum b
  {
    private b() {}
  }
  
  final class c
  {
    String groupId;
    int mXg;
    long mXh;
    int xnS;
    int xnZ;
    
    c() {}
  }
  
  final class d
  {
    String mHz;
    int ndF;
    long xMh;
  }
  
  final class e
  {
    String groupId;
    int mXg;
    long mXh;
    
    e() {}
  }
  
  public static abstract interface f {}
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */