package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.plugin.card.b.d;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.model.t;
import com.tencent.mm.protocal.c.bfe;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.jo;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.ap;
import java.util.LinkedList;
import java.util.List;

public class CardViewUI
  extends CardBaseUI
{
  private int Zk;
  private String hbQ;
  private int kjz;
  private LinkedList<jo> ktB;
  private int kuP;
  private String kzc;
  private View kzd;
  
  public CardViewUI()
  {
    GMTrace.i(4962163621888L, 36971);
    this.Zk = 1;
    this.ktB = new LinkedList();
    this.hbQ = "";
    GMTrace.o(4962163621888L, 36971);
  }
  
  public final void YW()
  {
    GMTrace.i(4962566275072L, 36974);
    super.YW();
    if (this.kjz == 26) {
      overridePendingTransition(0, 0);
    }
    GMTrace.o(4962566275072L, 36974);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    int i = 0;
    GMTrace.i(4963640016896L, 36982);
    if ((paramk instanceof t))
    {
      dv(false);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((t)paramk).kpx;
        if ((paramString != null) && (paramString.size() > 0))
        {
          if ((this.kme instanceof g))
          {
            paramk = (g)this.kme;
            if (paramString != null)
            {
              paramk.ksp.clear();
              paramk.ksp.addAll(paramString);
              paramk.kxl.clear();
              paramInt1 = i;
              while (paramInt1 < paramString.size())
              {
                paramk.kxl.add(new Boolean(true));
                paramInt1 += 1;
              }
            }
          }
          this.kme.notifyDataSetChanged();
        }
        GMTrace.o(4963640016896L, 36982);
        return;
      }
      d.b(this, paramString, paramInt2);
      GMTrace.o(4963640016896L, 36982);
      return;
    }
    super.a(paramInt1, paramInt2, paramString, paramk);
    GMTrace.o(4963640016896L, 36982);
  }
  
  protected final void a(b paramb)
  {
    GMTrace.i(4963505799168L, 36981);
    if (this.Zk == 0)
    {
      al.ajH().kml = ((CardInfo)paramb);
      Intent localIntent = new Intent(this, CardDetailUI.class);
      localIntent.putExtra("key_card_id", ((CardInfo)paramb).field_card_id);
      localIntent.putExtra("key_from_scene", 51);
      localIntent.putExtra("key_from_appbrand_type", this.kuP);
      startActivity(localIntent);
      GMTrace.o(4963505799168L, 36981);
      return;
    }
    super.a(paramb);
    GMTrace.o(4963505799168L, 36981);
  }
  
  protected final void a(CardInfo paramCardInfo)
  {
    GMTrace.i(4963371581440L, 36980);
    if (this.Zk == 1)
    {
      this.kml = paramCardInfo;
      j(this.kzc, 1, true);
      GMTrace.o(4963371581440L, 36980);
      return;
    }
    super.a(paramCardInfo);
    if (this.kml != null) {
      com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "OperGift", Integer.valueOf(4), Integer.valueOf(this.kml.aiK().knq), this.kml.field_card_tp_id, this.kml.field_card_id, this.kzc });
    }
    GMTrace.o(4963371581440L, 36980);
  }
  
  protected final void aib()
  {
    GMTrace.i(4962700492800L, 36975);
    int i;
    if (this.Zk == 0)
    {
      oC(R.l.dGS);
      ap.wT().a(699, this);
      i = R.l.dEy;
      if (this.Zk != 0) {
        break label165;
      }
      dv(true);
      Object localObject = new bfe();
      ((bfe)localObject).uxn = this.hbQ;
      w.i("MicroMsg.CardViewUI", "doBatchGetCardItemByTpInfo templateId:%s", new Object[] { this.hbQ });
      localObject = new t(this.ktB, (bfe)localObject, this.kjz);
      ap.wT().a((com.tencent.mm.ac.k)localObject, 0);
      i = R.l.dEy;
    }
    for (;;)
    {
      findViewById(R.h.cgt).setVisibility(8);
      ((TextView)findViewById(R.h.cgv)).setText(i);
      GMTrace.o(4962700492800L, 36975);
      return;
      if (this.Zk != 1) {
        break;
      }
      oC(R.l.dFr);
      break;
      label165:
      if (this.Zk == 1)
      {
        this.kzd = View.inflate(this, R.i.cOr, null);
        if (this.kmg != null) {
          this.kmg.addView(this.kzd);
        }
        i = R.l.dGy;
      }
    }
  }
  
  protected final int aic()
  {
    GMTrace.i(4962834710528L, 36976);
    int i = n.a.kpl;
    GMTrace.o(4962834710528L, 36976);
    return i;
  }
  
  protected final BaseAdapter aid()
  {
    GMTrace.i(4962968928256L, 36977);
    if (this.Zk == 0)
    {
      localObject = new g(getApplicationContext());
      GMTrace.o(4962968928256L, 36977);
      return (BaseAdapter)localObject;
    }
    Object localObject = super.aid();
    GMTrace.o(4962968928256L, 36977);
    return (BaseAdapter)localObject;
  }
  
  protected final boolean aif()
  {
    GMTrace.i(4963103145984L, 36978);
    if (this.Zk == 1)
    {
      GMTrace.o(4963103145984L, 36978);
      return false;
    }
    boolean bool = super.aif();
    GMTrace.o(4963103145984L, 36978);
    return bool;
  }
  
  protected final void aig()
  {
    GMTrace.i(19558609977344L, 145723);
    GMTrace.o(19558609977344L, 145723);
  }
  
  protected final void b(b paramb)
  {
    GMTrace.i(4963237363712L, 36979);
    if (this.Zk == 1)
    {
      a((CardInfo)paramb);
      GMTrace.o(4963237363712L, 36979);
      return;
    }
    super.b(paramb);
    GMTrace.o(4963237363712L, 36979);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4962297839616L, 36972);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      w.e("MicroMsg.CardViewUI", "onCreate intent is null");
      finish();
      GMTrace.o(4962297839616L, 36972);
      return;
    }
    this.kjz = paramBundle.getIntExtra("key_previous_scene", 7);
    this.kuP = paramBundle.getIntExtra("key_from_appbrand_type", 0);
    this.Zk = paramBundle.getIntExtra("view_type", 0);
    this.kzc = paramBundle.getStringExtra("user_name");
    paramBundle = paramBundle.getStringExtra("card_list");
    this.hbQ = getIntent().getStringExtra("key_template_id");
    if (this.Zk == 0)
    {
      if (TextUtils.isEmpty(paramBundle))
      {
        w.e("MicroMsg.CardViewUI", "oncreate card_list is empty");
        finish();
        GMTrace.o(4962297839616L, 36972);
        return;
      }
      paramBundle = com.tencent.mm.plugin.card.b.k.aL(paramBundle, this.kjz);
      if ((paramBundle != null) && (paramBundle.size() > 0))
      {
        this.ktB.clear();
        this.ktB.addAll(paramBundle);
      }
    }
    MH();
    GMTrace.o(4962297839616L, 36972);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4962432057344L, 36973);
    ap.wT().b(699, this);
    super.onDestroy();
    GMTrace.o(4962432057344L, 36973);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/ui/CardViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */