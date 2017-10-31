package com.tencent.mm.plugin.search.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ay.j;
import com.tencent.mm.g.a.ah;
import com.tencent.mm.g.a.ah.b;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.protocal.c.ayl;
import com.tencent.mm.protocal.c.ayn;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.fts.widget.FTSEditTextView;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.b;
import com.tencent.mm.ui.fts.widget.a.b;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

public class FTSAddFriendUI
  extends FTSBaseUI
{
  private ayn lAC;
  private String lTL;
  private Dialog lou;
  private View plC;
  private View plD;
  private View plE;
  private View plF;
  private View plG;
  private View plH;
  private ImageView plI;
  private TextView plJ;
  private TextView plK;
  private TextView plL;
  private TextView plM;
  private TextView plN;
  private boolean plO;
  protected boolean plP;
  private int plQ;
  private a plR;
  private int plS;
  private int plT;
  int plU;
  private long plV;
  
  public FTSAddFriendUI()
  {
    GMTrace.i(11831426940928L, 88151);
    this.lTL = "";
    this.plQ = 1;
    this.plU = -1;
    GMTrace.o(11831426940928L, 88151);
  }
  
  private void Fo(final String paramString)
  {
    GMTrace.i(11833037553664L, 88163);
    this.plO = true;
    this.plP = false;
    this.plQ = 1;
    if ((paramString == null) || (paramString.length() == 0) || (paramString.trim().length() == 0))
    {
      GMTrace.o(11833037553664L, 88163);
      return;
    }
    if (Character.isDigit(paramString.charAt(0))) {}
    for (int i = 15;; i = 3)
    {
      this.plU = i;
      final e local4 = new e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(18366085464064L, 136838);
          ap.wT().b(106, this);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            switch (paramAnonymousInt2)
            {
            default: 
              FTSAddFriendUI.d(FTSAddFriendUI.this).setText(R.l.erT);
            }
            for (;;)
            {
              FTSAddFriendUI.a(FTSAddFriendUI.this, -1);
              FTSAddFriendUI.b(FTSAddFriendUI.this, 1);
              FTSAddFriendUI.g(FTSAddFriendUI.this);
              GMTrace.o(18366085464064L, 136838);
              return;
              if (paramAnonymousInt1 == 4) {
                break;
              }
              FTSAddFriendUI.d(FTSAddFriendUI.this).setText(FTSAddFriendUI.this.getString(R.l.ear));
              continue;
              paramAnonymousString = com.tencent.mm.h.a.dC(paramAnonymousString);
              if (paramAnonymousString != null) {
                FTSAddFriendUI.d(FTSAddFriendUI.this).setText(paramAnonymousString.desc);
              } else {
                FTSAddFriendUI.d(FTSAddFriendUI.this).setText(R.l.erT);
              }
            }
          }
          FTSAddFriendUI.a(FTSAddFriendUI.this, ((ab)paramAnonymousk).LC());
          if (FTSAddFriendUI.e(FTSAddFriendUI.this).tVh > 0)
          {
            if (FTSAddFriendUI.e(FTSAddFriendUI.this).tVi.isEmpty())
            {
              h.a(FTSAddFriendUI.this, R.l.dtO, 0, true, null);
              GMTrace.o(18366085464064L, 136838);
              return;
            }
            paramAnonymousString = new Intent();
            paramAnonymousString.putExtra("add_more_friend_search_scene", 3);
            if (FTSAddFriendUI.e(FTSAddFriendUI.this).tVi.size() <= 1) {
              break label341;
            }
          }
          for (;;)
          {
            try
            {
              paramAnonymousString.putExtra("result", FTSAddFriendUI.e(FTSAddFriendUI.this).toByteArray());
              com.tencent.mm.plugin.search.a.ifM.w(paramAnonymousString, FTSAddFriendUI.this.vov.voR);
              FTSAddFriendUI.a(FTSAddFriendUI.this, 1);
              FTSAddFriendUI.f(FTSAddFriendUI.this);
            }
            catch (IOException paramAnonymousString)
            {
              w.printErrStackTrace("MicroMsg.FTS.FTSAddFriendUI", paramAnonymousString, "", new Object[0]);
              continue;
            }
            label341:
            com.tencent.mm.pluginsdk.ui.tools.c.a(paramAnonymousString, (ayl)FTSAddFriendUI.e(FTSAddFriendUI.this).tVi.getFirst(), FTSAddFriendUI.this.plU);
          }
        }
      };
      this.plS = 0;
      this.plT = 0;
      ap.wT().a(106, local4);
      paramString = new ab(paramString, 3);
      ap.wT().a(paramString, 0);
      getString(R.l.dxm);
      this.lou = h.a(this, getString(R.l.dtR), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(18361924714496L, 136807);
          ap.wT().c(paramString);
          ap.wT().b(106, local4);
          FTSAddFriendUI.h(FTSAddFriendUI.this);
          GMTrace.o(18361924714496L, 136807);
        }
      });
      GMTrace.o(11833037553664L, 88163);
      return;
    }
  }
  
  private void bbT()
  {
    GMTrace.i(11832769118208L, 88161);
    if (bg.mY(com.tencent.mm.platformtools.n.a(this.lAC.tKE)).length() > 0)
    {
      if (2 != this.lAC.usA) {
        break label129;
      }
      this.plU = 15;
    }
    for (;;)
    {
      Intent localIntent = new Intent();
      com.tencent.mm.pluginsdk.ui.tools.c.a(localIntent, this.lAC, this.plU);
      if ((this.plU == 15) && (2 == this.lAC.usA)) {
        localIntent.putExtra("Contact_Search_Mobile", this.lTL.trim());
      }
      localIntent.putExtra("add_more_friend_search_scene", 2);
      com.tencent.mm.plugin.search.a.ifM.d(localIntent, this);
      GMTrace.o(11832769118208L, 88161);
      return;
      label129:
      if (1 == this.lAC.usA) {
        this.plU = 1;
      }
    }
  }
  
  private void bbU()
  {
    GMTrace.i(11833171771392L, 88164);
    af.u(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18368635600896L, 136857);
        if (FTSAddFriendUI.j(FTSAddFriendUI.this) != null)
        {
          FTSAddFriendUI.j(FTSAddFriendUI.this).dismiss();
          FTSAddFriendUI.h(FTSAddFriendUI.this);
        }
        GMTrace.o(18368635600896L, 136857);
      }
    });
    GMTrace.o(11833171771392L, 88164);
  }
  
  protected final b a(c paramc)
  {
    GMTrace.i(11831829594112L, 88154);
    if (this.plR == null) {
      this.plR = new a(paramc);
    }
    paramc = this.plR;
    GMTrace.o(11831829594112L, 88154);
    return paramc;
  }
  
  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    GMTrace.i(17433272254464L, 129888);
    super.a(paramString1, paramString2, paramList, paramb);
    this.plO = false;
    GMTrace.o(17433272254464L, 129888);
  }
  
  public final boolean aaj()
  {
    GMTrace.i(16487305707520L, 122840);
    Fo(this.fIW);
    aKl();
    GMTrace.o(16487305707520L, 122840);
    return true;
  }
  
  public final void b(com.tencent.mm.plugin.fts.d.a.a parama)
  {
    GMTrace.i(16487037272064L, 122838);
    if ((parama instanceof com.tencent.mm.plugin.search.ui.a.a))
    {
      this.lTL = parama.fIW;
      Fo(parama.fIW);
    }
    GMTrace.o(16487037272064L, 122838);
  }
  
  protected final void bbS()
  {
    GMTrace.i(11832500682752L, 88159);
    super.bbS();
    this.plC.setVisibility(8);
    GMTrace.o(11832500682752L, 88159);
  }
  
  public final void bbV()
  {
    GMTrace.i(18368367165440L, 136855);
    if (!this.pmg.wGw.vNy.hasFocus())
    {
      this.pmg.wGw.cez();
      aKp();
    }
    GMTrace.o(18368367165440L, 136855);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11832366465024L, 88158);
    int i = R.i.cVq;
    GMTrace.o(11832366465024L, 88158);
    return i;
  }
  
  public void onClickBg(View paramView)
  {
    GMTrace.i(11833305989120L, 88165);
    GMTrace.o(11833305989120L, 88165);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11831561158656L, 88152);
    super.onCreate(paramBundle);
    this.plC = findViewById(R.h.bxr);
    this.plD = findViewById(R.h.bOn);
    this.plH = findViewById(R.h.bxs);
    this.plE = findViewById(R.h.cgx);
    this.plF = findViewById(R.h.ccd);
    this.plG = findViewById(R.h.ctp);
    this.plI = ((ImageView)findViewById(R.h.bxq));
    this.plJ = ((TextView)findViewById(R.h.byH));
    this.plK = ((TextView)findViewById(R.h.bxv));
    this.plL = ((TextView)findViewById(R.h.ctR));
    this.plM = ((TextView)findViewById(R.h.bxw));
    this.plN = ((TextView)findViewById(R.h.ctq));
    try
    {
      paramBundle = j.kA("webSearchBar").optString("wording");
      w.i("MicroMsg.FTS.FTSAddFriendUI", "set searchNetworkTips %s", new Object[] { paramBundle });
      this.plN.setText(paramBundle);
      this.vov.iiK.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18368232947712L, 136854);
          FTSAddFriendUI.this.pmg.wGw.cez();
          FTSAddFriendUI.this.pmg.wGw.cey();
          GMTrace.o(18368232947712L, 136854);
        }
      }, 128L);
      GMTrace.o(11831561158656L, 88152);
      return;
    }
    catch (Exception paramBundle)
    {
      for (;;) {}
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11832903335936L, 88162);
    super.onDestroy();
    if ((this.plO) && (!this.plP)) {
      com.tencent.mm.ay.i.d(this.fIW, this.plQ, 3, 16);
    }
    GMTrace.o(11832903335936L, 88162);
  }
  
  protected final void stopSearch()
  {
    GMTrace.i(11832634900480L, 88160);
    super.stopSearch();
    this.plC.setVisibility(8);
    GMTrace.o(11832634900480L, 88160);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/FTSAddFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */