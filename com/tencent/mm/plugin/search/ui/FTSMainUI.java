package com.tencent.mm.plugin.search.ui;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b.b;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ay.j;
import com.tencent.mm.ay.m;
import com.tencent.mm.g.a.gi;
import com.tencent.mm.g.a.kl;
import com.tencent.mm.g.a.rk;
import com.tencent.mm.g.a.sw;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.appbrand.k.f.a;
import com.tencent.mm.plugin.appbrand.k.f.c;
import com.tencent.mm.protocal.c.axm;
import com.tencent.mm.protocal.c.ayl;
import com.tencent.mm.protocal.c.ayn;
import com.tencent.mm.protocal.c.aza;
import com.tencent.mm.protocal.c.azb;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.ui.fts.widget.FTSMainUIEducationLayout;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class FTSMainUI
  extends FTSBaseVoiceSearchUI
  implements a.a
{
  private Dialog lou;
  private int mmQ;
  int plU;
  long plV;
  private FTSMainUIEducationLayout pmV;
  private LinearLayout pmW;
  private LinearLayout pmX;
  private LinearLayout pmY;
  private View pmZ;
  private View pna;
  private f pnb;
  private TextView pnc;
  private TextView pnd;
  private View pne;
  private View pnf;
  private TextView png;
  private String pnh;
  m pni;
  private Map<String, Integer> pnj;
  private g pnk;
  private g.b pnl;
  private e pnm;
  private View.OnClickListener pnn;
  private com.tencent.mm.sdk.b.c<sw> pno;
  
  public FTSMainUI()
  {
    GMTrace.i(11854780825600L, 88325);
    this.pnj = new HashMap();
    this.pnl = new g.b()
    {
      public final void bcj()
      {
        GMTrace.i(19512439078912L, 145379);
        Object localObject1 = FTSMainUI.a(FTSMainUI.this);
        if (((f)localObject1).fIW != null)
        {
          localObject1 = ((f)localObject1).fIW;
          if ((FTSMainUI.a(FTSMainUI.this).getVisibility() != 0) || (bg.mZ((String)localObject1)) || (FTSMainUI.b(FTSMainUI.this).containsKey(localObject1))) {
            break label227;
          }
          FTSMainUI.b(FTSMainUI.this).put(localObject1, Integer.valueOf(1));
          localObject2 = FTSMainUI.a(FTSMainUI.this);
          if (((f)localObject2).iKu == null) {
            break label208;
          }
        }
        long l;
        StringBuilder localStringBuilder;
        label208:
        for (Object localObject2 = ((f)localObject2).iKu;; localObject2 = "")
        {
          l = System.currentTimeMillis();
          Object localObject3 = FTSMainUI.a(FTSMainUI.this);
          localStringBuilder = new StringBuilder("");
          if (((f)localObject3).pmF == null) {
            break label215;
          }
          localObject3 = ((f)localObject3).pmF.iterator();
          while (((Iterator)localObject3).hasNext())
          {
            axm localaxm = (axm)((Iterator)localObject3).next();
            if (localStringBuilder.length() > 0) {
              localStringBuilder.append("|");
            }
            localStringBuilder.append(localaxm.urW);
          }
          localObject1 = "";
          break;
        }
        label215:
        com.tencent.mm.ay.i.a((String)localObject1, (String)localObject2, l, localStringBuilder.toString());
        label227:
        GMTrace.o(19512439078912L, 145379);
      }
    };
    this.plU = -1;
    this.pnm = new e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
      {
        GMTrace.i(19514586562560L, 145395);
        if (paramAnonymousk.getType() == 1944)
        {
          FTSMainUI.this.pni = null;
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.w("MicroMsg.FTS.FTSMainUI", "search local page error" + paramAnonymousString);
            GMTrace.o(19514586562560L, 145395);
            return;
          }
          if (FTSMainUI.h(FTSMainUI.this).getVisibility() == 0)
          {
            paramAnonymousString = (m)paramAnonymousk;
            if (FTSMainUI.a(FTSMainUI.this).a(((azb)paramAnonymousString.gMC.hlV.hmc).usK, ((azb)paramAnonymousString.gMC.hlV.hmc).tCK, ((aza)paramAnonymousString.gMC.hlU.hmc).usI)) {
              FTSMainUI.a(FTSMainUI.this).setVisibility(0);
            }
          }
        }
        GMTrace.o(19514586562560L, 145395);
      }
    };
    this.pnn = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19515526086656L, 145402);
        try
        {
          if (paramAnonymousView.getTag() != null)
          {
            j = ((JSONObject)paramAnonymousView.getTag()).optInt("businessType");
            i = j;
            if (j == 0)
            {
              paramAnonymousView = ((TextView)paramAnonymousView).getText().toString();
              if (!paramAnonymousView.equals(FTSMainUI.this.getString(R.l.eEy))) {
                break label126;
              }
              i = 2;
            }
            if (i == 0) {
              break label280;
            }
            paramAnonymousView = FTSMainUI.this;
            if (System.currentTimeMillis() - paramAnonymousView.plV <= 1000L) {
              break label280;
            }
            paramAnonymousView.plV = System.currentTimeMillis();
            if (com.tencent.mm.ay.d.Km()) {
              break label173;
            }
            w.e("MicroMsg.FTS.FTSMainUI", "fts h5 template not avail");
            GMTrace.o(19515526086656L, 145402);
          }
        }
        catch (Exception localException)
        {
          int i;
          for (;;)
          {
            int j = 0;
            continue;
            label126:
            if (paramAnonymousView.equals(FTSMainUI.this.getString(R.l.eEB)))
            {
              i = 8;
            }
            else
            {
              i = j;
              if (paramAnonymousView.equals(FTSMainUI.this.getString(R.l.eEz))) {
                i = 1;
              }
            }
          }
          label173:
          com.tencent.mm.ay.i.b(i, 14, j.kB("searchID"));
          paramAnonymousView.aKl();
          paramAnonymousView = com.tencent.mm.ay.d.Kp();
          paramAnonymousView.putExtra("ftsneedkeyboard", true);
          paramAnonymousView.putExtra("ftsbizscene", 14);
          paramAnonymousView.putExtra("ftsType", i);
          Map localMap = com.tencent.mm.ay.d.a(14, true, i);
          localMap.put("sessionId", com.tencent.mm.ay.g.hJR);
          paramAnonymousView.putExtra("ftssessionid", com.tencent.mm.ay.g.hJR);
          paramAnonymousView.putExtra("rawUrl", com.tencent.mm.ay.d.n(localMap));
          paramAnonymousView.putExtra("key_load_js_without_delay", true);
          com.tencent.mm.bi.d.b(com.tencent.mm.sdk.platformtools.ab.getContext(), "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", paramAnonymousView);
          label280:
          GMTrace.o(19515526086656L, 145402);
        }
      }
    };
    this.pno = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(11854780825600L, 88325);
  }
  
  private void bck()
  {
    GMTrace.i(11856257220608L, 88336);
    this.pmV.setVisibility(0);
    this.pmV.ar();
    GMTrace.o(11856257220608L, 88336);
  }
  
  private void bcl()
  {
    GMTrace.i(11856391438336L, 88337);
    this.pmV.setVisibility(8);
    GMTrace.o(11856391438336L, 88337);
  }
  
  private void bcm()
  {
    GMTrace.i(11857465180160L, 88345);
    this.pnk.pmA = true;
    Object localObject1 = this.fIW;
    if ((localObject1 == null) || (bg.mZ(((String)localObject1).trim())))
    {
      GMTrace.o(11857465180160L, 88345);
      return;
    }
    if (System.currentTimeMillis() - this.plV <= 1000L)
    {
      GMTrace.o(11857465180160L, 88345);
      return;
    }
    this.plV = System.currentTimeMillis();
    if (!com.tencent.mm.ay.d.Km())
    {
      w.e("MicroMsg.FTS.FTSMainUI", "fts h5 template not avail");
      GMTrace.o(11857465180160L, 88345);
      return;
    }
    localObject1 = com.tencent.mm.ay.d.Kp();
    ((Intent)localObject1).putExtra("ftsbizscene", 3);
    ((Intent)localObject1).putExtra("ftsQuery", this.fIW);
    Object localObject2 = com.tencent.mm.ay.d.a(3, true, 0);
    ((Map)localObject2).put("query", this.fIW);
    ((Map)localObject2).put("sessionId", com.tencent.mm.ay.g.hJR);
    ((Intent)localObject1).putExtra("ftssessionid", com.tencent.mm.ay.g.hJR);
    ((Intent)localObject1).putExtra("rawUrl", com.tencent.mm.ay.d.n((Map)localObject2));
    localObject2 = new kl();
    ((kl)localObject2).fHP.scene = 0;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject2);
    com.tencent.mm.bi.d.b(this.vov.voR, "webview", ".ui.tools.fts.FTSWebViewUI", (Intent)localObject1);
    com.tencent.mm.ay.i.gD(3);
    if (!bg.mZ(this.fIW)) {
      com.tencent.mm.ay.i.d(this.fIW, 2, 2, 3);
    }
    this.pmZ.setEnabled(false);
    GMTrace.o(11857465180160L, 88345);
  }
  
  private static boolean bcn()
  {
    GMTrace.i(19512841732096L, 145382);
    com.tencent.mm.storage.c localc = com.tencent.mm.x.c.c.Cu().em("100285");
    try
    {
      int i = Integer.valueOf((String)localc.bPn().get("isOpen")).intValue();
      if (i == 0)
      {
        GMTrace.o(19512841732096L, 145382);
        return false;
      }
      GMTrace.o(19512841732096L, 145382);
      return true;
    }
    catch (Exception localException)
    {
      GMTrace.o(19512841732096L, 145382);
    }
    return false;
  }
  
  public final void D(int paramInt, boolean paramBoolean)
  {
    GMTrace.i(11858136268800L, 88350);
    super.D(paramInt, paramBoolean);
    this.pnb.setVisibility(8);
    if (this.pni != null)
    {
      ap.wT().c(this.pni);
      this.pni = null;
    }
    if ((!paramBoolean) && (paramInt == 0) && (this.pnk.pmR)) {
      this.pmY.setVisibility(0);
    }
    while (!paramBoolean)
    {
      this.pmZ.setVisibility(8);
      this.pne.setVisibility(8);
      GMTrace.o(11858136268800L, 88350);
      return;
      this.pmY.setVisibility(8);
    }
    paramBoolean = com.tencent.mm.plugin.search.a.b.Fm(this.fIW);
    boolean bool = com.tencent.mm.plugin.search.a.b.Fn(this.fIW);
    if (paramInt > 0)
    {
      if ((paramBoolean) || (bool)) {
        this.pnf.setVisibility(0);
      }
      this.pna.setVisibility(0);
    }
    for (;;)
    {
      if ((paramBoolean) || (bool)) {
        this.pne.setVisibility(0);
      }
      this.pmZ.setVisibility(0);
      if ((this.fIW != null) && (this.fIW.length() > 0))
      {
        this.pni = new m(this.fIW);
        ap.wT().a(this.pni, 0);
      }
      GMTrace.o(11858136268800L, 88350);
      return;
      this.pnf.setVisibility(8);
      if ((paramBoolean) || (bool)) {
        this.pna.setVisibility(0);
      } else {
        this.pna.setVisibility(8);
      }
    }
  }
  
  protected final b a(c paramc)
  {
    GMTrace.i(11855317696512L, 88329);
    this.pnk = new g(paramc, this.mmQ, this.pnl);
    paramc = this.pnk;
    GMTrace.o(11855317696512L, 88329);
    return paramc;
  }
  
  public final void a(boolean paramBoolean, String[] paramArrayOfString, long paramLong, int paramInt)
  {
    GMTrace.i(11858002051072L, 88349);
    super.a(paramBoolean, paramArrayOfString, paramLong, paramInt);
    if (paramBoolean)
    {
      com.tencent.mm.bi.d.a(this, ".ui.voicesearch.VoiceSearchResultUI", new Intent().putExtra("VoiceSearchResultUI_Resultlist", paramArrayOfString).putExtra("VoiceSearchResultUI_VoiceId", paramLong).putExtra("VoiceSearchResultUI_ShowType", paramInt));
      GMTrace.o(11858002051072L, 88349);
      return;
    }
    com.tencent.mm.bi.d.a(this, ".ui.voicesearch.VoiceSearchResultUI", new Intent().putExtra("VoiceSearchResultUI_Resultlist", new String[0]).putExtra("VoiceSearchResultUI_Error", this.vov.voR.getString(R.l.dZV)).putExtra("VoiceSearchResultUI_VoiceId", paramLong).putExtra("VoiceSearchResultUI_ShowType", paramInt));
    GMTrace.o(11858002051072L, 88349);
  }
  
  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    GMTrace.i(15616232652800L, 116350);
    w.i("MicroMsg.FTS.FTSMainUI", "onGetLocation %b %f|%f", new Object[] { Boolean.valueOf(paramBoolean), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
    com.tencent.mm.modelgeo.c.Io().c(this);
    GMTrace.o(15616232652800L, 116350);
    return false;
  }
  
  public final View akx()
  {
    GMTrace.i(11857330962432L, 88344);
    if (this.pmW == null)
    {
      this.pmW = ((LinearLayout)getLayoutInflater().inflate(R.i.cVz, null));
      this.pnc = ((TextView)this.pmW.findViewById(R.h.ctG));
      this.pnd = ((TextView)this.pmW.findViewById(R.h.bKJ));
    }
    try
    {
      Object localObject = j.kA("webSearchBar").optString("wording");
      w.i("MicroMsg.FTS.FTSMainUI", "set searchNetworkTips %s", new Object[] { localObject });
      this.pnd.setText((CharSequence)localObject);
      this.pna = this.pmW.findViewById(R.h.ctE);
      this.pmZ = this.pmW.findViewById(R.h.ctF);
      this.pmZ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19511633772544L, 145373);
          FTSMainUI.c(FTSMainUI.this);
          GMTrace.o(19511633772544L, 145373);
        }
      });
      this.pnb = new f(this);
      this.pnb.pmE = new f.b()
      {
        public final void a(axm paramAnonymousaxm, String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(19512707514368L, 145381);
          String str = FTSMainUI.this.fIW;
          Object localObject;
          if (paramAnonymousaxm.mEi == 1)
          {
            FTSMainUI.a(FTSMainUI.this, FTSMainUI.this.fIW);
            FTSMainUI.this.fIW = paramAnonymousaxm.urW;
            localObject = new HashMap();
            ((Map)localObject).put("prefixSug", FTSMainUI.d(FTSMainUI.this));
            ((Map)localObject).put("sugId", paramAnonymousString);
            ((Map)localObject).put("sceneActionType", "6");
            FTSMainUI.a(FTSMainUI.this, (Map)localObject);
          }
          for (;;)
          {
            com.tencent.mm.ay.i.a(str, paramAnonymousString, paramAnonymousInt, paramAnonymousaxm.urW);
            GMTrace.o(19512707514368L, 145381);
            return;
            if ((paramAnonymousaxm.mEi == 4) && (!bg.mZ(paramAnonymousaxm.mDg)))
            {
              localObject = new Intent();
              ((Intent)localObject).putExtra("rawUrl", paramAnonymousaxm.mDg);
              ((Intent)localObject).putExtra("convertActivityFromTranslucent", false);
              com.tencent.mm.bi.d.b(com.tencent.mm.sdk.platformtools.ab.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject);
            }
          }
        }
      };
      int i = this.pmW.indexOfChild(this.pmZ);
      if ((i >= 0) && (i < this.pmW.getChildCount())) {
        this.pmW.addView(this.pnb, i + 1);
      }
      this.png = ((TextView)this.pmW.findViewById(R.h.ctm));
      this.pnf = this.pmW.findViewById(R.h.ctk);
      this.pne = this.pmW.findViewById(R.h.ctl);
      this.pne.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19511767990272L, 145374);
          FTSMainUI.b(FTSMainUI.this, FTSMainUI.this.fIW);
          GMTrace.o(19511767990272L, 145374);
        }
      });
      this.pmX = ((LinearLayout)this.pmW.findViewById(R.h.bJv));
      localObject = this.pmW;
      GMTrace.o(11857330962432L, 88344);
      return (View)localObject;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final void b(com.tencent.mm.plugin.fts.d.a.a parama)
  {
    GMTrace.i(16483950264320L, 122815);
    GMTrace.o(16483950264320L, 122815);
  }
  
  protected final void bbS()
  {
    GMTrace.i(11858270486528L, 88351);
    super.bbS();
    Object localObject = com.tencent.mm.pluginsdk.ui.d.h.c(this, com.tencent.mm.plugin.fts.d.f.a(getString(R.l.ebP), "", com.tencent.mm.plugin.fts.d.b.a.d(this.fIW, this.fIW)).mok, com.tencent.mm.bq.a.U(this, R.f.aSh));
    this.pnc.setText((CharSequence)localObject);
    localObject = null;
    if (com.tencent.mm.plugin.search.a.b.Fm(this.fIW)) {
      localObject = com.tencent.mm.plugin.fts.d.f.a(getString(R.l.ebA), "", com.tencent.mm.plugin.fts.d.b.a.d(this.fIW, this.fIW)).mok;
    }
    for (;;)
    {
      localObject = com.tencent.mm.pluginsdk.ui.d.h.c(this, (CharSequence)localObject, com.tencent.mm.bq.a.U(this, R.f.aSh));
      this.png.setText((CharSequence)localObject);
      GMTrace.o(11858270486528L, 88351);
      return;
      if (com.tencent.mm.plugin.search.a.b.Fn(this.fIW)) {
        localObject = com.tencent.mm.plugin.fts.d.f.a(getString(R.l.ebB), "", com.tencent.mm.plugin.fts.d.b.a.d(this.fIW, this.fIW)).mok;
      }
    }
  }
  
  protected final void bbX()
  {
    GMTrace.i(11855049261056L, 88327);
    switch (getIntent().getIntExtra("from_tab_index", -1))
    {
    default: 
      this.mmQ = 0;
      GMTrace.o(11855049261056L, 88327);
      return;
    case 0: 
      this.mmQ = 1;
      GMTrace.o(11855049261056L, 88327);
      return;
    case 1: 
      this.mmQ = 2;
      GMTrace.o(11855049261056L, 88327);
      return;
    case 2: 
      this.mmQ = 3;
      GMTrace.o(11855049261056L, 88327);
      return;
    }
    this.mmQ = 4;
    GMTrace.o(11855049261056L, 88327);
  }
  
  protected final void bca()
  {
    GMTrace.i(11857196744704L, 88343);
    super.bca();
    bcl();
    this.pmY.setVisibility(8);
    GMTrace.o(11857196744704L, 88343);
  }
  
  protected final void bcb()
  {
    GMTrace.i(11857062526976L, 88342);
    super.bcb();
    bcl();
    this.pmY.setVisibility(8);
    this.pmd.setVisibility(0);
    this.mPV.setVisibility(8);
    GMTrace.o(11857062526976L, 88342);
  }
  
  protected final void bcc()
  {
    GMTrace.i(11856928309248L, 88341);
    super.bcc();
    bcl();
    this.pmY.setVisibility(8);
    GMTrace.o(11856928309248L, 88341);
  }
  
  protected final void bcd()
  {
    GMTrace.i(11856794091520L, 88340);
    super.bcd();
    bck();
    this.pmY.setVisibility(8);
    GMTrace.o(11856794091520L, 88340);
  }
  
  protected final boolean bce()
  {
    GMTrace.i(11855183478784L, 88328);
    boolean bool = v.bMN();
    GMTrace.o(11855183478784L, 88328);
    return bool;
  }
  
  protected final void bcf()
  {
    GMTrace.i(11856525656064L, 88338);
    super.bcf();
    bcl();
    this.pmY.setVisibility(8);
    GMTrace.o(11856525656064L, 88338);
  }
  
  protected final void bcg()
  {
    GMTrace.i(11856659873792L, 88339);
    super.bcg();
    bck();
    this.pmY.setVisibility(8);
    GMTrace.o(11856659873792L, 88339);
  }
  
  protected final void bch()
  {
    GMTrace.i(11857733615616L, 88347);
    if (this.pmX != null) {
      this.pmX.setVisibility(0);
    }
    GMTrace.o(11857733615616L, 88347);
  }
  
  protected final void bci()
  {
    GMTrace.i(11857867833344L, 88348);
    if (this.pmX != null) {
      this.pmX.setVisibility(8);
    }
    GMTrace.o(11857867833344L, 88348);
  }
  
  public void finish()
  {
    GMTrace.i(11855988785152L, 88334);
    aKl();
    super.finish();
    GMTrace.o(11855988785152L, 88334);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11855451914240L, 88330);
    int i = R.i.cVC;
    GMTrace.o(11855451914240L, 88330);
    return i;
  }
  
  public final boolean np(String paramString)
  {
    GMTrace.i(11857599397888L, 88346);
    if (this.pnk.getCount() == 0) {
      bcm();
    }
    boolean bool = super.np(paramString);
    GMTrace.o(11857599397888L, 88346);
    return bool;
  }
  
  public void onClickSnsHotArticle(String paramString)
  {
    GMTrace.i(11858404704256L, 88352);
    if (System.currentTimeMillis() - this.plV <= 1000L)
    {
      GMTrace.o(11858404704256L, 88352);
      return;
    }
    this.plV = System.currentTimeMillis();
    if (!com.tencent.mm.ay.d.Km())
    {
      w.e("MicroMsg.FTS.FTSMainUI", "fts h5 template not avail");
      GMTrace.o(11858404704256L, 88352);
      return;
    }
    Intent localIntent = com.tencent.mm.ay.d.Kp();
    localIntent.putExtra("ftsbizscene", 15);
    localIntent.putExtra("ftsQuery", paramString);
    localIntent.putExtra("title", paramString);
    localIntent.putExtra("isWebwx", paramString);
    localIntent.putExtra("ftscaneditable", false);
    Object localObject = com.tencent.mm.ay.d.a(15, false, 2);
    ((Map)localObject).put("query", paramString);
    ((Map)localObject).put("sceneActionType", "2");
    localIntent.putExtra("rawUrl", com.tencent.mm.ay.d.n((Map)localObject));
    localObject = new kl();
    ((kl)localObject).fHP.scene = 0;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
    com.tencent.mm.bi.d.b(this.vov.voR, "webview", ".ui.tools.fts.FTSWebViewUI", localIntent);
    com.tencent.mm.ay.i.p(15, paramString);
    GMTrace.o(11858404704256L, 88352);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11854915043328L, 88326);
    super.onCreate(paramBundle);
    com.tencent.mm.ay.g.hJR = com.tencent.mm.ay.d.gy(3);
    com.tencent.mm.ay.g.gB(this.mmQ);
    this.pmV = ((FTSMainUIEducationLayout)findViewById(R.h.cts));
    this.pmY = ((LinearLayout)findViewById(R.h.ctD));
    this.pmV.i(this.pnn);
    this.pmV.wGp = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11866323550208L, 88411);
        FTSMainUI.this.onClickSnsHotArticle((String)paramAnonymousView.getTag());
        GMTrace.o(11866323550208L, 88411);
      }
    };
    this.pmV.ceD();
    if (bcn())
    {
      this.pmV.wGo = true;
      this.pmV.wGq = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(19515660304384L, 145403);
          FTSMainUI localFTSMainUI = FTSMainUI.this;
          if (paramAnonymousView.getTag().equals("more-click"))
          {
            ((com.tencent.mm.plugin.appbrand.k.f)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.f.class)).a(localFTSMainUI, com.tencent.mm.ay.g.hJR, f.a.jpe);
            GMTrace.o(19515660304384L, 145403);
            return;
          }
          if (paramAnonymousView.getTag().equals("more-swipe"))
          {
            ((com.tencent.mm.plugin.appbrand.k.f)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.f.class)).a(localFTSMainUI, com.tencent.mm.ay.g.hJR, f.a.jpf);
            GMTrace.o(19515660304384L, 145403);
            return;
          }
          ((com.tencent.mm.plugin.appbrand.k.f)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.f.class)).a(localFTSMainUI, (f.c)paramAnonymousView.getTag(), com.tencent.mm.ay.g.hJR);
          GMTrace.o(19515660304384L, 145403);
        }
      };
    }
    com.tencent.mm.plugin.search.a.c.bbP();
    com.tencent.mm.modelgeo.c.Io().a(this, true);
    if (com.tencent.mm.plugin.search.a.c.bbO() == null)
    {
      finish();
      GMTrace.o(11854915043328L, 88326);
      return;
    }
    com.tencent.mm.plugin.search.a.c.bbO().aBB();
    j.gF(3);
    com.tencent.mm.sdk.b.a.uLm.a(this.pno);
    ap.wT().a(1944, this.pnm);
    GMTrace.o(11854915043328L, 88326);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11855720349696L, 88332);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19511365337088L, 145371);
        gi localgi = new gi();
        localgi.fCx.context = com.tencent.mm.sdk.platformtools.ab.getContext();
        localgi.fCx.actionCode = 3;
        com.tencent.mm.sdk.b.a.uLm.m(localgi);
        GMTrace.o(19511365337088L, 145371);
      }
    });
    com.tencent.mm.modelgeo.c.Io().c(this);
    if (com.tencent.mm.plugin.fts.d.h.aBF() != null) {
      com.tencent.mm.plugin.fts.d.h.aBF().aBC();
    }
    com.tencent.mm.sdk.b.a.uLm.c(this.pno);
    ap.wT().b(1944, this.pnm);
    super.onDestroy();
    GMTrace.o(11855720349696L, 88332);
  }
  
  protected void onResume()
  {
    GMTrace.i(11855854567424L, 88333);
    super.onResume();
    Object localObject = new rk();
    ((rk)localObject).fPs.fvY = 0L;
    com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = new Intent();
    ((Intent)localObject).setComponent(new ComponentName(e.g.vkF, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    ((Intent)localObject).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    sendBroadcast((Intent)localObject);
    if (this.pmZ != null) {
      this.pmZ.setEnabled(true);
    }
    if (!bg.mZ(this.pnh))
    {
      this.fIW = this.pnh;
      this.pnh = null;
    }
    GMTrace.o(11855854567424L, 88333);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/FTSMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */