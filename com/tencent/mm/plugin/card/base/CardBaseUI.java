package com.tencent.mm.plugin.card.base;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.k;
import com.tencent.mm.modelgeo.a.a;
import com.tencent.mm.plugin.card.a.l;
import com.tencent.mm.plugin.card.b.d.a;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.ad;
import com.tencent.mm.plugin.card.model.af;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.model.r;
import com.tencent.mm.plugin.card.model.x;
import com.tencent.mm.plugin.card.ui.CardDetailUI;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.ui.applet.k.a;
import com.tencent.mm.protocal.c.bbx;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.q;
import com.tencent.mm.x.ap;
import java.util.ArrayList;
import java.util.LinkedList;

public abstract class CardBaseUI
  extends MMActivity
  implements e, MMActivity.a
{
  private float gBS;
  private float gBT;
  private a.a gBY;
  private boolean hpC;
  public com.tencent.mm.modelgeo.c hpz;
  private q iXW;
  public ListView kmd;
  public BaseAdapter kme;
  public RelativeLayout kmf;
  public LinearLayout kmg;
  public LinearLayout kmh;
  public boolean kmi;
  public boolean kmj;
  public a kmk;
  public CardInfo kml;
  
  public CardBaseUI()
  {
    GMTrace.i(5101615841280L, 38010);
    this.kmd = null;
    this.kme = null;
    this.kmf = null;
    this.iXW = null;
    this.kmi = false;
    this.kmj = true;
    this.kmk = null;
    this.gBS = -85.0F;
    this.gBT = -1000.0F;
    this.hpC = false;
    this.gBY = new a.a()
    {
      public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
      {
        GMTrace.i(15361621622784L, 114453);
        if (!paramAnonymousBoolean)
        {
          CardBaseUI.this.ail();
          GMTrace.o(15361621622784L, 114453);
          return true;
        }
        if ((paramAnonymousFloat2 != -85.0F) && (paramAnonymousFloat1 != -1000.0F))
        {
          CardBaseUI.a(CardBaseUI.this, paramAnonymousFloat2);
          CardBaseUI.b(CardBaseUI.this, paramAnonymousFloat1);
          al.ajI().s(CardBaseUI.a(CardBaseUI.this), CardBaseUI.b(CardBaseUI.this));
          CardBaseUI.this.aik();
        }
        if (!CardBaseUI.c(CardBaseUI.this))
        {
          CardBaseUI.d(CardBaseUI.this);
          com.tencent.mm.modelstat.n.a(2010, paramAnonymousFloat1, paramAnonymousFloat2, (int)paramAnonymousDouble2);
        }
        GMTrace.o(15361621622784L, 114453);
        return false;
      }
    };
    GMTrace.o(5101615841280L, 38010);
  }
  
  public final void C(LinkedList<String> paramLinkedList)
  {
    GMTrace.i(5102823800832L, 38019);
    dv(true);
    paramLinkedList = new r(paramLinkedList);
    ap.wT().a(paramLinkedList, 0);
    GMTrace.o(5102823800832L, 38019);
  }
  
  public void MH()
  {
    GMTrace.i(5102152712192L, 38014);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5113963872256L, 38102);
        CardBaseUI.this.finish();
        GMTrace.o(5113963872256L, 38102);
        return true;
      }
    });
    this.kmd = ((ListView)findViewById(16908298));
    this.kmf = ((RelativeLayout)findViewById(R.h.bzd));
    if (this.kmf != null) {
      this.kmd.setEmptyView(this.kmf);
    }
    this.kmg = ((LinearLayout)View.inflate(getBaseContext(), R.i.cOs, null));
    this.kmh = ((LinearLayout)View.inflate(getBaseContext(), R.i.cOq, null));
    this.kmd.addHeaderView(this.kmg);
    this.kmd.addFooterView(this.kmh);
    this.kme = aid();
    this.kmd.setAdapter(this.kme);
    this.kmd.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5108192509952L, 38059);
        if (paramAnonymousInt == 0)
        {
          w.i("MicroMsg.CardBaseUI", "onItemClick pos is 0, onListHeaderItemClick()");
          CardBaseUI.this.aig();
          GMTrace.o(5108192509952L, 38059);
          return;
        }
        int i = paramAnonymousInt;
        if (paramAnonymousInt > 0) {
          i = paramAnonymousInt - 1;
        }
        if (i >= CardBaseUI.this.kme.getCount())
        {
          GMTrace.o(5108192509952L, 38059);
          return;
        }
        paramAnonymousAdapterView = CardBaseUI.this.kmk.lr(i);
        CardBaseUI.this.b(paramAnonymousAdapterView);
        GMTrace.o(5108192509952L, 38059);
      }
    });
    this.kmd.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5106850332672L, 38049);
        if (paramAnonymousInt == 0)
        {
          w.i("MicroMsg.CardBaseUI", "onItemLongClick pos is 0");
          GMTrace.o(5106850332672L, 38049);
          return true;
        }
        int i = paramAnonymousInt;
        if (paramAnonymousInt > 0) {
          i = paramAnonymousInt - 1;
        }
        if (i >= CardBaseUI.this.kme.getCount())
        {
          GMTrace.o(5106850332672L, 38049);
          return true;
        }
        paramAnonymousAdapterView = CardBaseUI.this.kmk.lr(i);
        CardBaseUI.this.c(paramAnonymousAdapterView);
        GMTrace.o(5106850332672L, 38049);
        return true;
      }
    });
    ap.wT().a(560, this);
    ap.wT().a(692, this);
    Object localObject = this.kme;
    if ((localObject instanceof com.tencent.mm.plugin.card.ui.c)) {
      localObject = new com.tencent.mm.plugin.card.ui.d((com.tencent.mm.plugin.card.ui.c)localObject);
    }
    for (;;)
    {
      this.kmk = ((a)localObject);
      this.kmk.onCreate();
      aib();
      GMTrace.o(5102152712192L, 38014);
      return;
      if ((localObject instanceof com.tencent.mm.plugin.card.sharecard.ui.c)) {
        localObject = new com.tencent.mm.plugin.card.sharecard.ui.d((com.tencent.mm.plugin.card.sharecard.ui.c)localObject);
      } else if ((localObject instanceof com.tencent.mm.plugin.card.sharecard.ui.g)) {
        localObject = new com.tencent.mm.plugin.card.sharecard.ui.h((com.tencent.mm.plugin.card.sharecard.ui.g)localObject);
      } else {
        localObject = new com.tencent.mm.plugin.card.ui.h((com.tencent.mm.plugin.card.ui.g)localObject);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5104031760384L, 38028);
    if ((paramInt1 == 0) && (paramInt2 == -1)) {
      j(paramIntent.getStringExtra("Select_Conv_User"), 0, false);
    }
    GMTrace.o(5104031760384L, 38028);
  }
  
  public void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5102958018560L, 38020);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paramk instanceof r))
      {
        dv(false);
        com.tencent.mm.ui.base.h.bl(this, getResources().getString(R.l.dFd));
        al.ajB();
        com.tencent.mm.plugin.card.a.b.lt(4);
        this.kmk.Bg();
        ain();
        GMTrace.o(5102958018560L, 38020);
        return;
      }
      if ((paramk instanceof af))
      {
        dv(false);
        paramInt1 = ((af)paramk).kpr;
        paramk = ((af)paramk).kps;
        if (paramInt1 == 10000)
        {
          paramString = paramk;
          if (TextUtils.isEmpty(paramk)) {
            paramString = getString(R.l.dFo);
          }
          com.tencent.mm.plugin.card.b.d.b(this, paramString, paramInt1);
          GMTrace.o(5102958018560L, 38020);
          return;
        }
        if (this.kml != null)
        {
          paramString = this.kml.aiL();
          paramString.status = 3;
          this.kml.a(paramString);
          if (!al.ajC().c(this.kml, new String[0])) {
            w.e("MicroMsg.CardBaseUI", "update newSerial fail, cardId = %s", new Object[] { this.kml.field_card_id });
          }
        }
        this.kmk.Bg();
        ain();
        GMTrace.o(5102958018560L, 38020);
      }
    }
    else
    {
      dv(false);
      String str1 = paramString;
      if ((paramk instanceof af))
      {
        paramInt1 = ((af)paramk).kpr;
        String str2 = ((af)paramk).kps;
        str1 = paramString;
        if (paramInt1 == 10000)
        {
          paramString = str2;
          if (TextUtils.isEmpty(str2)) {
            paramString = getString(R.l.dFo);
          }
          str1 = paramString;
        }
      }
      if ((!(paramk instanceof x)) && (!(paramk instanceof ad)) && (!(paramk instanceof com.tencent.mm.plugin.card.sharecard.model.b)) && (this.kmj)) {
        com.tencent.mm.plugin.card.b.d.b(this, str1, paramInt2);
      }
    }
    GMTrace.o(5102958018560L, 38020);
  }
  
  public void a(b paramb)
  {
    GMTrace.i(5102555365376L, 38017);
    Intent localIntent = new Intent(this, CardDetailUI.class);
    localIntent.putExtra("key_card_id", paramb.aiO());
    localIntent.addFlags(131072);
    localIntent.putExtra("key_from_scene", 3);
    startActivity(localIntent);
    if (aic() == n.a.kpo)
    {
      com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "ClickMemberCard", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0) });
      GMTrace.o(5102555365376L, 38017);
      return;
    }
    if (aic() == n.a.kpn) {
      com.tencent.mm.plugin.report.service.g.paX.i(11324, new Object[] { "ClickMemberCard", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(1), "", Integer.valueOf(0), Integer.valueOf(0) });
    }
    GMTrace.o(5102555365376L, 38017);
  }
  
  public void a(CardInfo paramCardInfo)
  {
    GMTrace.i(5104165978112L, 38029);
    this.kml = paramCardInfo;
    com.tencent.mm.plugin.card.b.b.a(this, 0, this);
    GMTrace.o(5104165978112L, 38029);
  }
  
  public abstract void aib();
  
  public int aic()
  {
    GMTrace.i(5103226454016L, 38022);
    int i = n.a.kpj;
    GMTrace.o(5103226454016L, 38022);
    return i;
  }
  
  public BaseAdapter aid()
  {
    GMTrace.i(5103360671744L, 38023);
    com.tencent.mm.plugin.card.ui.c localc = new com.tencent.mm.plugin.card.ui.c(this, aic());
    GMTrace.o(5103360671744L, 38023);
    return localc;
  }
  
  public boolean aie()
  {
    GMTrace.i(5103494889472L, 38024);
    GMTrace.o(5103494889472L, 38024);
    return true;
  }
  
  public boolean aif()
  {
    GMTrace.i(5103629107200L, 38025);
    GMTrace.o(5103629107200L, 38025);
    return true;
  }
  
  public void aig()
  {
    GMTrace.i(19558878412800L, 145725);
    GMTrace.o(19558878412800L, 145725);
  }
  
  public final void aih()
  {
    GMTrace.i(5104434413568L, 38031);
    if (this.hpz == null) {
      this.hpz = com.tencent.mm.modelgeo.c.Io();
    }
    if (this.hpz != null) {
      this.hpz.a(this.gBY, true);
    }
    GMTrace.o(5104434413568L, 38031);
  }
  
  public final void aii()
  {
    GMTrace.i(5104568631296L, 38032);
    if (this.hpz != null) {
      this.hpz.a(this.gBY, true);
    }
    GMTrace.o(5104568631296L, 38032);
  }
  
  public final void aij()
  {
    GMTrace.i(5104702849024L, 38033);
    if (this.hpz != null) {
      this.hpz.c(this.gBY);
    }
    GMTrace.o(5104702849024L, 38033);
  }
  
  public void aik()
  {
    GMTrace.i(5104837066752L, 38034);
    GMTrace.o(5104837066752L, 38034);
  }
  
  public void ail()
  {
    GMTrace.i(5104971284480L, 38035);
    GMTrace.o(5104971284480L, 38035);
  }
  
  public void aim()
  {
    GMTrace.i(5105105502208L, 38036);
    GMTrace.o(5105105502208L, 38036);
  }
  
  public void ain()
  {
    GMTrace.i(5105239719936L, 38037);
    GMTrace.o(5105239719936L, 38037);
  }
  
  public void b(b paramb)
  {
    GMTrace.i(5103763324928L, 38026);
    if (!aie())
    {
      w.e("MicroMsg.CardBaseUI", "isItemClickable return false");
      GMTrace.o(5103763324928L, 38026);
      return;
    }
    if (paramb == null)
    {
      w.e("MicroMsg.CardBaseUI", "onListItemClick  item == null");
      GMTrace.o(5103763324928L, 38026);
      return;
    }
    if (paramb.aiw())
    {
      a(paramb);
      GMTrace.o(5103763324928L, 38026);
      return;
    }
    if (!TextUtils.isEmpty(paramb.aiK().tFc)) {
      com.tencent.mm.plugin.card.b.b.a(this, paramb.aiK().tFc, 0);
    }
    GMTrace.o(5103763324928L, 38026);
  }
  
  public void c(final b paramb)
  {
    GMTrace.i(5103897542656L, 38027);
    if (!aif())
    {
      w.e("MicroMsg.CardBaseUI", "isItemClickable return false");
      GMTrace.o(5103897542656L, 38027);
      return;
    }
    if (paramb == null)
    {
      w.e("MicroMsg.CardBaseUI", "onListItemLongClick  item == null");
      GMTrace.o(5103897542656L, 38027);
      return;
    }
    ArrayList localArrayList = new ArrayList();
    if (paramb.aix()) {
      localArrayList.add(getResources().getString(R.l.dFO));
    }
    localArrayList.add(getResources().getString(R.l.duY));
    final String str = paramb.aiO();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramb.aiK().koC);
    com.tencent.mm.ui.base.h.a(this, localStringBuilder.toString(), (String[])localArrayList.toArray(new String[localArrayList.size()]), null, new h.c()
    {
      public final void hC(int paramAnonymousInt)
      {
        GMTrace.i(5107924074496L, 38057);
        if (paramb.aix())
        {
          switch (paramAnonymousInt)
          {
          default: 
            GMTrace.o(5107924074496L, 38057);
            return;
          case 0: 
            CardBaseUI.this.a((CardInfo)paramb);
            GMTrace.o(5107924074496L, 38057);
            return;
          }
          CardBaseUI.b(CardBaseUI.this, str);
          GMTrace.o(5107924074496L, 38057);
          return;
        }
        switch (paramAnonymousInt)
        {
        }
        for (;;)
        {
          GMTrace.o(5107924074496L, 38057);
          return;
          CardBaseUI.b(CardBaseUI.this, str);
        }
      }
    });
    GMTrace.o(5103897542656L, 38027);
  }
  
  public final void dv(boolean paramBoolean)
  {
    GMTrace.i(5102689583104L, 38018);
    if (paramBoolean)
    {
      this.iXW = q.b(this, getString(R.l.dxB), true, 0, null);
      GMTrace.o(5102689583104L, 38018);
      return;
    }
    if ((this.iXW != null) && (this.iXW.isShowing()))
    {
      this.iXW.dismiss();
      this.iXW = null;
    }
    GMTrace.o(5102689583104L, 38018);
  }
  
  public int getLayoutId()
  {
    GMTrace.i(5102286929920L, 38015);
    int i = R.i.cOm;
    GMTrace.o(5102286929920L, 38015);
    return i;
  }
  
  public final void j(final String paramString, int paramInt, final boolean paramBoolean)
  {
    GMTrace.i(5104300195840L, 38030);
    if (this.kml == null)
    {
      w.e("MicroMsg.CardBaseUI", "showGiftConfirmDialog mCardInfo == null");
      GMTrace.o(5104300195840L, 38030);
      return;
    }
    if (this.kml.aiK() == null)
    {
      w.e("MicroMsg.CardBaseUI", "showGiftConfirmDialog mCardInfo.getCardTpInfo() == null");
      GMTrace.o(5104300195840L, 38030);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramInt == 0) {
      if (!TextUtils.isEmpty(this.kml.aiM().uuc))
      {
        localStringBuilder.append(this.kml.aiM().uuc);
        com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "OperGift", Integer.valueOf(2), Integer.valueOf(this.kml.aiK().knq), this.kml.field_card_tp_id, this.kml.field_card_id, paramString });
      }
    }
    for (;;)
    {
      String str = this.kml.aiK().title + "\n" + this.kml.aiK().koD;
      com.tencent.mm.pluginsdk.ui.applet.d.a(this.vov, localStringBuilder.toString(), this.kml.aiK().knr, str, null, false, getResources().getString(R.l.dwY), new k.a()
      {
        public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(5100810534912L, 38004);
          if (paramAnonymousBoolean)
          {
            CardBaseUI.c(CardBaseUI.this, paramString);
            com.tencent.mm.ui.base.h.bl(CardBaseUI.this, CardBaseUI.this.getResources().getString(R.l.dFt));
            if (paramBoolean)
            {
              paramAnonymousString = CardBaseUI.this;
              String str = paramString;
              Intent localIntent = new Intent();
              localIntent.addFlags(67108864);
              localIntent.putExtra("Chat_User", str);
              com.tencent.mm.plugin.card.a.ifM.e(localIntent, paramAnonymousString);
            }
          }
          GMTrace.o(5100810534912L, 38004);
        }
      });
      GMTrace.o(5104300195840L, 38030);
      return;
      localStringBuilder.append(getString(R.l.eLC));
      break;
      if (paramInt == 1)
      {
        localStringBuilder.append(getString(R.l.dFn, new Object[] { this.kml.aiK().koC }));
        com.tencent.mm.plugin.report.service.g.paX.i(11582, new Object[] { "OperGift", Integer.valueOf(3), Integer.valueOf(this.kml.aiK().knq), this.kml.field_card_tp_id, this.kml.field_card_id, paramString });
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5101750059008L, 38011);
    super.onCreate(paramBundle);
    GMTrace.o(5101750059008L, 38011);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5102421147648L, 38016);
    ap.wT().b(560, this);
    ap.wT().b(692, this);
    if (this.kmk != null) {
      this.kmk.onDestroy();
    }
    super.onDestroy();
    GMTrace.o(5102421147648L, 38016);
  }
  
  public void onPause()
  {
    GMTrace.i(5102018494464L, 38013);
    super.onPause();
    this.kmj = false;
    ap.wT().b(652, this);
    GMTrace.o(5102018494464L, 38013);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(5105373937664L, 38038);
    w.i("MicroMsg.CardBaseUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(5105373937664L, 38038);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        aim();
        GMTrace.o(5105373937664L, 38038);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.etS), getString(R.l.etW), getString(R.l.ejv), getString(R.l.cancel), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(5114232307712L, 38104);
          CardBaseUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(5114232307712L, 38104);
        }
      }, null);
    }
  }
  
  public void onResume()
  {
    GMTrace.i(5101884276736L, 38012);
    super.onResume();
    this.kmj = true;
    ap.wT().a(652, this);
    GMTrace.o(5101884276736L, 38012);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/base/CardBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */