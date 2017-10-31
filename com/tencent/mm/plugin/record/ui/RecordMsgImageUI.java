package com.tencent.mm.plugin.record.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.by;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.g.a.me;
import com.tencent.mm.g.a.me.a;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.plugin.record.a.g;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.a.i.a;
import com.tencent.mm.plugin.record.a.j;
import com.tencent.mm.plugin.record.a.s;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.c;
import com.tencent.mm.ui.tools.MMGestureGallery.f;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.x.ap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class RecordMsgImageUI
  extends MMActivity
  implements i.a
{
  private long fxK;
  private l jeN;
  private List<sp> kjM;
  private MMGestureGallery kvr;
  private Map<String, me> lRE;
  private com.tencent.mm.sdk.b.c lRF;
  private Runnable lRf;
  private o.d lfD;
  private j oVa;
  private a oVh;
  private int oVi;
  private String oVj;
  
  public RecordMsgImageUI()
  {
    GMTrace.i(7532164677632L, 56119);
    this.kjM = new LinkedList();
    this.oVi = 0;
    this.fxK = -1L;
    this.oVj = null;
    this.lRE = new HashMap();
    this.lfD = new o.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(7521964130304L, 56043);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(7521964130304L, 56043);
          return;
          RecordMsgImageUI.f(RecordMsgImageUI.this);
          GMTrace.o(7521964130304L, 56043);
          return;
          paramAnonymousMenuItem = RecordMsgImageUI.this;
          Object localObject = new cd();
          e.a((cd)localObject, paramAnonymousMenuItem.getIntent().getIntExtra("key_favorite_source_type", 1), paramAnonymousMenuItem.aZx());
          ((cd)localObject).fwt.fwA = 10;
          ((cd)localObject).fwt.activity = paramAnonymousMenuItem;
          com.tencent.mm.sdk.b.a.uLm.m((b)localObject);
          GMTrace.o(7521964130304L, 56043);
          return;
          RecordMsgImageUI.g(RecordMsgImageUI.this);
          GMTrace.o(7521964130304L, 56043);
          return;
          paramAnonymousMenuItem = RecordMsgImageUI.h(RecordMsgImageUI.this);
          if (bg.mZ(paramAnonymousMenuItem))
          {
            GMTrace.o(7521964130304L, 56043);
            return;
          }
          paramAnonymousMenuItem = (me)RecordMsgImageUI.i(RecordMsgImageUI.this).get(paramAnonymousMenuItem);
          if (paramAnonymousMenuItem != null)
          {
            localObject = new by();
            ((by)localObject).fwg.activity = RecordMsgImageUI.this;
            ((by)localObject).fwg.fuE = paramAnonymousMenuItem.fKo.result;
            ((by)localObject).fwg.fwh = paramAnonymousMenuItem.fKo.fwh;
            ((by)localObject).fwg.fwj = 8;
            RecordMsgImageUI.a(RecordMsgImageUI.this, (by)localObject);
            ((by)localObject).fwg.fwi = paramAnonymousMenuItem.fKo.fwi;
            if (RecordMsgImageUI.this.getIntent() != null) {
              ((by)localObject).fwg.fwn = RecordMsgImageUI.this.getIntent().getBundleExtra("_stat_obj");
            }
            com.tencent.mm.sdk.b.a.uLm.m((b)localObject);
          }
        }
      }
    };
    this.lRf = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7526527533056L, 56077);
        RecordMsgImageUI.a(RecordMsgImageUI.this).notifyDataSetChanged();
        GMTrace.o(7526527533056L, 56077);
      }
    };
    this.lRF = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7532164677632L, 56119);
  }
  
  public final void a(int paramInt, g paramg)
  {
    GMTrace.i(7533104201728L, 56126);
    Iterator localIterator = this.kjM.iterator();
    while (localIterator.hasNext()) {
      if (((sp)localIterator.next()).lUP.equals(paramg.field_dataId))
      {
        af.u(this.lRf);
        GMTrace.o(7533104201728L, 56126);
        return;
      }
    }
    GMTrace.o(7533104201728L, 56126);
  }
  
  final String aZx()
  {
    GMTrace.i(7532701548544L, 56123);
    int i = this.kvr.getSelectedItemPosition();
    if (-1 == i)
    {
      w.w("MicroMsg.ShowImageUI", "error position");
      GMTrace.o(7532701548544L, 56123);
      return null;
    }
    String str = com.tencent.mm.plugin.record.a.m.c(this.oVh.sV(i), this.fxK);
    w.d("MicroMsg.ShowImageUI", "cur pos %d path %s", new Object[] { Integer.valueOf(i), str });
    GMTrace.o(7532701548544L, 56123);
    return str;
  }
  
  protected final void bH(View paramView)
  {
    GMTrace.i(7532835766272L, 56124);
    ad.d(ad.a(getWindow(), null), this.vov.voD);
    ((ViewGroup)this.vov.voD.getParent()).removeView(this.vov.voD);
    ((ViewGroup)getWindow().getDecorView()).addView(this.vov.voD, 0);
    GMTrace.o(7532835766272L, 56124);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7532298895360L, 56120);
    int i = R.i.dgy;
    GMTrace.o(7532298895360L, 56120);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(7532969984000L, 56125);
    if ((1001 == paramInt1) && (-1 == paramInt2))
    {
      if (paramIntent == null)
      {
        localObject = null;
        if (paramIntent != null) {
          break label64;
        }
      }
      label64:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        if (!bg.mZ((String)localObject)) {
          break label75;
        }
        GMTrace.o(7532969984000L, 56125);
        return;
        localObject = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
      label75:
      final Object localObject = bg.f(((String)localObject).split(","));
      if (bg.bX((List)localObject))
      {
        w.w("MicroMsg.ShowImageUI", "want to send record msg, but toUser is null");
        GMTrace.o(7532969984000L, 56125);
        return;
      }
      final Runnable local10 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7557531828224L, 56308);
          this.lRz.dismiss();
          GMTrace.o(7557531828224L, 56308);
        }
      };
      ap.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7559008223232L, 56319);
          Iterator localIterator = localObject.iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            d.aNb().a(RecordMsgImageUI.this.vov.voR, str, RecordMsgImageUI.j(RecordMsgImageUI.this), 0, "", "");
            d.aNb().cM(paramIntent, str);
          }
          af.u(local10);
          GMTrace.o(7559008223232L, 56319);
        }
        
        public final String toString()
        {
          GMTrace.i(7559142440960L, 56320);
          String str = super.toString() + "|onActivityResult";
          GMTrace.o(7559142440960L, 56320);
          return str;
        }
      });
      GMTrace.o(7532969984000L, 56125);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(7532969984000L, 56125);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7532433113088L, 56121);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(1024, 1024);
    }
    this.oVa = new j();
    this.fxK = getIntent().getLongExtra("message_id", -1L);
    paramBundle = getIntent().getStringExtra("record_data_id");
    Object localObject = com.tencent.mm.plugin.record.a.m.EH(getIntent().getStringExtra("record_xml"));
    if (localObject == null)
    {
      w.w("MicroMsg.ShowImageUI", "get record msg data error, empty");
      finish();
      GMTrace.o(7532433113088L, 56121);
      return;
    }
    localObject = ((com.tencent.mm.protocal.b.a.c)localObject).hdL.iterator();
    while (((Iterator)localObject).hasNext())
    {
      sp localsp = (sp)((Iterator)localObject).next();
      if (localsp.aHe == 2)
      {
        this.kjM.add(localsp);
        if (localsp.lUP.equals(paramBundle)) {
          this.oVi = (this.kjM.size() - 1);
        }
      }
    }
    if (this.kjM.isEmpty())
    {
      w.w("MicroMsg.ShowImageUI", "get image data error, empty");
      finish();
      GMTrace.o(7532433113088L, 56121);
      return;
    }
    this.kvr = ((MMGestureGallery)findViewById(R.h.bKR));
    this.kvr.setVerticalFadingEdgeEnabled(false);
    this.kvr.setHorizontalFadingEdgeEnabled(false);
    this.oVh = new a((byte)0);
    this.oVh.kjM = this.kjM;
    this.oVh.fxK = this.fxK;
    this.oVh.oVa = this.oVa;
    this.kvr.setAdapter(this.oVh);
    this.kvr.setSelection(this.oVi);
    this.kvr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
    {
      public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(7520756170752L, 56034);
        if (com.tencent.mm.plugin.record.a.m.d(RecordMsgImageUI.a(RecordMsgImageUI.this).sV(paramAnonymousInt), RecordMsgImageUI.b(RecordMsgImageUI.this)))
        {
          RecordMsgImageUI.this.rV(String.format("%d/%d", new Object[] { Integer.valueOf(paramAnonymousInt + 1), Integer.valueOf(RecordMsgImageUI.c(RecordMsgImageUI.this).size()) }));
          RecordMsgImageUI.this.kS(true);
          GMTrace.o(7520756170752L, 56034);
          return;
        }
        RecordMsgImageUI.this.kS(false);
        GMTrace.o(7520756170752L, 56034);
      }
      
      public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
      {
        GMTrace.i(7520890388480L, 56035);
        GMTrace.o(7520890388480L, 56035);
      }
    });
    this.kvr.wKI = new MMGestureGallery.f()
    {
      public final void alc()
      {
        GMTrace.i(7562497884160L, 56345);
        RecordMsgImageUI.this.finish();
        GMTrace.o(7562497884160L, 56345);
      }
    };
    this.kvr.wKJ = new MMGestureGallery.c()
    {
      public final void axH()
      {
        GMTrace.i(7556860739584L, 56303);
        RecordMsgImageUI.d(RecordMsgImageUI.this);
        GMTrace.o(7556860739584L, 56303);
      }
    };
    kQ(true);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7528272363520L, 56090);
        RecordMsgImageUI.this.finish();
        GMTrace.o(7528272363520L, 56090);
        return true;
      }
    });
    s.aZh().a(this);
    com.tencent.mm.sdk.b.a.uLm.b(this.lRF);
    GMTrace.o(7532433113088L, 56121);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7532567330816L, 56122);
    s.aZh().b(this);
    this.oVa.destory();
    com.tencent.mm.sdk.b.a.uLm.c(this.lRF);
    super.onDestroy();
    GMTrace.o(7532567330816L, 56122);
  }
  
  private static final class a
    extends BaseAdapter
  {
    long fxK;
    List<sp> kjM;
    j oVa;
    
    private a()
    {
      GMTrace.i(7553639514112L, 56279);
      this.kjM = new LinkedList();
      this.fxK = -1L;
      GMTrace.o(7553639514112L, 56279);
    }
    
    public final int getCount()
    {
      GMTrace.i(7553773731840L, 56280);
      int i = this.kjM.size();
      GMTrace.o(7553773731840L, 56280);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(7554042167296L, 56282);
      long l = paramInt;
      GMTrace.o(7554042167296L, 56282);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(7554176385024L, 56283);
      j localj = this.oVa;
      sp localsp = sV(paramInt);
      long l = this.fxK;
      Object localObject = localj.a(localsp, l, false, false);
      if (localObject == null)
      {
        boolean bool = localj.a(localsp, l);
        w.d("MicroMsg.RecordMsgImgService", "get image fail, try download, can retry:%B", new Object[] { Boolean.valueOf(bool) });
        com.tencent.mm.plugin.record.a.m.a(localsp, l, bool);
      }
      if (localObject == null)
      {
        w.w("MicroMsg.ShowImageUI", "get image fail");
        if (paramView != null)
        {
          localObject = paramView;
          if (!(paramView instanceof MultiTouchImageView)) {}
        }
        else
        {
          localObject = View.inflate(paramViewGroup.getContext(), R.i.dgz, null);
        }
        ((ImageView)((View)localObject).findViewById(R.h.bPv)).setImageResource(R.k.dnU);
        ((View)localObject).setLayoutParams(new Gallery.LayoutParams(-1, -1));
        GMTrace.o(7554176385024L, 56283);
        return (View)localObject;
      }
      paramViewGroup = paramViewGroup.getContext();
      if ((paramView == null) || (!(paramView instanceof MultiTouchImageView))) {
        paramView = new MultiTouchImageView(paramViewGroup, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
      }
      for (;;)
      {
        k.i(paramView, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        paramView.setImageBitmap((Bitmap)localObject);
        paramView.vKH = true;
        GMTrace.o(7554176385024L, 56283);
        return paramView;
        paramView = (MultiTouchImageView)paramView;
        paramView.ej(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
      }
    }
    
    public final sp sV(int paramInt)
    {
      GMTrace.i(7553907949568L, 56281);
      sp localsp = (sp)this.kjM.get(paramInt);
      GMTrace.o(7553907949568L, 56281);
      return localsp;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/RecordMsgImageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */