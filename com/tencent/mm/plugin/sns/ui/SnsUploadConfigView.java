package com.tencent.mm.plugin.sns.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.k;
import com.tencent.mm.ao.b;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.fm;
import com.tencent.mm.g.a.fm.b;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.protocal.c.akv;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.j.a.a;
import com.tencent.mm.ui.j.a.b;
import com.tencent.mm.ui.j.a.c;
import com.tencent.mm.ui.v;
import com.tencent.mm.x.m;

public class SnsUploadConfigView
  extends LinearLayout
  implements com.tencent.mm.ac.e, a.a, a.b
{
  private static String flK;
  private Context context;
  private ProgressDialog nfM;
  boolean qNx;
  ImageView qRH;
  ImageView qRI;
  ImageView qRJ;
  private boolean qRK;
  boolean qRL;
  boolean qRM;
  private boolean qRN;
  private boolean qRO;
  private boolean qRP;
  akv qRQ;
  com.tencent.mm.ui.j.a qRR;
  
  static
  {
    GMTrace.i(8701603741696L, 64832);
    flK = "com.tencent.mm";
    GMTrace.o(8701603741696L, 64832);
  }
  
  public SnsUploadConfigView(final Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8697979863040L, 64805);
    this.qNx = false;
    this.qRK = false;
    this.qRL = false;
    this.qRM = false;
    this.qRN = false;
    this.qRO = true;
    this.qRP = false;
    this.qRQ = new akv();
    this.qRR = new com.tencent.mm.ui.j.a();
    this.nfM = null;
    this.context = paramContext;
    this.context = paramContext;
    paramAttributeSet = v.fa(paramContext).inflate(i.g.pPK, this, true);
    this.qRH = ((ImageView)paramAttributeSet.findViewById(i.f.pMZ));
    this.qRI = ((ImageView)paramAttributeSet.findViewById(i.f.pNb));
    this.qRJ = ((ImageView)paramAttributeSet.findViewById(i.f.pNa));
    if (!b.Jr()) {
      this.qRJ.setVisibility(8);
    }
    if (!b.Jt()) {
      this.qRI.setVisibility(8);
    }
    if (!m.Ae()) {
      this.qRH.setVisibility(8);
    }
    this.qRJ.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8514638446592L, 63439);
        if ((!SnsUploadConfigView.a(SnsUploadConfigView.this)) && (SnsUploadConfigView.b(SnsUploadConfigView.this)))
        {
          com.tencent.mm.ui.base.h.h(paramContext, i.j.pTO, i.j.dxm);
          GMTrace.o(8514638446592L, 63439);
          return;
        }
        paramAnonymousView = SnsUploadConfigView.this;
        if (SnsUploadConfigView.a(SnsUploadConfigView.this)) {}
        for (boolean bool = false;; bool = true)
        {
          SnsUploadConfigView.a(paramAnonymousView, bool);
          SnsUploadConfigView.c(SnsUploadConfigView.this);
          GMTrace.o(8514638446592L, 63439);
          return;
        }
      }
    });
    this.qRH.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8481218232320L, 63190);
        paramAnonymousView = SnsUploadConfigView.this;
        if (SnsUploadConfigView.d(SnsUploadConfigView.this)) {}
        for (boolean bool = false;; bool = true)
        {
          SnsUploadConfigView.b(paramAnonymousView, bool);
          if (SnsUploadConfigView.d(SnsUploadConfigView.this)) {
            SnsUploadConfigView.e(SnsUploadConfigView.this);
          }
          SnsUploadConfigView.f(SnsUploadConfigView.this);
          GMTrace.o(8481218232320L, 63190);
          return;
        }
      }
    });
    this.qRI.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8587250237440L, 63980);
        paramAnonymousView = SnsUploadConfigView.this;
        if (SnsUploadConfigView.g(SnsUploadConfigView.this)) {}
        for (boolean bool = false;; bool = true)
        {
          SnsUploadConfigView.c(paramAnonymousView, bool);
          if (SnsUploadConfigView.g(SnsUploadConfigView.this)) {
            SnsUploadConfigView.e(SnsUploadConfigView.this);
          }
          SnsUploadConfigView.h(SnsUploadConfigView.this);
          GMTrace.o(8587250237440L, 63980);
          return;
        }
      }
    });
    GMTrace.o(8697979863040L, 64805);
  }
  
  private void pq(int paramInt)
  {
    GMTrace.i(8699053604864L, 64813);
    com.tencent.mm.ui.base.h.a(getContext(), paramInt, i.j.dxm, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(8626039160832L, 64269);
        GMTrace.o(8626039160832L, 64269);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(8326330974208L, 62036);
        GMTrace.o(8326330974208L, 62036);
      }
    });
    GMTrace.o(8699053604864L, 64813);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8699187822592L, 64814);
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramk == null))
    {
      GMTrace.o(8699187822592L, 64814);
      return;
    }
    GMTrace.o(8699187822592L, 64814);
  }
  
  public final void a(a.c paramc)
  {
    GMTrace.i(8699322040320L, 64815);
    if (this.nfM != null) {
      this.nfM.cancel();
    }
    switch (6.ngk[paramc.ordinal()])
    {
    }
    for (;;)
    {
      bnQ();
      GMTrace.o(8699322040320L, 64815);
      return;
      this.qRM = true;
      pq(i.j.eNk);
      continue;
      this.qRM = false;
      continue;
      this.qRM = false;
      pq(i.j.eNj);
    }
  }
  
  public final void b(a.c paramc)
  {
    GMTrace.i(8699456258048L, 64816);
    switch (6.ngk[paramc.ordinal()])
    {
    }
    for (;;)
    {
      bnQ();
      GMTrace.o(8699456258048L, 64816);
      return;
      this.qRM = false;
    }
  }
  
  public final void bnO()
  {
    GMTrace.i(8698114080768L, 64806);
    this.qRK = false;
    this.qRL = false;
    this.qRM = false;
    this.qRN = false;
    this.qRJ.setImageResource(i.i.pQL);
    this.qRH.setImageResource(i.i.pQF);
    this.qRI.setImageResource(i.i.pQP);
    GMTrace.o(8698114080768L, 64806);
  }
  
  final void bnP()
  {
    GMTrace.i(8698248298496L, 64807);
    if (this.qRN)
    {
      com.tencent.mm.kernel.h.xA();
      int i = bg.e((Integer)com.tencent.mm.kernel.h.xz().xi().get(9, null));
      if (i == 0) {
        com.tencent.mm.ui.base.h.a(getContext(), i.j.eJz, i.j.dxm, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8402566643712L, 62604);
            com.tencent.mm.plugin.sns.c.a.ifM.h(new Intent(), SnsUploadConfigView.i(SnsUploadConfigView.this));
            GMTrace.o(8402566643712L, 62604);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8345792544768L, 62181);
            GMTrace.o(8345792544768L, 62181);
          }
        });
      }
      for (i = 0;; i = 1)
      {
        if (i != 0) {
          break label103;
        }
        this.qRN = false;
        GMTrace.o(8698248298496L, 64807);
        return;
        if (i == 0) {
          break;
        }
      }
      label103:
      this.qRJ.setImageResource(i.i.pQM);
      GMTrace.o(8698248298496L, 64807);
      return;
    }
    this.qRJ.setImageResource(i.i.pQL);
    GMTrace.o(8698248298496L, 64807);
  }
  
  final void bnQ()
  {
    GMTrace.i(8698516733952L, 64809);
    if (this.qRM)
    {
      if (!this.qRR.cfO()) {
        com.tencent.mm.ui.base.h.a(getContext(), i.j.eJj, i.j.dxm, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8581613092864L, 63938);
            paramAnonymousDialogInterface = SnsUploadConfigView.this;
            Context localContext = SnsUploadConfigView.this.getContext();
            SnsUploadConfigView.this.getContext().getString(i.j.dxm);
            SnsUploadConfigView.a(paramAnonymousDialogInterface, com.tencent.mm.ui.base.h.a(localContext, SnsUploadConfigView.this.getContext().getString(i.j.eNi), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(8323378184192L, 62014);
                GMTrace.o(8323378184192L, 62014);
              }
            }));
            SnsUploadConfigView.j(SnsUploadConfigView.this).a(SnsUploadConfigView.this, SnsUploadConfigView.this.getContext());
            GMTrace.o(8581613092864L, 63938);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8718917828608L, 64961);
            GMTrace.o(8718917828608L, 64961);
          }
        });
      }
      for (int i = 0; i == 0; i = 1)
      {
        this.qRM = false;
        GMTrace.o(8698516733952L, 64809);
        return;
      }
      this.qRI.setImageResource(i.i.pQQ);
      GMTrace.o(8698516733952L, 64809);
      return;
    }
    this.qRI.setImageResource(i.i.pQP);
    GMTrace.o(8698516733952L, 64809);
  }
  
  public final int bnR()
  {
    GMTrace.i(8698650951680L, 64810);
    int i = 0;
    if (this.qNx) {
      i = 1;
    }
    GMTrace.o(8698650951680L, 64810);
    return i;
  }
  
  public final int bnS()
  {
    GMTrace.i(8698919387136L, 64812);
    int j = 0;
    if (this.qRK) {
      j = 1;
    }
    int i = j;
    if (this.qRL) {
      i = j | 0x2;
    }
    j = i;
    if (this.qRM) {
      j = i | 0x8;
    }
    i = j;
    if (this.qRN) {
      i = j | 0x4;
    }
    GMTrace.o(8698919387136L, 64812);
    return i;
  }
  
  final void ic(boolean paramBoolean)
  {
    GMTrace.i(8698382516224L, 64808);
    if (this.qRL)
    {
      if (!m.Ag()) {
        com.tencent.mm.ui.base.h.a(getContext(), i.j.eHd, i.j.dxm, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8323780837376L, 62017);
            d.a(SnsUploadConfigView.this.getContext(), ".ui.account.FacebookAuthUI", new Intent().putExtra("shake_music", true));
            GMTrace.o(8323780837376L, 62017);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(8549937709056L, 63702);
            GMTrace.o(8549937709056L, 63702);
          }
        });
      }
      for (int i = 0; i == 0; i = 1)
      {
        this.qRL = false;
        GMTrace.o(8698382516224L, 64808);
        return;
      }
      if ((!paramBoolean) && (!this.qRP) && (m.Ag()))
      {
        final fm localfm = new fm();
        localfm.fwM = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8677041897472L, 64649);
            if (!localfm.fAY.fwc) {
              SnsUploadConfigView.k(SnsUploadConfigView.this);
            }
            GMTrace.o(8677041897472L, 64649);
          }
        };
        com.tencent.mm.sdk.b.a.uLm.a(localfm, Looper.myLooper());
      }
      this.qRH.setImageResource(i.i.pQG);
      GMTrace.o(8698382516224L, 64808);
      return;
    }
    this.qRH.setImageResource(i.i.pQF);
    GMTrace.o(8698382516224L, 64808);
  }
  
  public final void id(boolean paramBoolean)
  {
    GMTrace.i(8698785169408L, 64811);
    this.qNx = paramBoolean;
    if (paramBoolean) {
      bnO();
    }
    GMTrace.o(8698785169408L, 64811);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsUploadConfigView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */