package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.ipcinvoker.g;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.ipcinvoker.type.IPCString;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.plugin.appbrand.collector.f;
import com.tencent.mm.plugin.appbrand.q.a.a;
import com.tencent.mm.plugin.appbrand.q.a.b;
import com.tencent.mm.plugin.appbrand.q.a.c;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

public class WxaWidgetPerformanceUI
  extends MMActivity
{
  MMSwitchBtn iNA;
  MMSwitchBtn iNB;
  MMSwitchBtn iNC;
  
  public WxaWidgetPerformanceUI()
  {
    GMTrace.i(18320585654272L, 136499);
    GMTrace.o(18320585654272L, 136499);
  }
  
  public void finish()
  {
    GMTrace.i(18320854089728L, 136501);
    if ((isFinishing()) || (this.vox))
    {
      GMTrace.o(18320854089728L, 136501);
      return;
    }
    if (Build.VERSION.SDK_INT >= 21) {
      finishAndRemoveTask();
    }
    for (;;)
    {
      TypedArray localTypedArray = obtainStyledAttributes(16973825, new int[] { 16842938, 16842939 });
      int i = localTypedArray.getResourceId(0, 0);
      int j = localTypedArray.getResourceId(1, 0);
      localTypedArray.recycle();
      overridePendingTransition(i, j);
      GMTrace.o(18320854089728L, 136501);
      return;
      super.finish();
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(18320988307456L, 136502);
    int i = a.b.jKk;
    GMTrace.o(18320988307456L, 136502);
    return i;
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(18320719872000L, 136500);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(18327699193856L, 136552);
        WxaWidgetPerformanceUI.this.finish();
        GMTrace.o(18327699193856L, 136552);
        return false;
      }
    });
    oC(a.c.jKp);
    final Object localObject = (TextView)findViewById(a.a.jJX);
    paramBundle = findViewById(a.a.jKc);
    paramBundle.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18322062049280L, 136510);
        Object localObject = c.oB("jsapi_draw_canvas").toString();
        paramAnonymousView = new StringBuilder();
        if ((localObject != null) && (((String)localObject).length() > 0))
        {
          int i = c.aN("jsapi_draw_canvas", "__invoke_jsapi_data_size");
          paramAnonymousView.append("data size :").append(i).append("\n").append((String)localObject);
        }
        localObject = (IPCString)e.a("com.tencent.mm:support", new IPCString("widget_launch"), WxaWidgetPerformanceUI.e.class);
        if (localObject != null) {
          paramAnonymousView.append("\n\n").append(localObject);
        }
        if (f.TL()) {
          paramAnonymousView.append("\n\n").append(f.TM());
        }
        localObject.setText(paramAnonymousView.toString());
        GMTrace.o(18322062049280L, 136510);
      }
    });
    findViewById(a.a.bvk).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18323672662016L, 136522);
        e.a("com.tencent.mm:support", null, WxaWidgetPerformanceUI.a.class, null);
        c.clear();
        f.reset();
        localObject.setText(c.oB("jsapi_draw_canvas").toString());
        GMTrace.o(18323672662016L, 136522);
      }
    });
    localObject = (MMSwitchBtn)findViewById(a.a.jJZ);
    boolean bool = c.TK();
    ((MMSwitchBtn)localObject).mx(bool);
    ((MMSwitchBtn)localObject).wUC = new MMSwitchBtn.a()
    {
      public final void cc(boolean paramAnonymousBoolean)
      {
        GMTrace.i(18317632864256L, 136477);
        e.a("com.tencent.mm:support", new IPCBoolean(paramAnonymousBoolean), WxaWidgetPerformanceUI.d.class, null);
        c.bY(paramAnonymousBoolean);
        paramBundle.setEnabled(paramAnonymousBoolean);
        WxaWidgetPerformanceUI.this.iNA.setEnabled(paramAnonymousBoolean);
        WxaWidgetPerformanceUI.this.iNB.setEnabled(paramAnonymousBoolean);
        WxaWidgetPerformanceUI.this.iNC.setEnabled(paramAnonymousBoolean);
        GMTrace.o(18317632864256L, 136477);
      }
    };
    paramBundle.setEnabled(bool);
    this.iNA = ((MMSwitchBtn)findViewById(a.a.jJH));
    this.iNA.setEnabled(bool);
    this.iNA.mx(c.oE("jsapi_draw_canvas"));
    this.iNA.wUC = new MMSwitchBtn.a()
    {
      public final void cc(boolean paramAnonymousBoolean)
      {
        GMTrace.i(18329846677504L, 136568);
        e.a("com.tencent.mm:support", new IPCBoolean(paramAnonymousBoolean), WxaWidgetPerformanceUI.b.class, null);
        if (paramAnonymousBoolean)
        {
          c.oC("jsapi_draw_canvas");
          GMTrace.o(18329846677504L, 136568);
          return;
        }
        c.oD("jsapi_draw_canvas");
        GMTrace.o(18329846677504L, 136568);
      }
    };
    this.iNB = ((MMSwitchBtn)findViewById(a.a.jJJ));
    this.iNB.setEnabled(bool);
    this.iNB.mx(c.oE("widget_launch"));
    this.iNB.wUC = new MMSwitchBtn.a()
    {
      public final void cc(boolean paramAnonymousBoolean)
      {
        GMTrace.i(18319511912448L, 136491);
        e.a("com.tencent.mm:support", new IPCBoolean(paramAnonymousBoolean), WxaWidgetPerformanceUI.c.class, null);
        if (paramAnonymousBoolean)
        {
          c.oC("widget_launch");
          GMTrace.o(18319511912448L, 136491);
          return;
        }
        c.oD("widget_launch");
        GMTrace.o(18319511912448L, 136491);
      }
    };
    this.iNC = ((MMSwitchBtn)findViewById(a.a.jJI));
    this.iNC.setEnabled(bool);
    this.iNC.mx(f.TL());
    this.iNC.wUC = new MMSwitchBtn.a()
    {
      public final void cc(boolean paramAnonymousBoolean)
      {
        GMTrace.i(19925695463424L, 148458);
        f.bZ(paramAnonymousBoolean);
        GMTrace.o(19925695463424L, 148458);
      }
    };
    GMTrace.o(18320719872000L, 136500);
  }
  
  private static class a
    implements g<IPCVoid, IPCVoid>
  {
    private a()
    {
      GMTrace.i(18322196267008L, 136511);
      GMTrace.o(18322196267008L, 136511);
    }
  }
  
  private static class b
    implements g<IPCBoolean, IPCVoid>
  {
    private b()
    {
      GMTrace.i(18327833411584L, 136553);
      GMTrace.o(18327833411584L, 136553);
    }
  }
  
  private static class c
    implements g<IPCBoolean, IPCVoid>
  {
    private c()
    {
      GMTrace.i(18318303952896L, 136482);
      GMTrace.o(18318303952896L, 136482);
    }
  }
  
  private static class d
    implements g<IPCBoolean, IPCVoid>
  {
    private d()
    {
      GMTrace.i(18319646130176L, 136492);
      GMTrace.o(18319646130176L, 136492);
    }
  }
  
  private static class e
    implements i<IPCString, IPCString>
  {
    private e()
    {
      GMTrace.i(18326222798848L, 136541);
      GMTrace.o(18326222798848L, 136541);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/ui/WxaWidgetPerformanceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */