package com.tencent.mm.plugin.favorite.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.r;
import com.tencent.mm.plugin.favorite.ui.a.b;
import com.tencent.mm.plugin.favorite.ui.c.a.b;
import com.tencent.mm.plugin.favorite.ui.c.e;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.pluginsdk.ui.applet.d.a;
import com.tencent.mm.pluginsdk.ui.applet.k.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.o;
import java.util.HashSet;
import java.util.Set;

public class FavSelectUI
  extends FavBaseUI
{
  private Set<Integer> lSA;
  private com.tencent.mm.plugin.favorite.b.q lSB;
  private String lSy;
  private b lSz;
  private String toUser;
  
  public FavSelectUI()
  {
    GMTrace.i(6465133740032L, 48169);
    this.lSz = null;
    this.lSA = new HashSet();
    this.lSB = new com.tencent.mm.plugin.favorite.b.q();
    GMTrace.o(6465133740032L, 48169);
  }
  
  public final com.tencent.mm.plugin.favorite.ui.a.a axA()
  {
    GMTrace.i(6465536393216L, 48172);
    if (this.lSz == null) {
      this.lSz = new b(this.lNK, false);
    }
    b localb = this.lSz;
    GMTrace.o(6465536393216L, 48172);
    return localb;
  }
  
  protected final void axB()
  {
    GMTrace.i(6465670610944L, 48173);
    GMTrace.o(6465670610944L, 48173);
  }
  
  protected final boolean axC()
  {
    GMTrace.i(6465804828672L, 48174);
    if (com.tencent.mm.plugin.favorite.h.awD().getCount() > 0)
    {
      GMTrace.o(6465804828672L, 48174);
      return true;
    }
    GMTrace.o(6465804828672L, 48174);
    return false;
  }
  
  protected final void axD()
  {
    GMTrace.i(6465939046400L, 48175);
    this.lQV.setCompoundDrawablesWithIntrinsicBounds(0, R.g.aYJ, 0, 0);
    this.lQV.setCompoundDrawablePadding(com.tencent.mm.bq.a.fromDPToPix(this.vov.voR, 10));
    this.lQV.setText(R.l.dWu);
    GMTrace.o(6465939046400L, 48175);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6466073264128L, 48176);
    if ((paramInt1 == 0) && (-1 == paramInt2))
    {
      finish();
      GMTrace.o(6466073264128L, 48176);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6466073264128L, 48176);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6465267957760L, 48170);
    super.onCreate(paramBundle);
    this.toUser = getIntent().getStringExtra("key_to_user");
    this.lSy = getIntent().getStringExtra("key_fav_item_id");
    if (this.lSy != null)
    {
      paramBundle = this.lSy.split(",");
      int j = paramBundle.length;
      int i = 0;
      while (i < j)
      {
        int k = bg.getInt(paramBundle[i], Integer.MAX_VALUE);
        if (Integer.MAX_VALUE != k) {
          this.lSA.add(Integer.valueOf(k));
        }
        i += 1;
      }
    }
    this.lSA.remove(Integer.valueOf(3));
    this.lSz.e(this.lSA);
    this.lSB.lOG = false;
    this.lSz.a(this.lSB);
    this.lQX.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6416412704768L, 47806);
        FavSelectUI.a(FavSelectUI.this).axT();
        FavSelectUI.this.axE();
        GMTrace.o(6416412704768L, 47806);
      }
    });
    a(0, R.k.dkM, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6415875833856L, 47802);
        paramAnonymousMenuItem = new Intent(FavSelectUI.this.vov.voR, FavSearchUI.class);
        paramAnonymousMenuItem.putExtra("key_to_user", FavSelectUI.b(FavSelectUI.this));
        paramAnonymousMenuItem.putExtra("key_fav_item_id", FavSelectUI.c(FavSelectUI.this));
        paramAnonymousMenuItem.putExtra("key_search_type", 1);
        paramAnonymousMenuItem.putExtra("key_enter_fav_search_from", 1);
        FavSelectUI.this.startActivityForResult(paramAnonymousMenuItem, 0);
        GMTrace.o(6415875833856L, 47802);
        return true;
      }
    });
    oC(R.l.dXP);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6337492680704L, 47218);
        FavSelectUI.this.finish();
        GMTrace.o(6337492680704L, 47218);
        return true;
      }
    });
    GMTrace.o(6465267957760L, 48170);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6466207481856L, 48177);
    super.onDestroy();
    if (this.lSz != null) {
      this.lSz.finish();
    }
    GMTrace.o(6466207481856L, 48177);
  }
  
  public void onItemClick(final AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(6465402175488L, 48171);
    paramAdapterView = (a.b)paramView.getTag();
    if (paramAdapterView == null)
    {
      w.w("MicroMsg.FavSelectUI", "on item click, holder is null");
      GMTrace.o(6465402175488L, 48171);
      return;
    }
    if (paramAdapterView.lPM == null)
    {
      w.w("MicroMsg.FavSelectUI", "on item click, info is null");
      GMTrace.o(6465402175488L, 48171);
      return;
    }
    paramView = paramAdapterView.lPM;
    g.paX.i(10651, new Object[] { Integer.valueOf(paramView.field_type), Integer.valueOf(1), Integer.valueOf(1) });
    if (paramView.field_type == 3)
    {
      com.tencent.mm.ui.snackbar.a.e(this, getString(R.l.drR));
      GMTrace.o(6465402175488L, 48171);
      return;
    }
    if ((paramView.field_type == 8) && (o.fn(this.toUser)))
    {
      com.tencent.mm.ui.snackbar.a.e(this, getString(R.l.drP));
      GMTrace.o(6465402175488L, 48171);
      return;
    }
    paramView = new d.a(this.vov.voR);
    paramView.bx(this.toUser);
    e.a(paramView, this.vov.voR, paramAdapterView.lPM);
    e.b(paramView, this.vov.voR, paramAdapterView.lPM);
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(6362994049024L, 47408);
        FavSelectUI.this.aKl();
        if (paramAnonymousBoolean)
        {
          final com.tencent.mm.ui.base.q localq = com.tencent.mm.ui.base.h.a(FavSelectUI.this.vov.voR, FavSelectUI.this.getString(R.l.dWT), false, null);
          r.a(FavSelectUI.this.vov.voR, FavSelectUI.b(FavSelectUI.this), paramAnonymousString, paramAdapterView.lPM, new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6334271455232L, 47194);
              if (localq != null) {
                localq.dismiss();
              }
              com.tencent.mm.ui.snackbar.a.e(FavSelectUI.this, FavSelectUI.this.getString(R.l.dZv));
              af.i(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(6367020580864L, 47438);
                  FavSelectUI.this.finish();
                  GMTrace.o(6367020580864L, 47438);
                }
              }, 1800L);
              GMTrace.o(6334271455232L, 47194);
            }
          });
        }
        GMTrace.o(6362994049024L, 47408);
      }
    }.show();
    GMTrace.o(6465402175488L, 48171);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/FavSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */