package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.v;
import com.tencent.mm.ui.widget.MMSpinnerDatePicker;

public class DatePickerDialogView
  extends LinearLayout
  implements View.OnClickListener
{
  private CollectRadioBtnView kPe;
  private CollectRadioBtnView kPf;
  private CollectRadioBtnView kPg;
  MMSpinnerDatePicker kPh;
  TextView kPi;
  TextView kPj;
  int kPk;
  
  public DatePickerDialogView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5417967026176L, 40367);
    this.kPk = 0;
    init(paramContext);
    GMTrace.o(5417967026176L, 40367);
  }
  
  public DatePickerDialogView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5418101243904L, 40368);
    this.kPk = 0;
    init(paramContext);
    GMTrace.o(5418101243904L, 40368);
  }
  
  public DatePickerDialogView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(5418235461632L, 40369);
    this.kPk = 0;
    init(paramContext);
    GMTrace.o(5418235461632L, 40369);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(5418369679360L, 40370);
    paramContext = v.fa(paramContext).inflate(R.i.cQF, this);
    this.kPe = ((CollectRadioBtnView)paramContext.findViewById(R.h.cLO));
    this.kPf = ((CollectRadioBtnView)paramContext.findViewById(R.h.cds));
    this.kPg = ((CollectRadioBtnView)paramContext.findViewById(R.h.bAi));
    this.kPi = ((TextView)paramContext.findViewById(R.h.bwX));
    this.kPj = ((TextView)paramContext.findViewById(R.h.bov));
    this.kPe.setOnClickListener(this);
    this.kPf.setOnClickListener(this);
    this.kPg.setOnClickListener(this);
    this.kPe.uN("年");
    this.kPf.uN("月");
    this.kPg.uN("日");
    this.kPh = ((MMSpinnerDatePicker)paramContext.findViewById(R.h.bAh));
    this.kPh.DC(R.e.transparent);
    paramContext = this.kPh;
    int i = R.f.aSh;
    paramContext.a(paramContext.wUg, i);
    paramContext.a(paramContext.wUh, i);
    paramContext.a(paramContext.wUi, i);
    GMTrace.o(5418369679360L, 40370);
  }
  
  final void aox()
  {
    GMTrace.i(5418638114816L, 40372);
    if (this.kPk == 2)
    {
      this.kPe.me(R.k.dqr);
      this.kPf.me(R.k.dqq);
      this.kPg.me(R.k.dqq);
    }
    for (;;)
    {
      this.kPh.DB(this.kPk);
      GMTrace.o(5418638114816L, 40372);
      return;
      if (this.kPk == 1)
      {
        this.kPe.me(R.k.dqq);
        this.kPf.me(R.k.dqr);
        this.kPg.me(R.k.dqq);
      }
      else
      {
        this.kPe.me(R.k.dqq);
        this.kPf.me(R.k.dqq);
        this.kPg.me(R.k.dqr);
      }
    }
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(5418503897088L, 40371);
    int i = paramView.getId();
    if (i == R.h.cLO) {
      this.kPk = 2;
    }
    for (;;)
    {
      aox();
      GMTrace.o(5418503897088L, 40371);
      return;
      if (i == R.h.cds) {
        this.kPk = 1;
      } else if (i == R.h.bAi) {
        this.kPk = 0;
      } else {
        w.i("MicroMsg.DatePickerDialogView", "unhandled click view: %s", new Object[] { paramView.getClass().toString() });
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/ui/DatePickerDialogView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */