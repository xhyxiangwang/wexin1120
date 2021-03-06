package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.game.model.e;
import com.tencent.mm.ui.base.preference.Preference;

public class GameRegionPreference
  extends Preference
{
  a mOY;
  
  public GameRegionPreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(12697399721984L, 94603);
    GMTrace.o(12697399721984L, 94603);
  }
  
  public GameRegionPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(12697533939712L, 94604);
    GMTrace.o(12697533939712L, 94604);
  }
  
  public GameRegionPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(12697668157440L, 94605);
    setLayoutResource(R.i.dap);
    GMTrace.o(12697668157440L, 94605);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(12697936592896L, 94607);
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(R.h.cqr);
    paramView = (CheckBox)paramView.findViewById(R.h.cyU);
    if ((localTextView != null) && (paramView != null) && (this.mOY != null))
    {
      localTextView.setText(e.a(this.mOY));
      paramView.setChecked(this.mOY.mPc);
    }
    GMTrace.o(12697936592896L, 94607);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(12697802375168L, 94606);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.cWX, localViewGroup);
    GMTrace.o(12697802375168L, 94606);
    return paramViewGroup;
  }
  
  public static final class a
  {
    public String gcc;
    public boolean isDefault;
    public String mOZ;
    public String mPa;
    public String mPb;
    public boolean mPc;
    
    public a()
    {
      GMTrace.i(12672972095488L, 94421);
      GMTrace.o(12672972095488L, 94421);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameRegionPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */