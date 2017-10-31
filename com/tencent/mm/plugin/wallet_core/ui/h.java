package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.plugin.wallet.a.e;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet.a.g;
import com.tencent.mm.plugin.wallet.a.q;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.l;
import com.tencent.mm.plugin.wallet_core.model.l.a;
import com.tencent.mm.plugin.wallet_core.model.l.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MaxListView;
import com.tencent.mm.ui.base.j;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public final class h
  extends j
{
  private LayoutInflater CO;
  private View krg;
  private a rHS;
  private MaxListView rUe;
  private TextView rUf;
  private a rUg;
  private b rUh;
  
  private h(Context paramContext)
  {
    super(paramContext, R.m.fdx);
    GMTrace.i(7018110779392L, 52289);
    this.CO = LayoutInflater.from(paramContext);
    this.krg = LayoutInflater.from(paramContext).inflate(R.i.dit, null);
    this.rUe = ((MaxListView)this.krg.findViewById(R.h.cIZ));
    this.rUf = ((TextView)this.krg.findViewById(R.h.cIX));
    this.rUg = new a();
    this.rUe.setAdapter(this.rUg);
    this.krg.findViewById(R.h.cIY).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6916910612480L, 51535);
        h.a(h.this);
        h.this.dismiss();
        GMTrace.o(6916910612480L, 51535);
      }
    });
    GMTrace.o(7018110779392L, 52289);
  }
  
  public static h a(Context paramContext, Orders paramOrders, String paramString, b paramb)
  {
    GMTrace.i(7018513432576L, 52292);
    h localh = new h(paramContext);
    localh.setOnCancelListener(null);
    localh.setCancelable(true);
    localh.rHS = b.rSp.a(paramOrders);
    if (localh.rHS == null)
    {
      w.w("MicroMsg.WalletFavorDialog", "mFavorLogicHelper null & dismiss");
      localh.dismiss();
    }
    Object localObject3;
    Object localObject1;
    int i;
    for (;;)
    {
      localh.rUh = paramb;
      localh.show();
      com.tencent.mm.ui.base.h.a(paramContext, localh);
      GMTrace.o(7018513432576L, 52292);
      return localh;
      paramOrders = localh.rUg;
      localObject3 = paramOrders.rUi.rHS.rSj;
      localObject1 = paramOrders.rUi.rHS.JG(paramString);
      paramOrders.rUk = paramOrders.rUi.rHS.bxy();
      paramOrders.rUl = paramOrders.rUi.rHS.JC((String)localObject1);
      paramOrders.rUj = -1;
      i = 0;
      for (;;)
      {
        if (i < paramOrders.rUk.size()) {
          if (((q)paramOrders.rUk.get(i)).rGH == 0) {
            break label272;
          }
        }
        label272:
        for (j = 1; j != 0; j = 0)
        {
          paramOrders.rUj = i;
          paramString = new LinkedList();
          if (paramOrders.rUk == null) {
            break label287;
          }
          i = 0;
          while (i < paramOrders.rUk.size())
          {
            paramString.add(((q)paramOrders.rUk.get(i)).rFL);
            i += 1;
          }
        }
        i += 1;
      }
      label287:
      w.w("MicroMsg.WalletFavorDialog", "func[setCouponInfo] mFavorList null");
      i = 0;
      label297:
      if (i != 0) {
        break label671;
      }
      w.w("MicroMsg.WalletFavorDialog", "initFavorInfo failed & dismiss");
      localh.dismiss();
    }
    LinkedList localLinkedList = new LinkedList();
    if ((localObject3 != null) && (((f)localObject3).rFS != null))
    {
      i = 0;
      while (i < ((f)localObject3).rFS.size())
      {
        localObject2 = ((q)((f)localObject3).rFS.get(i)).rFL;
        if (!paramString.contains(localObject2)) {
          localLinkedList.add(localObject2);
        }
        i += 1;
      }
    }
    Object localObject2 = new LinkedList();
    label449:
    String str;
    if ((localObject3 != null) && (((f)localObject3).rFT != null) && (((f)localObject3).rFT.rGd != null))
    {
      localObject3 = ((f)localObject3).rFT.rGd;
      i = 0;
      if (i >= ((List)localObject3).size()) {
        break label563;
      }
      str = ((com.tencent.mm.plugin.wallet.a.h)((List)localObject3).get(i)).rGf;
      j = 0;
      label481:
      if (j >= localLinkedList.size()) {
        break label702;
      }
      if (!str.contains((CharSequence)localLinkedList.get(j))) {}
    }
    label563:
    label671:
    label702:
    for (int j = 1;; j = 0)
    {
      if (j == 0) {
        ((List)localObject2).add(str);
      }
      i += 1;
      break label449;
      j += 1;
      break label481;
      w.w("MicroMsg.WalletFavorDialog", "func[setCouponInfo] favorInfo.favorComposeList or favorInfo.favorComposeList.favorComposeInfo null");
      i = 0;
      break label297;
      localLinkedList = new LinkedList();
      if ((!bg.mZ((String)localObject1)) && (!((String)localObject1).equals("0")))
      {
        localObject1 = ((String)localObject1).split("-");
        if (localObject1 != null)
        {
          i = 0;
          while (i < localObject1.length)
          {
            localLinkedList.add(localObject1[i]);
            i += 1;
          }
        }
        w.w("MicroMsg.WalletFavorDialog", "func[setCouponInfo] preKeyArr null");
        i = 0;
        break label297;
      }
      paramOrders.rUm.c(paramString, localLinkedList, (List)localObject2);
      i = 1;
      break label297;
      localh.rUf.setText(R.l.eUB);
      localh.rUe.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(6981871992832L, 52019);
          paramAnonymousAdapterView = h.b(h.this);
          paramAnonymousView = paramAnonymousAdapterView.rUm;
          if (paramAnonymousInt < paramAnonymousView.rOG.size())
          {
            int i = ((l.b)paramAnonymousView.rOG.get(paramAnonymousInt)).rOO;
            int j = l.a.rOK;
            switch (com.tencent.mm.plugin.wallet_core.model.l.1.rOI[(i - 1)])
            {
            }
          }
          for (;;)
          {
            paramAnonymousView.bwx();
            paramAnonymousAdapterView.notifyDataSetChanged();
            GMTrace.o(6981871992832L, 52019);
            return;
            paramAnonymousView.dw(paramAnonymousInt, l.a.rOK);
            continue;
            paramAnonymousView.dw(paramAnonymousInt, l.a.rOL);
          }
        }
      });
      break;
    }
  }
  
  private void bxD()
  {
    GMTrace.i(7018781868032L, 52294);
    w.d("MicroMsg.WalletFavorDialog", "On selection done");
    if (this.rUg != null)
    {
      Object localObject = this.rUg.rUm;
      localObject = ((l)localObject).a(((l)localObject).rOG, -1);
      localObject = this.rHS.JF((String)localObject);
      this.rUh.a((FavorPayInfo)localObject);
    }
    GMTrace.o(7018781868032L, 52294);
  }
  
  public final void dismiss()
  {
    GMTrace.i(7018379214848L, 52291);
    try
    {
      super.dismiss();
      GMTrace.o(7018379214848L, 52291);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.WalletFavorDialog", "dismiss exception, e = " + localException.getMessage());
      GMTrace.o(7018379214848L, 52291);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7018244997120L, 52290);
    super.onCreate(paramBundle);
    setContentView(this.krg);
    GMTrace.o(7018244997120L, 52290);
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(7018916085760L, 52295);
    if (paramInt == 4) {
      bxD();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(7018916085760L, 52295);
    return bool;
  }
  
  public final void setCancelable(boolean paramBoolean)
  {
    GMTrace.i(7018647650304L, 52293);
    super.setCancelable(paramBoolean);
    setCanceledOnTouchOutside(paramBoolean);
    GMTrace.o(7018647650304L, 52293);
  }
  
  final class a
    extends BaseAdapter
  {
    int rUj;
    List<q> rUk;
    com.tencent.mm.plugin.wallet.a.h rUl;
    l<String> rUm;
    
    public a()
    {
      GMTrace.i(6977577025536L, 51987);
      this.rUj = -1;
      this.rUk = new LinkedList();
      this.rUl = null;
      this.rUm = new l()
      {
        public final String a(Vector<l<String>.b> paramAnonymousVector, int paramAnonymousInt)
        {
          GMTrace.i(7014621118464L, 52263);
          if (paramAnonymousVector == null)
          {
            w.w("MicroMsg.WalletFavorDialog", "func[getComposedKey] keyList null");
            GMTrace.o(7014621118464L, 52263);
            return "";
          }
          StringBuilder localStringBuilder = new StringBuilder();
          int i = 0;
          while (i < paramAnonymousVector.size())
          {
            int j = ((l.b)paramAnonymousVector.get(i)).rOO;
            if ((i == paramAnonymousInt) || (j == l.a.rOK)) {
              localStringBuilder.append((String)((l.b)paramAnonymousVector.get(i)).rON + "-");
            }
            i += 1;
          }
          if (localStringBuilder.length() == 0)
          {
            GMTrace.o(7014621118464L, 52263);
            return "0";
          }
          if (localStringBuilder.length() > 1) {
            localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
          }
          paramAnonymousVector = localStringBuilder.toString();
          GMTrace.o(7014621118464L, 52263);
          return paramAnonymousVector;
        }
      };
      GMTrace.o(6977577025536L, 51987);
    }
    
    public final int getCount()
    {
      GMTrace.i(6977711243264L, 51988);
      int i = this.rUk.size();
      GMTrace.o(6977711243264L, 51988);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(6977845460992L, 51989);
      Object localObject = this.rUk.get(paramInt);
      GMTrace.o(6977845460992L, 51989);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6977979678720L, 51990);
      GMTrace.o(6977979678720L, 51990);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6978113896448L, 51991);
      Object localObject3;
      label164:
      label195:
      Object localObject2;
      int i;
      if (paramView == null)
      {
        paramView = h.c(h.this).inflate(R.i.diq, paramViewGroup, false);
        paramViewGroup = new h.c();
        paramViewGroup.rUo = paramView.findViewById(R.h.cIM);
        paramViewGroup.jpp = ((TextView)paramView.findViewById(R.h.cIL));
        paramViewGroup.rUq = ((TextView)paramView.findViewById(R.h.cIK));
        paramViewGroup.kLX = ((TextView)paramView.findViewById(R.h.cIJ));
        paramViewGroup.rUr = ((CheckBox)paramView.findViewById(R.h.cII));
        paramViewGroup.rUp = ((ImageView)paramView.findViewById(R.h.cIH));
        paramView.setTag(paramViewGroup);
        localObject3 = (q)getItem(paramInt);
        if ((paramInt != this.rUj) || (this.rUj <= 0)) {
          break label425;
        }
        paramViewGroup.rUo.setVisibility(0);
        paramViewGroup.rUp.setVisibility(8);
        if (bg.mZ(((q)localObject3).rGD)) {
          break label445;
        }
        paramViewGroup.jpp.setText(((q)localObject3).rGD);
        paramViewGroup.jpp.setVisibility(0);
        localObject1 = ((q)localObject3).rFL;
        if ((this.rUl == null) || (this.rUl.rGh == null)) {
          break label466;
        }
        localObject2 = this.rUl.rGh;
        i = 0;
        label231:
        if (i >= ((List)localObject2).size()) {
          break label466;
        }
        if (!((String)localObject1).equals(((e)((List)localObject2).get(i)).rFL)) {
          break label457;
        }
        localObject1 = (e)((List)localObject2).get(i);
        label280:
        localObject2 = ((q)localObject3).rFM;
        localObject3 = ((q)localObject3).rFN;
        if (localObject1 == null) {
          break label533;
        }
        localObject2 = ((e)localObject1).rFM;
      }
      label338:
      label363:
      label425:
      label445:
      label457:
      label466:
      label484:
      label496:
      label533:
      for (Object localObject1 = ((e)localObject1).rFN;; localObject1 = localObject3)
      {
        if (!bg.mZ((String)localObject2))
        {
          paramViewGroup.rUq.setText((CharSequence)localObject2);
          paramViewGroup.rUq.setVisibility(0);
          if (bg.mZ((String)localObject1)) {
            break label484;
          }
          paramViewGroup.kLX.setText((CharSequence)localObject1);
          paramViewGroup.kLX.setVisibility(0);
          paramInt = ((l.b)this.rUm.rOG.get(paramInt)).rOO;
          if (paramInt != l.a.rOJ) {
            break label496;
          }
          paramViewGroup.rUr.setChecked(false);
          paramViewGroup.rUr.setEnabled(false);
        }
        for (;;)
        {
          GMTrace.o(6978113896448L, 51991);
          return paramView;
          paramViewGroup = (h.c)paramView.getTag();
          break;
          paramViewGroup.rUo.setVisibility(8);
          paramViewGroup.rUp.setVisibility(0);
          break label164;
          paramViewGroup.jpp.setVisibility(8);
          break label195;
          i += 1;
          break label231;
          localObject1 = null;
          break label280;
          paramViewGroup.rUq.setVisibility(8);
          break label338;
          paramViewGroup.kLX.setVisibility(8);
          break label363;
          paramViewGroup.rUr.setEnabled(true);
          if (paramInt == l.a.rOK) {
            paramViewGroup.rUr.setChecked(true);
          } else {
            paramViewGroup.rUr.setChecked(false);
          }
        }
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(FavorPayInfo paramFavorPayInfo);
  }
  
  static final class c
  {
    TextView jpp;
    TextView kLX;
    View rUo;
    ImageView rUp;
    TextView rUq;
    CheckBox rUr;
    
    c()
    {
      GMTrace.i(7017708126208L, 52286);
      GMTrace.o(7017708126208L, 52286);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */