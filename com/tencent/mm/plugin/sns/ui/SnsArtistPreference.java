package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public final class SnsArtistPreference
  extends Preference
{
  private MMActivity fsU;
  private String mTitle;
  private String ppV;
  private int ppW;
  private int ppX;
  private TextView qGE;
  String qGF;
  
  public SnsArtistPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(8549132402688L, 63696);
    this.fsU = ((MMActivity)paramContext);
    GMTrace.o(8549132402688L, 63696);
  }
  
  public SnsArtistPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(8549266620416L, 63697);
    this.ppV = "";
    this.mTitle = "";
    this.ppW = -1;
    this.ppX = 8;
    this.qGE = null;
    this.qGF = "";
    this.fsU = ((MMActivity)paramContext);
    setLayoutResource(i.g.dap);
    setWidgetLayoutResource(i.g.daZ);
    GMTrace.o(8549266620416L, 63697);
  }
  
  public final void bmw()
  {
    GMTrace.i(8549400838144L, 63698);
    if ((this.qGE != null) && (this.qGF != null) && (!this.qGF.equals("")) && (this.fsU != null))
    {
      String str = this.fsU.getString(i.j.pRo, new Object[] { this.qGF });
      this.qGE.setText(str);
    }
    GMTrace.o(8549400838144L, 63698);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(8549669273600L, 63700);
    super.onBindView(paramView);
    this.qGE = ((TextView)paramView.findViewById(i.f.pJa));
    ((TextView)paramView.findViewById(i.f.bhB)).setText(this.mTitle);
    paramView = (TextView)paramView.findViewById(i.f.cAs);
    if (paramView != null)
    {
      paramView.setVisibility(this.ppX);
      paramView.setText(this.ppV);
      if (this.ppW != -1) {
        paramView.setBackgroundDrawable(a.b(this.fsU, this.ppW));
      }
    }
    bmw();
    GMTrace.o(8549669273600L, 63700);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(8549535055872L, 63699);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(i.f.content);
    localViewGroup.removeAllViews();
    this.mTitle = this.fsU.getString(i.j.pRp);
    localLayoutInflater.inflate(i.g.pOb, localViewGroup);
    GMTrace.o(8549535055872L, 63699);
    return paramViewGroup;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsArtistPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */