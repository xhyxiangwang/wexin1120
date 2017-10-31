package com.tencent.mm.plugin.record.ui.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ListView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.by;
import com.tencent.mm.g.a.fr;
import com.tencent.mm.g.a.fr.b;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.g.a.me;
import com.tencent.mm.g.a.me.a;
import com.tencent.mm.plugin.record.ui.RecordMsgImageUI;
import com.tencent.mm.plugin.record.ui.h.a;
import com.tencent.mm.plugin.record.ui.h.a.b;
import com.tencent.mm.plugin.record.ui.h.a.c;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.sz;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import java.util.HashMap;
import java.util.Map;

public final class a
  implements h.b
{
  private ListView EA;
  public l iYs;
  public Map<String, me> lRE;
  private com.tencent.mm.sdk.b.c lRF;
  private View.OnClickListener lTT;
  public View.OnLongClickListener lVS;
  public h.a oUM;
  public int oVp;
  
  public a(h.a parama, ListView paramListView)
  {
    GMTrace.i(7548405022720L, 56240);
    this.lRE = new HashMap();
    this.lTT = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(7547465498624L, 56233);
        Object localObject = (com.tencent.mm.plugin.record.ui.a.b)paramAnonymousView.getTag();
        switch (((com.tencent.mm.plugin.record.ui.a.b)localObject).aHe)
        {
        }
        for (;;)
        {
          GMTrace.o(7547465498624L, 56233);
          return;
          Intent localIntent = new Intent(paramAnonymousView.getContext(), RecordMsgImageUI.class);
          localIntent.putExtra("message_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject).fxK);
          localIntent.putExtra("record_data_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject).fBc.lUP);
          localIntent.putExtra("record_xml", ((com.tencent.mm.plugin.record.ui.a.b)localObject).fKr);
          if (((paramAnonymousView.getContext() instanceof Activity)) && (((Activity)paramAnonymousView.getContext()).getIntent() != null))
          {
            localObject = ((Activity)paramAnonymousView.getContext()).getIntent().getBundleExtra("_stat_obj");
            if (localObject != null) {
              localIntent.putExtra("_stat_obj", (Bundle)localObject);
            }
          }
          paramAnonymousView.getContext().startActivity(localIntent);
          GMTrace.o(7547465498624L, 56233);
          return;
          localIntent = new Intent();
          localIntent.putExtra("key_detail_info_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject).oUu.field_localId);
          localIntent.putExtra("key_detail_data_id", ((com.tencent.mm.plugin.record.ui.a.b)localObject).fBc.lUP);
          com.tencent.mm.bi.d.b(paramAnonymousView.getContext(), "favorite", ".ui.FavImgGalleryUI", localIntent);
        }
      }
    };
    this.lVS = new View.OnLongClickListener()
    {
      public Context context;
      private com.tencent.mm.plugin.record.ui.a.b oVr;
      public com.tencent.mm.plugin.record.a.c oVs;
      public sp oVt;
      public String path;
      
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(7546928627712L, 56229);
        if (paramAnonymousView != null)
        {
          this.context = paramAnonymousView.getContext();
          this.oVr = ((com.tencent.mm.plugin.record.ui.a.b)paramAnonymousView.getTag());
          this.oVs = this.oVr.oUu;
          this.oVt = this.oVr.fBc;
        }
        paramAnonymousView = new fr();
        paramAnonymousView.fBn.type = 2;
        paramAnonymousView.fBn.fBp = this.oVr.fBc;
        com.tencent.mm.sdk.b.a.uLm.m(paramAnonymousView);
        this.path = paramAnonymousView.fBo.path;
        if (!e.aZ(this.path))
        {
          w.w("MicroMsg.ImageViewWrapper", "file not exists");
          GMTrace.o(7546928627712L, 56229);
          return true;
        }
        if (a.this.iYs == null) {
          a.this.iYs = new l(this.context);
        }
        a.this.iYs.qQS = new o.c()
        {
          public final void a(com.tencent.mm.ui.base.m paramAnonymous2m)
          {
            int j = 0;
            GMTrace.i(7545989103616L, 56222);
            if (a.2.this.oVt.tPF == 0)
            {
              Context localContext;
              if ((a.2.this.oVs.field_favProto.tPW & 0x1) != 0)
              {
                i = 1;
                if (i != 0) {
                  paramAnonymous2m.e(2, a.2.this.context.getString(R.l.dXS));
                }
                i = j;
                if ((a.2.this.oVs.field_favProto.tPW & 0x2) != 0) {
                  i = 1;
                }
                if (i != 0) {
                  paramAnonymous2m.e(1, a.2.this.context.getString(R.l.dXu));
                }
                paramAnonymous2m.e(3, a.2.this.context.getString(R.l.dXN));
                me localme = (me)a.this.lRE.get(a.2.this.path);
                if (localme == null) {
                  break label244;
                }
                if (bg.mZ(localme.fKo.result)) {
                  break label274;
                }
                localContext = a.2.this.context;
                if (!com.tencent.mm.plugin.scanner.a.al(localme.fKo.fwh, localme.fKo.result)) {
                  break label237;
                }
              }
              label237:
              for (int i = R.l.ewZ;; i = R.l.ewY)
              {
                paramAnonymous2m.e(4, localContext.getString(i));
                GMTrace.o(7545989103616L, 56222);
                return;
                i = 0;
                break;
              }
              label244:
              paramAnonymous2m = new mc();
              paramAnonymous2m.fKl.filePath = a.2.this.path;
              com.tencent.mm.sdk.b.a.uLm.m(paramAnonymous2m);
            }
            label274:
            GMTrace.o(7545989103616L, 56222);
          }
        };
        a.this.iYs.qQT = new o.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(7549881417728L, 56251);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(7549881417728L, 56251);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Ksnsupload_type", 0);
              paramAnonymous2MenuItem.putExtra("sns_kemdia_path", a.2.this.path);
              Object localObject = q.gi("fav_");
              q.Aw().n((String)localObject, true).k("prePublishId", "fav_");
              paramAnonymous2MenuItem.putExtra("reportSessionId", (String)localObject);
              com.tencent.mm.bi.d.b(a.2.this.context, "sns", ".ui.En_c4f742e5", paramAnonymous2MenuItem);
              GMTrace.o(7549881417728L, 56251);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Retr_File_Name", a.2.this.path);
              paramAnonymous2MenuItem.putExtra("Retr_Compress_Type", 0);
              paramAnonymous2MenuItem.putExtra("Retr_Msg_Type", 0);
              com.tencent.mm.bi.d.a(a.2.this.context, ".ui.transmit.MsgRetransmitUI", paramAnonymous2MenuItem);
              GMTrace.o(7549881417728L, 56251);
              return;
              if (!com.tencent.mm.platformtools.d.a(a.2.this.path, a.2.this.context, R.l.dPq))
              {
                Toast.makeText(a.2.this.context, a.2.this.context.getString(R.l.dXM), 1).show();
                GMTrace.o(7549881417728L, 56251);
                return;
                paramAnonymous2MenuItem = (me)a.this.lRE.get(a.2.this.path);
                if (paramAnonymous2MenuItem != null)
                {
                  localObject = new by();
                  ((by)localObject).fwg.activity = ((Activity)a.2.this.context);
                  ((by)localObject).fwg.fuE = paramAnonymous2MenuItem.fKo.result;
                  ((by)localObject).fwg.fwh = paramAnonymous2MenuItem.fKo.fwh;
                  ((by)localObject).fwg.fwi = paramAnonymous2MenuItem.fKo.fwi;
                  com.tencent.mm.sdk.b.a.uLm.m((com.tencent.mm.sdk.b.b)localObject);
                }
              }
            }
          }
        };
        a.this.iYs.bnM();
        GMTrace.o(7546928627712L, 56229);
        return true;
      }
    };
    this.lRF = new com.tencent.mm.sdk.b.c() {};
    this.oUM = parama;
    this.EA = paramListView;
    com.tencent.mm.sdk.b.a.uLm.b(this.lRF);
    GMTrace.o(7548405022720L, 56240);
  }
  
  public final void a(final View paramView, int paramInt, final com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    GMTrace.i(7548673458176L, 56242);
    paramView = (ImageView)paramView.findViewById(R.h.cpO);
    paramView.setTag(paramb);
    paramView.setOnClickListener(this.lTT);
    if (paramb.aHe == 1) {
      paramView.setOnLongClickListener(this.lVS);
    }
    h.a.b localb = new h.a.b();
    if (paramb.aHe == 0) {
      localb.oUO = paramb.fxK;
    }
    for (;;)
    {
      localb.fBc = paramb.fBc;
      localb.fBf = true;
      localb.maxWidth = this.oVp;
      Bitmap localBitmap = this.oUM.a(localb);
      if (localBitmap == null) {
        break;
      }
      w.d("MicroMsg.ImageViewWrapper", "get from dataId %s, cache %s", new Object[] { localb.fBc.lUP, localBitmap });
      a(paramView, localBitmap, R.k.dol, paramb.fBc.lUP);
      GMTrace.o(7548673458176L, 56242);
      return;
      if (paramb.aHe == 1) {
        localb.oUO = paramb.oUu.field_localId;
      }
    }
    ap.xC().C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7550686724096L, 56257);
        final Object localObject = (com.tencent.mm.plugin.record.ui.a.a)paramb;
        final int i;
        if (((com.tencent.mm.plugin.record.ui.a.a)localObject).aHe == 0)
        {
          if (!com.tencent.mm.plugin.record.a.m.g(((com.tencent.mm.plugin.record.ui.a.a)localObject).fBc, ((com.tencent.mm.plugin.record.ui.a.a)localObject).fxK)) {
            break label243;
          }
          i = R.k.dqt;
          if (i != -1) {
            break label326;
          }
          i = R.k.dol;
        }
        label243:
        label318:
        label321:
        label326:
        for (;;)
        {
          com.tencent.mm.plugin.record.ui.a.a locala = (com.tencent.mm.plugin.record.ui.a.a)paramb;
          h.a locala1 = a.this.oUM;
          int j = a.this.oVp;
          localObject = new h.a.b();
          ((h.a.b)localObject).fBc = locala.fBc;
          ((h.a.b)localObject).fBf = false;
          ((h.a.b)localObject).maxWidth = j;
          h.a.c localc = new h.a.c();
          localc.fBc = locala.fBc;
          Bitmap localBitmap;
          if (locala.aHe == 0)
          {
            if (com.tencent.mm.plugin.record.a.m.g(locala.fBc, locala.fxK)) {
              break label321;
            }
            ((h.a.b)localObject).oUO = locala.fxK;
            localBitmap = locala1.a((h.a.b)localObject);
            localObject = localBitmap;
            if (localBitmap != null) {
              break label318;
            }
            localc.oUO = locala.fxK;
            localObject = locala1.a(localc);
          }
          for (;;)
          {
            af.u(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(7550149853184L, 56253);
                a.this.a(a.3.this.oVw, localObject, i, a.3.this.oVv.fBc.lUP);
                GMTrace.o(7550149853184L, 56253);
              }
            });
            GMTrace.o(7550686724096L, 56257);
            return;
            if ((((com.tencent.mm.plugin.record.ui.a.a)localObject).aHe == 1) && (bg.mZ(((com.tencent.mm.plugin.record.ui.a.a)localObject).fBc.tOx)))
            {
              i = R.k.dqt;
              break;
            }
            i = -1;
            break;
            if (locala.aHe == 1)
            {
              ((h.a.b)localObject).oUO = locala.oUu.field_localId;
              ((h.a.b)localObject).fBg = false;
              localBitmap = locala1.a((h.a.b)localObject);
              localObject = localBitmap;
              if (localBitmap == null)
              {
                localc.oUO = locala.oUu.field_localId;
                localObject = locala1.a(localc);
              }
            }
            else
            {
              localObject = null;
            }
          }
        }
      }
      
      public final String toString()
      {
        GMTrace.i(7550820941824L, 56258);
        String str = super.toString() + "|fillView";
        GMTrace.o(7550820941824L, 56258);
        return str;
      }
    });
    GMTrace.o(7548673458176L, 56242);
  }
  
  public final void a(ImageView paramImageView, Bitmap paramBitmap, int paramInt, String paramString)
  {
    GMTrace.i(7548807675904L, 56243);
    if (!((com.tencent.mm.plugin.record.ui.a.b)paramImageView.getTag()).fBc.lUP.equals(paramString))
    {
      w.d("MicroMsg.ImageViewWrapper", "scroll over to next img. old tag %s, now tag %s", new Object[] { paramString, paramImageView.getTag() });
      GMTrace.o(7548807675904L, 56243);
      return;
    }
    if (paramBitmap == null)
    {
      paramBitmap = paramImageView.getLayoutParams();
      paramBitmap.height = 200;
      paramBitmap.width = 280;
      paramImageView.setImageResource(paramInt);
      paramImageView.setBackgroundResource(R.e.aOR);
      GMTrace.o(7548807675904L, 56243);
      return;
    }
    w.d("MicroMsg.ImageViewWrapper", "update view bmp[%d, %d], iv[%d, %d]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(paramImageView.getWidth()), Integer.valueOf(paramImageView.getHeight()) });
    paramString = paramImageView.getLayoutParams();
    paramInt = paramBitmap.getWidth();
    int i = paramBitmap.getHeight();
    float f;
    if (i >= paramInt)
    {
      f = i / paramInt;
      if (f <= 2.5D) {
        break label466;
      }
      paramBitmap = Bitmap.createBitmap(paramBitmap, 0, (paramBitmap.getHeight() - (int)(paramBitmap.getWidth() * 2.5F)) / 2, paramBitmap.getWidth(), (int)(paramBitmap.getWidth() * 2.5F));
      f = 2.5F;
    }
    label466:
    for (;;)
    {
      if (f <= 2.0F)
      {
        paramInt = com.tencent.mm.bq.a.V(paramImageView.getContext(), R.f.aRe);
        i = (int)(paramInt / f);
      }
      for (;;)
      {
        paramString.width = i;
        paramString.height = paramInt;
        paramImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        k.i(paramImageView, i, paramInt);
        if (paramImageView.getLayerType() == 1) {
          this.EA.setLayerType(1, null);
        }
        paramImageView.setImageBitmap(paramBitmap);
        paramImageView.setBackgroundResource(0);
        GMTrace.o(7548807675904L, 56243);
        return;
        i = com.tencent.mm.bq.a.V(paramImageView.getContext(), R.f.aRf);
        paramInt = (int)(i * f);
      }
      f = paramInt / i;
      if (f > 2.5D)
      {
        paramBitmap = Bitmap.createBitmap(paramBitmap, (paramBitmap.getWidth() - (int)(paramBitmap.getHeight() * 2.5F)) / 2, 0, (int)(paramBitmap.getHeight() * 2.5F), paramBitmap.getHeight());
        f = 2.5F;
      }
      for (;;)
      {
        if (f <= 2.0F)
        {
          i = com.tencent.mm.bq.a.V(paramImageView.getContext(), R.f.aRe);
          paramInt = (int)(i / f);
          break;
        }
        paramInt = com.tencent.mm.bq.a.V(paramImageView.getContext(), R.f.aRf);
        i = (int)(paramInt * f);
        break;
      }
    }
  }
  
  public final View cY(Context paramContext)
  {
    GMTrace.i(7548539240448L, 56241);
    View localView = View.inflate(paramContext, R.i.deg, null);
    this.oVp = com.tencent.mm.bq.a.fromDPToPix(paramContext, 200);
    GMTrace.o(7548539240448L, 56241);
    return localView;
  }
  
  public final void destroy()
  {
    GMTrace.i(7548941893632L, 56244);
    com.tencent.mm.sdk.b.a.uLm.c(this.lRF);
    GMTrace.o(7548941893632L, 56244);
  }
  
  public final void pause()
  {
    GMTrace.i(7549076111360L, 56245);
    GMTrace.o(7549076111360L, 56245);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */