package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.AccelerateInterpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ay.i;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.KeyboardLinearLayout.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.fts.widget.FTSEditTextView;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.b;
import com.tencent.mm.ui.fts.widget.FTSMainUIEducationLayout;
import com.tencent.mm.ui.fts.widget.FTSMainUIEducationLayoutWithAll;
import com.tencent.mm.ui.fts.widget.FTSMainUIHotWordLayout;
import com.tencent.mm.ui.fts.widget.FTSMainUIHotWordLayout.a;
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
import com.tencent.mm.ui.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class FTSSOSHomeWebViewUI
  extends BaseSOSWebViewUI
{
  private View pDB;
  private FTSMainUIEducationLayout pmV;
  private View.OnClickListener pnn;
  private TextView svA;
  private View svB;
  private View svC;
  private View svD;
  private View svE;
  private b svF;
  private int svG;
  private boolean svH;
  private int svI;
  private String svJ;
  private View.OnClickListener svK;
  private a.a svL;
  private c.a svM;
  private b.a svN;
  private String svO;
  int svP;
  private View.OnClickListener svQ;
  private AdapterView.OnItemClickListener svR;
  private View.OnClickListener svS;
  private boolean svT;
  private View svr;
  private ListView svs;
  private a svt;
  private a svu;
  private b svv;
  private c svw;
  private FTSMainUIHotWordLayout svx;
  private FTSMainUIEducationLayoutWithAll svy;
  private View svz;
  private TextView titleView;
  
  public FTSSOSHomeWebViewUI()
  {
    GMTrace.i(16223165218816L, 120872);
    this.svI = 0;
    this.svJ = "";
    this.pnn = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(18122480287744L, 135023);
        FTSSOSHomeWebViewUI.c(FTSSOSHomeWebViewUI.this);
        if (!FTSSOSHomeWebViewUI.this.svc)
        {
          GMTrace.o(18122480287744L, 135023);
          return;
        }
        FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).zG(1);
        String str = ((TextView)paramAnonymousView).getText().toString();
        final int i = com.tencent.mm.ay.d.a((JSONObject)paramAnonymousView.getTag(), str, FTSSOSHomeWebViewUI.this);
        if ((FTSSOSHomeWebViewUI.this.suY != i) && (!FTSSOSHomeWebViewUI.this.bCE().qOG.isEmpty()))
        {
          paramAnonymousView = FTSSOSHomeWebViewUI.this.bCI();
          FTSSOSHomeWebViewUI.this.bCE().clearText();
          FTSSOSHomeWebViewUI.this.bCE().r(paramAnonymousView, null);
          FTSSOSHomeWebViewUI.this.bCE().ceC();
        }
        FTSSOSHomeWebViewUI.this.suY = i;
        FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this, i);
        try
        {
          FTSSOSHomeWebViewUI.c(FTSSOSHomeWebViewUI.this, 0);
          paramAnonymousView = new Bundle();
          paramAnonymousView.putInt("type", i);
          boolean bool;
          if (i == 0)
          {
            bool = true;
            paramAnonymousView.putBoolean("isHomePage", bool);
            if (i == 0) {
              break label260;
            }
            paramAnonymousView.putInt("scene", 22);
          }
          for (;;)
          {
            paramAnonymousView = FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.this).m(4, paramAnonymousView);
            FTSSOSHomeWebViewUI.h(FTSSOSHomeWebViewUI.this).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(18126104166400L, 135050);
                boolean bool = false;
                HashMap localHashMap;
                if (FTSSOSHomeWebViewUI.e(FTSSOSHomeWebViewUI.this) != null)
                {
                  localHashMap = new HashMap();
                  if (i != 0) {
                    break label228;
                  }
                  localHashMap.put("isHomePage", "1");
                }
                for (;;)
                {
                  if (!bg.mZ(FTSSOSHomeWebViewUI.this.bCI())) {
                    localHashMap.put("query", FTSSOSHomeWebViewUI.this.bCI());
                  }
                  bool = FTSSOSHomeWebViewUI.f(FTSSOSHomeWebViewUI.this).a(paramAnonymousView.getString("scene", "0"), paramAnonymousView.getString("type", "0"), paramAnonymousView.getString("isSug", "0"), paramAnonymousView.getString("isLocalSug", "0"), FTSSOSHomeWebViewUI.this.fwy, localHashMap, null);
                  if (bool)
                  {
                    FTSSOSHomeWebViewUI.this.bCE().Il(FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.this, i));
                    i.b(i, 22, FTSSOSHomeWebViewUI.g(FTSSOSHomeWebViewUI.this));
                    FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).zG(7);
                  }
                  GMTrace.o(18126104166400L, 135050);
                  return;
                  label228:
                  if (i == 1) {
                    localHashMap.put("isMostSearchBiz", paramAnonymousView.getString("isMostSearchBiz", "0"));
                  }
                }
              }
            });
            GMTrace.o(18122480287744L, 135023);
            return;
            bool = false;
            break;
            label260:
            paramAnonymousView.putInt("scene", 20);
          }
          return;
        }
        catch (Exception paramAnonymousView)
        {
          GMTrace.o(18122480287744L, 135023);
        }
      }
    };
    this.svK = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(18122748723200L, 135025);
        Object localObject = (FTSMainUIHotWordLayout.a)paramAnonymousView.getTag();
        switch (((FTSMainUIHotWordLayout.a)localObject).fKZ)
        {
        }
        try
        {
          final HashMap localHashMap = new HashMap();
          localHashMap.put("isclick", Integer.valueOf(1));
          localHashMap.put("scene", Integer.valueOf(20));
          localHashMap.put("recommendid", FTSSOSHomeWebViewUI.k(FTSSOSHomeWebViewUI.this).ceH());
          localHashMap.put("businesstype", Integer.valueOf(0));
          if (((FTSMainUIHotWordLayout.a)localObject).wGu != null) {}
          for (paramAnonymousView = Uri.encode(((FTSMainUIHotWordLayout.a)localObject).wGu);; paramAnonymousView = "")
          {
            localHashMap.put("docid", paramAnonymousView);
            localHashMap.put("docpos", Integer.valueOf(((FTSMainUIHotWordLayout.a)localObject).wGv + 1));
            localHashMap.put("ishomepage", Integer.valueOf(1));
            localHashMap.put("typepos", Integer.valueOf(1));
            localHashMap.put("jumpurl", Uri.encode(((FTSMainUIHotWordLayout.a)localObject).jumpUrl));
            paramAnonymousView = com.tencent.mm.ay.d.o(localHashMap);
            localObject = new Bundle();
            ((Bundle)localObject).putString("logString", paramAnonymousView);
            FTSSOSHomeWebViewUI.o(FTSSOSHomeWebViewUI.this).d(131, (Bundle)localObject);
            GMTrace.o(18122748723200L, 135025);
            return;
            if (!FTSSOSHomeWebViewUI.this.svc)
            {
              GMTrace.o(18122748723200L, 135025);
              return;
            }
            FTSSOSHomeWebViewUI.i(FTSSOSHomeWebViewUI.this);
            FTSSOSHomeWebViewUI.c(FTSSOSHomeWebViewUI.this, 0);
            FTSSOSHomeWebViewUI.this.bCE().clearText();
            FTSSOSHomeWebViewUI.this.bCE().r(((FTSMainUIHotWordLayout.a)localObject).wGu, null);
            FTSSOSHomeWebViewUI.this.bCE().ceC();
            FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).zG(13);
            try
            {
              paramAnonymousView = new Bundle();
              paramAnonymousView.putInt("type", 0);
              paramAnonymousView.putBoolean("isHomePage", true);
              paramAnonymousView.putInt("scene", 20);
              paramAnonymousView = FTSSOSHomeWebViewUI.j(FTSSOSHomeWebViewUI.this).m(4, paramAnonymousView);
              localHashMap = new HashMap();
              localHashMap.put("sceneActionType", "2");
              localHashMap.put("recommendId", FTSSOSHomeWebViewUI.k(FTSSOSHomeWebViewUI.this).ceH());
              FTSSOSHomeWebViewUI.n(FTSSOSHomeWebViewUI.this).post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(18132546617344L, 135098);
                  boolean bool = false;
                  if (FTSSOSHomeWebViewUI.l(FTSSOSHomeWebViewUI.this) != null) {
                    bool = FTSSOSHomeWebViewUI.m(FTSSOSHomeWebViewUI.this).a(paramAnonymousView.getString("type", "0"), paramAnonymousView.getString("isMostSearchBiz", "0"), paramAnonymousView.getString("isSug", "0"), paramAnonymousView.getString("scene", "0"), paramAnonymousView.getString("isLocalSug", "0"), FTSSOSHomeWebViewUI.this.bCI(), FTSSOSHomeWebViewUI.this.bCK(), FTSSOSHomeWebViewUI.this.bCL(), FTSSOSHomeWebViewUI.this.bCC(), FTSSOSHomeWebViewUI.this.svP, localHashMap);
                  }
                  if (bool)
                  {
                    FTSSOSHomeWebViewUI.this.bCE().Il(FTSSOSHomeWebViewUI.d(FTSSOSHomeWebViewUI.this, 0));
                    FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).zG(7);
                  }
                  GMTrace.o(18132546617344L, 135098);
                }
              });
            }
            catch (Exception paramAnonymousView) {}
            break;
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("rawUrl", ((FTSMainUIHotWordLayout.a)localObject).jumpUrl);
            paramAnonymousView.putExtra("convertActivityFromTranslucent", false);
            com.tencent.mm.bi.d.b(ab.getContext(), "webview", ".ui.tools.WebViewUI", paramAnonymousView);
            break;
          }
          return;
        }
        catch (Exception paramAnonymousView)
        {
          w.w("MicroMsg.FTS.FTSSOSHomeWebViewUI", "onHotwordCellClickListener cgi report fail for %s", new Object[] { paramAnonymousView.toString() });
          GMTrace.o(18122748723200L, 135025);
        }
      }
    };
    this.svL = new a.a()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(16892106375168L, 125856);
        FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).zG(4);
        FTSSOSHomeWebViewUI.p(FTSSOSHomeWebViewUI.this);
        GMTrace.o(16892106375168L, 125856);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(19417949798400L, 144675);
        FTSSOSHomeWebViewUI.q(FTSSOSHomeWebViewUI.this);
        GMTrace.o(19417949798400L, 144675);
      }
    };
    this.svM = new c.a()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(18122614505472L, 135024);
        FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).zG(9);
        FTSSOSHomeWebViewUI.p(FTSSOSHomeWebViewUI.this);
        GMTrace.o(18122614505472L, 135024);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(19406138638336L, 144587);
        FTSSOSHomeWebViewUI.q(FTSSOSHomeWebViewUI.this);
        GMTrace.o(19406138638336L, 144587);
      }
    };
    this.svN = new b.a()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(18125164642304L, 135043);
        FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this).zG(3);
        FTSSOSHomeWebViewUI.p(FTSSOSHomeWebViewUI.this);
        GMTrace.o(18125164642304L, 135043);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(19410567823360L, 144620);
        FTSSOSHomeWebViewUI.q(FTSSOSHomeWebViewUI.this);
        GMTrace.o(19410567823360L, 144620);
      }
    };
    this.svQ = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19409091428352L, 144609);
        paramAnonymousView = (FTSSOSHomeWebViewUI.c)paramAnonymousView.getTag();
        Bundle localBundle;
        if (paramAnonymousView.type == 1)
        {
          localBundle = new Bundle();
          localBundle.putString("history", paramAnonymousView.content);
        }
        try
        {
          FTSSOSHomeWebViewUI.s(FTSSOSHomeWebViewUI.this).g(5, localBundle);
          af.u(new FTSSOSHomeWebViewUI.a.2(FTSSOSHomeWebViewUI.t(FTSSOSHomeWebViewUI.this), paramAnonymousView));
          GMTrace.o(19409091428352L, 144609);
          return;
          if (paramAnonymousView.type == 2)
          {
            FTSSOSHomeWebViewUI.t(FTSSOSHomeWebViewUI.this).clear();
            FTSSOSHomeWebViewUI.this.bCE().r(paramAnonymousView.content, null);
            FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this, paramAnonymousView, 2);
            FTSSOSHomeWebViewUI.c(FTSSOSHomeWebViewUI.this, 2);
            FTSSOSHomeWebViewUI.u(FTSSOSHomeWebViewUI.this);
          }
          GMTrace.o(19409091428352L, 144609);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          for (;;) {}
        }
      }
    };
    this.svR = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(19412178436096L, 144632);
        paramAnonymousAdapterView = FTSSOSHomeWebViewUI.t(FTSSOSHomeWebViewUI.this).xG(paramAnonymousInt);
        FTSSOSHomeWebViewUI.this.bCE().r(paramAnonymousAdapterView.content, null);
        if (paramAnonymousAdapterView.type == 2)
        {
          FTSSOSHomeWebViewUI.a(FTSSOSHomeWebViewUI.this, paramAnonymousAdapterView, 1);
          FTSSOSHomeWebViewUI.c(FTSSOSHomeWebViewUI.this, 1);
        }
        FTSSOSHomeWebViewUI.this.aaj();
        GMTrace.o(19412178436096L, 144632);
      }
    };
    this.svS = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(19411238912000L, 144625);
        FTSSOSHomeWebViewUI.v(FTSSOSHomeWebViewUI.this);
        GMTrace.o(19411238912000L, 144625);
      }
    };
    GMTrace.o(16223165218816L, 120872);
  }
  
  private void bCN()
  {
    GMTrace.i(16223702089728L, 120876);
    try
    {
      this.svt.clear();
      w.i("MicroMsg.FTS.FTSSOSHomeWebViewUI", "start to update history");
      Bundle localBundle = new Bundle();
      localBundle.putInt("webview_id", hashCode());
      localBundle.putString("query", bCK());
      localBundle.putInt("count", 6);
      localBundle.putInt("scene", this.scene);
      this.jeK.g(3, localBundle);
      GMTrace.o(16223702089728L, 120876);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      GMTrace.o(16223702089728L, 120876);
    }
  }
  
  private void bCO()
  {
    GMTrace.i(16901233180672L, 125924);
    if ((this.svy.getVisibility() == 0) && (!this.svT))
    {
      this.svT = true;
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.svy, View.TRANSLATION_Y, new float[] { 0.0F, -this.svy.getHeight() });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.svB, View.ALPHA, new float[] { 1.0F, 0.0F });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.setDuration(300L);
      localAnimatorSet.setInterpolator(new AccelerateInterpolator());
      localAnimatorSet.playTogether(new Animator[] { localObjectAnimator2, localObjectAnimator1 });
      localAnimatorSet.addListener(new Animator.AnimatorListener()
      {
        public final void onAnimationCancel(Animator paramAnonymousAnimator)
        {
          GMTrace.i(19407480815616L, 144597);
          FTSSOSHomeWebViewUI.w(FTSSOSHomeWebViewUI.this).setVisibility(8);
          FTSSOSHomeWebViewUI.x(FTSSOSHomeWebViewUI.this).setVisibility(8);
          FTSSOSHomeWebViewUI.y(FTSSOSHomeWebViewUI.this);
          GMTrace.o(19407480815616L, 144597);
        }
        
        public final void onAnimationEnd(Animator paramAnonymousAnimator)
        {
          GMTrace.i(19407346597888L, 144596);
          FTSSOSHomeWebViewUI.w(FTSSOSHomeWebViewUI.this).setVisibility(8);
          FTSSOSHomeWebViewUI.x(FTSSOSHomeWebViewUI.this).setVisibility(8);
          FTSSOSHomeWebViewUI.y(FTSSOSHomeWebViewUI.this);
          GMTrace.o(19407346597888L, 144596);
        }
        
        public final void onAnimationRepeat(Animator paramAnonymousAnimator)
        {
          GMTrace.i(19407615033344L, 144598);
          GMTrace.o(19407615033344L, 144598);
        }
        
        public final void onAnimationStart(Animator paramAnonymousAnimator)
        {
          GMTrace.i(19407212380160L, 144595);
          GMTrace.o(19407212380160L, 144595);
        }
      });
      localAnimatorSet.start();
    }
    GMTrace.o(16901233180672L, 125924);
  }
  
  private void xE(int paramInt)
  {
    GMTrace.i(16900964745216L, 125922);
    this.svy.Dc(paramInt);
    this.svA.setText(this.svy.Dd(paramInt));
    bCE().v(com.tencent.mm.ay.d.a(paramInt, this.vov.voR));
    GMTrace.o(16900964745216L, 125922);
  }
  
  private String xF(int paramInt)
  {
    GMTrace.i(17780761952256L, 132477);
    int i = -1;
    switch (paramInt)
    {
    default: 
      paramInt = i;
    }
    while (paramInt < 0)
    {
      str = getString(R.l.dwX);
      GMTrace.o(17780761952256L, 132477);
      return str;
      paramInt = R.l.eEz;
      continue;
      paramInt = R.l.ebK;
      continue;
      paramInt = R.l.eEy;
      continue;
      paramInt = R.l.ebJ;
      continue;
      paramInt = R.l.duy;
      continue;
      paramInt = R.l.ebF;
      continue;
      paramInt = R.l.ebG;
      continue;
      paramInt = R.l.ebH;
      continue;
      paramInt = R.l.ebI;
    }
    String str = getString(R.l.eEx, new Object[] { getString(paramInt) });
    GMTrace.o(17780761952256L, 132477);
    return str;
  }
  
  public final void a(String paramString1, String paramString2, List<com.tencent.mm.ui.fts.widget.a.b> paramList, FTSEditTextView.b paramb)
  {
    GMTrace.i(16900830527488L, 125921);
    if (paramb == FTSEditTextView.b.wGg) {
      this.svP = 0;
    }
    if (this.svF.bCM())
    {
      super.a(paramString1, paramString2, paramList, paramb);
      GMTrace.o(16900830527488L, 125921);
      return;
    }
    if (bCI().length() == 0)
    {
      this.pmV.setVisibility(0);
      this.svx.setVisibility(0);
      this.svt.clear();
      GMTrace.o(16900830527488L, 125921);
      return;
    }
    this.pmV.setVisibility(8);
    this.svx.setVisibility(8);
    if (paramb != FTSEditTextView.b.wGi) {
      bCN();
    }
    GMTrace.o(16900830527488L, 125921);
  }
  
  protected final int aad()
  {
    GMTrace.i(16223433654272L, 120874);
    if ((com.tencent.mm.compatible.util.d.et(23)) && (!h.tJ()))
    {
      i = getResources().getColor(R.e.aQk);
      GMTrace.o(16223433654272L, 120874);
      return i;
    }
    int i = super.aad();
    GMTrace.o(16223433654272L, 120874);
    return i;
  }
  
  public final boolean aaj()
  {
    GMTrace.i(16223970525184L, 120878);
    if (!this.svc)
    {
      GMTrace.o(16223970525184L, 120878);
      return true;
    }
    this.svF.zG(0);
    super.aaj();
    GMTrace.o(16223970525184L, 120878);
    return true;
  }
  
  /* Error */
  protected final void aal()
  {
    // Byte code:
    //   0: ldc2_w 841
    //   3: ldc_w 843
    //   6: invokestatic 133	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: invokespecial 845	com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI:aal	()V
    //   13: aload_0
    //   14: new 53	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$b
    //   17: dup
    //   18: aload_0
    //   19: ldc_w 847
    //   22: aload_0
    //   23: invokevirtual 851	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:getMainLooper	()Landroid/os/Looper;
    //   26: invokespecial 854	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$b:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI;Ljava/lang/String;Landroid/os/Looper;)V
    //   29: putfield 288	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svF	Lcom/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$b;
    //   32: aload_0
    //   33: aload_0
    //   34: getstatic 859	com/tencent/mm/R$h:cBB	I
    //   37: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   40: putfield 216	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svE	Landroid/view/View;
    //   43: aload_0
    //   44: aload_0
    //   45: getstatic 866	com/tencent/mm/R$h:csY	I
    //   48: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   51: putfield 868	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svD	Landroid/view/View;
    //   54: aload_0
    //   55: aload_0
    //   56: getstatic 871	com/tencent/mm/R$h:cbX	I
    //   59: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   62: putfield 252	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svB	Landroid/view/View;
    //   65: aload_0
    //   66: aload_0
    //   67: getstatic 874	com/tencent/mm/R$h:bDa	I
    //   70: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   73: putfield 232	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svz	Landroid/view/View;
    //   76: aload_0
    //   77: aload_0
    //   78: getstatic 877	com/tencent/mm/R$h:bCZ	I
    //   81: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   84: checkcast 641	android/widget/TextView
    //   87: putfield 636	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svA	Landroid/widget/TextView;
    //   90: aload_0
    //   91: getfield 232	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svz	Landroid/view/View;
    //   94: aload_0
    //   95: getfield 165	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svS	Landroid/view/View$OnClickListener;
    //   98: invokevirtual 881	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   101: aload_0
    //   102: aload_0
    //   103: getstatic 884	com/tencent/mm/R$h:cBC	I
    //   106: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   109: putfield 210	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svC	Landroid/view/View;
    //   112: aload_0
    //   113: aload_0
    //   114: getstatic 887	com/tencent/mm/R$h:cBJ	I
    //   117: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   120: checkcast 641	android/widget/TextView
    //   123: putfield 723	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:titleView	Landroid/widget/TextView;
    //   126: aload_0
    //   127: aload_0
    //   128: getstatic 890	com/tencent/mm/R$h:cKV	I
    //   131: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   134: putfield 197	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svr	Landroid/view/View;
    //   137: aload_0
    //   138: getfield 197	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svr	Landroid/view/View;
    //   141: iconst_4
    //   142: invokevirtual 255	android/view/View:setVisibility	(I)V
    //   145: aload_0
    //   146: getfield 197	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svr	Landroid/view/View;
    //   149: checkcast 892	com/tencent/mm/plugin/webview/ui/tools/WebViewKeyboardLinearLayout
    //   152: new 6	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$1
    //   155: dup
    //   156: aload_0
    //   157: invokespecial 893	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$1:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI;)V
    //   160: putfield 899	com/tencent/mm/ui/KeyboardLinearLayout:vmY	Lcom/tencent/mm/ui/KeyboardLinearLayout$a;
    //   163: aload_0
    //   164: aload_0
    //   165: getstatic 902	com/tencent/mm/R$h:cts	I
    //   168: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   171: checkcast 726	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout
    //   174: putfield 223	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:pmV	Lcom/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout;
    //   177: aload_0
    //   178: getfield 223	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:pmV	Lcom/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout;
    //   181: aload_0
    //   182: getfield 144	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:pnn	Landroid/view/View$OnClickListener;
    //   185: invokevirtual 904	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:i	(Landroid/view/View$OnClickListener;)V
    //   188: aload_0
    //   189: aload_0
    //   190: getstatic 907	com/tencent/mm/R$h:ctt	I
    //   193: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   196: checkcast 246	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayoutWithAll
    //   199: putfield 244	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svy	Lcom/tencent/mm/ui/fts/widget/FTSMainUIEducationLayoutWithAll;
    //   202: aload_0
    //   203: getfield 244	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svy	Lcom/tencent/mm/ui/fts/widget/FTSMainUIEducationLayoutWithAll;
    //   206: aload_0
    //   207: getfield 144	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:pnn	Landroid/view/View$OnClickListener;
    //   210: invokevirtual 908	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayoutWithAll:i	(Landroid/view/View$OnClickListener;)V
    //   213: aload_0
    //   214: aload_0
    //   215: getstatic 911	com/tencent/mm/R$h:ctw	I
    //   218: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   221: checkcast 729	com/tencent/mm/ui/fts/widget/FTSMainUIHotWordLayout
    //   224: putfield 561	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svx	Lcom/tencent/mm/ui/fts/widget/FTSMainUIHotWordLayout;
    //   227: aload_0
    //   228: getfield 561	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svx	Lcom/tencent/mm/ui/fts/widget/FTSMainUIHotWordLayout;
    //   231: aload_0
    //   232: getfield 147	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svK	Landroid/view/View$OnClickListener;
    //   235: invokevirtual 912	com/tencent/mm/ui/fts/widget/FTSMainUIHotWordLayout:i	(Landroid/view/View$OnClickListener;)V
    //   238: aload_0
    //   239: new 518	com/tencent/mm/plugin/webview/ui/tools/fts/a
    //   242: dup
    //   243: aload_0
    //   244: aload_0
    //   245: getfield 915	com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI:suU	Landroid/view/View;
    //   248: aload_0
    //   249: getfield 723	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:titleView	Landroid/widget/TextView;
    //   252: aload_0
    //   253: invokevirtual 649	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:bCE	()Lcom/tencent/mm/ui/fts/widget/SOSEditTextView;
    //   256: getfield 919	com/tencent/mm/ui/fts/widget/FTSEditTextView:jjR	Landroid/widget/ImageView;
    //   259: aload_0
    //   260: getfield 764	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:ogo	Landroid/widget/ImageButton;
    //   263: aload_0
    //   264: getfield 770	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:suW	Landroid/view/View;
    //   267: aload_0
    //   268: invokevirtual 649	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:bCE	()Lcom/tencent/mm/ui/fts/widget/SOSEditTextView;
    //   271: getfield 786	com/tencent/mm/ui/fts/widget/FTSEditTextView:vNy	Landroid/widget/EditText;
    //   274: aload_0
    //   275: getfield 868	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svD	Landroid/view/View;
    //   278: invokespecial 922	com/tencent/mm/plugin/webview/ui/tools/fts/a:<init>	(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    //   281: putfield 176	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svu	Lcom/tencent/mm/plugin/webview/ui/tools/fts/a;
    //   284: aload_0
    //   285: getfield 176	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svu	Lcom/tencent/mm/plugin/webview/ui/tools/fts/a;
    //   288: aload_0
    //   289: getfield 150	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svL	Lcom/tencent/mm/plugin/webview/ui/tools/fts/a$a;
    //   292: putfield 925	com/tencent/mm/plugin/webview/ui/tools/fts/a:swx	Lcom/tencent/mm/plugin/webview/ui/tools/fts/a$a;
    //   295: aload_0
    //   296: new 515	com/tencent/mm/plugin/webview/ui/tools/fts/b
    //   299: dup
    //   300: aload_0
    //   301: aload_0
    //   302: getfield 915	com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI:suU	Landroid/view/View;
    //   305: aload_0
    //   306: getfield 723	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:titleView	Landroid/widget/TextView;
    //   309: aload_0
    //   310: getfield 764	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:ogo	Landroid/widget/ImageButton;
    //   313: aload_0
    //   314: getfield 770	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:suW	Landroid/view/View;
    //   317: aload_0
    //   318: getfield 868	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svD	Landroid/view/View;
    //   321: aload_0
    //   322: getfield 216	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svE	Landroid/view/View;
    //   325: invokespecial 928	com/tencent/mm/plugin/webview/ui/tools/fts/b:<init>	(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    //   328: putfield 183	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svv	Lcom/tencent/mm/plugin/webview/ui/tools/fts/b;
    //   331: aload_0
    //   332: getfield 183	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svv	Lcom/tencent/mm/plugin/webview/ui/tools/fts/b;
    //   335: aload_0
    //   336: getfield 156	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svN	Lcom/tencent/mm/plugin/webview/ui/tools/fts/b$a;
    //   339: putfield 931	com/tencent/mm/plugin/webview/ui/tools/fts/b:swH	Lcom/tencent/mm/plugin/webview/ui/tools/fts/b$a;
    //   342: aload_0
    //   343: new 510	com/tencent/mm/plugin/webview/ui/tools/fts/c
    //   346: dup
    //   347: aload_0
    //   348: aload_0
    //   349: getfield 915	com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI:suU	Landroid/view/View;
    //   352: aload_0
    //   353: getfield 723	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:titleView	Landroid/widget/TextView;
    //   356: aload_0
    //   357: invokevirtual 649	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:bCE	()Lcom/tencent/mm/ui/fts/widget/SOSEditTextView;
    //   360: getfield 919	com/tencent/mm/ui/fts/widget/FTSEditTextView:jjR	Landroid/widget/ImageView;
    //   363: aload_0
    //   364: getfield 764	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:ogo	Landroid/widget/ImageButton;
    //   367: aload_0
    //   368: getfield 770	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:suW	Landroid/view/View;
    //   371: aload_0
    //   372: invokevirtual 649	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:bCE	()Lcom/tencent/mm/ui/fts/widget/SOSEditTextView;
    //   375: getfield 786	com/tencent/mm/ui/fts/widget/FTSEditTextView:vNy	Landroid/widget/EditText;
    //   378: aload_0
    //   379: getfield 868	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svD	Landroid/view/View;
    //   382: invokespecial 932	com/tencent/mm/plugin/webview/ui/tools/fts/c:<init>	(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V
    //   385: putfield 262	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svw	Lcom/tencent/mm/plugin/webview/ui/tools/fts/c;
    //   388: aload_0
    //   389: getfield 262	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svw	Lcom/tencent/mm/plugin/webview/ui/tools/fts/c;
    //   392: aload_0
    //   393: getfield 153	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svM	Lcom/tencent/mm/plugin/webview/ui/tools/fts/c$a;
    //   396: putfield 935	com/tencent/mm/plugin/webview/ui/tools/fts/c:swJ	Lcom/tencent/mm/plugin/webview/ui/tools/fts/c$a;
    //   399: aload_0
    //   400: aload_0
    //   401: getstatic 938	com/tencent/mm/R$h:cyI	I
    //   404: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   407: checkcast 940	android/widget/ListView
    //   410: putfield 942	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svs	Landroid/widget/ListView;
    //   413: aload_0
    //   414: new 40	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$a
    //   417: dup
    //   418: aload_0
    //   419: iconst_0
    //   420: invokespecial 945	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$a:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI;B)V
    //   423: putfield 387	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svt	Lcom/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$a;
    //   426: aload_0
    //   427: getfield 942	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svs	Landroid/widget/ListView;
    //   430: aload_0
    //   431: getfield 387	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svt	Lcom/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$a;
    //   434: invokevirtual 949	android/widget/ListView:setAdapter	(Landroid/widget/ListAdapter;)V
    //   437: aload_0
    //   438: getfield 942	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svs	Landroid/widget/ListView;
    //   441: aload_0
    //   442: getfield 162	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svR	Landroid/widget/AdapterView$OnItemClickListener;
    //   445: invokevirtual 953	android/widget/ListView:setOnItemClickListener	(Landroid/widget/AdapterView$OnItemClickListener;)V
    //   448: aload_0
    //   449: aload_0
    //   450: getstatic 956	com/tencent/mm/R$h:cyH	I
    //   453: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   456: putfield 238	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:pDB	Landroid/view/View;
    //   459: new 401	android/os/Bundle
    //   462: dup
    //   463: invokespecial 402	android/os/Bundle:<init>	()V
    //   466: astore_1
    //   467: aload_1
    //   468: ldc_w 958
    //   471: ldc_w 960
    //   474: invokevirtual 417	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   477: new 962	org/json/JSONObject
    //   480: dup
    //   481: aload_0
    //   482: getfield 372	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:jeK	Lcom/tencent/mm/plugin/webview/stub/d;
    //   485: iconst_2
    //   486: aload_1
    //   487: invokeinterface 965 3 0
    //   492: ldc_w 967
    //   495: invokevirtual 970	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   498: invokespecial 972	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   501: astore_1
    //   502: aload_0
    //   503: getfield 223	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:pmV	Lcom/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout;
    //   506: aload_1
    //   507: invokevirtual 976	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:X	(Lorg/json/JSONObject;)V
    //   510: new 401	android/os/Bundle
    //   513: dup
    //   514: invokespecial 402	android/os/Bundle:<init>	()V
    //   517: astore_1
    //   518: aload_1
    //   519: ldc_w 958
    //   522: ldc_w 978
    //   525: invokevirtual 417	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   528: new 962	org/json/JSONObject
    //   531: dup
    //   532: aload_0
    //   533: getfield 372	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:jeK	Lcom/tencent/mm/plugin/webview/stub/d;
    //   536: iconst_2
    //   537: aload_1
    //   538: invokeinterface 965 3 0
    //   543: ldc_w 967
    //   546: invokevirtual 970	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   549: invokespecial 972	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   552: astore_1
    //   553: aload_0
    //   554: getfield 244	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svy	Lcom/tencent/mm/ui/fts/widget/FTSMainUIEducationLayoutWithAll;
    //   557: aload_1
    //   558: invokevirtual 979	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayoutWithAll:X	(Lorg/json/JSONObject;)V
    //   561: aload_0
    //   562: getfield 655	com/tencent/mm/ui/MMActivity:vov	Lcom/tencent/mm/ui/p;
    //   565: getfield 982	com/tencent/mm/ui/p:iiK	Landroid/view/View;
    //   568: new 36	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$8
    //   571: dup
    //   572: aload_0
    //   573: invokespecial 983	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$8:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI;)V
    //   576: ldc2_w 984
    //   579: invokevirtual 989	android/view/View:postDelayed	(Ljava/lang/Runnable;J)Z
    //   582: pop
    //   583: aload_0
    //   584: getfield 942	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svs	Landroid/widget/ListView;
    //   587: new 38	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$9
    //   590: dup
    //   591: aload_0
    //   592: invokespecial 990	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$9:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI;)V
    //   595: invokevirtual 994	android/widget/ListView:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   598: aload_0
    //   599: getstatic 997	com/tencent/mm/R$h:bzc	I
    //   602: invokevirtual 863	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:findViewById	(I)Landroid/view/View;
    //   605: new 8	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$10
    //   608: dup
    //   609: aload_0
    //   610: invokespecial 998	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$10:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI;)V
    //   613: invokevirtual 999	android/view/View:setOnTouchListener	(Landroid/view/View$OnTouchListener;)V
    //   616: aload_0
    //   617: getfield 252	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svB	Landroid/view/View;
    //   620: new 10	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$11
    //   623: dup
    //   624: aload_0
    //   625: invokespecial 1000	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$11:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI;)V
    //   628: invokevirtual 881	android/view/View:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   631: aload_0
    //   632: invokevirtual 1004	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:getIntent	()Landroid/content/Intent;
    //   635: ldc_w 1006
    //   638: invokevirtual 1011	android/content/Intent:getStringExtra	(Ljava/lang/String;)Ljava/lang/String;
    //   641: astore_1
    //   642: aload_0
    //   643: getfield 723	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:titleView	Landroid/widget/TextView;
    //   646: aload_1
    //   647: invokevirtual 645	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   650: aload_0
    //   651: aload_0
    //   652: getfield 723	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:titleView	Landroid/widget/TextView;
    //   655: invokevirtual 1015	android/widget/TextView:getLayoutParams	()Landroid/view/ViewGroup$LayoutParams;
    //   658: checkcast 1017	android/widget/RelativeLayout$LayoutParams
    //   661: getfield 1020	android/widget/RelativeLayout$LayoutParams:leftMargin	I
    //   664: aload_0
    //   665: invokevirtual 749	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:getResources	()Landroid/content/res/Resources;
    //   668: getstatic 1025	com/tencent/mm/R$f:aUY	I
    //   671: invokevirtual 1029	android/content/res/Resources:getDimension	(I)F
    //   674: f2i
    //   675: isub
    //   676: putfield 204	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svG	I
    //   679: aload_0
    //   680: getfield 288	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svF	Lcom/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$b;
    //   683: invokevirtual 1030	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI$b:start	()V
    //   686: new 401	android/os/Bundle
    //   689: dup
    //   690: invokespecial 402	android/os/Bundle:<init>	()V
    //   693: astore_1
    //   694: aload_1
    //   695: ldc_w 958
    //   698: ldc_w 1032
    //   701: invokevirtual 417	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   704: aload_0
    //   705: aload_0
    //   706: getfield 372	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:jeK	Lcom/tencent/mm/plugin/webview/stub/d;
    //   709: bipush 6
    //   711: aload_1
    //   712: invokeinterface 965 3 0
    //   717: ldc_w 967
    //   720: invokevirtual 970	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   723: putfield 139	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svJ	Ljava/lang/String;
    //   726: aload_0
    //   727: getfield 139	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:svJ	Ljava/lang/String;
    //   730: astore_2
    //   731: aload_0
    //   732: getfield 355	com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI:fwy	Ljava/lang/String;
    //   735: astore_3
    //   736: aload_0
    //   737: getfield 223	com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI:pmV	Lcom/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout;
    //   740: astore_1
    //   741: aload_1
    //   742: getfield 1035	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:wGm	Ljava/lang/String;
    //   745: ifnonnull +22 -> 767
    //   748: ldc -119
    //   750: astore_1
    //   751: aload_2
    //   752: aload_3
    //   753: aload_1
    //   754: invokestatic 1038	com/tencent/mm/ay/i:m	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   757: ldc2_w 841
    //   760: ldc_w 843
    //   763: invokestatic 168	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   766: return
    //   767: aload_1
    //   768: getfield 1035	com/tencent/mm/ui/fts/widget/FTSMainUIEducationLayout:wGm	Ljava/lang/String;
    //   771: astore_1
    //   772: goto -21 -> 751
    //   775: astore_1
    //   776: ldc2_w 841
    //   779: ldc_w 843
    //   782: invokestatic 168	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   785: return
    //   786: astore_1
    //   787: goto -226 -> 561
    //   790: astore_1
    //   791: goto -281 -> 510
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	794	0	this	FTSSOSHomeWebViewUI
    //   466	306	1	localObject	Object
    //   775	1	1	localException1	Exception
    //   786	1	1	localException2	Exception
    //   790	1	1	localException3	Exception
    //   730	22	2	str1	String
    //   735	18	3	str2	String
    // Exception table:
    //   from	to	target	type
    //   686	748	775	java/lang/Exception
    //   751	757	775	java/lang/Exception
    //   767	772	775	java/lang/Exception
    //   510	561	786	java/lang/Exception
    //   459	510	790	java/lang/Exception
  }
  
  protected final void bCA()
  {
    GMTrace.i(16224104742912L, 120879);
    if (this.svI > 0)
    {
      GMTrace.o(16224104742912L, 120879);
      return;
    }
    super.bCA();
    bCE().Il(getString(R.l.dwX));
    this.svF.zG(2);
    this.suU.setBackgroundResource(R.g.bdF);
    this.pDB.setVisibility(8);
    this.svO = null;
    this.svP = 0;
    GMTrace.o(16224104742912L, 120879);
  }
  
  protected final void bCB()
  {
    GMTrace.i(19412312653824L, 144633);
    super.bCB();
    this.svr.setVisibility(0);
    GMTrace.o(19412312653824L, 144633);
  }
  
  public final String bCC()
  {
    GMTrace.i(16263833190400L, 121175);
    if (this.svP == 0)
    {
      GMTrace.o(16263833190400L, 121175);
      return "";
    }
    String str = this.svO;
    GMTrace.o(16263833190400L, 121175);
    return str;
  }
  
  public final int bCD()
  {
    GMTrace.i(16263967408128L, 121176);
    int i = this.svP;
    GMTrace.o(16263967408128L, 121176);
    return i;
  }
  
  public final boolean bCM()
  {
    GMTrace.i(18126506819584L, 135053);
    boolean bool = this.svF.bCM();
    GMTrace.o(18126506819584L, 135053);
    return bool;
  }
  
  protected final void bCy()
  {
    GMTrace.i(16901098962944L, 125923);
    super.bCy();
    this.svF.zG(11);
    GMTrace.o(16901098962944L, 125923);
  }
  
  protected final void bCz()
  {
    GMTrace.i(16900696309760L, 125920);
    super.bCz();
    xE(this.suY);
    bCE().Il(xF(this.suY));
    GMTrace.o(16900696309760L, 125920);
  }
  
  protected final void g(int paramInt, Bundle paramBundle)
  {
    int i = 0;
    GMTrace.i(16224507396096L, 120882);
    super.g(paramInt, paramBundle);
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(16224507396096L, 120882);
      return;
      ArrayList localArrayList = new ArrayList();
      String str;
      Object localObject;
      if (bCE().vNy.hasFocus())
      {
        str = paramBundle.getString("query");
        if (bCK().equals(str))
        {
          paramBundle = paramBundle.getStringArrayList("result").iterator();
          paramInt = i;
          while (paramBundle.hasNext())
          {
            localObject = (String)paramBundle.next();
            if (com.tencent.mm.ay.d.ag((String)localObject, str))
            {
              paramInt += 1;
              if (paramInt > 2) {
                break;
              }
              c localc = new c();
              localc.type = 1;
              localc.icon = R.k.dqS;
              localc.content = ((String)localObject);
              localc.swj = R.g.bdE;
              localArrayList.add(localc);
            }
          }
        }
      }
      af.u(new FTSSOSHomeWebViewUI.a.1(this.svt, localArrayList));
      GMTrace.o(16224507396096L, 120882);
      return;
      localArrayList = new ArrayList();
      if (bCE().vNy.hasFocus())
      {
        str = paramBundle.getString("query");
        if (bCK().equals(str))
        {
          this.svO = paramBundle.getString("suggestionId");
          paramBundle = paramBundle.getStringArrayList("result").iterator();
          while (paramBundle.hasNext())
          {
            str = (String)paramBundle.next();
            localObject = new c();
            ((c)localObject).type = 2;
            ((c)localObject).icon = 0;
            ((c)localObject).content = str;
            ((c)localObject).swj = R.g.bdG;
            localArrayList.add(localObject);
          }
        }
      }
      af.u(new FTSSOSHomeWebViewUI.a.3(this.svt, localArrayList));
      GMTrace.o(16224507396096L, 120882);
      return;
      this.svF.zG(8);
      GMTrace.o(16224507396096L, 120882);
      return;
      this.svF.zG(10);
      GMTrace.o(16224507396096L, 120882);
      return;
      GMTrace.o(16224507396096L, 120882);
      return;
      paramBundle.getString("fts_key_new_query", "");
      this.svF.zG(13);
    }
  }
  
  protected final String getHint()
  {
    GMTrace.i(16224373178368L, 120881);
    String str = getString(R.l.dwX);
    GMTrace.o(16224373178368L, 120881);
    return str;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(16224238960640L, 120880);
    int i = R.i.dgK;
    GMTrace.o(16224238960640L, 120880);
    return i;
  }
  
  public final void hc(boolean paramBoolean)
  {
    GMTrace.i(16223567872000L, 120875);
    if (this.svF.bCM()) {
      super.hc(paramBoolean);
    }
    this.svF.zG(5);
    GMTrace.o(16223567872000L, 120875);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(16901367398400L, 125925);
    if (this.svy.getVisibility() == 0) {
      bCO();
    }
    for (;;)
    {
      bCE().ceC();
      GMTrace.o(16901367398400L, 125925);
      return;
      super.onBackPressed();
    }
  }
  
  private final class a
    extends BaseAdapter
  {
    private List<FTSSOSHomeWebViewUI.c> svY;
    
    private a()
    {
      GMTrace.i(16208938139648L, 120766);
      this.svY = new ArrayList();
      GMTrace.o(16208938139648L, 120766);
    }
    
    public final void clear()
    {
      GMTrace.i(16209340792832L, 120769);
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16210682970112L, 120779);
          FTSSOSHomeWebViewUI.a.a(FTSSOSHomeWebViewUI.a.this).clear();
          FTSSOSHomeWebViewUI.a.this.notifyDataSetChanged();
          GMTrace.o(16210682970112L, 120779);
        }
      });
      GMTrace.o(16209340792832L, 120769);
    }
    
    public final int getCount()
    {
      GMTrace.i(16209475010560L, 120770);
      if (this.svY.size() > 6)
      {
        GMTrace.o(16209475010560L, 120770);
        return 6;
      }
      int i = this.svY.size();
      GMTrace.o(16209475010560L, 120770);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(16209743446016L, 120772);
      GMTrace.o(16209743446016L, 120772);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(16209877663744L, 120773);
      FTSSOSHomeWebViewUI.c localc;
      if (paramView == null)
      {
        paramViewGroup = new a();
        paramView = LayoutInflater.from(FTSSOSHomeWebViewUI.this.vov.voR).inflate(R.i.dgM, null);
        paramViewGroup.jjR = ((ImageView)paramView.findViewById(R.h.bOX));
        paramViewGroup.kGV = ((TextView)paramView.findViewById(R.h.bze));
        paramViewGroup.swc = ((ImageView)paramView.findViewById(R.h.czO));
        paramView.setTag(paramViewGroup);
        localc = xG(paramInt);
        localc.position = paramInt;
        if (localc.icon == 0) {
          break label214;
        }
        paramViewGroup.jjR.setVisibility(0);
        paramViewGroup.jjR.setImageResource(localc.icon);
        label130:
        if (localc.swj == 0) {
          break label225;
        }
        paramViewGroup.swc.setVisibility(0);
        paramViewGroup.swc.setImageResource(localc.swj);
        paramViewGroup.swc.setTag(localc);
        paramViewGroup.swc.setOnClickListener(FTSSOSHomeWebViewUI.r(FTSSOSHomeWebViewUI.this));
      }
      for (;;)
      {
        paramViewGroup.kGV.setText(localc.content);
        GMTrace.o(16209877663744L, 120773);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label214:
        paramViewGroup.jjR.setVisibility(4);
        break label130;
        label225:
        paramViewGroup.swc.setVisibility(4);
      }
    }
    
    public final FTSSOSHomeWebViewUI.c xG(int paramInt)
    {
      GMTrace.i(16209609228288L, 120771);
      FTSSOSHomeWebViewUI.c localc = (FTSSOSHomeWebViewUI.c)this.svY.get(paramInt);
      GMTrace.o(16209609228288L, 120771);
      return localc;
    }
    
    private final class a
    {
      ImageView jjR;
      TextView kGV;
      ImageView swc;
      
      public a()
      {
        GMTrace.i(16221151952896L, 120857);
        GMTrace.o(16221151952896L, 120857);
      }
    }
  }
  
  private final class b
    extends com.tencent.mm.sdk.d.d
  {
    com.tencent.mm.sdk.d.c swd;
    com.tencent.mm.sdk.d.c swe;
    com.tencent.mm.sdk.d.c swf;
    com.tencent.mm.sdk.d.c swg;
    
    protected b(String paramString, Looper paramLooper)
    {
      super(paramLooper);
      GMTrace.i(16899219914752L, 125909);
      this.swd = new a();
      this.swe = new d();
      this.swf = new b();
      this.swg = new c();
      b(this.swd);
      b(this.swe);
      b(this.swf);
      b(this.swg);
      c(this.swd);
      GMTrace.o(16899219914752L, 125909);
    }
    
    public final boolean bCM()
    {
      GMTrace.i(18126238384128L, 135051);
      com.tencent.mm.sdk.d.a locala = bOm();
      if ((locala == this.swe) || (locala == this.swf) || (locala == this.swg))
      {
        GMTrace.o(18126238384128L, 135051);
        return true;
      }
      GMTrace.o(18126238384128L, 135051);
      return false;
    }
    
    private final class a
      extends com.tencent.mm.sdk.d.b
    {
      public a()
      {
        GMTrace.i(16896938213376L, 125892);
        GMTrace.o(16896938213376L, 125892);
      }
      
      public final void enter()
      {
        GMTrace.i(16897072431104L, 125893);
        super.enter();
        FTSSOSHomeWebViewUI.z(FTSSOSHomeWebViewUI.this);
        GMTrace.o(16897072431104L, 125893);
      }
      
      public final void exit()
      {
        GMTrace.i(16897206648832L, 125894);
        super.exit();
        GMTrace.o(16897206648832L, 125894);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(16897340866560L, 125895);
        switch (paramMessage.what)
        {
        }
        for (;;)
        {
          boolean bool = super.f(paramMessage);
          GMTrace.o(16897340866560L, 125895);
          return bool;
          if (FTSSOSHomeWebViewUI.this.bCI().length() > 0)
          {
            FTSSOSHomeWebViewUI.this.bCE().ceC();
            FTSSOSHomeWebViewUI.this.bCE().vNy.clearFocus();
            FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this, 0);
            FTSSOSHomeWebViewUI.A(FTSSOSHomeWebViewUI.this).xH(a.b.swE);
            FTSSOSHomeWebViewUI.e(FTSSOSHomeWebViewUI.this, a.b.swE);
            FTSSOSHomeWebViewUI.this.suU.setBackgroundResource(R.e.white);
            FTSSOSHomeWebViewUI.t(FTSSOSHomeWebViewUI.this).clear();
            continue;
            FTSSOSHomeWebViewUI.this.bCE().ceC();
            FTSSOSHomeWebViewUI.B(FTSSOSHomeWebViewUI.this).xH(a.b.swE);
            FTSSOSHomeWebViewUI.e(FTSSOSHomeWebViewUI.this, a.b.swE);
            FTSSOSHomeWebViewUI.this.suU.setBackgroundResource(R.e.white);
            FTSSOSHomeWebViewUI.t(FTSSOSHomeWebViewUI.this).clear();
            FTSSOSHomeWebViewUI.C(FTSSOSHomeWebViewUI.this);
            continue;
            FTSSOSHomeWebViewUI.this.svb = true;
            FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.swe);
            continue;
            FTSSOSHomeWebViewUI.this.svb = true;
            FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.swf);
            continue;
            if ((FTSSOSHomeWebViewUI.this.bCE().vNy.hasFocus()) && (FTSSOSHomeWebViewUI.this.bCI().length() > 0)) {
              FTSSOSHomeWebViewUI.u(FTSSOSHomeWebViewUI.this);
            }
          }
        }
      }
      
      public final String getName()
      {
        GMTrace.i(16897475084288L, 125896);
        GMTrace.o(16897475084288L, 125896);
        return "InitSate";
      }
    }
    
    private final class b
      extends com.tencent.mm.sdk.d.b
    {
      public b()
      {
        GMTrace.i(16895730253824L, 125883);
        GMTrace.o(16895730253824L, 125883);
      }
      
      public final void enter()
      {
        GMTrace.i(16895864471552L, 125884);
        super.enter();
        FTSSOSHomeWebViewUI.this.suV.vNy.clearFocus();
        FTSSOSHomeWebViewUI.D(FTSSOSHomeWebViewUI.this).setVisibility(0);
        FTSSOSHomeWebViewUI.this.suU.setPadding(FTSSOSHomeWebViewUI.E(FTSSOSHomeWebViewUI.this), 0, 0, 0);
        FTSSOSHomeWebViewUI.this.bCE().ceC();
        FTSSOSHomeWebViewUI.this.suW.setVisibility(0);
        FTSSOSHomeWebViewUI.this.ogo.setVisibility(8);
        FTSSOSHomeWebViewUI.F(FTSSOSHomeWebViewUI.this).setVisibility(0);
        FTSSOSHomeWebViewUI.t(FTSSOSHomeWebViewUI.this).clear();
        FTSSOSHomeWebViewUI.G(FTSSOSHomeWebViewUI.this).setVisibility(0);
        FTSSOSHomeWebViewUI.H(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.k(FTSSOSHomeWebViewUI.this).setVisibility(8);
        if (!FTSSOSHomeWebViewUI.I(FTSSOSHomeWebViewUI.this)) {
          FTSSOSHomeWebViewUI.J(FTSSOSHomeWebViewUI.this).setVisibility(0);
        }
        FTSSOSHomeWebViewUI.this.bCE().jjR.setVisibility(8);
        FTSSOSHomeWebViewUI.K(FTSSOSHomeWebViewUI.this).setVisibility(0);
        if ((com.tencent.mm.compatible.util.d.et(23)) && (!h.tJ())) {
          FTSSOSHomeWebViewUI.f(FTSSOSHomeWebViewUI.this, FTSSOSHomeWebViewUI.this.getResources().getColor(R.e.white));
        }
        GMTrace.o(16895864471552L, 125884);
      }
      
      public final void exit()
      {
        GMTrace.i(16895998689280L, 125885);
        super.exit();
        GMTrace.o(16895998689280L, 125885);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(16896132907008L, 125886);
        switch (paramMessage.what)
        {
        }
        for (;;)
        {
          boolean bool = super.f(paramMessage);
          GMTrace.o(16896132907008L, 125886);
          return bool;
          FTSSOSHomeWebViewUI.L(FTSSOSHomeWebViewUI.this);
          FTSSOSHomeWebViewUI.J(FTSSOSHomeWebViewUI.this).setVisibility(8);
          FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this, 0);
          FTSSOSHomeWebViewUI.A(FTSSOSHomeWebViewUI.this).xH(a.b.swD);
          FTSSOSHomeWebViewUI.e(FTSSOSHomeWebViewUI.this, a.b.swD);
          continue;
          FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.swd);
          continue;
          if (FTSSOSHomeWebViewUI.this.bCE().vNy.hasFocus()) {
            FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.swe);
          }
        }
      }
      
      public final String getName()
      {
        GMTrace.i(16896267124736L, 125887);
        GMTrace.o(16896267124736L, 125887);
        return "SearchNoFocusState";
      }
    }
    
    private final class c
      extends com.tencent.mm.sdk.d.b
    {
      public c()
      {
        GMTrace.i(16899891003392L, 125914);
        GMTrace.o(16899891003392L, 125914);
      }
      
      public final void enter()
      {
        GMTrace.i(16900025221120L, 125915);
        super.enter();
        FTSSOSHomeWebViewUI.this.suU.setPadding(FTSSOSHomeWebViewUI.E(FTSSOSHomeWebViewUI.this), 0, 0, 0);
        FTSSOSHomeWebViewUI.this.bCE().ceC();
        FTSSOSHomeWebViewUI.this.suW.setVisibility(0);
        FTSSOSHomeWebViewUI.this.ogo.setVisibility(8);
        FTSSOSHomeWebViewUI.F(FTSSOSHomeWebViewUI.this).setVisibility(0);
        FTSSOSHomeWebViewUI.G(FTSSOSHomeWebViewUI.this).setVisibility(0);
        FTSSOSHomeWebViewUI.H(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.k(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.J(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.this.bCE().ceB();
        FTSSOSHomeWebViewUI.K(FTSSOSHomeWebViewUI.this).setVisibility(0);
        GMTrace.o(16900025221120L, 125915);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(16900159438848L, 125916);
        switch (paramMessage.what)
        {
        }
        label1131:
        for (;;)
        {
          boolean bool = super.f(paramMessage);
          GMTrace.o(16900159438848L, 125916);
          return bool;
          if (FTSSOSHomeWebViewUI.this.bCE().vNy.hasFocus())
          {
            FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.swe);
            continue;
            if (FTSSOSHomeWebViewUI.this.bCI().length() > 0)
            {
              FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.swf);
              continue;
              if (FTSSOSHomeWebViewUI.this.bCI().length() > 0)
              {
                FTSSOSHomeWebViewUI.this.bCE().ceC();
                FTSSOSHomeWebViewUI.this.bCE().vNy.clearFocus();
                FTSSOSHomeWebViewUI.t(FTSSOSHomeWebViewUI.this).clear();
                FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.swf);
                continue;
                FTSSOSHomeWebViewUI.L(FTSSOSHomeWebViewUI.this);
                FTSSOSHomeWebViewUI.J(FTSSOSHomeWebViewUI.this).setVisibility(8);
                FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this, 0);
                Object localObject = FTSSOSHomeWebViewUI.M(FTSSOSHomeWebViewUI.this);
                int i = a.b.swD;
                if (i != ((c)localObject).swu) {
                  switch (c.2.swA[(i - 1)])
                  {
                  }
                }
                for (;;)
                {
                  ((c)localObject).swu = i;
                  FTSSOSHomeWebViewUI.e(FTSSOSHomeWebViewUI.this, a.b.swD);
                  break;
                  ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(((c)localObject).swo, "y", new float[] { localObject.swt[0][1], localObject.swt[0][0] });
                  ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(((c)localObject).swo, "x", new float[] { localObject.swt[1][1], localObject.swt[1][0] });
                  ObjectAnimator localObjectAnimator3 = ObjectAnimator.ofFloat(((c)localObject).swn, "alpha", new float[] { 0.0F, 1.0F });
                  ObjectAnimator localObjectAnimator4 = ObjectAnimator.ofFloat(((c)localObject).swq, "alpha", new float[] { 0.0F, 1.0F });
                  ObjectAnimator localObjectAnimator5 = ObjectAnimator.ofFloat(((c)localObject).swr, "alpha", new float[] { 1.0F, 0.0F });
                  ValueAnimator localValueAnimator1 = ValueAnimator.ofInt(new int[] { ((c)localObject).sww, ((c)localObject).swv });
                  localValueAnimator1.addUpdateListener(new c.5((c)localObject));
                  ValueAnimator localValueAnimator2 = ValueAnimator.ofInt(new int[] { c.swm, 0 });
                  localValueAnimator2.addUpdateListener(new c.6((c)localObject));
                  AnimatorSet localAnimatorSet = new AnimatorSet();
                  localAnimatorSet.playTogether(new Animator[] { localObjectAnimator2, localObjectAnimator1, localValueAnimator2, localObjectAnimator3, localObjectAnimator4, localObjectAnimator5, localValueAnimator1 });
                  localAnimatorSet.setDuration(300L);
                  localAnimatorSet.addListener(new c.7((c)localObject));
                  localAnimatorSet.start();
                  continue;
                  localObjectAnimator1 = ObjectAnimator.ofFloat(((c)localObject).swo, "y", new float[] { localObject.swt[0][0], localObject.swt[0][1] });
                  localObjectAnimator2 = ObjectAnimator.ofFloat(((c)localObject).swo, "x", new float[] { localObject.swt[1][0], localObject.swt[1][1] });
                  localObjectAnimator3 = ObjectAnimator.ofFloat(((c)localObject).swn, "alpha", new float[] { 1.0F, 0.0F });
                  localObjectAnimator4 = ObjectAnimator.ofFloat(((c)localObject).swq, "alpha", new float[] { 1.0F, 0.0F });
                  localObjectAnimator5 = ObjectAnimator.ofFloat(((c)localObject).swr, "alpha", new float[] { 0.0F, 1.0F });
                  localValueAnimator1 = ValueAnimator.ofInt(new int[] { ((c)localObject).swv, ((c)localObject).sww });
                  localValueAnimator1.addUpdateListener(new c.8((c)localObject));
                  localValueAnimator2 = ValueAnimator.ofInt(new int[] { 0, c.swm });
                  localValueAnimator2.addUpdateListener(new c.9((c)localObject));
                  localAnimatorSet = new AnimatorSet();
                  localAnimatorSet.playTogether(new Animator[] { localObjectAnimator2, localObjectAnimator1, localValueAnimator2, localObjectAnimator3, localObjectAnimator4, localObjectAnimator5, localValueAnimator1 });
                  localAnimatorSet.setDuration(300L);
                  localAnimatorSet.addListener(new c.10((c)localObject));
                  localAnimatorSet.start();
                }
                FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.swd);
                continue;
                if (TextUtils.isEmpty(FTSSOSHomeWebViewUI.this.bCI()))
                {
                  localObject = FTSSOSHomeWebViewUI.this;
                  if ((((BaseSOSWebViewUI)localObject).suX != null) && (((BaseSOSWebViewUI)localObject).suX.size() > 0)) {}
                  for (localObject = (BaseSOSWebViewUI.c)((BaseSOSWebViewUI)localObject).suX.get(0);; localObject = null)
                  {
                    if (localObject == null) {
                      break label1131;
                    }
                    FTSSOSHomeWebViewUI.this.suV.a(((BaseSOSWebViewUI.c)localObject).svl, ((BaseSOSWebViewUI.c)localObject).qOG, FTSEditTextView.b.wGg);
                    FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.swf);
                    i = FTSSOSHomeWebViewUI.this.bCJ();
                    if ((i != 2) && (i != 5)) {
                      break;
                    }
                    FTSSOSHomeWebViewUI.b.this.uPX.post(new Runnable()
                    {
                      public final void run()
                      {
                        GMTrace.i(19412044218368L, 144631);
                        if (FTSSOSHomeWebViewUI.N(FTSSOSHomeWebViewUI.this) != null)
                        {
                          HashMap localHashMap = new HashMap();
                          localHashMap.put("changeType", Integer.valueOf(1));
                          FTSSOSHomeWebViewUI.O(FTSSOSHomeWebViewUI.this).a(FTSSOSHomeWebViewUI.this.bCI(), FTSSOSHomeWebViewUI.this.bCK(), FTSSOSHomeWebViewUI.this.bCL(), localHashMap);
                        }
                        GMTrace.o(19412044218368L, 144631);
                      }
                    });
                    break;
                  }
                }
              }
            }
          }
        }
      }
      
      public final String getName()
      {
        GMTrace.i(16900293656576L, 125917);
        GMTrace.o(16900293656576L, 125917);
        return "SearchWithFocusNoResultState";
      }
    }
    
    private final class d
      extends com.tencent.mm.sdk.d.b
    {
      public d()
      {
        GMTrace.i(16907541413888L, 125971);
        GMTrace.o(16907541413888L, 125971);
      }
      
      public final void enter()
      {
        GMTrace.i(16907675631616L, 125972);
        super.enter();
        FTSSOSHomeWebViewUI.D(FTSSOSHomeWebViewUI.this).setVisibility(0);
        FTSSOSHomeWebViewUI.this.suU.setPadding(0, 0, 0, 0);
        FTSSOSHomeWebViewUI.J(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.c(FTSSOSHomeWebViewUI.this);
        FTSSOSHomeWebViewUI.this.bCE().ceB();
        FTSSOSHomeWebViewUI.G(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.H(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.k(FTSSOSHomeWebViewUI.this).setVisibility(8);
        FTSSOSHomeWebViewUI.K(FTSSOSHomeWebViewUI.this).setVisibility(0);
        if (!FTSSOSHomeWebViewUI.this.bCE().vNy.hasFocus())
        {
          FTSSOSHomeWebViewUI.this.bCE().cez();
          FTSSOSHomeWebViewUI.this.aKp();
        }
        if ((com.tencent.mm.compatible.util.d.et(23)) && (!h.tJ())) {
          FTSSOSHomeWebViewUI.g(FTSSOSHomeWebViewUI.this, FTSSOSHomeWebViewUI.this.getResources().getColor(R.e.white));
        }
        if (!TextUtils.isEmpty(FTSSOSHomeWebViewUI.this.bCK())) {
          FTSSOSHomeWebViewUI.this.bCE().wFW.setVisibility(0);
        }
        GMTrace.o(16907675631616L, 125972);
      }
      
      public final void exit()
      {
        GMTrace.i(16907809849344L, 125973);
        super.exit();
        GMTrace.o(16907809849344L, 125973);
      }
      
      public final boolean f(Message paramMessage)
      {
        GMTrace.i(16907944067072L, 125974);
        switch (paramMessage.what)
        {
        }
        for (;;)
        {
          boolean bool = super.f(paramMessage);
          GMTrace.o(16907944067072L, 125974);
          return bool;
          FTSSOSHomeWebViewUI.L(FTSSOSHomeWebViewUI.this);
          FTSSOSHomeWebViewUI.J(FTSSOSHomeWebViewUI.this).setVisibility(8);
          FTSSOSHomeWebViewUI.b(FTSSOSHomeWebViewUI.this, 0);
          FTSSOSHomeWebViewUI.B(FTSSOSHomeWebViewUI.this).xH(a.b.swD);
          FTSSOSHomeWebViewUI.e(FTSSOSHomeWebViewUI.this, a.b.swD);
          continue;
          FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.swd);
          continue;
          if (!FTSSOSHomeWebViewUI.this.bCE().vNy.hasFocus())
          {
            FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.swg);
            continue;
            if (FTSSOSHomeWebViewUI.this.bCI().length() > 0) {
              FTSSOSHomeWebViewUI.b.this.b(FTSSOSHomeWebViewUI.b.this.swf);
            }
          }
        }
      }
      
      public final String getName()
      {
        GMTrace.i(16908078284800L, 125975);
        GMTrace.o(16908078284800L, 125975);
        return "SearchWithFocusState";
      }
    }
  }
  
  private final class c
  {
    String content;
    int icon;
    int position;
    int swj;
    int type;
    
    public c()
    {
      GMTrace.i(16222091476992L, 120864);
      GMTrace.o(16222091476992L, 120864);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(16222225694720L, 120865);
      paramObject = (c)paramObject;
      boolean bool = this.content.equals(((c)paramObject).content);
      GMTrace.o(16222225694720L, 120865);
      return bool;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/FTSSOSHomeWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */