package com.tencent.mm.plugin.masssend.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.HeaderViewListAdapter;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.c;
import com.tencent.mm.ui.contact.c.a;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.contact.q;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.ui.tools.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MassSendSelectContactUI
  extends MMBaseSelectContactUI
{
  private HashSet<String> iiR;
  private List<String> jLn;
  private boolean nHA;
  private MultiSelectContactView nHB;
  private Button nHz;
  
  public MassSendSelectContactUI()
  {
    GMTrace.i(11242479550464L, 83763);
    GMTrace.o(11242479550464L, 83763);
  }
  
  private void qe(int paramInt)
  {
    GMTrace.i(11242882203648L, 83766);
    if (paramInt > 0)
    {
      aE(1, getString(R.l.cbz) + "(" + this.iiR.size() + ")");
      W(1, true);
      GMTrace.o(11242882203648L, 83766);
      return;
    }
    aE(1, getString(R.l.cbz));
    W(1, false);
    GMTrace.o(11242882203648L, 83766);
  }
  
  protected final void Bo(String paramString)
  {
    GMTrace.i(11243016421376L, 83767);
    g.paX.i(11225, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
    Intent localIntent = new Intent();
    localIntent.putExtra("label", paramString);
    localIntent.putExtra("always_select_contact", bg.c(new ArrayList(this.iiR), ","));
    localIntent.putExtra("list_attr", s.p(new int[] { 16384, 64 }));
    d.a(this, ".ui.contact.SelectLabelContactUI", localIntent, 0);
    GMTrace.o(11243016421376L, 83767);
  }
  
  protected final void PU()
  {
    GMTrace.i(11242613768192L, 83764);
    super.PU();
    this.jLn = new ArrayList();
    this.jLn.addAll(s.cdJ());
    this.jLn.addAll(s.cdK());
    this.jLn.add(com.tencent.mm.x.m.zF());
    this.iiR = new HashSet();
    GMTrace.o(11242613768192L, 83764);
  }
  
  protected final boolean PV()
  {
    GMTrace.i(11243553292288L, 83771);
    GMTrace.o(11243553292288L, 83771);
    return false;
  }
  
  protected final boolean PW()
  {
    GMTrace.i(11243687510016L, 83772);
    GMTrace.o(11243687510016L, 83772);
    return true;
  }
  
  protected final String PX()
  {
    GMTrace.i(11243821727744L, 83773);
    String str = getString(R.l.eoI);
    GMTrace.o(11243821727744L, 83773);
    return str;
  }
  
  protected final o PY()
  {
    GMTrace.i(11243955945472L, 83774);
    Object localObject = new c.a();
    ((c.a)localObject).wtQ = true;
    localObject = new c(this, this.jLn, true, (c.a)localObject);
    GMTrace.o(11243955945472L, 83774);
    return (o)localObject;
  }
  
  protected final com.tencent.mm.ui.contact.m PZ()
  {
    GMTrace.i(11244090163200L, 83775);
    q localq = new q(this, this.jLn, true, this.scene);
    GMTrace.o(11244090163200L, 83775);
    return localq;
  }
  
  public final boolean a(a parama)
  {
    GMTrace.i(11244224380928L, 83776);
    if ((parama.wvS) && (parama.jqN != null))
    {
      boolean bool = this.iiR.contains(parama.jqN.field_username);
      GMTrace.o(11244224380928L, 83776);
      return bool;
    }
    GMTrace.o(11244224380928L, 83776);
    return false;
  }
  
  public final int[] aLT()
  {
    GMTrace.i(11244358598656L, 83777);
    GMTrace.o(11244358598656L, 83777);
    return new int[] { 131072 };
  }
  
  protected final boolean aMW()
  {
    GMTrace.i(11244492816384L, 83778);
    GMTrace.o(11244492816384L, 83778);
    return true;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11243284856832L, 83769);
    int i = R.i.dab;
    GMTrace.o(11243284856832L, 83769);
    return i;
  }
  
  public final void hr(int paramInt)
  {
    GMTrace.i(11243419074560L, 83770);
    n localn = cdz();
    Object localObject = localn.CU(paramInt - this.oIu.getHeaderViewsCount());
    if (localObject == null)
    {
      GMTrace.o(11243419074560L, 83770);
      return;
    }
    if (((a)localObject).jqN == null)
    {
      GMTrace.o(11243419074560L, 83770);
      return;
    }
    w.i("MicroMsg.MassSendSelectContactUI", "ClickUser=%s", new Object[] { ((a)localObject).jqN.field_username });
    localObject = ((a)localObject).jqN.field_username;
    cdF();
    if (this.iiR.contains(localObject))
    {
      this.iiR.remove(localObject);
      this.nHB.Og((String)localObject);
    }
    for (;;)
    {
      qe(this.iiR.size());
      localn.notifyDataSetChanged();
      cdF();
      cdG();
      GMTrace.o(11243419074560L, 83770);
      return;
      this.iiR.add(localObject);
      this.nHB.Og((String)localObject);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    int i = 0;
    GMTrace.i(11243150639104L, 83768);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.MassSendSelectContactUI", "requestCode=%d | resultCode=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      GMTrace.o(11243150639104L, 83768);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(11243150639104L, 83768);
      return;
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      if (bg.mZ(paramIntent))
      {
        w.i("MicroMsg.MassSendSelectContactUI", "GET_LABEL_USERS return usernames is null or empty");
        GMTrace.o(11243150639104L, 83768);
        return;
      }
      w.i("MicroMsg.MassSendSelectContactUI", "GET_LABEL_USERS select username=%s", new Object[] { paramIntent });
      paramIntent = paramIntent.split(",");
      paramInt2 = paramIntent.length;
      paramInt1 = i;
      while (paramInt1 < paramInt2)
      {
        Object localObject = paramIntent[paramInt1];
        if (this.iiR.add(localObject)) {
          this.nHB.Og((String)localObject);
        }
        paramInt1 += 1;
      }
      qe(this.iiR.size());
      cdz().notifyDataSetChanged();
      if (this.kGl != null)
      {
        this.kGl.clearFocus();
        this.kGl.cfs();
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11242747985920L, 83765);
    super.onCreate(paramBundle);
    w.i("MicroMsg.MassSendSelectContactUI", "create!");
    this.nHB = this.nHB;
    if (this.nHB == null)
    {
      finish();
      GMTrace.o(11242747985920L, 83765);
      return;
    }
    this.nHB.setBackgroundDrawable(null);
    a(1, getString(R.l.cbz), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11236976623616L, 83722);
        w.i("MicroMsg.MassSendSelectContactUI", "Click Next Btn");
        paramAnonymousMenuItem = bg.f((String[])MassSendSelectContactUI.a(MassSendSelectContactUI.this).toArray(new String[0]));
        if (paramAnonymousMenuItem == null)
        {
          w.e("MicroMsg.MassSendSelectContactUI", "no choosed anyone");
          GMTrace.o(11236976623616L, 83722);
          return false;
        }
        paramAnonymousMenuItem.remove(com.tencent.mm.x.m.zF());
        paramAnonymousMenuItem = bg.c(paramAnonymousMenuItem, ";");
        Intent localIntent = new Intent(MassSendSelectContactUI.this, MassSendMsgUI.class);
        localIntent.putExtra("mass_send_contact_list", paramAnonymousMenuItem);
        MassSendSelectContactUI.this.startActivity(localIntent);
        GMTrace.o(11236976623616L, 83722);
        return true;
      }
    }, p.b.vpB);
    this.nHz = ((Button)findViewById(R.h.cuo));
    this.nHz.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11219394101248L, 83591);
        w.i("MicroMsg.MassSendSelectContactUI", "Click SelectAll");
        paramAnonymousView = (n)((HeaderViewListAdapter)MassSendSelectContactUI.this.oIu.getAdapter()).getWrappedAdapter();
        if (!MassSendSelectContactUI.b(MassSendSelectContactUI.this))
        {
          MassSendSelectContactUI.c(MassSendSelectContactUI.this).setText(R.l.eoA);
          int j = paramAnonymousView.getCount();
          int i = 0;
          while (i < j)
          {
            localObject = paramAnonymousView.CU(i);
            if ((localObject != null) && (((a)localObject).jqN != null) && (!MassSendSelectContactUI.a(MassSendSelectContactUI.this).contains(((a)localObject).jqN.field_username)))
            {
              MassSendSelectContactUI.a(MassSendSelectContactUI.this).add(((a)localObject).jqN.field_username);
              MassSendSelectContactUI.d(MassSendSelectContactUI.this).Og(((a)localObject).jqN.field_username);
            }
            i += 1;
          }
        }
        MassSendSelectContactUI.c(MassSendSelectContactUI.this).setText(R.l.eoH);
        Object localObject = MassSendSelectContactUI.a(MassSendSelectContactUI.this).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          MassSendSelectContactUI.d(MassSendSelectContactUI.this).Og(str);
        }
        MassSendSelectContactUI.a(MassSendSelectContactUI.this).clear();
        localObject = MassSendSelectContactUI.this;
        if (!MassSendSelectContactUI.b(MassSendSelectContactUI.this)) {}
        for (boolean bool = true;; bool = false)
        {
          MassSendSelectContactUI.a((MassSendSelectContactUI)localObject, bool);
          MassSendSelectContactUI.a(MassSendSelectContactUI.this, MassSendSelectContactUI.a(MassSendSelectContactUI.this).size());
          paramAnonymousView.notifyDataSetChanged();
          GMTrace.o(11219394101248L, 83591);
          return;
        }
      }
    });
    this.nHB.sZn = new MultiSelectContactView.a()
    {
      public final void nj(String paramAnonymousString)
      {
        GMTrace.i(11231742132224L, 83683);
        if (paramAnonymousString != null)
        {
          MassSendSelectContactUI.a(MassSendSelectContactUI.this).remove(paramAnonymousString);
          MassSendSelectContactUI.a(MassSendSelectContactUI.this, MassSendSelectContactUI.a(MassSendSelectContactUI.this).size());
        }
        GMTrace.o(11231742132224L, 83683);
      }
    };
    qe(this.iiR.size());
    GMTrace.o(11242747985920L, 83765);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/masssend/ui/MassSendSelectContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */