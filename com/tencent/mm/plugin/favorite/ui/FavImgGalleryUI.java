package com.tencent.mm.plugin.favorite.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.SparseBooleanArray;
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
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.by;
import com.tencent.mm.g.a.me;
import com.tencent.mm.g.a.me.a;
import com.tencent.mm.plugin.favorite.b.b;
import com.tencent.mm.plugin.favorite.b.b.a;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.r;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.c;
import com.tencent.mm.ui.tools.MMGestureGallery.f;
import com.tencent.mm.ui.tools.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class FavImgGalleryUI
  extends MMActivity
  implements AdapterView.OnItemSelectedListener, b.a
{
  private boolean fHE;
  private l jeN;
  private ArrayList<com.tencent.mm.plugin.favorite.ui.base.d> jrW;
  private MMGestureGallery kvr;
  private int lRC;
  private a lRD;
  private Map<String, me> lRE;
  private com.tencent.mm.sdk.b.c lRF;
  private o.d lfD;
  
  public FavImgGalleryUI()
  {
    GMTrace.i(6338700640256L, 47227);
    this.lRC = 0;
    this.fHE = true;
    this.lRE = new HashMap();
    this.lfD = new o.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(6440035024896L, 47982);
        Object localObject1 = FavImgGalleryUI.d(FavImgGalleryUI.this).nt(FavImgGalleryUI.c(FavImgGalleryUI.this));
        if (localObject1 == null)
        {
          GMTrace.o(6440035024896L, 47982);
          return;
        }
        Object localObject2 = x.g(((com.tencent.mm.plugin.favorite.ui.base.d)localObject1).fBc);
        if (!e.aZ((String)localObject2))
        {
          w.w("MicroMsg.FavImgGalleryUI", "file not exists");
          GMTrace.o(6440035024896L, 47982);
          return;
        }
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(6440035024896L, 47982);
          return;
          com.tencent.mm.plugin.report.service.g.paX.i(10651, new Object[] { Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0) });
          if (o.QO((String)localObject2))
          {
            paramAnonymousMenuItem = new Intent();
            paramAnonymousMenuItem.putExtra("Select_Conv_Type", 3);
            paramAnonymousMenuItem.putExtra("select_is_ret", true);
            com.tencent.mm.bi.d.a(FavImgGalleryUI.this, ".ui.transmit.SelectConversationUI", paramAnonymousMenuItem, 1);
            GMTrace.o(6440035024896L, 47982);
            return;
          }
          com.tencent.mm.plugin.favorite.c.d((String)localObject2, FavImgGalleryUI.this);
          GMTrace.o(6440035024896L, 47982);
          return;
          com.tencent.mm.plugin.favorite.c.c((String)localObject2, FavImgGalleryUI.this);
          com.tencent.mm.plugin.report.service.g.paX.i(10651, new Object[] { Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(6440035024896L, 47982);
          return;
          com.tencent.mm.plugin.favorite.c.a((String)localObject2, FavImgGalleryUI.this.getString(R.l.dXM), FavImgGalleryUI.this);
          GMTrace.o(6440035024896L, 47982);
          return;
          localObject2 = (me)FavImgGalleryUI.e(FavImgGalleryUI.this).get(localObject2);
          if (localObject2 != null)
          {
            paramAnonymousMenuItem = new by();
            paramAnonymousMenuItem.fwg.activity = FavImgGalleryUI.this;
            paramAnonymousMenuItem.fwg.fuE = ((me)localObject2).fKo.result;
            paramAnonymousMenuItem.fwg.fwh = ((me)localObject2).fKo.fwh;
            paramAnonymousMenuItem.fwg.fwj = 7;
            if ((localObject1 != null) && (((com.tencent.mm.plugin.favorite.ui.base.d)localObject1).fBc != null))
            {
              paramAnonymousMenuItem.fwg.imagePath = ((com.tencent.mm.plugin.favorite.ui.base.d)localObject1).fBc.tOx;
              paramAnonymousMenuItem.fwg.fwm = ((com.tencent.mm.plugin.favorite.ui.base.d)localObject1).fBc.tOz;
            }
            paramAnonymousMenuItem.fwg.fwi = ((me)localObject2).fKo.fwi;
            localObject1 = new Bundle(1);
            ((Bundle)localObject1).putInt("stat_scene", 5);
            paramAnonymousMenuItem.fwg.fwn = ((Bundle)localObject1);
            com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousMenuItem);
          }
        }
      }
    };
    this.lRF = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6338700640256L, 47227);
  }
  
  private void axG()
  {
    GMTrace.i(6339103293440L, 47230);
    long l = getIntent().getLongExtra("key_detail_info_id", -1L);
    String str = getIntent().getStringExtra("key_detail_data_id");
    boolean bool2 = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
    Object localObject = getIntent().getStringExtra("fav_note_xml");
    ArrayList localArrayList = new ArrayList();
    j localj = com.tencent.mm.plugin.favorite.h.awD().cc(l);
    boolean bool1;
    if (localj != null)
    {
      bool1 = true;
      w.i("MicroMsg.FavImgGalleryUI", "show one fav info, local id is %d, get from db ok ? %B", new Object[] { Long.valueOf(l), Boolean.valueOf(bool1) });
      if ((!bool2) || (bg.mZ((String)localObject))) {
        break label429;
      }
      localj = x.xo((String)localObject);
    }
    label172:
    label206:
    label426:
    label429:
    for (;;)
    {
      if (localj != null) {
        localArrayList.add(localj);
      }
      this.jrW.clear();
      final int i = -1;
      int m = localArrayList.size();
      int k = 0;
      int j;
      if (k < m)
      {
        localj = (j)localArrayList.get(k);
        int n = localj.field_favProto.tQC.size();
        j = 0;
        if (j < n)
        {
          localObject = (sp)localj.field_favProto.tQC.get(j);
          if (((((sp)localObject).aHe == 8) && (!o.QO(x.g((sp)localObject)))) || ((((sp)localObject).aHe != 2) && (((sp)localObject).aHe != 8))) {
            break label426;
          }
          com.tencent.mm.plugin.favorite.ui.base.d locald = new com.tencent.mm.plugin.favorite.ui.base.d(localj, (sp)localObject);
          this.jrW.add(locald);
          if ((str == null) || (!str.equals(((sp)localObject).lUP))) {
            break label426;
          }
          i = this.jrW.size() - 1;
        }
      }
      for (;;)
      {
        j += 1;
        break label206;
        bool1 = false;
        break;
        j = i;
        if (str == null)
        {
          j = i;
          if (localj.field_localId == l) {
            j = this.jrW.size() - 1;
          }
        }
        k += 1;
        i = j;
        break label172;
        getIntent().removeExtra("key_detail_info_id");
        getIntent().removeExtra("key_detail_data_id");
        this.lRD.notifyDataSetChanged();
        this.kvr.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6321789206528L, 47101);
            if (i != -1)
            {
              w.d("MicroMsg.FavImgGalleryUI", "match selection %d", new Object[] { Integer.valueOf(i) });
              FavImgGalleryUI.f(FavImgGalleryUI.this).setSelection(i);
              FavImgGalleryUI.a(FavImgGalleryUI.this, i);
              GMTrace.o(6321789206528L, 47101);
              return;
            }
            if ((FavImgGalleryUI.c(FavImgGalleryUI.this) - 1 >= 0) && (FavImgGalleryUI.c(FavImgGalleryUI.this) - 1 < FavImgGalleryUI.g(FavImgGalleryUI.this).size()))
            {
              w.d("MicroMsg.FavImgGalleryUI", "adjust selection %d, list size %d", new Object[] { Integer.valueOf(FavImgGalleryUI.c(FavImgGalleryUI.this) - 1), Integer.valueOf(FavImgGalleryUI.g(FavImgGalleryUI.this).size()) });
              FavImgGalleryUI.f(FavImgGalleryUI.this).setSelection(FavImgGalleryUI.c(FavImgGalleryUI.this) - 1);
              FavImgGalleryUI.a(FavImgGalleryUI.this, FavImgGalleryUI.c(FavImgGalleryUI.this) - 1);
              GMTrace.o(6321789206528L, 47101);
              return;
            }
            if (FavImgGalleryUI.g(FavImgGalleryUI.this).size() > 0)
            {
              w.d("MicroMsg.FavImgGalleryUI", "adjust selection fail, set selection 0, list size %d", new Object[] { Integer.valueOf(FavImgGalleryUI.g(FavImgGalleryUI.this).size()) });
              FavImgGalleryUI.f(FavImgGalleryUI.this).setSelection(0);
              FavImgGalleryUI.a(FavImgGalleryUI.this, 0);
              GMTrace.o(6321789206528L, 47101);
              return;
            }
            w.w("MicroMsg.FavImgGalleryUI", "data list size %d, empty, finish", new Object[] { Integer.valueOf(FavImgGalleryUI.g(FavImgGalleryUI.this).size()) });
            FavImgGalleryUI.this.finish();
            GMTrace.o(6321789206528L, 47101);
          }
        });
        GMTrace.o(6339103293440L, 47230);
        return;
      }
    }
  }
  
  public final void b(final com.tencent.mm.plugin.favorite.b.a parama)
  {
    GMTrace.i(6339908599808L, 47236);
    if (parama != null)
    {
      w.v("MicroMsg.FavImgGalleryUI", "on cdn status changed, status:%d", new Object[] { Integer.valueOf(parama.field_status) });
      com.tencent.mm.plugin.favorite.ui.base.d locald = this.lRD.nt(this.lRC);
      if ((locald != null) && (bg.ap(parama.field_dataId, "").equals(locald.fBc.lUP))) {
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6442182508544L, 47998);
            Object localObject = FavImgGalleryUI.f(FavImgGalleryUI.this).getSelectedView();
            if (localObject == null)
            {
              GMTrace.o(6442182508544L, 47998);
              return;
            }
            localObject = (FavImgGalleryUI.b)((View)localObject).getTag();
            if (parama.field_totalLen > 0) {}
            for (int i = parama.field_offset * 100 / parama.field_totalLen - 1;; i = 0)
            {
              int j = i;
              if (i < 0) {
                j = 0;
              }
              ((FavImgGalleryUI.b)localObject).jUz.setProgress(j);
              ((FavImgGalleryUI.b)localObject).lRN.setText(FavImgGalleryUI.this.getString(R.l.eaf, new Object[] { Integer.valueOf(j) }));
              if ((j >= 100) || (parama.isFinished())) {
                FavImgGalleryUI.d(FavImgGalleryUI.this).notifyDataSetChanged();
              }
              GMTrace.o(6442182508544L, 47998);
              return;
            }
          }
        });
      }
    }
    GMTrace.o(6339908599808L, 47236);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6338834857984L, 47228);
    int i = R.i.cTZ;
    GMTrace.o(6338834857984L, 47228);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6340042817536L, 47237);
    if (1 == paramInt1)
    {
      if (-1 != paramInt2)
      {
        GMTrace.o(6340042817536L, 47237);
        return;
      }
      com.tencent.mm.plugin.favorite.ui.base.d locald = this.lRD.nt(this.lRC);
      if (locald == null)
      {
        w.i("MicroMsg.FavImgGalleryUI", "dataItem is null.");
        GMTrace.o(6340042817536L, 47237);
        return;
      }
      new com.tencent.mm.plugin.favorite.b.q();
      if (com.tencent.mm.plugin.favorite.b.q.h(locald.lUm))
      {
        com.tencent.mm.ui.base.h.bl(this.vov.voR, getString(R.l.drQ));
        GMTrace.o(6340042817536L, 47237);
        return;
      }
      String str = paramIntent.getStringExtra("Select_Conv_User");
      w.d("MicroMsg.FavImgGalleryUI", "select %s for sending", new Object[] { str });
      final com.tencent.mm.ui.base.q localq = com.tencent.mm.ui.base.h.a(this.vov.voR, getString(R.l.dWT), false, null);
      r.a(this.vov.voR, str, locald.lUm, locald.fBc, new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6440571895808L, 47986);
          localq.dismiss();
          com.tencent.mm.ui.snackbar.a.e(FavImgGalleryUI.this, FavImgGalleryUI.this.getString(R.l.dZv));
          GMTrace.o(6440571895808L, 47986);
        }
      });
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6340042817536L, 47237);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6338969075712L, 47229);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(1024, 1024);
    }
    this.fHE = getIntent().getBooleanExtra("show_share", true);
    this.kvr = ((MMGestureGallery)findViewById(R.h.bKR));
    this.kvr.setVerticalFadingEdgeEnabled(false);
    this.kvr.setHorizontalFadingEdgeEnabled(false);
    this.kvr.setOnItemSelectedListener(this);
    this.kvr.wKI = new MMGestureGallery.f()
    {
      public final void alc()
      {
        GMTrace.i(6313736142848L, 47041);
        FavImgGalleryUI.this.finish();
        GMTrace.o(6313736142848L, 47041);
      }
    };
    if (this.fHE) {
      this.kvr.wKJ = new MMGestureGallery.c()
      {
        public final void axH()
        {
          GMTrace.i(6464999522304L, 48168);
          if ((!FavImgGalleryUI.this.isFinishing()) && (!FavImgGalleryUI.this.vox)) {
            FavImgGalleryUI.a(FavImgGalleryUI.this);
          }
          GMTrace.o(6464999522304L, 48168);
        }
      };
    }
    kQ(true);
    this.jrW = new ArrayList();
    this.lRD = new a((byte)0);
    this.kvr.setAdapter(this.lRD);
    axG();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6363262484480L, 47410);
        FavImgGalleryUI.this.finish();
        GMTrace.o(6363262484480L, 47410);
        return true;
      }
    });
    com.tencent.mm.sdk.b.a.uLm.b(this.lRF);
    GMTrace.o(6338969075712L, 47229);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6339237511168L, 47231);
    com.tencent.mm.sdk.b.a.uLm.c(this.lRF);
    super.onDestroy();
    GMTrace.o(6339237511168L, 47231);
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(6339640164352L, 47234);
    this.lRC = paramInt;
    w.d("MicroMsg.FavImgGalleryUI", "pos:" + paramInt);
    if ((paramView instanceof MultiTouchImageView)) {
      ((MultiTouchImageView)paramView).bXG();
    }
    GMTrace.o(6339640164352L, 47234);
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
    GMTrace.i(6339774382080L, 47235);
    GMTrace.o(6339774382080L, 47235);
  }
  
  protected void onPause()
  {
    GMTrace.i(6339505946624L, 47233);
    super.onPause();
    com.tencent.mm.plugin.favorite.h.awy().b(this);
    GMTrace.o(6339505946624L, 47233);
  }
  
  protected void onResume()
  {
    GMTrace.i(6339371728896L, 47232);
    super.onResume();
    com.tencent.mm.plugin.favorite.h.awy().a(this);
    GMTrace.o(6339371728896L, 47232);
  }
  
  private final class a
    extends BaseAdapter
  {
    SparseBooleanArray lRJ;
    
    private a()
    {
      GMTrace.i(6416546922496L, 47807);
      this.lRJ = new SparseBooleanArray();
      GMTrace.o(6416546922496L, 47807);
    }
    
    private Bitmap a(com.tencent.mm.plugin.favorite.ui.base.d paramd)
    {
      GMTrace.i(6417352228864L, 47813);
      if (paramd != null)
      {
        paramd = com.tencent.mm.plugin.favorite.c.g.a(paramd.fBc, paramd.lUm);
        if (paramd != null)
        {
          GMTrace.o(6417352228864L, 47813);
          return paramd;
        }
      }
      paramd = com.tencent.mm.compatible.f.a.decodeResource(FavImgGalleryUI.this.getResources(), R.k.dnU);
      GMTrace.o(6417352228864L, 47813);
      return paramd;
    }
    
    private void a(FavImgGalleryUI.b paramb, Bitmap paramBitmap, String paramString)
    {
      GMTrace.i(6417218011136L, 47812);
      paramb.jUz.setVisibility(8);
      paramb.lRN.setVisibility(8);
      paramb.lRM.setVisibility(8);
      paramb.lRK.setVisibility(0);
      paramb.lRO.setVisibility(8);
      b(paramb, paramBitmap, paramString);
      GMTrace.o(6417218011136L, 47812);
    }
    
    private void b(FavImgGalleryUI.b paramb, Bitmap paramBitmap, String paramString)
    {
      GMTrace.i(6417486446592L, 47814);
      com.tencent.mm.sdk.platformtools.k.i(paramb.lRL, paramBitmap.getWidth(), paramBitmap.getHeight());
      int i = paramb.lRL.getWidth();
      int j = paramb.lRL.getHeight();
      Object localObject = new Matrix();
      ((Matrix)localObject).reset();
      float f1 = paramBitmap.getWidth() / paramBitmap.getHeight();
      float f2 = paramBitmap.getHeight() / paramBitmap.getWidth();
      w.v("MicroMsg.FavImgGalleryUI", "whDiv is " + f1 + " hwDiv is " + f2);
      if ((f2 >= 2.0F) && (paramBitmap.getHeight() >= 480))
      {
        f1 = paramBitmap.getWidth() / i;
        f2 = i / paramBitmap.getWidth();
        if (f1 > 1.0D)
        {
          ((Matrix)localObject).postScale(f2, f2);
          paramBitmap.getHeight();
          ((Matrix)localObject).postTranslate((i - f2 * paramBitmap.getWidth()) / 2.0F, 0.0F);
        }
      }
      for (;;)
      {
        paramb.lRL.setImageMatrix((Matrix)localObject);
        paramb.lRL.ej(paramBitmap.getWidth(), paramBitmap.getHeight());
        paramb.lRL.vKH = true;
        if (!bg.mZ(paramString)) {
          break label537;
        }
        paramb.lRL.setImageBitmap(paramBitmap);
        GMTrace.o(6417486446592L, 47814);
        return;
        ((Matrix)localObject).postScale(1.0F, 1.0F);
        ((Matrix)localObject).postTranslate((i - paramBitmap.getWidth()) / 2, 0.0F);
        continue;
        if ((f1 < 2.0F) || (paramBitmap.getWidth() < 480)) {
          break;
        }
        f1 = paramBitmap.getHeight() / 480.0F;
        f2 = 480.0F / paramBitmap.getHeight();
        if (f1 > 1.0D)
        {
          ((Matrix)localObject).postScale(f1, f2);
          ((Matrix)localObject).postTranslate(0.0F, (j - 480) / 2);
        }
        else
        {
          ((Matrix)localObject).postScale(1.0F, 1.0F);
          f1 = (j - paramBitmap.getHeight()) / 2;
          w.d("MicroMsg.FavImgGalleryUI", " offsety " + f1);
          ((Matrix)localObject).postTranslate(0.0F, f1);
        }
      }
      f1 = i / paramBitmap.getWidth();
      f2 = j / paramBitmap.getHeight();
      label438:
      float f3;
      if (f1 < f2)
      {
        f2 = paramBitmap.getWidth() / i;
        f3 = paramBitmap.getHeight() / j;
        if (f2 <= f3) {
          break label530;
        }
        label468:
        if (f2 <= 1.0D) {
          break label709;
        }
        ((Matrix)localObject).postScale(f1, f1);
      }
      for (;;)
      {
        ((Matrix)localObject).postTranslate((i - paramBitmap.getWidth() * f1) / 2.0F, (j - f1 * paramBitmap.getHeight()) / 2.0F);
        break;
        f1 = f2;
        break label438;
        label530:
        f2 = f3;
        break label468;
        try
        {
          label537:
          paramString = new com.tencent.mm.plugin.gif.c(paramString);
          localObject = paramb.lRL;
          ((MultiTouchImageView)localObject).vKO = true;
          ((MultiTouchImageView)localObject).vKP = paramString;
          ((MultiTouchImageView)localObject).setImageDrawable(((MultiTouchImageView)localObject).vKP);
          localObject = paramb.lRL;
          i = com.tencent.mm.bq.a.ef(FavImgGalleryUI.this.vov.voR);
          ((MultiTouchImageView)localObject).lyG = com.tencent.mm.bq.a.eg(FavImgGalleryUI.this.vov.voR);
          ((MultiTouchImageView)localObject).lyF = i;
          paramb.lRL.ej(paramString.getIntrinsicWidth(), paramString.getIntrinsicHeight());
          paramString = paramb.lRL;
          if ((paramString.vKO) && (paramString.vKP != null)) {
            ((com.tencent.mm.ui.f.b.a)paramString.vKP).start();
          }
          paramb.lRL.bXJ();
          GMTrace.o(6417486446592L, 47814);
          return;
        }
        catch (Exception paramString)
        {
          w.e("MicroMsg.FavImgGalleryUI", bg.f(paramString));
          paramb.lRL.setImageBitmap(paramBitmap);
          GMTrace.o(6417486446592L, 47814);
          return;
        }
        label709:
        f1 = 1.0F;
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(6416681140224L, 47808);
      int i = FavImgGalleryUI.g(FavImgGalleryUI.this).size();
      GMTrace.o(6416681140224L, 47808);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6416949575680L, 47810);
      long l = paramInt;
      GMTrace.o(6416949575680L, 47810);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6417083793408L, 47811);
      com.tencent.mm.plugin.favorite.ui.base.d locald;
      Object localObject;
      if (paramView == null)
      {
        paramViewGroup = new FavImgGalleryUI.b(FavImgGalleryUI.this);
        paramView = View.inflate(FavImgGalleryUI.this.vov.voR, R.i.cTY, null);
        paramViewGroup.lRK = paramView.findViewById(R.h.bPo);
        paramViewGroup.lRL = ((MultiTouchImageView)paramView.findViewById(R.h.image));
        paramViewGroup.jUz = ((ProgressBar)paramView.findViewById(R.h.bCW));
        paramViewGroup.lRM = ((ImageView)paramView.findViewById(R.h.cAG));
        paramViewGroup.lRN = ((TextView)paramView.findViewById(R.h.bCX));
        paramViewGroup.lRO = ((LinearLayout)paramView.findViewById(R.h.bGS));
        paramViewGroup.lRP = ((TextView)paramView.findViewById(R.h.bGT));
        paramViewGroup.lRP.setText(R.l.dWh);
        paramView.setTag(paramViewGroup);
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        locald = nt(paramInt);
        boolean bool = this.lRJ.get(paramInt, true);
        this.lRJ.put(paramInt, false);
        localObject = com.tencent.mm.plugin.favorite.c.g.a(locald.fBc, locald.lUm, bool);
        if (locald.lUm != null) {
          w.i("MicroMsg.FavImgGalleryUI", "index %d item favid %d, localid %d, itemStatus %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(locald.lUm.field_id), Long.valueOf(locald.lUm.field_localId), Integer.valueOf(locald.lUm.field_itemStatus) });
        }
        if (locald.fBc != null) {
          w.i("MicroMsg.FavImgGalleryUI", "item dataId %s, item data url %s, key %s, fullsize %d, thumb url %s, key %s, thumb size %d", new Object[] { locald.fBc.lUP, locald.fBc.tOx, locald.fBc.tOz, Long.valueOf(locald.fBc.tOS), locald.fBc.haX, locald.fBc.tOt, Long.valueOf(locald.fBc.tPd) });
        }
        if (localObject != null) {
          break label811;
        }
        FavImgGalleryUI.this.kS(false);
        w.w("MicroMsg.FavImgGalleryUI", "get big image fail");
        b localb = com.tencent.mm.plugin.favorite.h.awy();
        if (locald.fBc == null) {
          break label574;
        }
        localObject = locald.fBc.lUP;
        label428:
        localObject = localb.wZ((String)localObject);
        if (localObject != null) {
          break label653;
        }
        paramViewGroup.lRO.setVisibility(8);
        if ((locald.lUm == null) || (locald.lUm.field_id >= 0)) {
          break label582;
        }
        paramViewGroup.jUz.setVisibility(0);
        paramViewGroup.lRN.setVisibility(0);
        paramViewGroup.lRM.setVisibility(0);
        paramViewGroup.lRK.setVisibility(8);
        paramViewGroup.lRM.setImageBitmap(a(locald));
        paramViewGroup.jUz.setProgress(0);
        paramViewGroup.lRN.setText(FavImgGalleryUI.this.getString(R.l.eaf, new Object[] { Integer.valueOf(0) }));
      }
      for (;;)
      {
        GMTrace.o(6417083793408L, 47811);
        return paramView;
        paramViewGroup = (FavImgGalleryUI.b)paramView.getTag();
        break;
        label574:
        localObject = "";
        break label428;
        label582:
        paramViewGroup.jUz.setVisibility(8);
        paramViewGroup.lRN.setVisibility(8);
        paramViewGroup.lRM.setVisibility(8);
        paramViewGroup.lRK.setVisibility(0);
        if (locald.fBc.tPF != 0) {
          paramViewGroup.lRO.setVisibility(0);
        }
        b(paramViewGroup, a(locald), "");
      }
      label653:
      w.i("MicroMsg.FavImgGalleryUI", "fav cdnInfo status %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.favorite.b.a)localObject).field_status) });
      paramViewGroup.jUz.setVisibility(0);
      paramViewGroup.lRN.setVisibility(0);
      paramViewGroup.lRM.setVisibility(0);
      paramViewGroup.lRK.setVisibility(8);
      paramViewGroup.lRM.setImageBitmap(a(locald));
      if (((com.tencent.mm.plugin.favorite.b.a)localObject).field_totalLen > 0) {}
      for (paramInt = ((com.tencent.mm.plugin.favorite.b.a)localObject).field_offset * 100 / ((com.tencent.mm.plugin.favorite.b.a)localObject).field_totalLen - 1;; paramInt = 0)
      {
        int i = paramInt;
        if (paramInt < 0) {
          i = 0;
        }
        paramViewGroup.jUz.setProgress(i);
        paramViewGroup.lRN.setText(FavImgGalleryUI.this.getString(R.l.eaf, new Object[] { Integer.valueOf(i) }));
        GMTrace.o(6417083793408L, 47811);
        return paramView;
      }
      label811:
      FavImgGalleryUI.this.kS(true);
      if (o.QO(x.g(locald.fBc))) {
        a(paramViewGroup, (Bitmap)localObject, x.g(locald.fBc));
      }
      for (;;)
      {
        GMTrace.o(6417083793408L, 47811);
        return paramView;
        a(paramViewGroup, (Bitmap)localObject, "");
      }
    }
    
    public final com.tencent.mm.plugin.favorite.ui.base.d nt(int paramInt)
    {
      GMTrace.i(6416815357952L, 47809);
      if (paramInt >= FavImgGalleryUI.g(FavImgGalleryUI.this).size())
      {
        w.w("MicroMsg.FavImgGalleryUI", "get item fail, position %d error", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(6416815357952L, 47809);
        return null;
      }
      com.tencent.mm.plugin.favorite.ui.base.d locald = (com.tencent.mm.plugin.favorite.ui.base.d)FavImgGalleryUI.g(FavImgGalleryUI.this).get(paramInt);
      GMTrace.o(6416815357952L, 47809);
      return locald;
    }
  }
  
  private final class b
  {
    ProgressBar jUz;
    View lRK;
    MultiTouchImageView lRL;
    ImageView lRM;
    TextView lRN;
    LinearLayout lRO;
    TextView lRP;
    
    public b()
    {
      GMTrace.i(6341519212544L, 47248);
      GMTrace.o(6341519212544L, 47248);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/favorite/ui/FavImgGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */