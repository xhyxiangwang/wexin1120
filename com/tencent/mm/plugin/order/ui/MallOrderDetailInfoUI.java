package com.tencent.mm.plugin.order.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.a;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.b;
import com.tencent.mm.plugin.order.model.MallTransactionObject;
import com.tencent.mm.plugin.order.model.ProductSectionItem;
import com.tencent.mm.plugin.order.model.ProductSectionItem.Skus;
import com.tencent.mm.plugin.order.model.f;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class MallOrderDetailInfoUI
  extends WalletBaseUI
  implements j.a
{
  private ListView EA;
  private View.OnClickListener iom;
  private String kJW;
  private HashMap<String, View> ooO;
  private List<MallOrderDetailObject.a> oqH;
  protected MallOrderDetailObject orP;
  String osA;
  private a osB;
  private View osC;
  private View osD;
  private View osE;
  private View osF;
  private View osG;
  private View osH;
  private View osI;
  private boolean osJ;
  private boolean osK;
  private int osL;
  private CheckedTextView osM;
  private CheckedTextView osN;
  View.OnClickListener osO;
  
  public MallOrderDetailInfoUI()
  {
    GMTrace.i(6635187601408L, 49436);
    this.oqH = new ArrayList();
    this.orP = null;
    this.ooO = new HashMap();
    this.osJ = false;
    this.kJW = "";
    this.osK = false;
    this.osL = 0;
    this.iom = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6659883663360L, 49620);
        if (paramAnonymousView.getId() == R.h.chT)
        {
          if (MallOrderDetailInfoUI.this.orP.oqF != null)
          {
            com.tencent.mm.plugin.order.c.c.aq(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.orP.oqF.mDg);
            MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.orP.oqF.oqN);
            GMTrace.o(6659883663360L, 49620);
          }
        }
        else if ((paramAnonymousView.getId() == R.h.cih) || (paramAnonymousView.getId() == R.h.cig))
        {
          if ((MallOrderDetailInfoUI.this.orP.oqG == null) || (MallOrderDetailInfoUI.this.orP.oqG.size() <= 0)) {
            break label631;
          }
          if (TextUtils.isEmpty(((ProductSectionItem)MallOrderDetailInfoUI.this.orP.oqG.get(0)).jumpUrl)) {
            break label640;
          }
        }
        label631:
        label640:
        for (boolean bool = com.tencent.mm.plugin.order.c.c.aq(MallOrderDetailInfoUI.this, ((ProductSectionItem)MallOrderDetailInfoUI.this.orP.oqG.get(0)).jumpUrl);; bool = false)
        {
          if (!bool) {
            com.tencent.mm.plugin.order.c.c.ar(MallOrderDetailInfoUI.this, ((ProductSectionItem)MallOrderDetailInfoUI.this.orP.oqG.get(0)).osx);
          }
          MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, ((ProductSectionItem)MallOrderDetailInfoUI.this.orP.oqG.get(0)).name);
          GMTrace.o(6659883663360L, 49620);
          return;
          if (paramAnonymousView.getId() == R.h.cif)
          {
            paramAnonymousView = MallOrderDetailInfoUI.this.un;
            paramAnonymousView.putParcelableArrayList("order_product_list", MallOrderDetailInfoUI.this.orP.oqG);
            paramAnonymousView.putInt("key_enter_id", 0);
            paramAnonymousView.putString("key_trans_id", MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this));
            paramAnonymousView.putString("appname", MallOrderDetailInfoUI.this.orP.fBG);
            com.tencent.mm.wallet_core.a.i(MallOrderDetailInfoUI.this, new Bundle());
            MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.getResources().getString(R.l.enM));
            GMTrace.o(6659883663360L, 49620);
            return;
          }
          if (paramAnonymousView.getId() == R.h.cio)
          {
            paramAnonymousView = MallOrderDetailInfoUI.this.un.getString("key_trans_id");
            Bundle localBundle = MallOrderDetailInfoUI.this.un;
            localBundle.putString("key_trans_id", paramAnonymousView);
            localBundle.putInt("key_enter_id", 1);
            if (MallOrderDetailInfoUI.this.orP != null) {
              localBundle.putParcelable("transaction_data", MallOrderDetailInfoUI.this.orP.oqE);
            }
            com.tencent.mm.wallet_core.a.i(MallOrderDetailInfoUI.this, localBundle);
            MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.getResources().getString(R.l.enL));
            GMTrace.o(6659883663360L, 49620);
            return;
          }
          if (paramAnonymousView.getId() == R.h.chR)
          {
            MallOrderDetailInfoUI.b(MallOrderDetailInfoUI.this);
            GMTrace.o(6659883663360L, 49620);
            return;
          }
          if (paramAnonymousView.getId() == R.h.bOP)
          {
            if ((MallOrderDetailInfoUI.this.orP != null) && (MallOrderDetailInfoUI.this.orP.oqL != null))
            {
              MallOrderDetailInfoUI.this.osA = MallOrderDetailInfoUI.this.orP.oqL;
              MallOrderDetailInfoUI.c(MallOrderDetailInfoUI.this);
              MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.getResources().getString(R.l.enK));
              GMTrace.o(6659883663360L, 49620);
            }
          }
          else if (paramAnonymousView.getId() == R.h.cLI)
          {
            e.Q(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.orP.fBG);
            MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, MallOrderDetailInfoUI.this.getResources().getString(R.l.enQ));
          }
          GMTrace.o(6659883663360L, 49620);
          return;
        }
      }
    };
    this.osO = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6655186042880L, 49585);
        if ((MallOrderDetailInfoUI.f(MallOrderDetailInfoUI.this) != null) && (MallOrderDetailInfoUI.g(MallOrderDetailInfoUI.this) != null))
        {
          if (paramAnonymousView.getId() == R.h.chN)
          {
            MallOrderDetailInfoUI.f(MallOrderDetailInfoUI.this).setSelected(true);
            MallOrderDetailInfoUI.g(MallOrderDetailInfoUI.this).setSelected(false);
            MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, 100);
            GMTrace.o(6655186042880L, 49585);
            return;
          }
          MallOrderDetailInfoUI.f(MallOrderDetailInfoUI.this).setSelected(false);
          MallOrderDetailInfoUI.g(MallOrderDetailInfoUI.this).setSelected(true);
          MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, -100);
        }
        GMTrace.o(6655186042880L, 49585);
      }
    };
    GMTrace.o(6635187601408L, 49436);
  }
  
  private static void a(View paramView, MallOrderDetailObject.a parama)
  {
    GMTrace.i(6636395560960L, 49445);
    if (parama == null)
    {
      GMTrace.o(6636395560960L, 49445);
      return;
    }
    Rect localRect = new Rect();
    localRect.left = paramView.getPaddingLeft();
    localRect.right = paramView.getPaddingRight();
    localRect.top = paramView.getPaddingTop();
    localRect.bottom = paramView.getPaddingBottom();
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    if ((parama != null) && (parama.knE)) {
      paramView.setBackgroundResource(R.g.baH);
    }
    for (;;)
    {
      paramView.setLayoutParams(localLayoutParams);
      paramView.setPadding(localRect.left, localRect.top, localRect.right, localRect.bottom);
      GMTrace.o(6636395560960L, 49445);
      return;
      paramView.setBackgroundResource(R.g.aZN);
    }
  }
  
  private void a(View paramView, ProductSectionItem paramProductSectionItem)
  {
    GMTrace.i(6636127125504L, 49443);
    if ((paramView == null) || (paramProductSectionItem == null))
    {
      GMTrace.o(6636127125504L, 49443);
      return;
    }
    paramView.setVisibility(0);
    TextView localTextView = (TextView)paramView.findViewById(R.h.bRX);
    if (localTextView != null) {
      localTextView.setText(paramProductSectionItem.name);
    }
    if (!TextUtils.isEmpty(paramProductSectionItem.iconUrl)) {
      l((ImageView)paramView.findViewById(R.h.bRY), paramProductSectionItem.iconUrl);
    }
    GMTrace.o(6636127125504L, 49443);
  }
  
  private void aVk()
  {
    GMTrace.i(6635992907776L, 49442);
    if (this.orP == null)
    {
      GMTrace.o(6635992907776L, 49442);
      return;
    }
    com.tencent.mm.platformtools.j.a(this);
    this.ooO.clear();
    MallOrderDetailObject.b localb = this.orP.oqF;
    Object localObject;
    if (localb != null)
    {
      localObject = localb.oqN;
      if (TextUtils.isEmpty(localb.oqO)) {
        break label1525;
      }
      localObject = (String)localObject + "：" + localb.oqO;
    }
    label249:
    label350:
    label647:
    label1351:
    label1363:
    label1525:
    for (;;)
    {
      if (!this.osJ)
      {
        this.osD.setVisibility(8);
        this.osC.setVisibility(0);
        ((TextView)this.osC.findViewById(R.h.chV)).setText((CharSequence)localObject);
        ((TextView)this.osC.findViewById(R.h.chU)).setText(e.Ef(this.orP.oqM));
        if ((!TextUtils.isEmpty(localb.thumbUrl)) && (e.WB(localb.thumbUrl)))
        {
          l((ImageView)this.osC.findViewById(R.h.cie), localb.thumbUrl);
          localObject = this.orP.oqG;
          if ((localObject != null) && (((List)localObject).size() != 0)) {
            break label647;
          }
          this.osG.setVisibility(8);
          this.osH.setVisibility(8);
          this.osI.setVisibility(8);
          localObject = this.orP.oqE;
          if (localObject == null) {
            break label1351;
          }
          this.osE.setVisibility(0);
          ((TextView)findViewById(R.h.cip)).setText(e.d(((MallTransactionObject)localObject).kKX, ((MallTransactionObject)localObject).ori));
          if ((this.orP != null) && (this.orP.oqH != null) && (this.orP.oqH.size() > 0))
          {
            localObject = (MallOrderDetailObject.a)this.orP.oqH.get(0);
            a(this.osF, (MallOrderDetailObject.a)localObject);
          }
          localObject = this.orP.oqH;
          if (localObject != null)
          {
            this.oqH.addAll((Collection)localObject);
            this.osB.notifyDataSetChanged();
          }
          findViewById(R.h.bZP).setVisibility(0);
          if ((this.orP == null) || (!TextUtils.isEmpty(this.orP.oqL)) || (!TextUtils.isEmpty(this.orP.fBG))) {
            break label1363;
          }
          findViewById(R.h.bZP).setVisibility(8);
        }
      }
      for (;;)
      {
        if ((this.orP != null) && (!TextUtils.isEmpty(this.orP.oqK))) {
          a(0, R.g.baG, new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              GMTrace.i(6634516512768L, 49431);
              MallOrderDetailInfoUI.d(MallOrderDetailInfoUI.this);
              GMTrace.o(6634516512768L, 49431);
              return true;
            }
          });
        }
        GMTrace.o(6635992907776L, 49442);
        return;
        d((ImageView)this.osC.findViewById(R.h.cie));
        break;
        this.osC.setVisibility(8);
        this.osD.setVisibility(0);
        ((TextView)this.osD.findViewById(R.h.chV)).setText((CharSequence)localObject);
        ((TextView)this.osD.findViewById(R.h.chU)).setText(e.Ef(this.orP.oqM));
        if ((!TextUtils.isEmpty(localb.thumbUrl)) && (e.WB(localb.thumbUrl)))
        {
          l((ImageView)this.osD.findViewById(R.h.cie), localb.thumbUrl);
          break;
        }
        d((ImageView)this.osD.findViewById(R.h.cie));
        break;
        this.osC.setVisibility(8);
        this.osD.setVisibility(8);
        break;
        if (((List)localObject).size() == 1)
        {
          this.osI.setVisibility(8);
          localObject = (ProductSectionItem)((List)localObject).get(0);
          if (!TextUtils.isEmpty(((ProductSectionItem)localObject).iconUrl))
          {
            this.osG.setVisibility(8);
            this.osH.setVisibility(0);
            ((TextView)this.osH.findViewById(R.h.bRX)).setText(((ProductSectionItem)localObject).name);
            ((TextView)this.osH.findViewById(R.h.bRZ)).setText(((ProductSectionItem)localObject).osw);
            ((TextView)this.osH.findViewById(R.h.bRV)).setText("+" + ((ProductSectionItem)localObject).count);
            ((TextView)this.osH.findViewById(R.h.bRU)).setText(ProductSectionItem.Skus.aV(((ProductSectionItem)localObject).osv));
            if (TextUtils.isEmpty(((ProductSectionItem)localObject).iconUrl)) {
              break label249;
            }
            l((ImageView)this.osH.findViewById(R.h.bRY), ((ProductSectionItem)localObject).iconUrl);
            break label249;
          }
          this.osH.setVisibility(8);
          this.osG.setVisibility(0);
          ((TextView)this.osG.findViewById(R.h.bRX)).setText(((ProductSectionItem)localObject).name);
          if (TextUtils.isEmpty(((ProductSectionItem)localObject).jumpUrl))
          {
            localObject = new Rect();
            ((Rect)localObject).set(this.osG.findViewById(R.h.bRW).getPaddingLeft(), this.osG.findViewById(R.h.bRW).getPaddingTop(), this.osG.findViewById(R.h.bRW).getPaddingRight(), this.osG.findViewById(R.h.bRW).getPaddingBottom());
            this.osG.findViewById(R.h.bRW).setBackgroundResource(R.g.aZN);
            this.osG.findViewById(R.h.bRW).setPadding(((Rect)localObject).left, ((Rect)localObject).top, ((Rect)localObject).right, ((Rect)localObject).bottom);
            break label249;
          }
          ((TextView)this.osG.findViewById(R.h.bRX)).setTextColor(getResources().getColor(R.e.aPp));
          break label249;
        }
        this.osG.setVisibility(8);
        this.osH.setVisibility(8);
        this.osI.setVisibility(0);
        if (((List)localObject).size() == 2)
        {
          a(this.osI.findViewById(R.h.cii), (ProductSectionItem)((List)localObject).get(0));
          a(this.osI.findViewById(R.h.cij), (ProductSectionItem)((List)localObject).get(1));
          this.osI.findViewById(R.h.cik).setVisibility(8);
          this.osI.findViewById(R.h.cil).setVisibility(8);
          break label249;
        }
        if (((List)localObject).size() == 3)
        {
          a(this.osI.findViewById(R.h.cii), (ProductSectionItem)((List)localObject).get(0));
          a(this.osI.findViewById(R.h.cij), (ProductSectionItem)((List)localObject).get(1));
          a(this.osI.findViewById(R.h.cik), (ProductSectionItem)((List)localObject).get(2));
          this.osI.findViewById(R.h.cil).setVisibility(8);
          break label249;
        }
        if (((List)localObject).size() < 4) {
          break label249;
        }
        a(this.osI.findViewById(R.h.cii), (ProductSectionItem)((List)localObject).get(0));
        a(this.osI.findViewById(R.h.cij), (ProductSectionItem)((List)localObject).get(1));
        a(this.osI.findViewById(R.h.cik), (ProductSectionItem)((List)localObject).get(2));
        a(this.osI.findViewById(R.h.cil), (ProductSectionItem)((List)localObject).get(3));
        break label249;
        this.osE.setVisibility(8);
        break label350;
        if ((this.orP != null) && (!TextUtils.isEmpty(this.orP.oqL)) && (TextUtils.isEmpty(this.orP.fBG)))
        {
          findViewById(R.h.cLI).setVisibility(8);
          findViewById(R.h.cLH).setVisibility(8);
          localObject = (TextView)findViewById(R.h.bOP);
          ((TextView)localObject).setVisibility(0);
          ((TextView)localObject).setGravity(3);
        }
        else if ((this.orP != null) && (TextUtils.isEmpty(this.orP.oqL)) && (!TextUtils.isEmpty(this.orP.fBG)))
        {
          findViewById(R.h.bOP).setVisibility(8);
          findViewById(R.h.cLH).setVisibility(8);
          localObject = (TextView)findViewById(R.h.cLI);
          ((TextView)localObject).setVisibility(0);
          ((TextView)localObject).setGravity(3);
        }
      }
    }
  }
  
  private void aVl()
  {
    GMTrace.i(6636798214144L, 49448);
    if ((!this.osK) && (this.osL != 0))
    {
      ap.wT().a(new f(this.kJW, "", this.osL), 0);
      this.osK = true;
    }
    GMTrace.o(6636798214144L, 49448);
  }
  
  private void aVm()
  {
    GMTrace.i(6637335085056L, 49452);
    com.tencent.mm.ui.base.h.a(this.vov.voR, R.l.eVU, 0, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(6639214133248L, 49466);
        MallOrderDetailInfoUI.this.finish();
        GMTrace.o(6639214133248L, 49466);
      }
    });
    GMTrace.o(6637335085056L, 49452);
  }
  
  private void d(ImageView paramImageView)
  {
    GMTrace.i(6636663996416L, 49447);
    Bitmap localBitmap = com.tencent.mm.compatible.f.a.decodeResource(getResources(), R.k.doU);
    if (localBitmap != null) {
      paramImageView.setImageBitmap(d.a(localBitmap, false, 96.0F));
    }
    GMTrace.o(6636663996416L, 49447);
  }
  
  private void l(ImageView paramImageView, String paramString)
  {
    GMTrace.i(6636261343232L, 49444);
    if ((paramImageView == null) || (TextUtils.isEmpty(paramString)) || (!e.WB(paramString)))
    {
      GMTrace.o(6636261343232L, 49444);
      return;
    }
    paramImageView.setImageBitmap(com.tencent.mm.platformtools.j.a(new com.tencent.mm.plugin.order.c.b(paramString)));
    this.ooO.put(paramString, paramImageView);
    GMTrace.o(6636261343232L, 49444);
  }
  
  protected final void MH()
  {
    GMTrace.i(6635590254592L, 49439);
    int i;
    if (this.osJ)
    {
      com.tencent.mm.plugin.order.a.b.aVa();
      com.tencent.mm.plugin.order.model.j localj = com.tencent.mm.plugin.order.a.b.aVd().DJ(this.kJW);
      if ((localj != null) && (!TextUtils.isEmpty(localj.osl)) && (com.tencent.mm.plugin.order.c.c.ul(localj.osl)))
      {
        i = Integer.valueOf(localj.osl).intValue();
        if (i != 2) {
          break label331;
        }
        oC(R.l.enH);
      }
    }
    for (;;)
    {
      this.osC = findViewById(R.h.chT);
      this.osD = findViewById(R.h.chS);
      this.osH = findViewById(R.h.cih);
      this.osI = findViewById(R.h.cif);
      this.osG = findViewById(R.h.cig);
      this.osE = findViewById(R.h.cio);
      this.osF = findViewById(R.h.cin);
      this.osC.setOnClickListener(this.iom);
      this.osI.setOnClickListener(this.iom);
      this.osH.setOnClickListener(this.iom);
      this.osG.setOnClickListener(this.iom);
      this.osE.setOnClickListener(this.iom);
      findViewById(R.h.chR).setOnClickListener(this.iom);
      findViewById(R.h.bOP).setOnClickListener(this.iom);
      findViewById(R.h.cLI).setOnClickListener(this.iom);
      this.EA = ((ListView)findViewById(R.h.chQ));
      this.osB = new a((byte)0);
      this.EA.setAdapter(this.osB);
      this.osB.notifyDataSetChanged();
      this.EA.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(6651159511040L, 49555);
          paramAnonymousAdapterView = (MallOrderDetailObject.a)MallOrderDetailInfoUI.e(MallOrderDetailInfoUI.this).get(paramAnonymousInt);
          if (!TextUtils.isEmpty(paramAnonymousAdapterView.jumpUrl)) {
            com.tencent.mm.plugin.order.c.c.aq(MallOrderDetailInfoUI.this, paramAnonymousAdapterView.jumpUrl);
          }
          MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, paramAnonymousAdapterView.name);
          GMTrace.o(6651159511040L, 49555);
        }
      });
      aVk();
      GMTrace.o(6635590254592L, 49439);
      return;
      i = -1;
      break;
      label331:
      if (i == 1)
      {
        oC(R.l.enI);
        continue;
        oC(R.l.enJ);
      }
    }
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(6635858690048L, 49441);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof com.tencent.mm.plugin.order.model.h))
      {
        paramString = ((com.tencent.mm.plugin.order.model.h)paramk).orP;
        w.d("MicroMsg.MallOrderDetailInfoUI", "tempObject:" + paramString);
        if (paramString != null)
        {
          this.orP = paramString;
          aVk();
        }
      }
      GMTrace.o(6635858690048L, 49441);
      return true;
    }
    GMTrace.o(6635858690048L, 49441);
    return false;
  }
  
  public void finish()
  {
    GMTrace.i(6636932431872L, 49449);
    aVl();
    super.finish();
    GMTrace.o(6636932431872L, 49449);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6635321819136L, 49437);
    int i = R.i.cZL;
    GMTrace.o(6635321819136L, 49437);
    return i;
  }
  
  public final void k(String paramString, Bitmap paramBitmap)
  {
    GMTrace.i(6636529778688L, 49446);
    paramString = (ImageView)this.ooO.get(paramString);
    if (paramString != null) {
      paramString.setImageBitmap(paramBitmap);
    }
    GMTrace.o(6636529778688L, 49446);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6635456036864L, 49438);
    super.onCreate(paramBundle);
    paramBundle = com.tencent.mm.wallet_core.a.aa(this);
    if ((paramBundle != null) && ((paramBundle instanceof com.tencent.mm.plugin.order.a.a)))
    {
      paramBundle = this.un.getString("key_trans_id");
      this.kJW = paramBundle;
      if (paramBundle == null) {
        break label95;
      }
      com.tencent.mm.plugin.order.a.b.aVa();
      if (com.tencent.mm.plugin.order.a.b.aVd().DI(paramBundle)) {
        break label95;
      }
      this.osJ = false;
      l(new com.tencent.mm.plugin.order.model.h(paramBundle));
    }
    for (;;)
    {
      MH();
      GMTrace.o(6635456036864L, 49438);
      return;
      label95:
      com.tencent.mm.plugin.order.a.b.aVa();
      if (com.tencent.mm.plugin.order.a.b.aVd().DI(paramBundle))
      {
        this.osJ = true;
        com.tencent.mm.plugin.order.a.b.aVa();
        com.tencent.mm.plugin.order.model.c localc = com.tencent.mm.plugin.order.a.b.aVd();
        if (TextUtils.isEmpty(paramBundle)) {}
        for (paramBundle = null;; paramBundle = com.tencent.mm.plugin.order.model.c.a(localc.DJ(paramBundle)))
        {
          this.orP = paramBundle;
          if (this.orP != null) {
            break;
          }
          aVm();
          break;
          w.v("MicroMsg.MallPayMsgManager", "getMallOrderDetailObjectByMsgId msgId:" + paramBundle);
        }
      }
      w.w("MicroMsg.MallOrderDetailInfoUI", "mOrders info is Illegal!");
      aVm();
    }
  }
  
  public void onDestroy()
  {
    GMTrace.i(6637066649600L, 49450);
    aVl();
    super.onDestroy();
    GMTrace.o(6637066649600L, 49450);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6635724472320L, 49440);
    if (paramInt == 4)
    {
      if ((com.tencent.mm.wallet_core.a.aa(this) instanceof com.tencent.mm.plugin.order.a.a)) {
        com.tencent.mm.wallet_core.a.X(this);
      }
      GMTrace.o(6635724472320L, 49440);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6635724472320L, 49440);
    return bool;
  }
  
  public final void sa(int paramInt)
  {
    GMTrace.i(6637200867328L, 49451);
    finish();
    GMTrace.o(6637200867328L, 49451);
  }
  
  private final class a
    extends BaseAdapter
  {
    private a()
    {
      GMTrace.i(6653038559232L, 49569);
      GMTrace.o(6653038559232L, 49569);
    }
    
    private MallOrderDetailObject.a sb(int paramInt)
    {
      GMTrace.i(6653306994688L, 49571);
      MallOrderDetailObject.a locala = (MallOrderDetailObject.a)MallOrderDetailInfoUI.e(MallOrderDetailInfoUI.this).get(paramInt);
      GMTrace.o(6653306994688L, 49571);
      return locala;
    }
    
    public final int getCount()
    {
      GMTrace.i(6653172776960L, 49570);
      int i = MallOrderDetailInfoUI.e(MallOrderDetailInfoUI.this).size();
      GMTrace.o(6653172776960L, 49570);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6653441212416L, 49572);
      long l = paramInt;
      GMTrace.o(6653441212416L, 49572);
      return l;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(6653709647872L, 49574);
      paramInt = sb(paramInt).type;
      GMTrace.o(6653709647872L, 49574);
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6653575430144L, 49573);
      MallOrderDetailObject.a locala = sb(paramInt);
      switch (locala.type)
      {
      default: 
        if (paramView == null)
        {
          paramView = View.inflate(MallOrderDetailInfoUI.this, R.i.cZD, null);
          paramViewGroup = new MallOrderDetailInfoUI.b(MallOrderDetailInfoUI.this);
          paramViewGroup.kym = ((TextView)paramView.findViewById(R.h.chP));
          paramViewGroup.kzk = ((TextView)paramView.findViewById(R.h.chO));
          paramViewGroup.kzl = ((TextView)paramView.findViewById(R.h.chM));
          paramViewGroup.jSz = paramView.findViewById(R.h.chL);
          paramView.setTag(paramViewGroup);
          paramViewGroup.kym.setText(locala.name);
          if (!TextUtils.isEmpty(locala.value)) {
            break label460;
          }
          paramViewGroup.kzk.setVisibility(4);
          label161:
          if (!locala.knE) {
            break label483;
          }
          paramViewGroup.kzl.setVisibility(0);
        }
        break;
      }
      for (;;)
      {
        if (paramInt + 1 < getCount())
        {
          locala = sb(paramInt + 1);
          MallOrderDetailInfoUI.b(paramViewGroup.jSz, locala);
        }
        GMTrace.o(6653575430144L, 49573);
        return paramView;
        paramView = View.inflate(MallOrderDetailInfoUI.this, R.i.cZF, null);
        paramViewGroup = paramView.findViewById(R.h.chL);
        MallOrderDetailInfoUI.a(MallOrderDetailInfoUI.this, (CheckedTextView)paramView.findViewById(R.h.chN));
        MallOrderDetailInfoUI.b(MallOrderDetailInfoUI.this, (CheckedTextView)paramView.findViewById(R.h.chK));
        MallOrderDetailInfoUI.f(MallOrderDetailInfoUI.this).setOnClickListener(MallOrderDetailInfoUI.this.osO);
        MallOrderDetailInfoUI.g(MallOrderDetailInfoUI.this).setOnClickListener(MallOrderDetailInfoUI.this.osO);
        if (paramInt + 1 < getCount()) {
          MallOrderDetailInfoUI.b(paramViewGroup, sb(paramInt + 1));
        }
        GMTrace.o(6653575430144L, 49573);
        return paramView;
        paramView = View.inflate(MallOrderDetailInfoUI.this, R.i.cZE, null);
        paramViewGroup = (TextView)paramView.findViewById(R.h.chK);
        View localView = paramView.findViewById(R.h.chL);
        if (bg.getInt(locala.value, 0) >= 0)
        {
          paramViewGroup.setText(R.l.enG);
          paramViewGroup.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.k.doT, 0);
        }
        for (;;)
        {
          if (paramInt + 1 < getCount()) {
            MallOrderDetailInfoUI.b(localView, sb(paramInt + 1));
          }
          GMTrace.o(6653575430144L, 49573);
          return paramView;
          paramViewGroup.setText(R.l.enF);
          paramViewGroup.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.k.doR, 0);
        }
        paramViewGroup = (MallOrderDetailInfoUI.b)paramView.getTag();
        break;
        label460:
        paramViewGroup.kzk.setVisibility(0);
        paramViewGroup.kzk.setText(locala.value);
        break label161;
        label483:
        paramViewGroup.kzl.setVisibility(8);
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(6653843865600L, 49575);
      GMTrace.o(6653843865600L, 49575);
      return 3;
    }
  }
  
  private final class b
  {
    View jSz;
    TextView kym;
    TextView kzk;
    TextView kzl;
    
    public b()
    {
      GMTrace.i(6655722913792L, 49589);
      GMTrace.o(6655722913792L, 49589);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/order/ui/MallOrderDetailInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */