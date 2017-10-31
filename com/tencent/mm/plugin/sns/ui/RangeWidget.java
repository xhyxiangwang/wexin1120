package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.i;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RangeWidget
  extends RelativeLayout
{
  private View iiK;
  private Activity owr;
  private String qAu;
  private String qAv;
  private TextView qEI;
  private boolean qEJ;
  int qEK;
  String qEL;
  boolean qEM;
  private ImageView qxB;
  SnsUploadConfigView qxE;
  public int style;
  
  public RangeWidget(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8602819493888L, 64096);
    this.qEJ = true;
    this.qEK = 0;
    this.qEL = "";
    this.qAu = "";
    this.qAv = "";
    this.qEM = false;
    this.style = 0;
    init(paramContext);
    GMTrace.o(8602819493888L, 64096);
  }
  
  public RangeWidget(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8602685276160L, 64095);
    this.qEJ = true;
    this.qEK = 0;
    this.qEL = "";
    this.qAu = "";
    this.qAv = "";
    this.qEM = false;
    this.style = 0;
    init(paramContext);
    GMTrace.o(8602685276160L, 64095);
  }
  
  private static List<String> af(List<String> paramList)
  {
    GMTrace.i(8603087929344L, 64098);
    LinkedList localLinkedList = new LinkedList();
    com.tencent.mm.kernel.h.xA();
    if (!com.tencent.mm.kernel.h.xx().wM())
    {
      GMTrace.o(8603087929344L, 64098);
      return localLinkedList;
    }
    if (paramList == null)
    {
      GMTrace.o(8603087929344L, 64098);
      return localLinkedList;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      com.tencent.mm.kernel.h.xA();
      x localx = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yL().SL(str);
      paramList = str;
      if (localx != null)
      {
        paramList = str;
        if ((int)localx.gLS != 0) {
          paramList = localx.vq();
        }
      }
      localLinkedList.add(paramList);
    }
    GMTrace.o(8603087929344L, 64098);
    return localLinkedList;
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(8602953711616L, 64097);
    this.owr = ((Activity)paramContext);
    this.iiK = View.inflate(paramContext, getLayoutResource(), this);
    this.qEI = ((TextView)this.iiK.findViewById(i.f.pNh));
    this.qxB = ((ImageView)this.iiK.findViewById(i.f.pKK));
    this.iiK.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8711804289024L, 64908);
        paramAnonymousView = new Intent(RangeWidget.a(RangeWidget.this), SnsLabelUI.class);
        paramAnonymousView.putExtra("KLabel_range_index", RangeWidget.b(RangeWidget.this));
        paramAnonymousView.putExtra("Klabel_name_list", RangeWidget.c(RangeWidget.this));
        paramAnonymousView.putExtra("Kother_user_name_list", RangeWidget.d(RangeWidget.this));
        paramAnonymousView.putExtra("Ktag_rangeFilterprivate", RangeWidget.e(RangeWidget.this));
        paramAnonymousView.putExtra("k_sns_label_ui_style", RangeWidget.this.style);
        RangeWidget.a(RangeWidget.this).startActivityForResult(paramAnonymousView, 5);
        GMTrace.o(8711804289024L, 64908);
      }
    });
    GMTrace.o(8602953711616L, 64097);
  }
  
  public boolean a(int paramInt1, int paramInt2, Intent paramIntent, AtContactWidget paramAtContactWidget)
  {
    GMTrace.i(8603222147072L, 64099);
    this.qEK = paramIntent.getIntExtra("Ktag_range_index", 0);
    this.qAu = paramIntent.getStringExtra("Klabel_name_list");
    this.qAv = paramIntent.getStringExtra("Kother_user_name_list");
    paramInt1 = bml();
    Object localObject = "";
    if (!bg.mZ(this.qAu)) {
      localObject = "" + this.qAu;
    }
    paramIntent = (Intent)localObject;
    if (!bg.mZ(this.qAv))
    {
      paramIntent = bg.c(af(Arrays.asList(this.qAv.split(","))), ",");
      if (((String)localObject).length() > 0) {
        paramIntent = (String)localObject + "," + paramIntent;
      }
    }
    else
    {
      localObject = paramIntent;
      if (paramInt1 != -1)
      {
        localObject = paramIntent;
        if (paramIntent != null)
        {
          localObject = paramIntent;
          if (paramIntent.length() > paramInt1) {
            localObject = paramIntent.substring(0, paramInt1) + "...";
          }
        }
      }
      paramInt1 = this.qEK;
      if (this.qxB != null) {
        this.qxB.setImageResource(i.i.pQK);
      }
      if (this.qxE != null) {
        this.qxE.id(false);
      }
      switch (paramInt1)
      {
      }
    }
    for (;;)
    {
      GMTrace.o(8603222147072L, 64099);
      return true;
      paramIntent = (String)localObject + paramIntent;
      break;
      if (this.qxB != null) {
        this.qxB.setImageResource(i.i.pQJ);
      }
      this.qEI.setText(i.j.pSS);
      continue;
      if (this.qxE != null) {
        this.qxE.id(true);
      }
      if ((paramAtContactWidget != null) && (this.qxE != null) && (paramAtContactWidget.bkP().size() > 0))
      {
        com.tencent.mm.ui.base.h.h(this.owr, i.j.pTP, i.j.dxm);
        paramAtContactWidget.bkQ();
        this.qxE.bnO();
      }
      this.qEI.setText(i.j.pSQ);
      continue;
      this.qEI.setText((CharSequence)localObject);
      continue;
      paramIntent = this.qEI;
      paramAtContactWidget = this.owr.getString(i.j.pSE);
      localObject = paramAtContactWidget + "  " + (String)localObject;
      SpannableString localSpannableString = new SpannableString((CharSequence)localObject);
      localSpannableString.setSpan(new ForegroundColorSpan(-65536), paramAtContactWidget.length() + 2, ((String)localObject).length(), 33);
      paramIntent.setText(localSpannableString);
    }
  }
  
  protected int bml()
  {
    GMTrace.i(8603490582528L, 64101);
    GMTrace.o(8603490582528L, 64101);
    return -1;
  }
  
  protected int getLayoutResource()
  {
    GMTrace.i(8603356364800L, 64100);
    int i = i.g.pOh;
    GMTrace.o(8603356364800L, 64100);
    return i;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/RangeWidget.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */