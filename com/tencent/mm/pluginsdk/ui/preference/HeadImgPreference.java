package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.base.preference.Preference;

public final class HeadImgPreference
  extends Preference
{
  private int height;
  private ImageView jso;
  public View.OnClickListener sPf;
  private Bitmap tif;
  
  public HeadImgPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(1054682906624L, 7858);
    GMTrace.o(1054682906624L, 7858);
  }
  
  public HeadImgPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1054817124352L, 7859);
    this.height = -1;
    setLayoutResource(R.i.dap);
    GMTrace.o(1054817124352L, 7859);
  }
  
  public final void N(Bitmap paramBitmap)
  {
    GMTrace.i(1055085559808L, 7861);
    this.tif = null;
    if (this.jso != null)
    {
      this.jso.setImageBitmap(paramBitmap);
      GMTrace.o(1055085559808L, 7861);
      return;
    }
    this.tif = paramBitmap;
    GMTrace.o(1055085559808L, 7861);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(1055219777536L, 7862);
    super.onBindView(paramView);
    if (this.jso == null) {
      this.jso = ((ImageView)paramView.findViewById(R.h.bPs));
    }
    if (this.sPf != null) {
      this.jso.setOnClickListener(this.sPf);
    }
    if (this.tif != null)
    {
      this.jso.setImageBitmap(this.tif);
      this.tif = null;
    }
    paramView = (LinearLayout)paramView.findViewById(R.h.ccz);
    if (this.height != -1) {
      paramView.setMinimumHeight(this.height);
    }
    GMTrace.o(1055219777536L, 7862);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(1054951342080L, 7860);
    paramViewGroup = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    View.inflate(this.mContext, R.i.daw, localViewGroup);
    this.jso = ((ImageView)paramViewGroup.findViewById(R.h.bPs));
    GMTrace.o(1054951342080L, 7860);
    return paramViewGroup;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/preference/HeadImgPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */