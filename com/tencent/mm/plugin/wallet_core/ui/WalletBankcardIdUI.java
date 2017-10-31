package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.n;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.g.a.sa;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wallet.a.q;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ac;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.m;
import com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView.a;
import com.tencent.mm.x.ap;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class WalletBankcardIdUI
  extends WalletBaseUI
  implements WalletFormView.a
{
  private int hJp;
  com.tencent.mm.sdk.b.c rFr;
  private Button rFt;
  com.tencent.mm.sdk.b.c rJr;
  protected WalletFormView rSt;
  protected WalletFormView rSu;
  private Bankcard rSv;
  private a rSw;
  private boolean rSx;
  private boolean rSy;
  
  public WalletBankcardIdUI()
  {
    GMTrace.i(7015292207104L, 52268);
    this.rSx = false;
    this.hJp = -1;
    this.rFr = new com.tencent.mm.sdk.b.c() {};
    this.rJr = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7015292207104L, 52268);
  }
  
  private boolean QN()
  {
    GMTrace.i(7016365948928L, 52276);
    if (this.rSt.dI(null))
    {
      this.rFt.setEnabled(true);
      this.rFt.setClickable(true);
      GMTrace.o(7016365948928L, 52276);
      return true;
    }
    this.rFt.setEnabled(false);
    this.rFt.setClickable(false);
    GMTrace.o(7016365948928L, 52276);
    return false;
  }
  
  protected final void MH()
  {
    GMTrace.i(7015829078016L, 52272);
    this.rFt = ((Button)findViewById(R.h.cgl));
    this.rSt = ((WalletFormView)findViewById(R.h.bqD));
    com.tencent.mm.wallet_core.ui.formview.a.a(this.rSt);
    this.rSu = ((WalletFormView)findViewById(R.h.ceC));
    Object localObject1;
    label126:
    label140:
    Object localObject2;
    if (this.un.getBoolean("key_bind_show_change_card", false))
    {
      com.tencent.mm.wallet_core.ui.formview.a.d(this, this.rSu);
      this.rSt.xid = this;
      this.rFt.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6919058096128L, 51551);
          g.paX.i(11353, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
          WalletBankcardIdUI.this.bvY();
          GMTrace.o(6919058096128L, 51551);
        }
      });
      localObject1 = cjm();
      if (localObject1 == null) {
        break label632;
      }
      this.rSy = ((com.tencent.mm.wallet_core.b)localObject1).lRQ.getBoolean("key_is_realname_verify_process", false);
      if (!this.rSy) {
        break label640;
      }
      oC(R.l.eYi);
      localObject1 = (TextView)findViewById(R.h.bQj);
      if ((!m.bwE().bwV()) && (!m.bwE().bwZ())) {
        break label650;
      }
      localObject2 = new f(this);
      ((f)localObject2).rTY = new f.a()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6952880963584L, 51803);
          w.i("Micromsg.WalletInputCardIDUI", "hy: clickable span on click");
          WalletBankcardIdUI.a(WalletBankcardIdUI.this);
          GMTrace.o(6952880963584L, 51803);
        }
      };
      Object localObject3 = getString(R.l.eVc);
      SpannableString localSpannableString = new SpannableString((CharSequence)localObject3);
      localSpannableString.setSpan(localObject2, ((String)localObject3).length() - 6, ((String)localObject3).length(), 33);
      ((TextView)localObject1).setText(localSpannableString);
      ((TextView)localObject1).setMovementMethod(LinkMovementMethod.getInstance());
      label240:
      localObject1 = (FavorPayInfo)this.un.getParcelable("key_favor_pay_info");
      localObject2 = (Orders)this.un.getParcelable("key_orders");
      if ((localObject1 != null) && (localObject2 != null))
      {
        localObject3 = b.rSp.a((Orders)localObject2);
        localObject2 = (TextView)findViewById(R.h.cIv);
        if (localObject3 == null) {
          break label690;
        }
        localObject1 = ((a)localObject3).JB(((a)localObject3).JE(((FavorPayInfo)localObject1).rOr));
        if (((List)localObject1).size() <= 0) {
          break label681;
        }
        this.rSw = new a(this.vov.voR, (List)localObject1);
        ((TextView)localObject2).setText(R.l.eVa);
        ((TextView)localObject2).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6929258643456L, 51627);
            WalletBankcardIdUI.this.showDialog(1);
            GMTrace.o(6929258643456L, 51627);
          }
        });
        ((TextView)localObject2).setVisibility(0);
      }
      label364:
      localObject1 = m.bwE();
      if ((!((ae)localObject1).bwY()) || (((ae)localObject1).aoj() == null) || (bg.mZ(((ae)localObject1).aoj().trim())) || (!((ae)localObject1).bxd())) {
        break label708;
      }
      this.rSu.setVisibility(0);
      this.rSu.setText(((ae)localObject1).aoj());
      this.rSt.setHint(getString(R.l.eTy));
      this.rSu.setClickable(false);
      this.rSu.setEnabled(false);
    }
    for (;;)
    {
      ap.AS();
      localObject1 = (String)com.tencent.mm.x.c.xi().get(w.a.uUV, null);
      if (!bg.mZ((String)localObject1)) {
        this.rSt.setHint((CharSequence)localObject1);
      }
      this.rSv = ((Bankcard)this.un.getParcelable("key_history_bankcard"));
      if (this.rSv != null)
      {
        this.rSt.setText(this.rSv.rMW);
        this.rSt.a(new TextWatcher()
        {
          public final void afterTextChanged(Editable paramAnonymousEditable)
          {
            GMTrace.i(6923084627968L, 51581);
            GMTrace.o(6923084627968L, 51581);
          }
          
          public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(6922950410240L, 51580);
            if ((WalletBankcardIdUI.this.rSt.QR()) && (!WalletBankcardIdUI.b(WalletBankcardIdUI.this)))
            {
              WalletBankcardIdUI.c(WalletBankcardIdUI.this);
              WalletBankcardIdUI.this.rSt.aYY();
            }
            GMTrace.o(6922950410240L, 51580);
          }
          
          public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(6922816192512L, 51579);
            GMTrace.o(6922816192512L, 51579);
          }
        });
      }
      QN();
      com.tencent.mm.plugin.wallet_core.d.c.b(this, this.un, 2);
      e(this.rSt, 0, false);
      this.rSt.j(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6953283616768L, 51806);
          g.paX.i(11353, new Object[] { Integer.valueOf(2), Integer.valueOf(0) });
          com.tencent.mm.wallet_core.ui.e.e(WalletBankcardIdUI.this, m.bwE().aoj());
          GMTrace.o(6953283616768L, 51806);
        }
      });
      if (m.bwE().bxc().bwS())
      {
        this.rSt.oSV.setVisibility(0);
        this.rSt.oSV.setImageResource(R.k.drJ);
      }
      GMTrace.o(7015829078016L, 52272);
      return;
      com.tencent.mm.wallet_core.ui.formview.a.e(this, this.rSu);
      break;
      label632:
      this.rSy = false;
      break label126;
      label640:
      oC(R.l.eVe);
      break label140;
      label650:
      ((TextView)localObject1).setVisibility(0);
      localObject2 = this.un.getString("key_custom_bind_tips");
      if (bg.mZ((String)localObject2)) {
        break label240;
      }
      ((TextView)localObject1).setText((CharSequence)localObject2);
      break label240;
      label681:
      ((TextView)localObject2).setVisibility(8);
      break label364;
      label690:
      w.w("Micromsg.WalletInputCardIDUI", "favorlogichelper null");
      ((TextView)localObject2).setVisibility(8);
      break label364;
      label708:
      this.rSu.setVisibility(8);
      this.rSt.setHint(getString(R.l.eVd));
    }
  }
  
  protected final int Qb()
  {
    GMTrace.i(7016768602112L, 52279);
    GMTrace.o(7016768602112L, 52279);
    return 1;
  }
  
  protected final void bvY()
  {
    GMTrace.i(7015963295744L, 52273);
    if (cjm() == null)
    {
      w.e("Micromsg.WalletInputCardIDUI", "WalletBankcardIdUI doNext, process is null");
      GMTrace.o(7015963295744L, 52273);
      return;
    }
    Object localObject = cjm().lRQ.getString("kreq_token");
    int i = this.un.getInt("entry_scene", -1);
    if (this.rSv != null)
    {
      localObject = new com.tencent.mm.plugin.wallet_core.b.k(bvp(), null, (PayInfo)this.un.getParcelable("key_pay_info"), (String)localObject, this.hJp, i);
      ((com.tencent.mm.plugin.wallet_core.b.k)localObject).rKM = this.rSv.field_bankcardType;
      this.un.putParcelable("key_history_bankcard", this.rSv);
      l((com.tencent.mm.ac.k)localObject);
      GMTrace.o(7015963295744L, 52273);
      return;
    }
    if (QN())
    {
      String str = this.rSt.getText();
      l(new com.tencent.mm.plugin.wallet_core.b.k(bvp(), str, (PayInfo)this.un.getParcelable("key_pay_info"), (String)localObject, this.hJp, i));
      GMTrace.o(7015963295744L, 52273);
      return;
    }
    h.h(this, R.l.eVH, R.l.dxm);
    GMTrace.o(7015963295744L, 52273);
  }
  
  protected final boolean bvz()
  {
    GMTrace.i(7016634384384L, 52278);
    GMTrace.o(7016634384384L, 52278);
    return true;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(7016231731200L, 52275);
    w.d("Micromsg.WalletInputCardIDUI", " errCode: " + paramInt2 + " errMsg :" + paramString);
    paramString = new Bundle();
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paramk instanceof com.tencent.mm.plugin.wallet_core.b.k))
      {
        paramk = (com.tencent.mm.plugin.wallet_core.b.k)paramk;
        paramString.putBoolean("key_need_area", paramk.bwg());
        paramString.putBoolean("key_need_profession", paramk.bwh());
        paramString.putParcelableArray("key_profession_list", paramk.rKQ);
        if (paramk.rKL != null)
        {
          if ((paramk.rKL.rNV) && (paramk.rKL.isError()))
          {
            h.h(this, R.l.eSD, R.l.dxm);
            GMTrace.o(7016231731200L, 52275);
            return true;
          }
          paramString.putString("bank_name", paramk.rKL.mVv);
          paramString.putParcelable("elemt_query", paramk.rKL);
          paramString.putString("key_card_id", this.rSt.getText());
          com.tencent.mm.wallet_core.a.i(this, paramString);
          GMTrace.o(7016231731200L, 52275);
          return true;
        }
        paramString.putString("bank_name", "");
        paramString.putParcelable("elemt_query", new ElementQuery());
        paramString.putString("key_card_id", this.rSt.getText());
        com.tencent.mm.wallet_core.a.i(this, paramString);
      }
    }
    while ((paramInt2 != 1) || (!(paramk instanceof com.tencent.mm.plugin.wallet_core.b.k)))
    {
      GMTrace.o(7016231731200L, 52275);
      return false;
    }
    paramString.putString("bank_name", "");
    paramString.putParcelable("elemt_query", new ElementQuery());
    paramString.putString("key_card_id", this.rSt.getText());
    com.tencent.mm.wallet_core.a.i(this, paramString);
    GMTrace.o(7016231731200L, 52275);
    return true;
  }
  
  public final void gQ(boolean paramBoolean)
  {
    GMTrace.i(7016500166656L, 52277);
    if (!paramBoolean)
    {
      this.rSv = null;
      this.un.putParcelable("key_history_bankcard", null);
    }
    QN();
    GMTrace.o(7016500166656L, 52277);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7015426424832L, 52269);
    int i = R.i.dia;
    GMTrace.o(7015426424832L, 52269);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7015560642560L, 52270);
    super.onCreate(paramBundle);
    oC(R.l.eVe);
    MH();
    com.tencent.mm.sdk.b.a.uLm.b(this.rFr);
    com.tencent.mm.sdk.b.a.uLm.b(this.rJr);
    this.hJp = this.un.getInt("key_bind_scene");
    GMTrace.o(7015560642560L, 52270);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    GMTrace.i(7016097513472L, 52274);
    Object localObject1;
    Object localObject2;
    if (paramInt == 1)
    {
      localObject1 = getLayoutInflater().inflate(R.i.diC, null);
      ((ListView)((View)localObject1).findViewById(R.h.bgK)).setAdapter(this.rSw);
      localObject2 = new i.a(this);
      ((i.a)localObject2).Bg(R.l.eUZ);
      ((i.a)localObject2).df((View)localObject1);
      ((i.a)localObject2).d(null);
      ((i.a)localObject2).Bj(R.l.egp);
      localObject1 = ((i.a)localObject2).ZT();
      GMTrace.o(7016097513472L, 52274);
      return (Dialog)localObject1;
    }
    if ((this.rSy) && (paramInt == 1000))
    {
      localObject1 = getString(R.l.eVb);
      localObject2 = com.tencent.mm.wallet_core.a.aa(this);
      if (localObject2 == null) {
        break label213;
      }
    }
    label213:
    for (paramInt = ((com.tencent.mm.wallet_core.b)localObject2).b(this, 1);; paramInt = -1)
    {
      if (paramInt != -1) {
        localObject1 = getString(paramInt);
      }
      localObject1 = h.a(this, true, (String)localObject1, "", getString(R.l.dxC), getString(R.l.dwo), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6924426805248L, 51591);
          ((com.tencent.mm.plugin.wallet_core.id_verify.a)WalletBankcardIdUI.this.cjm()).c(WalletBankcardIdUI.this, 0);
          WalletBankcardIdUI.this.finish();
          GMTrace.o(6924426805248L, 51591);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6932479868928L, 51651);
          if (WalletBankcardIdUI.d(WalletBankcardIdUI.this) == null) {}
          for (paramAnonymousDialogInterface = null;; paramAnonymousDialogInterface = WalletBankcardIdUI.e(WalletBankcardIdUI.this).findFocus())
          {
            if ((paramAnonymousDialogInterface != null) && ((paramAnonymousDialogInterface instanceof EditText))) {
              WalletBankcardIdUI.this.aKp();
            }
            GMTrace.o(6932479868928L, 51651);
            return;
          }
        }
      });
      GMTrace.o(7016097513472L, 52274);
      return (Dialog)localObject1;
      localObject1 = super.onCreateDialog(paramInt);
      GMTrace.o(7016097513472L, 52274);
      return (Dialog)localObject1;
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(7015694860288L, 52271);
    com.tencent.mm.sdk.b.a.uLm.c(this.rFr);
    com.tencent.mm.sdk.b.a.uLm.c(this.rJr);
    super.onDestroy();
    GMTrace.o(7015694860288L, 52271);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private LayoutInflater CO;
    private Context mContext;
    List<q> rSA;
    
    public a(Context paramContext, List<q> paramList)
    {
      GMTrace.i(6991267233792L, 52089);
      this.CO = null;
      this.rSA = new LinkedList();
      this.mContext = null;
      this.CO = LayoutInflater.from(paramContext);
      this.rSA = paramList;
      this.mContext = paramContext;
      GMTrace.o(6991267233792L, 52089);
    }
    
    public final int getCount()
    {
      GMTrace.i(6991401451520L, 52090);
      if (this.rSA == null)
      {
        GMTrace.o(6991401451520L, 52090);
        return 0;
      }
      int i = this.rSA.size();
      GMTrace.o(6991401451520L, 52090);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(6991535669248L, 52091);
      Object localObject = this.rSA.get(paramInt);
      GMTrace.o(6991535669248L, 52091);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6991669886976L, 52092);
      GMTrace.o(6991669886976L, 52092);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6991804104704L, 52093);
      Object localObject;
      if (paramView == null)
      {
        paramView = this.CO.inflate(R.i.dig, paramViewGroup, false);
        paramViewGroup = new a();
        paramViewGroup.rSB = ((ImageView)paramView.findViewById(R.h.cIi));
        paramViewGroup.rCT = ((TextView)paramView.findViewById(R.h.cIh));
        paramViewGroup.rSC = ((TextView)paramView.findViewById(R.h.cIk));
        paramViewGroup.rSD = ((TextView)paramView.findViewById(R.h.cIj));
        paramView.setTag(paramViewGroup);
        localObject = (q)getItem(paramInt);
        if (bg.mZ(((q)localObject).org)) {
          break label347;
        }
        paramViewGroup.rCT.setText(((q)localObject).org);
        paramViewGroup.rCT.setVisibility(0);
        label136:
        if (bg.mZ(((q)localObject).rGD)) {
          break label359;
        }
        paramViewGroup.rSC.setText(((q)localObject).rGD);
        paramViewGroup.rSC.setVisibility(0);
        label167:
        if (bg.mZ(((q)localObject).rFM)) {
          break label371;
        }
        paramViewGroup.rSD.setText(((q)localObject).rFM);
        paramViewGroup.rSD.setVisibility(0);
      }
      for (;;)
      {
        String str = ((q)localObject).rGJ;
        w.v("Micromsg.WalletInputCardIDUI", "bankType:" + ((q)localObject).rGI + ", logurl:" + str);
        paramViewGroup.rSB.setImageBitmap(null);
        if (!bg.mZ(str))
        {
          localObject = new c.a();
          n.Jb();
          ((c.a)localObject).hDk = null;
          ((c.a)localObject).hCS = com.tencent.mm.compatible.util.e.gZT;
          ((c.a)localObject).hCR = com.tencent.mm.plugin.wallet_core.c.b.DS(str);
          ((c.a)localObject).hCP = true;
          ((c.a)localObject).hDl = true;
          localObject = ((c.a)localObject).Jk();
          n.Ja().a(str, paramViewGroup.rSB, (com.tencent.mm.an.a.a.c)localObject);
        }
        GMTrace.o(6991804104704L, 52093);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label347:
        paramViewGroup.rCT.setVisibility(8);
        break label136;
        label359:
        paramViewGroup.rSC.setVisibility(8);
        break label167;
        label371:
        paramViewGroup.rSD.setVisibility(8);
      }
    }
    
    final class a
    {
      TextView rCT;
      ImageView rSB;
      TextView rSC;
      TextView rSD;
      
      a()
      {
        GMTrace.i(6960934027264L, 51863);
        GMTrace.o(6960934027264L, 51863);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletBankcardIdUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */