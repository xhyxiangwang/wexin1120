package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.u;
import android.view.View;
import android.view.ViewGroup;

public abstract class n
  extends u
{
  private final l ql;
  private p qm = null;
  private Fragment qn = null;
  
  public n(l paraml)
  {
    this.ql = paraml;
  }
  
  private static String b(int paramInt, long paramLong)
  {
    return "android:switcher:" + paramInt + ":" + paramLong;
  }
  
  public abstract Fragment I(int paramInt);
  
  public final void a(Parcelable paramParcelable, ClassLoader paramClassLoader) {}
  
  public final void a(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (this.qm == null) {
      this.qm = this.ql.aV();
    }
    this.qm.b((Fragment)paramObject);
  }
  
  public final boolean a(View paramView, Object paramObject)
  {
    return ((Fragment)paramObject).mView == paramView;
  }
  
  public final Object b(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.qm == null) {
      this.qm = this.ql.aV();
    }
    long l = paramInt;
    Object localObject = b(paramViewGroup.getId(), l);
    localObject = this.ql.l((String)localObject);
    if (localObject != null) {
      this.qm.c((Fragment)localObject);
    }
    for (paramViewGroup = (ViewGroup)localObject;; paramViewGroup = (ViewGroup)localObject)
    {
      if (paramViewGroup != this.qn)
      {
        paramViewGroup.setMenuVisibility(false);
        paramViewGroup.setUserVisibleHint(false);
      }
      return paramViewGroup;
      localObject = I(paramInt);
      this.qm.a(paramViewGroup.getId(), (Fragment)localObject, b(paramViewGroup.getId(), l));
    }
  }
  
  public final void ba()
  {
    if (this.qm != null)
    {
      this.qm.commitAllowingStateLoss();
      this.qm = null;
      this.ql.executePendingTransactions();
    }
  }
  
  public final Parcelable bb()
  {
    return null;
  }
  
  public final void d(Object paramObject)
  {
    paramObject = (Fragment)paramObject;
    if (paramObject != this.qn)
    {
      if (this.qn != null)
      {
        this.qn.setMenuVisibility(false);
        this.qn.setUserVisibleHint(false);
      }
      if (paramObject != null)
      {
        ((Fragment)paramObject).setMenuVisibility(true);
        ((Fragment)paramObject).setUserVisibleHint(true);
      }
      this.qn = ((Fragment)paramObject);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/android/support/v4/app/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */