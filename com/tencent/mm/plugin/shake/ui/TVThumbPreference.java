package com.tencent.mm.plugin.shake.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.platformtools.j;
import com.tencent.mm.platformtools.j.a;
import com.tencent.mm.plugin.shake.e.b;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.List;

public class TVThumbPreference
  extends Preference
  implements j.a
{
  public f jqf;
  public ImageView pAu;
  public ImageView pAv;
  public ImageView pAw;
  List<String> pAx;
  
  public TVThumbPreference(Context paramContext)
  {
    this(paramContext, null);
    GMTrace.i(6590358880256L, 49102);
    GMTrace.o(6590358880256L, 49102);
  }
  
  public TVThumbPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(6590224662528L, 49101);
    GMTrace.o(6590224662528L, 49101);
  }
  
  public TVThumbPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6590090444800L, 49100);
    this.pAx = null;
    setLayoutResource(R.i.dhh);
    setWidgetLayoutResource(0);
    j.a(this);
    GMTrace.o(6590090444800L, 49100);
  }
  
  public final void k(String paramString, final Bitmap paramBitmap)
  {
    GMTrace.i(6590761533440L, 49105);
    if ((paramString == null) || (paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(6590761533440L, 49105);
      return;
    }
    if ((this.pAu != null) && (this.pAu.getTag() != null) && (paramString.equals((String)this.pAu.getTag())))
    {
      this.pAu.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6541772062720L, 48740);
          TVThumbPreference.this.pAu.setImageBitmap(paramBitmap);
          if (TVThumbPreference.this.jqf != null) {
            TVThumbPreference.this.jqf.notifyDataSetChanged();
          }
          GMTrace.o(6541772062720L, 48740);
        }
      });
      GMTrace.o(6590761533440L, 49105);
      return;
    }
    if ((this.pAv != null) && (this.pAv.getTag() != null) && (paramString.equals((String)this.pAv.getTag())))
    {
      this.pAv.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6581634727936L, 49037);
          TVThumbPreference.this.pAv.setImageBitmap(paramBitmap);
          if (TVThumbPreference.this.jqf != null) {
            TVThumbPreference.this.jqf.notifyDataSetChanged();
          }
          GMTrace.o(6581634727936L, 49037);
        }
      });
      GMTrace.o(6590761533440L, 49105);
      return;
    }
    if ((this.pAw != null) && (this.pAw.getTag() != null) && (paramString.equals((String)this.pAw.getTag()))) {
      this.pAw.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6582171598848L, 49041);
          TVThumbPreference.this.pAw.setImageBitmap(paramBitmap);
          if (TVThumbPreference.this.jqf != null) {
            TVThumbPreference.this.jqf.notifyDataSetChanged();
          }
          GMTrace.o(6582171598848L, 49041);
        }
      });
    }
    GMTrace.o(6590761533440L, 49105);
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6590627315712L, 49104);
    super.onBindView(paramView);
    this.pAu = ((ImageView)paramView.findViewById(R.h.cAD));
    this.pAv = ((ImageView)paramView.findViewById(R.h.cAE));
    this.pAw = ((ImageView)paramView.findViewById(R.h.cAF));
    if (this.pAx != null)
    {
      if (this.pAx.size() <= 0)
      {
        GMTrace.o(6590627315712L, 49104);
        return;
      }
      paramView = new b((String)this.pAx.get(0));
      this.pAu.setTag(paramView.Pi());
      paramView = j.a(paramView);
      if ((paramView != null) && (!paramView.isRecycled())) {
        this.pAu.setImageBitmap(paramView);
      }
      this.pAu.setVisibility(0);
      if (1 >= this.pAx.size())
      {
        GMTrace.o(6590627315712L, 49104);
        return;
      }
      paramView = new b((String)this.pAx.get(1));
      this.pAv.setTag(paramView.Pi());
      paramView = j.a(paramView);
      if ((paramView != null) && (!paramView.isRecycled())) {
        this.pAv.setImageBitmap(paramView);
      }
      this.pAv.setVisibility(0);
      if (2 >= this.pAx.size())
      {
        GMTrace.o(6590627315712L, 49104);
        return;
      }
      paramView = new b((String)this.pAx.get(2));
      this.pAw.setTag(paramView.Pi());
      paramView = j.a(paramView);
      if ((paramView != null) && (!paramView.isRecycled())) {
        this.pAw.setImageBitmap(paramView);
      }
      this.pAw.setVisibility(0);
    }
    GMTrace.o(6590627315712L, 49104);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    GMTrace.i(6590493097984L, 49103);
    paramViewGroup = super.onCreateView(paramViewGroup);
    GMTrace.o(6590493097984L, 49103);
    return paramViewGroup;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/ui/TVThumbPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */