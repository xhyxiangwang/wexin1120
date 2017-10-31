package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.media.ToneGenerator;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.h.a;
import com.tencent.mm.ac.h.b;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.masssend.a.a;
import com.tencent.mm.plugin.masssend.a.f;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import com.tencent.mm.x.y;
import java.util.List;

public final class b
  implements com.tencent.mm.pluginsdk.ui.chat.b
{
  public com.tencent.mm.ui.base.q ikZ;
  public final aj kiH;
  public final aj kiI;
  private final h.a kiL;
  public ToneGenerator kin;
  public long kio;
  public Toast kip;
  private Vibrator kiq;
  public MassSendMsgUI nGE;
  public ChatFooter nGF;
  public a nGG;
  private String nGH;
  private List<String> nGI;
  private boolean nGJ;
  private final h.b nGK;
  
  public b(MassSendMsgUI paramMassSendMsgUI, ChatFooter paramChatFooter, String paramString, List<String> paramList, boolean paramBoolean)
  {
    GMTrace.i(11250129960960L, 83820);
    this.kio = -1L;
    this.ikZ = null;
    this.kiH = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(11241540026368L, 83756);
        b.this.nGF.yM(b.this.nGG.getMaxAmplitude());
        GMTrace.o(11241540026368L, 83756);
        return true;
      }
    }, true);
    this.kiL = new h.a()
    {
      public final void onError()
      {
        GMTrace.i(11228386689024L, 83658);
        b.this.nGG.reset();
        b.this.kiH.MM();
        b.this.kiI.MM();
        ad.Ra("keep_app_silent");
        b.this.nGF.ayn();
        w.v("MicroMsg.MassSendFooterEventImpl", "record stop on error");
        Toast.makeText(b.this.nGE, b.this.nGE.getString(R.l.dJB), 0).show();
        GMTrace.o(11228386689024L, 83658);
      }
    };
    this.nGK = new h.b()
    {
      public final void DB()
      {
        GMTrace.i(11237245059072L, 83724);
        b.this.nGF.bJk();
        GMTrace.o(11237245059072L, 83724);
      }
    };
    this.kiI = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(11240734720000L, 83750);
        if (b.this.kio == -1L) {
          b.this.kio = bg.Pq();
        }
        long l = bg.aG(b.this.kio);
        int i;
        if ((l >= 50000L) && (l <= 60000L))
        {
          if (b.this.kip != null) {
            break label204;
          }
          i = (int)((60000L - l) / 1000L);
          b.this.kip = Toast.makeText(b.this.nGE, b.this.nGE.getResources().getQuantityString(R.j.djY, i, new Object[] { Integer.valueOf(i) }), 0);
        }
        for (;;)
        {
          b.this.kip.show();
          if (l < 60000L) {
            break;
          }
          w.v("MicroMsg.MassSendFooterEventImpl", "record stop on countdown");
          if (b.this.nGG.qx()) {
            b.this.aMB();
          }
          b.this.nGF.ayn();
          aq.C(b.this.nGE, R.l.eMP);
          GMTrace.o(11240734720000L, 83750);
          return false;
          label204:
          i = (int)((60000L - l) / 1000L);
          b.this.kip.setText(b.this.nGE.getResources().getQuantityString(R.j.djY, i, new Object[] { Integer.valueOf(i) }));
        }
        GMTrace.o(11240734720000L, 83750);
        return true;
      }
    }, true);
    this.nGE = paramMassSendMsgUI;
    this.nGF = paramChatFooter;
    this.nGH = paramString;
    this.nGI = paramList;
    this.nGJ = paramBoolean;
    this.nGG = new a(paramMassSendMsgUI);
    this.nGG.a(this.kiL);
    this.nGG.a(this.nGK);
    this.kin = new ToneGenerator(1, 60);
    this.kiq = ((Vibrator)paramMassSendMsgUI.getSystemService("vibrator"));
    GMTrace.o(11250129960960L, 83820);
  }
  
  public final boolean Bh(final String paramString)
  {
    GMTrace.i(11250801049600L, 83825);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(11250801049600L, 83825);
      return false;
    }
    MassSendMsgUI.Bl(paramString);
    Object localObject = new a();
    ((a)localObject).nGo = this.nGH;
    ((a)localObject).nGp = this.nGI.size();
    ((a)localObject).filename = paramString;
    ((a)localObject).msgType = 1;
    paramString = new f((a)localObject, this.nGJ);
    ap.wT().a(paramString, 0);
    localObject = this.nGE;
    this.nGE.getString(R.l.dxm);
    this.ikZ = com.tencent.mm.ui.base.h.a((Context)localObject, this.nGE.getString(R.l.eFT), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11234963357696L, 83707);
        ap.wT().c(paramString);
        if (b.this.ikZ != null)
        {
          b.this.ikZ.dismiss();
          b.this.ikZ = null;
        }
        GMTrace.o(11234963357696L, 83707);
      }
    });
    GMTrace.o(11250801049600L, 83825);
    return true;
  }
  
  public final boolean aMA()
  {
    GMTrace.i(11250264178688L, 83821);
    this.kiH.MM();
    this.kiI.MM();
    this.kio = -1L;
    if (this.nGG.qx())
    {
      aMB();
      this.nGF.ayn();
    }
    for (;;)
    {
      ap.pF().rm();
      GMTrace.o(11250264178688L, 83821);
      return false;
      this.nGF.bJi();
    }
  }
  
  public final void aMB()
  {
    GMTrace.i(11250398396416L, 83822);
    final Object localObject = new a();
    ((a)localObject).nGo = this.nGH;
    ((a)localObject).nGp = this.nGI.size();
    ((a)localObject).filename = this.nGG.fnP;
    ((a)localObject).msgType = 34;
    ((a)localObject).nGq = this.nGG.frJ;
    localObject = new f((a)localObject, this.nGJ);
    ap.wT().a((k)localObject, 0);
    MassSendMsgUI localMassSendMsgUI = this.nGE;
    this.nGE.getString(R.l.dxm);
    this.ikZ = com.tencent.mm.ui.base.h.a(localMassSendMsgUI, this.nGE.getString(R.l.eFT), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(11227849818112L, 83654);
        ap.wT().c(localObject);
        if (b.this.ikZ != null)
        {
          b.this.ikZ.dismiss();
          b.this.ikZ = null;
        }
        GMTrace.o(11227849818112L, 83654);
      }
    });
    GMTrace.o(11250398396416L, 83822);
  }
  
  public final boolean aMC()
  {
    GMTrace.i(11250532614144L, 83823);
    this.kiH.MM();
    this.kiI.MM();
    this.kio = -1L;
    this.nGF.ayn();
    a locala = this.nGG;
    locala.qx();
    com.tencent.mm.modelvoice.q.mD(locala.fnP);
    ap.pF().rm();
    GMTrace.o(11250532614144L, 83823);
    return false;
  }
  
  public final boolean aMD()
  {
    GMTrace.i(11250666831872L, 83824);
    ap.AS();
    if (!c.isSDCardAvailable())
    {
      t.fn(this.nGE);
      GMTrace.o(11250666831872L, 83824);
      return false;
    }
    this.kin.startTone(24);
    new ae().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11218588794880L, 83585);
        b.this.kin.stopTone();
        GMTrace.o(11218588794880L, 83585);
      }
    }, 200L);
    this.kiq.vibrate(50L);
    this.kiH.w(100L, 100L);
    this.kiI.w(200L, 200L);
    DisplayMetrics localDisplayMetrics = this.nGE.getResources().getDisplayMetrics();
    this.nGF.yL(localDisplayMetrics.heightPixels - this.nGF.getHeight());
    this.nGG.bN("_USER_FOR_THROWBOTTLE_");
    this.nGG.a(this.nGK);
    this.nGG.a(this.kiL);
    ap.pF().rn();
    GMTrace.o(11250666831872L, 83824);
    return false;
  }
  
  public final void aME()
  {
    GMTrace.i(11250935267328L, 83826);
    GMTrace.o(11250935267328L, 83826);
  }
  
  public final void aMF()
  {
    GMTrace.i(11251069485056L, 83827);
    GMTrace.o(11251069485056L, 83827);
  }
  
  public final void aMG()
  {
    GMTrace.i(11251203702784L, 83828);
    GMTrace.o(11251203702784L, 83828);
  }
  
  public final void fS(boolean paramBoolean)
  {
    GMTrace.i(11251606355968L, 83831);
    GMTrace.o(11251606355968L, 83831);
  }
  
  public final void onPause()
  {
    GMTrace.i(11251472138240L, 83830);
    this.kiH.MM();
    this.kiI.MM();
    this.kio = -1L;
    this.nGG.qx();
    ap.pF().rm();
    GMTrace.o(11251472138240L, 83830);
  }
  
  public final void release()
  {
    GMTrace.i(11251337920512L, 83829);
    this.kin.release();
    GMTrace.o(11251337920512L, 83829);
  }
  
  final class a
    extends com.tencent.mm.e.b.h
  {
    String fnP;
    
    public a(Context paramContext)
    {
      super(false);
      GMTrace.i(11229057777664L, 83663);
      GMTrace.o(11229057777664L, 83663);
    }
    
    public final String getFileName()
    {
      GMTrace.i(11229191995392L, 83664);
      String str = this.fnP;
      GMTrace.o(11229191995392L, 83664);
      return str;
    }
    
    public final boolean qx()
    {
      GMTrace.i(11229326213120L, 83665);
      this.fnP = super.getFileName();
      boolean bool = super.qx();
      super.reset();
      GMTrace.o(11229326213120L, 83665);
      return bool;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/masssend/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */