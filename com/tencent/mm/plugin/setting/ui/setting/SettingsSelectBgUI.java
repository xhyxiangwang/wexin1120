package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.av.a;
import com.tencent.mm.av.j;
import com.tencent.mm.bt.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.o;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SettingsSelectBgUI
  extends MMActivity
  implements e
{
  private boolean prZ;
  private a pth;
  private GridView pti;
  private j ptj;
  private List<j> ptk;
  private aj ptl;
  private String username;
  
  public SettingsSelectBgUI()
  {
    GMTrace.i(4703526060032L, 35044);
    this.ptk = new ArrayList();
    this.ptl = new aj(new aj.a()
    {
      public final boolean pO()
      {
        GMTrace.i(4708626333696L, 35082);
        if (SettingsSelectBgUI.this.findViewById(R.h.cwo).getWidth() <= 0)
        {
          GMTrace.o(4708626333696L, 35082);
          return true;
        }
        SettingsSelectBgUI.a(SettingsSelectBgUI.this);
        GMTrace.o(4708626333696L, 35082);
        return false;
      }
    }, true);
    GMTrace.o(4703526060032L, 35044);
  }
  
  private void bk(List<j> paramList)
  {
    GMTrace.i(4704331366400L, 35050);
    if (paramList.size() > 0)
    {
      this.ptj = ((j)paramList.remove(0));
      ap.wT().a(this.ptj, 0);
      GMTrace.o(4704331366400L, 35050);
      return;
    }
    this.ptj = null;
    GMTrace.o(4704331366400L, 35050);
  }
  
  protected final void MH()
  {
    GMTrace.i(4704062930944L, 35048);
    oC(R.l.eGR);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4632793317376L, 34517);
        SettingsSelectBgUI.this.finish();
        GMTrace.o(4632793317376L, 34517);
        return true;
      }
    });
    this.prZ = getIntent().getBooleanExtra("isApplyToAll", true);
    this.username = getIntent().getStringExtra("username");
    this.ptl.w(20L, 20L);
    GMTrace.o(4704062930944L, 35048);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(4704197148672L, 35049);
    if ((!(paramk instanceof com.tencent.mm.ac.m)) || (((com.tencent.mm.ac.m)paramk).DM() != 1))
    {
      w.d("MicroMsg.SettingsSelectBgUI", "another scene");
      GMTrace.o(4704197148672L, 35049);
      return;
    }
    int i = paramk.getType();
    if ((i != 159) && (i != 160))
    {
      GMTrace.o(4704197148672L, 35049);
      return;
    }
    if (i == 160) {
      bk(this.ptk);
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      GMTrace.o(4704197148672L, 35049);
      return;
    }
    GMTrace.o(4704197148672L, 35049);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4703660277760L, 35045);
    int i = R.i.dgd;
    GMTrace.o(4703660277760L, 35045);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4703794495488L, 35046);
    super.onCreate(paramBundle);
    MH();
    ap.wT().a(159, this);
    ap.wT().a(160, this);
    ap.AS();
    if (c.isSDCardAvailable())
    {
      paramBundle = new com.tencent.mm.av.k(1);
      ap.wT().a(paramBundle, 0);
    }
    GMTrace.o(4703794495488L, 35046);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4703928713216L, 35047);
    super.onDestroy();
    if (this.ptj != null)
    {
      ap.wT().c(this.ptj);
      com.tencent.mm.av.t.Kg().aU(this.ptj.hIq, 1);
    }
    List localList = this.ptk;
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      com.tencent.mm.av.t.Kg().aU(localj.hIq, 1);
    }
    localList.clear();
    ap.wT().b(159, this);
    ap.wT().b(160, this);
    this.pth.aIb();
    com.tencent.mm.av.t.Kg().j(this.pth);
    GMTrace.o(4703928713216L, 35047);
  }
  
  final class a
    extends o<com.tencent.mm.av.m>
  {
    private Context context;
    private int kBW;
    
    public a(Context paramContext, int paramInt)
    {
      super(new com.tencent.mm.av.m());
      GMTrace.i(4680440610816L, 34872);
      this.context = paramContext;
      this.kBW = paramInt;
      GMTrace.o(4680440610816L, 34872);
    }
    
    public final void QA()
    {
      GMTrace.i(4680843264000L, 34875);
      com.tencent.mm.av.n localn = com.tencent.mm.av.t.Kg();
      String str = "select packageinfo2.localId,packageinfo2.id,packageinfo2.version,packageinfo2.name,packageinfo2.size,packageinfo2.packname,packageinfo2.status,packageinfo2.type,packageinfo2.reserved1,packageinfo2.reserved2,packageinfo2.reserved3,packageinfo2.reserved4 from packageinfo2   where packageinfo2.type=1";
      setCursor(localn.hhi.a(str, null, 0));
      super.notifyDataSetChanged();
      GMTrace.o(4680843264000L, 34875);
    }
    
    protected final void QB()
    {
      GMTrace.i(4680709046272L, 34874);
      QA();
      GMTrace.o(4680709046272L, 34874);
    }
    
    public final int getCount()
    {
      GMTrace.i(4680574828544L, 34873);
      int i = getCursor().getCount();
      GMTrace.o(4680574828544L, 34873);
      return i + 2;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(4680977481728L, 34876);
      int i;
      a locala;
      if (paramView == null)
      {
        paramView = View.inflate(this.context, R.i.dge, null);
        paramView.setLayoutParams(new AbsListView.LayoutParams(this.kBW, this.kBW));
        paramViewGroup = new b();
        paramViewGroup.puJ = ((LinearLayout)paramView.findViewById(R.h.cus));
        paramViewGroup.puK = ((LinearLayout)paramView.findViewById(R.h.cur));
        paramViewGroup.puL = ((LinearLayout)paramView.findViewById(R.h.cuu));
        paramViewGroup.puM = ((LinearLayout)paramView.findViewById(R.h.cuv));
        paramViewGroup.puN = ((LinearLayout)paramView.findViewById(R.h.cuq));
        paramView.setTag(paramViewGroup);
        ap.AS();
        i = bg.a((Integer)c.xi().get(12311, null), -2);
        locala = com.tencent.mm.av.t.Kh().ks(SettingsSelectBgUI.f(SettingsSelectBgUI.this));
        if (paramInt != 0) {
          break label294;
        }
        if (((!SettingsSelectBgUI.c(SettingsSelectBgUI.this)) || (i != -2)) && ((SettingsSelectBgUI.c(SettingsSelectBgUI.this)) || (i != -2) || (locala != null)) && ((locala == null) || (locala.hHX != -2))) {
          break label284;
        }
        paramViewGroup.Fv("using");
      }
      for (;;)
      {
        paramViewGroup = d.a(BitmapFactory.decodeResource(this.context.getResources(), R.g.aXO), true, 10.0F);
        ((ImageView)paramView.findViewById(R.h.cut)).setImageBitmap(paramViewGroup);
        GMTrace.o(4680977481728L, 34876);
        return paramView;
        paramViewGroup = (b)paramView.getTag();
        break;
        label284:
        paramViewGroup.Fv("downloaded");
      }
      label294:
      if (paramInt == 1)
      {
        if (((SettingsSelectBgUI.c(SettingsSelectBgUI.this)) && (i == 0)) || ((!SettingsSelectBgUI.c(SettingsSelectBgUI.this)) && (i == 0) && (locala == null)) || ((locala != null) && (locala.hHX == 0))) {
          paramViewGroup.Fv("using");
        }
        for (;;)
        {
          paramViewGroup = d.a(BitmapFactory.decodeResource(this.context.getResources(), R.g.aXN), true, 10.0F);
          ((ImageView)paramView.findViewById(R.h.cut)).setImageBitmap(paramViewGroup);
          GMTrace.o(4680977481728L, 34876);
          return paramView;
          paramViewGroup.Fv("downloaded");
        }
      }
      com.tencent.mm.av.m localm = (com.tencent.mm.av.m)getItem(paramInt - 2);
      com.tencent.mm.av.t.Kg();
      ap.AS();
      if (!c.isSDCardAvailable()) {}
      for (Bitmap localBitmap = BitmapFactory.decodeResource(SettingsSelectBgUI.this.getResources(), R.g.bbr); localBitmap == null; localBitmap = d.QK(com.tencent.mm.av.n.Kc() + com.tencent.mm.av.n.aR(localm.id, localm.fBH)))
      {
        GMTrace.o(4680977481728L, 34876);
        return paramView;
      }
      localBitmap = d.a(localBitmap, true, 10.0F);
      ((ImageView)paramView.findViewById(R.h.cut)).setImageBitmap(localBitmap);
      switch (localm.status)
      {
      }
      for (;;)
      {
        GMTrace.o(4680977481728L, 34876);
        return paramView;
        paramViewGroup.Fv("downloading");
        continue;
        if ((!SettingsSelectBgUI.c(SettingsSelectBgUI.this)) && (locala != null) && (locala.hHX == localm.id))
        {
          paramViewGroup.Fv("using");
        }
        else
        {
          paramViewGroup.Fv("downloaded");
          continue;
          paramViewGroup.Fv("undownloaded");
          continue;
          if ((!SettingsSelectBgUI.c(SettingsSelectBgUI.this)) && (locala != null) && (locala.hHX != localm.id))
          {
            paramViewGroup.Fv("downloaded");
          }
          else
          {
            paramViewGroup.Fv("using");
            continue;
            paramViewGroup.Fv("canceling");
          }
        }
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsSelectBgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */