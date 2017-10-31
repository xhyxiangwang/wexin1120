package com.tencent.mm.plugin.shake.c.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.oj;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.x.ap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  public List<WeakReference<a>> kmu;
  private String pwi;
  
  public f()
  {
    GMTrace.i(6518149742592L, 48564);
    this.kmu = new ArrayList();
    this.pwi = "";
    this.pwi = com.tencent.mm.plugin.shake.c.c.a.bdQ();
    GMTrace.o(6518149742592L, 48564);
  }
  
  private void ahA()
  {
    GMTrace.i(6518686613504L, 48568);
    if (this.kmu == null)
    {
      GMTrace.o(6518686613504L, 48568);
      return;
    }
    int i = 0;
    while (i < this.kmu.size())
    {
      Object localObject = (WeakReference)this.kmu.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if (localObject != null) {
          ((a)localObject).bdE();
        }
      }
      i += 1;
    }
    GMTrace.o(6518686613504L, 48568);
  }
  
  private static void bdD()
  {
    GMTrace.i(6518418178048L, 48566);
    oj localoj = new oj();
    com.tencent.mm.sdk.b.a.uLm.m(localoj);
    GMTrace.o(6518418178048L, 48566);
  }
  
  private static boolean ul(String paramString)
  {
    GMTrace.i(6518552395776L, 48567);
    boolean bool = Pattern.compile("[0-9]*").matcher(paramString).matches();
    GMTrace.o(6518552395776L, 48567);
    return bool;
  }
  
  public final void d(String paramString, long paramLong, int paramInt)
  {
    GMTrace.i(6518283960320L, 48565);
    w.i("MicroMsg.ShakeCardMsgMgr", "msg_id is " + paramLong);
    if (TextUtils.isEmpty(paramString))
    {
      w.e("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is empty");
      GMTrace.o(6518283960320L, 48565);
      return;
    }
    if (paramInt == 0)
    {
      w.i("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is MSG_TYPE_ENTRANCE");
      localObject = bh.p(paramString, "sysmsg");
      if (localObject == null)
      {
        paramString = null;
        if (paramString != null) {
          break label508;
        }
        w.e("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg msg == null");
        bdD();
      }
    }
    label155:
    label197:
    label255:
    label319:
    label410:
    label440:
    label448:
    label478:
    label508:
    while (paramInt != 1) {
      for (;;)
      {
        com.tencent.mm.plugin.shake.c.c.a.bdq();
        GMTrace.o(6518283960320L, 48565);
        return;
        paramString = new b();
        String str = (String)((Map)localObject).get(".sysmsg.begintime");
        if ((!TextUtils.isEmpty(str)) && (ul(str)))
        {
          paramString.pwj = Integer.valueOf(str).intValue();
          str = (String)((Map)localObject).get(".sysmsg.endtime");
          if ((TextUtils.isEmpty(str)) || (!ul(str))) {
            break label410;
          }
          paramString.pwk = Integer.valueOf(str).intValue();
          paramString.pwl = ((String)((Map)localObject).get(".sysmsg.entrancename"));
          str = (String)((Map)localObject).get(".sysmsg.activitytype");
          if ((TextUtils.isEmpty(str)) || (!ul(str))) {
            break label440;
          }
          paramString.pwm = Integer.valueOf(str).intValue();
          w.i("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml activitytype is " + str);
          str = (String)((Map)localObject).get(".sysmsg.flowcontrollevelmin");
          if ((TextUtils.isEmpty(str)) || (!ul(str))) {
            break label448;
          }
          paramString.pwn = Integer.valueOf(str).intValue();
          paramString.pwp = ((String)((Map)localObject).get(".sysmsg.shakecardentrancetip"));
          localObject = (String)((Map)localObject).get(".sysmsg.flowcontrollevelmax");
          if ((TextUtils.isEmpty((CharSequence)localObject)) || (!ul((String)localObject))) {
            break label478;
          }
        }
        for (paramString.pwo = Integer.valueOf((String)localObject).intValue();; paramString.pwo = 0)
        {
          break;
          w.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml begintime is " + str);
          paramString.pwj = 0;
          break label155;
          w.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml endtime is " + str);
          paramString.pwk = 0;
          break label197;
          paramString.pwm = 1;
          break label255;
          w.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml flowcontrollevelmin is " + str);
          paramString.pwn = 0;
          break label319;
          w.e("MicroMsg.ShakeCardMsgMgr", "parseEntrancedMsgFromMsgXml flowcontrollevelmax is " + (String)localObject);
        }
        w.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg msg");
        if (!com.tencent.mm.plugin.shake.c.c.a.bdr()) {
          w.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg isShakeCardEntranceOpen is false");
        }
        w.i("MicroMsg.ShakeCardMsgMgr", "saveEntranceMsg begintime:" + paramString.pwj + "  endtime:" + paramString.pwk + "  flowlevelmin:" + paramString.pwn + "  flowlevelmax:" + paramString.pwo + " entrancename:" + paramString.pwl + " activitytype:" + paramString.pwm);
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uTY, Integer.valueOf(paramString.pwj));
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uTZ, Integer.valueOf(paramString.pwk));
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uUa, paramString.pwl);
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uUe, Integer.valueOf(paramString.pwm));
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uUb, Integer.valueOf(paramString.pwn));
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uUc, Integer.valueOf(paramString.pwo));
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uUd, paramString.pwp);
      }
    }
    w.i("MicroMsg.ShakeCardMsgMgr", "onReceive() msgText is MSG_TYPE_RED_DOT");
    Object localObject = bh.p(paramString, "sysmsg");
    if (localObject == null)
    {
      paramString = null;
      label780:
      if (paramString != null) {
        break label860;
      }
      w.e("MicroMsg.ShakeCardMsgMgr", "saveRedDotMsg msg == null");
    }
    for (;;)
    {
      bdD();
      break;
      paramString = new d();
      paramString.pwq = ((String)((Map)localObject).get(".sysmsg.reddotid"));
      paramString.pwr = ((String)((Map)localObject).get(".sysmsg.reddotdesc"));
      paramString.pws = ((String)((Map)localObject).get(".sysmsg.reddottext"));
      break label780;
      label860:
      w.i("MicroMsg.ShakeCardMsgMgr", "saveRedDotMsg msg reddotid is " + paramString.pwq);
      w.i("MicroMsg.ShakeCardMsgMgr", "saveRedDotMsg pre reddotid is " + this.pwi);
      if (TextUtils.isEmpty(paramString.pwq))
      {
        w.i("MicroMsg.ShakeCardMsgMgr", "msg.reddotid is empty");
      }
      else if (TextUtils.isEmpty(this.pwi))
      {
        w.i("MicroMsg.ShakeCardMsgMgr", "redDotId is empty, msg.reddotid is not empty");
        com.tencent.mm.s.c.vP().l(262154, true);
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uUf, paramString.pwq);
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uUg, paramString.pwr);
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uUh, paramString.pws);
        ahA();
      }
      else if (!this.pwi.equals(paramString.pwq))
      {
        w.i("MicroMsg.ShakeCardMsgMgr", "redDotId and msg.reddotid is not empty, but no equals");
        com.tencent.mm.s.c.vP().l(262154, true);
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uUf, paramString.pwq);
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uUg, paramString.pwr);
        ap.AS();
        com.tencent.mm.x.c.xi().a(w.a.uUh, paramString.pws);
        ahA();
      }
      else if (this.pwi.equals(paramString.pwq))
      {
        w.i("MicroMsg.ShakeCardMsgMgr", "redDotId equals msg.reddotid");
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void bdE();
  }
  
  public static final class b
    extends f.c
  {
    protected int pwj;
    protected int pwk;
    protected String pwl;
    protected int pwm;
    protected int pwn;
    protected int pwo;
    protected String pwp;
    
    public b()
    {
      GMTrace.i(6523786887168L, 48606);
      this.pwj = 0;
      this.pwk = 0;
      this.pwl = "";
      this.pwm = 0;
      this.pwn = 0;
      this.pwo = 7;
      this.pwp = "";
      GMTrace.o(6523786887168L, 48606);
    }
  }
  
  public static class c
  {
    public c()
    {
      GMTrace.i(6523384233984L, 48603);
      GMTrace.o(6523384233984L, 48603);
    }
  }
  
  public static final class d
    extends f.c
  {
    protected String pwq;
    protected String pwr;
    protected String pws;
    
    public d()
    {
      GMTrace.i(6519491919872L, 48574);
      GMTrace.o(6519491919872L, 48574);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/c/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */