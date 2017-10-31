package com.tencent.mm.plugin.masssend.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.g.a;
import com.tencent.mm.ac.g.b;
import com.tencent.mm.bt.g;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.plugin.masssend.a.b;
import com.tencent.mm.plugin.masssend.a.h;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ae;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.MMPullDownView.g;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.x.ap;
import junit.framework.Assert;

public class MassSendHistoryUI
  extends MMActivity
  implements g.a, g.b, SensorController.a
{
  private static SensorController kha;
  private com.tencent.mm.e.a.a fnO;
  private boolean khd;
  private ListView nHe;
  private c nHf;
  private Button nHg;
  private Button nHh;
  private MMPullDownView nHi;
  private boolean nHj;
  private LinearLayout nHk;
  private o.d nHl;
  private View ner;
  
  public MassSendHistoryUI()
  {
    GMTrace.i(11245432340480L, 83785);
    this.khd = true;
    this.nHj = false;
    this.nHl = new o.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(11241003155456L, 83752);
        Object localObject1;
        Object localObject2;
        if (paramAnonymousMenuItem.getItemId() == 1)
        {
          localObject1 = (com.tencent.mm.plugin.masssend.a.a)MassSendHistoryUI.b(MassSendHistoryUI.this).getItem(paramAnonymousMenuItem.getGroupId());
          if (localObject1 == null)
          {
            GMTrace.o(11241003155456L, 83752);
            return;
          }
          if (((com.tencent.mm.plugin.masssend.a.a)localObject1).aMq().equals(MassSendHistoryUI.b(MassSendHistoryUI.this).nGT)) {
            MassSendHistoryUI.h(MassSendHistoryUI.this);
          }
          paramAnonymousMenuItem = h.aMy();
          localObject1 = ((com.tencent.mm.plugin.masssend.a.a)localObject1).aMq();
          localObject2 = paramAnonymousMenuItem.hhi.a("select * from massendinfo ORDER BY createtime DESC  limit 2", null, 0);
          if (localObject2 != null)
          {
            if (((Cursor)localObject2).getCount() != 0) {
              break label157;
            }
            ((Cursor)localObject2).close();
          }
        }
        for (;;)
        {
          if (paramAnonymousMenuItem.hhi.delete("massendinfo", "clientid= ?", new String[] { localObject1 }) > 0) {
            paramAnonymousMenuItem.doNotify();
          }
          GMTrace.o(11241003155456L, 83752);
          return;
          label157:
          com.tencent.mm.plugin.masssend.a.a locala;
          if (((Cursor)localObject2).getCount() == 1)
          {
            ((Cursor)localObject2).moveToFirst();
            locala = new com.tencent.mm.plugin.masssend.a.a();
            locala.b((Cursor)localObject2);
            ((Cursor)localObject2).close();
            localObject2 = new ae();
            ((ae)localObject2).setUsername("masssendapp");
            ((ae)localObject2).setContent(ab.getContext().getResources().getString(R.l.dNd));
            ((ae)localObject2).w(locala.hUw);
            ((ae)localObject2).dC(0);
            ((ae)localObject2).dz(0);
            ap.AS();
            com.tencent.mm.x.c.yQ().a((ae)localObject2, "masssendapp");
          }
          else
          {
            ((Cursor)localObject2).moveToPosition(1);
            locala = new com.tencent.mm.plugin.masssend.a.a();
            locala.b((Cursor)localObject2);
            ((Cursor)localObject2).close();
            localObject2 = new ae();
            ((ae)localObject2).setUsername("masssendapp");
            ((ae)localObject2).setContent(b.a(locala));
            ((ae)localObject2).w(locala.hUw);
            ((ae)localObject2).dC(0);
            ((ae)localObject2).dz(0);
            ap.AS();
            com.tencent.mm.x.c.yQ().a((ae)localObject2, "masssendapp");
          }
        }
      }
    };
    GMTrace.o(11245432340480L, 83785);
  }
  
  private boolean Bk(String paramString)
  {
    GMTrace.i(11246908735488L, 83796);
    if (paramString != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      kha.a(this);
      paramString = h.aMy().Bf(paramString);
      ap.AS();
      if ((com.tencent.mm.x.c.isSDCardAvailable()) || (bg.mZ(paramString.aMr()))) {
        break;
      }
      t.fn(this);
      GMTrace.o(11246908735488L, 83796);
      return false;
    }
    if (this.fnO == null) {
      this.fnO = new com.tencent.mm.e.a.a(this);
    }
    this.fnO.ax(false);
    if (this.fnO.h(paramString.aMr(), this.khd))
    {
      ap.AT().e(this.khd, false);
      this.fnO.fpN = this;
      this.fnO.fpM = this;
      GMTrace.o(11246908735488L, 83796);
      return true;
    }
    Toast.makeText(this, getString(R.l.dJz), 0).show();
    GMTrace.o(11246908735488L, 83796);
    return false;
  }
  
  private void ahm()
  {
    GMTrace.i(11247042953216L, 83797);
    kha.bNK();
    this.fnO.ax(false);
    this.nHf.Bi("");
    releaseWakeLock();
    GMTrace.o(11247042953216L, 83797);
  }
  
  protected final void MH()
  {
    GMTrace.i(11246237646848L, 83791);
    this.nHj = getIntent().getBooleanExtra("finish_direct", false);
    w.d("MicroMsg.MassSendHistoryUI", "isFromSearch  " + this.nHj);
    this.nHk = ((LinearLayout)findViewById(R.h.cbA));
    this.nHe = ((ListView)findViewById(R.h.cbk));
    this.nHe.setTranscriptMode(0);
    this.nHi = ((MMPullDownView)findViewById(R.h.cbl));
    this.nHi.vHG = new MMPullDownView.g()
    {
      public final boolean aoh()
      {
        int i = 0;
        GMTrace.i(11230399954944L, 83673);
        if (MassSendHistoryUI.b(MassSendHistoryUI.this).alk())
        {
          MassSendHistoryUI.d(MassSendHistoryUI.this).setSelectionFromTop(0, MassSendHistoryUI.c(MassSendHistoryUI.this).vHI);
          GMTrace.o(11230399954944L, 83673);
          return true;
        }
        c localc = MassSendHistoryUI.b(MassSendHistoryUI.this);
        if (localc.alk()) {}
        for (;;)
        {
          w.v("MicroMsg.MassSendHistoryUI", "onLoadData add count:" + i);
          MassSendHistoryUI.b(MassSendHistoryUI.this).a(null, null);
          MassSendHistoryUI.d(MassSendHistoryUI.this).setSelectionFromTop(i, MassSendHistoryUI.c(MassSendHistoryUI.this).vHI);
          GMTrace.o(11230399954944L, 83673);
          return true;
          localc.kye += 10;
          if (localc.kye <= localc.hIP)
          {
            i = 10;
          }
          else
          {
            localc.kye = localc.hIP;
            i = localc.hIP % 10;
          }
        }
      }
    };
    this.nHi.lt(true);
    this.nHi.vHS = new MMPullDownView.c()
    {
      public final boolean aog()
      {
        GMTrace.i(11239526760448L, 83741);
        if ((MassSendHistoryUI.d(MassSendHistoryUI.this).getChildAt(MassSendHistoryUI.d(MassSendHistoryUI.this).getChildCount() - 1).getBottom() <= MassSendHistoryUI.d(MassSendHistoryUI.this).getHeight()) && (MassSendHistoryUI.d(MassSendHistoryUI.this).getLastVisiblePosition() == MassSendHistoryUI.d(MassSendHistoryUI.this).getAdapter().getCount() - 1))
        {
          GMTrace.o(11239526760448L, 83741);
          return true;
        }
        GMTrace.o(11239526760448L, 83741);
        return false;
      }
    };
    this.nHi.vHT = new MMPullDownView.d()
    {
      public final boolean aof()
      {
        GMTrace.i(11242345332736L, 83762);
        View localView = MassSendHistoryUI.d(MassSendHistoryUI.this).getChildAt(MassSendHistoryUI.d(MassSendHistoryUI.this).getFirstVisiblePosition());
        if ((localView != null) && (localView.getTop() == 0))
        {
          GMTrace.o(11242345332736L, 83762);
          return true;
        }
        GMTrace.o(11242345332736L, 83762);
        return false;
      }
    };
    this.nHi.lr(true);
    this.nHf = new c(this);
    this.nHf.voo = new o.a()
    {
      public final void Qx()
      {
        GMTrace.i(11249861525504L, 83818);
        MassSendHistoryUI.c(MassSendHistoryUI.this).lq(MassSendHistoryUI.b(MassSendHistoryUI.this).alk());
        if (MassSendHistoryUI.b(MassSendHistoryUI.this).getCount() == 0)
        {
          MassSendHistoryUI.c(MassSendHistoryUI.this).setVisibility(8);
          MassSendHistoryUI.e(MassSendHistoryUI.this).setVisibility(0);
          MassSendHistoryUI.f(MassSendHistoryUI.this).setVisibility(8);
          GMTrace.o(11249861525504L, 83818);
          return;
        }
        MassSendHistoryUI.c(MassSendHistoryUI.this).setVisibility(0);
        MassSendHistoryUI.e(MassSendHistoryUI.this).setVisibility(8);
        MassSendHistoryUI.f(MassSendHistoryUI.this).setVisibility(0);
        GMTrace.o(11249861525504L, 83818);
      }
      
      public final void Qy()
      {
        GMTrace.i(11249995743232L, 83819);
        GMTrace.o(11249995743232L, 83819);
      }
    };
    this.ner = findViewById(R.h.cbj);
    this.nHe.setAdapter(this.nHf);
    this.nHe.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(11230131519488L, 83671);
        w.v("MicroMsg.MassSendHistoryUI", "onItemClick");
        GMTrace.o(11230131519488L, 83671);
      }
    });
    this.nHe.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(11230936825856L, 83677);
        w.v("MicroMsg.MassSendHistoryUI", "onTouch");
        GMTrace.o(11230936825856L, 83677);
        return false;
      }
    });
    this.nHg = ((Button)findViewById(R.h.cbz));
    this.nHg.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11248922001408L, 83811);
        paramAnonymousView = new Intent(MassSendHistoryUI.this, MassSendSelectContactUI.class);
        MassSendHistoryUI.this.startActivity(paramAnonymousView);
        GMTrace.o(11248922001408L, 83811);
      }
    });
    this.nHh = ((Button)findViewById(R.h.cbB));
    this.nHh.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11232010567680L, 83685);
        paramAnonymousView = new Intent(MassSendHistoryUI.this, MassSendSelectContactUI.class);
        MassSendHistoryUI.this.startActivity(paramAnonymousView);
        GMTrace.o(11232010567680L, 83685);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11234694922240L, 83705);
        if (MassSendHistoryUI.g(MassSendHistoryUI.this)) {
          MassSendHistoryUI.this.finish();
        }
        for (;;)
        {
          GMTrace.o(11234694922240L, 83705);
          return true;
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.addFlags(67108864);
          com.tencent.mm.plugin.masssend.a.ifM.s(paramAnonymousMenuItem, MassSendHistoryUI.this);
          MassSendHistoryUI.this.finish();
        }
      }
    });
    a(0, R.l.dxb, R.k.dkN, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11231205261312L, 83679);
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("Contact_User", "masssendapp");
        com.tencent.mm.plugin.masssend.a.ifM.d(paramAnonymousMenuItem, MassSendHistoryUI.this);
        GMTrace.o(11231205261312L, 83679);
        return true;
      }
    });
    new l(this).a(this.nHe, this, this.nHl);
    GMTrace.o(11246237646848L, 83791);
  }
  
  public final void dp(boolean paramBoolean)
  {
    GMTrace.i(11246774517760L, 83795);
    if (this.fnO == null)
    {
      GMTrace.o(11246774517760L, 83795);
      return;
    }
    if (!this.fnO.isPlaying())
    {
      this.fnO.ay(true);
      ap.AT().e(true, false);
      this.khd = true;
      GMTrace.o(11246774517760L, 83795);
      return;
    }
    this.fnO.ay(paramBoolean);
    ap.AT().e(paramBoolean, false);
    this.khd = paramBoolean;
    if (!paramBoolean)
    {
      if (Bk(this.nHf.nGT))
      {
        this.nHf.Bi(this.nHf.nGT);
        GMTrace.o(11246774517760L, 83795);
        return;
      }
      this.nHf.Bi("");
    }
    GMTrace.o(11246774517760L, 83795);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11246103429120L, 83790);
    int i = R.i.cZV;
    GMTrace.o(11246103429120L, 83790);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11245566558208L, 83786);
    super.onCreate(paramBundle);
    oC(R.l.eoE);
    if (kha == null) {
      kha = new SensorController(getApplicationContext());
    }
    MH();
    this.fnO = new com.tencent.mm.e.a.a(this);
    this.fnO.fpN = this;
    this.fnO.fpM = this;
    this.nHf.nGU = new c.e()
    {
      public final String Bj(String paramAnonymousString)
      {
        GMTrace.i(11238318800896L, 83732);
        ap.AS();
        if (!com.tencent.mm.x.c.isSDCardAvailable())
        {
          t.fn(MassSendHistoryUI.this);
          GMTrace.o(11238318800896L, 83732);
          return "";
        }
        paramAnonymousString = bg.mY(paramAnonymousString);
        if ((MassSendHistoryUI.a(MassSendHistoryUI.this).isPlaying()) && (paramAnonymousString.equals(MassSendHistoryUI.b(MassSendHistoryUI.this).nGT)))
        {
          MassSendHistoryUI.aMH();
          MassSendHistoryUI.this.releaseWakeLock();
          MassSendHistoryUI.a(MassSendHistoryUI.this).ax(false);
          GMTrace.o(11238318800896L, 83732);
          return "";
        }
        if (MassSendHistoryUI.a(MassSendHistoryUI.this, paramAnonymousString))
        {
          GMTrace.o(11238318800896L, 83732);
          return paramAnonymousString;
        }
        GMTrace.o(11238318800896L, 83732);
        return "";
      }
    };
    if (this.vov != null) {
      this.vov.Y(3, false);
    }
    GMTrace.o(11245566558208L, 83786);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(11246506082304L, 83793);
    w.v("MicroMsg.MassSendHistoryUI", "onCreateContextMenu");
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramContextMenuInfo = ((com.tencent.mm.plugin.masssend.a.a)this.nHf.getItem(paramView.position)).aMt().split(";");
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramContextMenuInfo.length;
    int i = 0;
    while (i < j)
    {
      Object localObject = paramContextMenuInfo[i];
      ap.AS();
      localObject = com.tencent.mm.x.c.yL().SL((String)localObject);
      if (localObject != null) {
        localStringBuilder.append(((x)localObject).vq() + ";");
      }
      i += 1;
    }
    paramContextMenu.setHeaderTitle(localStringBuilder.toString());
    paramContextMenu.add(paramView.position, 1, 0, getString(R.l.dIK));
    GMTrace.o(11246506082304L, 83793);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11245969211392L, 83789);
    this.nHf.aIb();
    super.onDestroy();
    GMTrace.o(11245969211392L, 83789);
  }
  
  public final void onError()
  {
    GMTrace.i(11247311388672L, 83799);
    ahm();
    GMTrace.o(11247311388672L, 83799);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(11246371864576L, 83792);
    if (paramInt == 4)
    {
      if (this.nHj) {
        finish();
      }
      for (;;)
      {
        GMTrace.o(11246371864576L, 83792);
        return true;
        paramKeyEvent = new Intent();
        paramKeyEvent.addFlags(67108864);
        com.tencent.mm.plugin.masssend.a.ifM.s(paramKeyEvent, this);
        finish();
      }
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(11246371864576L, 83792);
    return bool;
  }
  
  protected void onPause()
  {
    GMTrace.i(11245834993664L, 83788);
    super.onPause();
    ap.AT().sw();
    h.aMy().j(this.nHf);
    kha.bNK();
    GMTrace.o(11245834993664L, 83788);
  }
  
  protected void onResume()
  {
    GMTrace.i(11245700775936L, 83787);
    super.onResume();
    h.aMy().c(this.nHf);
    this.nHf.a(null, null);
    this.nHe.setSelection(this.nHf.getCount() - 1);
    GMTrace.o(11245700775936L, 83787);
  }
  
  public final void qq()
  {
    GMTrace.i(11247177170944L, 83798);
    ahm();
    GMTrace.o(11247177170944L, 83798);
  }
  
  protected final void releaseWakeLock()
  {
    GMTrace.i(11246640300032L, 83794);
    this.nHe.setKeepScreenOn(false);
    GMTrace.o(11246640300032L, 83794);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */