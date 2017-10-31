package com.tencent.mm.plugin.card.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.card.b.d;
import com.tencent.mm.plugin.card.b.f;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.ab;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.p;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.plugin.card.sharecard.model.g;
import com.tencent.mm.protocal.c.jg;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CardAcceptCardListUI
  extends MMActivity
  implements e, MMActivity.a
{
  int fMx;
  private String hbQ;
  private q iXW;
  protected ListView kmd;
  protected RelativeLayout kmf;
  private boolean knC;
  private String kpB;
  private int kpC;
  private String kpD;
  private int kpE;
  private String kpF;
  private Button krQ;
  public int krX;
  private String krY;
  private String krZ;
  public ArrayList<String> ksa;
  public ArrayList<String> ksb;
  private Button ktA;
  LinkedList<jg> ktB;
  int ktC;
  String ktD;
  String ktE;
  private String ktF;
  LinkedList<jg> ktG;
  LinkedList<String> ktH;
  HashMap<String, Integer> ktn;
  private View ktt;
  private View ktu;
  private View ktv;
  protected a ktw;
  private View ktx;
  private View kty;
  private TextView ktz;
  
  public CardAcceptCardListUI()
  {
    GMTrace.i(5015045406720L, 37365);
    this.kmd = null;
    this.ktw = null;
    this.kmf = null;
    this.iXW = null;
    this.ktB = new LinkedList();
    this.kpB = "";
    this.fMx = 8;
    this.ktC = 7;
    this.ktD = "";
    this.ktE = "";
    this.ktF = "";
    this.knC = false;
    this.krX = 0;
    this.krY = "";
    this.krZ = "";
    this.ksa = new ArrayList();
    this.ksb = new ArrayList();
    this.ktG = new LinkedList();
    this.ktH = new LinkedList();
    this.ktn = new HashMap();
    this.hbQ = "";
    GMTrace.o(5015045406720L, 37365);
  }
  
  private ArrayList<CardInfo> Z(List<CardInfo> paramList)
  {
    GMTrace.i(5016656019456L, 37377);
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.e("MicroMsg.CardAcceptCardListUI", "geCardInfoListByTpId list is empty!");
      GMTrace.o(5016656019456L, 37377);
      return null;
    }
    this.ktG.clear();
    this.ktH.clear();
    this.ktn.clear();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i < paramList.size())
    {
      CardInfo localCardInfo = (CardInfo)paramList.get(i);
      if (this.ktH.contains(localCardInfo.field_card_tp_id))
      {
        int j = ((Integer)this.ktn.get(localCardInfo.field_card_tp_id)).intValue();
        this.ktn.put(localCardInfo.field_card_tp_id, Integer.valueOf(j + 1));
      }
      for (;;)
      {
        i += 1;
        break;
        localArrayList.add(localCardInfo);
        this.ktn.put(localCardInfo.field_card_tp_id, Integer.valueOf(1));
        this.ktH.add(localCardInfo.field_card_tp_id);
      }
    }
    GMTrace.o(5016656019456L, 37377);
    return localArrayList;
  }
  
  private String akf()
  {
    GMTrace.i(5016387584000L, 37375);
    String str;
    if ((!TextUtils.isEmpty(this.krY)) && (!TextUtils.isEmpty(this.krZ)))
    {
      str = this.krY + "," + l.uo(this.krZ);
      GMTrace.o(5016387584000L, 37375);
      return str;
    }
    if (!TextUtils.isEmpty(this.krY))
    {
      str = this.krY;
      GMTrace.o(5016387584000L, 37375);
      return str;
    }
    if (!TextUtils.isEmpty(this.krZ))
    {
      str = l.uo(this.krZ);
      GMTrace.o(5016387584000L, 37375);
      return str;
    }
    GMTrace.o(5016387584000L, 37375);
    return "";
  }
  
  private void akt()
  {
    GMTrace.i(5016521801728L, 37376);
    if (!TextUtils.isEmpty(this.kpF))
    {
      this.ktz.setText(this.kpF);
      GMTrace.o(5016521801728L, 37376);
      return;
    }
    this.ktz.setText(R.l.dGk);
    GMTrace.o(5016521801728L, 37376);
  }
  
  private void lE(int paramInt)
  {
    GMTrace.i(5016119148544L, 37373);
    w.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI finishUI() result_code:" + paramInt);
    Intent localIntent = new Intent();
    localIntent.putExtra("card_list", this.kpB);
    localIntent.putExtra("result_code", paramInt);
    setResult(0, localIntent);
    finish();
    GMTrace.o(5016119148544L, 37373);
  }
  
  protected final void MH()
  {
    GMTrace.i(5015313842176L, 37367);
    oC(R.l.dEz);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5010482003968L, 37331);
        w.v("MicroMsg.CardAcceptCardListUI", "setBackBtn cancel");
        CardAcceptCardListUI.a(CardAcceptCardListUI.this, 1);
        GMTrace.o(5010482003968L, 37331);
        return true;
      }
    });
    this.ktt = findViewById(R.h.boB);
    this.ktu = findViewById(R.h.cBU);
    this.ktv = findViewById(R.h.bTO);
    this.ktu.setVisibility(4);
    this.kmd = ((ListView)findViewById(16908298));
    this.kmf = ((RelativeLayout)findViewById(R.h.bzd));
    this.kmd.setEmptyView(this.kmf);
    this.ktw = new a(this);
    this.kmd.setAdapter(this.ktw);
    this.kmd.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(4989007167488L, 37171);
        GMTrace.o(4989007167488L, 37171);
      }
    });
    this.ktx = findViewById(R.h.boF);
    this.krQ = ((Button)findViewById(R.h.bow));
    this.krQ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5004979077120L, 37290);
        if (CardAcceptCardListUI.a(CardAcceptCardListUI.this))
        {
          CardAcceptCardListUI.a(CardAcceptCardListUI.this, CardAcceptCardListUI.b(CardAcceptCardListUI.this));
          GMTrace.o(5004979077120L, 37290);
          return;
        }
        paramAnonymousView = CardAcceptCardListUI.this;
        LinkedList localLinkedList = CardAcceptCardListUI.b(CardAcceptCardListUI.this);
        paramAnonymousView.dv(true);
        paramAnonymousView = new p(localLinkedList, paramAnonymousView.fMx, paramAnonymousView.ktD, paramAnonymousView.ktE, paramAnonymousView.ktC);
        ap.wT().a(paramAnonymousView, 0);
        GMTrace.o(5004979077120L, 37290);
      }
    });
    this.krQ.setEnabled(false);
    this.kty = findViewById(R.h.bqO);
    this.ktz = ((TextView)findViewById(R.h.bqP));
    this.ktA = ((Button)findViewById(R.h.bqN));
    this.ktA.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5028198744064L, 37463);
        CardAcceptCardListUI.c(CardAcceptCardListUI.this);
        GMTrace.o(5028198744064L, 37463);
      }
    });
    Object localObject2 = getIntent();
    if (localObject2 == null)
    {
      w.e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () intent == null");
      lE(2);
      GMTrace.o(5015313842176L, 37367);
      return;
    }
    w.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI handle data");
    Object localObject3 = ((Intent)localObject2).getStringExtra("key_in_card_list");
    this.fMx = ((Intent)localObject2).getIntExtra("key_from_scene", 8);
    Object localObject1 = ((Intent)localObject2).getStringExtra("key_package_name");
    localObject2 = ((Intent)localObject2).getStringExtra("key_sign");
    this.ktC = getIntent().getIntExtra("key_stastic_scene", 7);
    this.ktD = getIntent().getStringExtra("src_username");
    this.ktE = getIntent().getStringExtra("js_url");
    this.ktF = getIntent().getStringExtra("key_consumed_card_id");
    this.hbQ = getIntent().getStringExtra("key_template_id");
    localObject3 = com.tencent.mm.plugin.card.b.h.aJ((String)localObject3, this.fMx);
    if ((localObject3 == null) || (((List)localObject3).size() == 0))
    {
      w.e("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI initView () tempList == null || tempList.size() == 0");
      lE(2);
      GMTrace.o(5015313842176L, 37367);
      return;
    }
    this.ktB.clear();
    this.ktB.addAll((Collection)localObject3);
    this.ktG.clear();
    this.ktH.clear();
    this.ktn.clear();
    localObject3 = this.ktB;
    dv(true);
    localObject1 = new ab((LinkedList)localObject3, this.fMx, (String)localObject1, (String)localObject2, this.ktD, this.ktE, this.ktF, this.ktC);
    ap.wT().a((k)localObject1, 0);
    GMTrace.o(5015313842176L, 37367);
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5016253366272L, 37374);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(5016253366272L, 37374);
      return;
      if (paramInt2 != -1)
      {
        GMTrace.o(5016253366272L, 37374);
        return;
      }
      this.krX = paramIntent.getIntExtra("Ktag_range_index", 0);
      w.i("MicroMsg.CardAcceptCardListUI", "mPrivateSelelct : %d", new Object[] { Integer.valueOf(this.krX) });
      if (this.krX >= 2)
      {
        this.krY = paramIntent.getStringExtra("Klabel_name_list");
        this.krZ = paramIntent.getStringExtra("Kother_user_name_list");
        w.d("MicroMsg.CardAcceptCardListUI", "mPrivateSelect : %d, names : %s", new Object[] { Integer.valueOf(this.krX), this.krY });
        if ((TextUtils.isEmpty(this.krY)) && (TextUtils.isEmpty(this.krZ)))
        {
          w.e("MicroMsg.CardAcceptCardListUI", "mLabelNameList by getIntent is empty");
          akt();
          GMTrace.o(5016253366272L, 37374);
          return;
        }
        paramIntent = Arrays.asList(this.krY.split(","));
        this.ksb = l.ac(paramIntent);
        this.ksa = l.ab(paramIntent);
        if ((this.krZ != null) && (this.krZ.length() > 0))
        {
          paramIntent = Arrays.asList(this.krZ.split(","));
          this.ksa.addAll(paramIntent);
        }
        if (this.ksb != null) {
          w.i("MicroMsg.CardAcceptCardListUI", "mPrivateIdsList size is " + this.ksb.size());
        }
        if (this.ksa != null)
        {
          w.i("MicroMsg.CardAcceptCardListUI", "mPrivateNamesList size is " + this.ksa.size());
          paramIntent = this.ksa.iterator();
          while (paramIntent.hasNext()) {
            w.d("MicroMsg.CardAcceptCardListUI", "username : %s", new Object[] { (String)paramIntent.next() });
          }
        }
        if (!TextUtils.isEmpty(this.krY))
        {
          if (this.krX == 2)
          {
            this.ktz.setText(getString(R.l.dGm, new Object[] { akf() }));
            GMTrace.o(5016253366272L, 37374);
            return;
          }
          if (this.krX == 3)
          {
            this.ktz.setText(getString(R.l.dGl, new Object[] { akf() }));
            GMTrace.o(5016253366272L, 37374);
          }
        }
        else
        {
          akt();
        }
        GMTrace.o(5016253366272L, 37374);
        return;
      }
      akt();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5015850713088L, 37371);
    Object localObject1;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof ab))
      {
        dv(false);
        paramString = (ab)paramk;
        paramk = paramString.kpq;
        this.kpC = paramString.kpC;
        this.kpD = paramString.kpD;
        this.kpE = paramString.kpE;
        this.kpF = paramString.kpF;
        w.i("MicroMsg.CardAcceptCardListUI", "accept_button_status: " + this.kpC + "  accept_button_wording: " + this.kpD);
        w.i("MicroMsg.CardAcceptCardListUI", "private_status: " + this.kpE + "  private_wording: " + this.kpF);
        paramString = f.ud(paramk);
        paramk = Z(paramString);
        if ((paramString != null) && (paramString.size() > 0))
        {
          w.i("MicroMsg.CardAcceptCardListUI", "The card info list size is " + paramString.size());
          if ((paramk != null) && (paramk.size() > 0))
          {
            localObject1 = this.ktw;
            localObject2 = this.ktn;
            if (paramk != null)
            {
              ((a)localObject1).ksp.clear();
              ((a)localObject1).ksp.addAll(paramk);
              ((a)localObject1).ktn.putAll((Map)localObject2);
            }
          }
          this.ktw.notifyDataSetChanged();
          if (((CardInfo)paramString.get(0)).aiq()) {
            this.knC = true;
          }
          this.ktu.setVisibility(0);
          if (this.ktw.getCount() <= 0) {
            break label871;
          }
          paramString = this.ktw.lD(0);
          m.a(this, paramString);
          this.ktt.setBackgroundColor(l.uk(paramString.aiK().hbA));
          this.ktx.setVisibility(0);
          paramk = new StateListDrawable();
          paramInt1 = getResources().getDimensionPixelOffset(R.f.aTb);
          if (this.kpC != 1) {
            break label703;
          }
          this.krQ.setEnabled(true);
          localObject1 = l.bM(l.uk(paramString.aiK().hbA), paramInt1);
          Object localObject2 = l.bM(l.aM(paramString.aiK().hbA, 175), paramInt1);
          paramk.addState(new int[] { 16842919 }, (Drawable)localObject2);
          paramk.addState(new int[0], (Drawable)localObject1);
          label450:
          this.krQ.setBackgroundDrawable(paramk);
          if (!TextUtils.isEmpty(this.kpD)) {
            this.krQ.setText(this.kpD);
          }
          if (this.kpE != 1) {
            break label763;
          }
          paramInt1 = getResources().getDimensionPixelOffset(R.f.aSg);
          paramk = l.d(this, getResources().getColor(R.e.white), paramInt1);
          localObject1 = l.bM(getResources().getColor(R.e.white), paramInt1);
          localObject2 = new StateListDrawable();
          ((StateListDrawable)localObject2).addState(new int[] { 16842919 }, (Drawable)localObject1);
          ((StateListDrawable)localObject2).addState(new int[0], paramk);
          this.ktA.setBackgroundDrawable((Drawable)localObject2);
          paramInt1 = l.uk(paramString.aiK().hbA);
          paramInt2 = getResources().getColor(R.e.white);
          paramString = new ColorStateList(new int[][] { { 16842919, 16842910 }, new int[0] }, new int[] { paramInt1, paramInt2 });
          this.ktA.setTextColor(paramString);
          this.kty.setVisibility(0);
          if (TextUtils.isEmpty(this.kpF)) {
            break label743;
          }
          this.ktz.setText(this.kpF);
        }
      }
    }
    for (;;)
    {
      GMTrace.o(5015850713088L, 37371);
      return;
      w.e("MicroMsg.CardAcceptCardListUI", "The card info list size is 0!");
      break;
      label703:
      this.krQ.setEnabled(false);
      localObject1 = l.bM(l.aM(paramString.aiK().hbA, 175), paramInt1);
      paramk.addState(new int[0], (Drawable)localObject1);
      break label450;
      label743:
      this.ktz.setText(R.l.dGk);
      GMTrace.o(5015850713088L, 37371);
      return;
      label763:
      this.kty.setVisibility(8);
      paramString = (RelativeLayout.LayoutParams)this.ktu.getLayoutParams();
      paramString.topMargin = getResources().getDimensionPixelSize(R.f.aSq);
      paramString.bottomMargin = getResources().getDimensionPixelSize(R.f.aRU);
      this.ktu.setLayoutParams(paramString);
      this.ktu.invalidate();
      paramString = (RelativeLayout.LayoutParams)this.ktx.getLayoutParams();
      paramString.addRule(8, R.h.bTO);
      this.ktx.setLayoutParams(paramString);
      this.ktx.invalidate();
      GMTrace.o(5015850713088L, 37371);
      return;
      label871:
      this.ktx.setVisibility(8);
      this.kty.setVisibility(8);
      this.ktt.setBackgroundColor(getResources().getColor(R.e.aPC));
      GMTrace.o(5015850713088L, 37371);
      return;
      if ((paramk instanceof p))
      {
        dv(false);
        localObject1 = (p)paramk;
        if (((p)localObject1).kpr != 0)
        {
          paramk = ((p)localObject1).kps;
          paramString = paramk;
          if (TextUtils.isEmpty(paramk)) {
            paramString = getString(R.l.dEN);
          }
          com.tencent.mm.ui.base.h.a(this, paramString, null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4960150355968L, 36956);
              paramAnonymousDialogInterface.dismiss();
              CardAcceptCardListUI.a(CardAcceptCardListUI.this, 2);
              GMTrace.o(4960150355968L, 36956);
            }
          });
          this.kpB = ((p)localObject1).kpq;
          GMTrace.o(5015850713088L, 37371);
          return;
        }
        com.tencent.mm.ui.base.h.bl(this, getResources().getString(R.l.dFs));
        paramString = new Intent();
        paramString.putExtra("card_list", ((p)localObject1).kpq);
        setResult(-1, paramString);
        w.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for card");
        l.amj();
        finish();
        GMTrace.o(5015850713088L, 37371);
        return;
      }
      if ((paramk instanceof g))
      {
        dv(false);
        paramString = ((g)paramk).kpq;
        paramInt1 = ((g)paramk).kpr;
        paramk = ((g)paramk).kps;
        this.kpB = paramString;
        if (paramInt1 != 0)
        {
          paramString = paramk;
          if (TextUtils.isEmpty(paramk)) {
            paramString = getString(R.l.dGt);
          }
          com.tencent.mm.ui.base.h.a(this, paramString, null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(4964713758720L, 36990);
              paramAnonymousDialogInterface.dismiss();
              CardAcceptCardListUI.a(CardAcceptCardListUI.this, 2);
              GMTrace.o(4964713758720L, 36990);
            }
          });
          GMTrace.o(5015850713088L, 37371);
          return;
        }
        com.tencent.mm.ui.base.h.bl(this, getResources().getString(R.l.dEE));
        paramk = new Intent();
        paramk.putExtra("card_list", this.kpB);
        setResult(-1, paramk);
        w.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI setResult RESULT_OK for sharecard");
        l.aml();
        paramk = new ShareCardInfo();
        f.a(paramk, paramString);
        l.a(paramk);
        al.ajJ().ahA();
        finish();
        GMTrace.o(5015850713088L, 37371);
        return;
        w.e("MicroMsg.CardAcceptCardListUI", "CardAddEntranceUI onSceneEnd() netsene type" + paramk.getType() + "errType = " + paramInt1 + " errCode = " + paramInt2);
        dv(false);
        d.b(this, paramString, paramInt2);
        if ((paramk instanceof p))
        {
          this.kpB = paramString;
          GMTrace.o(5015850713088L, 37371);
          return;
        }
        if ((paramk instanceof g)) {
          this.kpB = "";
        }
      }
    }
  }
  
  void dv(boolean paramBoolean)
  {
    GMTrace.i(5015716495360L, 37370);
    if (paramBoolean)
    {
      this.iXW = q.b(this, getString(R.l.bUo), false, 0, null);
      GMTrace.o(5015716495360L, 37370);
      return;
    }
    if ((this.iXW != null) && (this.iXW.isShowing()))
    {
      this.iXW.dismiss();
      this.iXW = null;
    }
    GMTrace.o(5015716495360L, 37370);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5015179624448L, 37366);
    int i = R.i.boB;
    GMTrace.o(5015179624448L, 37366);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5015448059904L, 37368);
    super.onCreate(paramBundle);
    ap.wT().a(690, this);
    ap.wT().a(687, this);
    ap.wT().a(902, this);
    MH();
    GMTrace.o(5015448059904L, 37368);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(5015582277632L, 37369);
    ap.wT().b(690, this);
    ap.wT().b(687, this);
    ap.wT().b(902, this);
    this.ktB.clear();
    a locala = this.ktw;
    locala.ksp.clear();
    locala.mContext = null;
    super.onDestroy();
    GMTrace.o(5015582277632L, 37369);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5015984930816L, 37372);
    if (paramInt == 4)
    {
      w.i("MicroMsg.CardAcceptCardListUI", "CardAcceptCardListUI onKeyDown() back cancel");
      lE(1);
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(5015984930816L, 37372);
    return bool;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardAcceptCardListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */