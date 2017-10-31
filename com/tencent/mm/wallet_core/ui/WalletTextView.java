package com.tencent.mm.wallet_core.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.wallet_core.ui.a.a;
import java.util.WeakHashMap;

@SuppressLint({"AppCompatCustomView"})
public class WalletTextView
  extends TextView
{
  public WalletTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(1477334532096L, 11007);
    GMTrace.o(1477334532096L, 11007);
  }
  
  public WalletTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(1477468749824L, 11008);
    GMTrace.o(1477468749824L, 11008);
  }
  
  public CharSequence getText()
  {
    GMTrace.i(19127502635008L, 142511);
    Object localObject = a.cjx();
    if ((com.tencent.mm.plugin.normsg.a.d.okG.bg(this)) && (!((a)localObject).xil.containsKey(this)))
    {
      com.tencent.mm.plugin.report.d.oZR.a(715L, 0L, 1L, false);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<st><Manufacturer>").append(Build.MANUFACTURER).append("</Manufacturer><Model>").append(Build.MODEL).append("</Model><VersionRelease>").append(Build.VERSION.RELEASE).append("</VersionRelease><VersionIncremental>").append(Build.VERSION.INCREMENTAL).append("</VersionIncremental><Display>").append(Build.DISPLAY).append("</Display></st>");
      com.tencent.mm.plugin.secinforeport.a.d.poR.Ft(localStringBuilder.toString());
      ((a)localObject).xil.put(this, Boolean.valueOf(true));
    }
    localObject = super.getText();
    GMTrace.o(19127502635008L, 142511);
    return (CharSequence)localObject;
  }
  
  public void setTypeface(Typeface paramTypeface)
  {
    GMTrace.i(1477737185280L, 11010);
    super.setTypeface(e.fL(getContext()));
    GMTrace.o(1477737185280L, 11010);
  }
  
  public void setTypeface(Typeface paramTypeface, int paramInt)
  {
    GMTrace.i(1477602967552L, 11009);
    super.setTypeface(e.fL(getContext()), paramInt);
    GMTrace.o(1477602967552L, 11009);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/wallet_core/ui/WalletTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */