package com.tencent.mm.plugin.appbrand.jsapi.i;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.f;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.plugin.appbrand.p.f;
import com.tencent.mm.plugin.appbrand.p.g;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 107;
  private static final String NAME = "showActionSheet";
  
  public b()
  {
    GMTrace.i(17680367091712L, 131729);
    GMTrace.o(17680367091712L, 131729);
  }
  
  public final void a(final k paramk, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17680501309440L, 131730);
    final Object localObject1 = b(paramk);
    if (localObject1 == null)
    {
      w.w("MicroMsg.JsApiShowActionSheet", "invoke JsApi JsApiShowActionSheet failed, current page view is null.");
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(17680501309440L, 131730);
      return;
    }
    m.k((AppBrandPageView)localObject1);
    Object localObject2 = paramJSONObject.optString("itemList");
    localObject1 = new ArrayList();
    try
    {
      localObject2 = new JSONArray((String)localObject2);
      int i = 0;
      while (i < ((JSONArray)localObject2).length())
      {
        ((ArrayList)localObject1).add((String)((JSONArray)localObject2).get(i));
        i += 1;
      }
      af.u(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17678085390336L, 131712);
          if (!paramk.UF)
          {
            GMTrace.o(17678085390336L, 131712);
            return;
          }
          Object localObject = b.this.a(paramk);
          final com.tencent.mm.plugin.appbrand.widget.c.a locala = new com.tencent.mm.plugin.appbrand.widget.c.a((Context)localObject);
          int i = c.aA(paramJSONObject.optString("itemColor", ""), Color.parseColor("#000000"));
          localObject = (ViewGroup)View.inflate((Context)localObject, p.g.gXG, null);
          locala.setContentView((View)localObject);
          localObject = (ListView)((ViewGroup)localObject).findViewById(p.f.list);
          ((ListView)localObject).setAdapter(new b.a(localObject1, i));
          ((ListView)localObject).setOnItemClickListener(new AdapterView.OnItemClickListener()
          {
            public final void onItemClick(AdapterView<?> paramAnonymous2AdapterView, View paramAnonymous2View, int paramAnonymous2Int, long paramAnonymous2Long)
            {
              GMTrace.i(17682648793088L, 131746);
              paramAnonymous2AdapterView = new HashMap();
              paramAnonymous2AdapterView.put("tapIndex", Integer.valueOf(paramAnonymous2Int));
              b.1.this.iPN.v(b.1.this.gQa, b.this.d("ok", paramAnonymous2AdapterView));
              locala.dismiss();
              GMTrace.o(17682648793088L, 131746);
            }
          });
          locala.setOnCancelListener(new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(17681306615808L, 131736);
              b.1.this.iPN.v(b.1.this.gQa, b.this.d("cancel", null));
              GMTrace.o(17681306615808L, 131736);
            }
          });
          paramk.irS.a(locala);
          GMTrace.o(17678085390336L, 131712);
        }
      });
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiShowActionSheet", paramJSONObject.getMessage());
      paramk.v(paramInt, d("fail", null));
      GMTrace.o(17680501309440L, 131730);
      return;
    }
    GMTrace.o(17680501309440L, 131730);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private final ArrayList<String> jaC;
    private final int jaD;
    
    public a(ArrayList<String> paramArrayList, int paramInt)
    {
      GMTrace.i(18243142025216L, 135922);
      this.jaC = paramArrayList;
      this.jaD = paramInt;
      GMTrace.o(18243142025216L, 135922);
    }
    
    private String iD(int paramInt)
    {
      GMTrace.i(17679293349888L, 131721);
      String str = (String)this.jaC.get(paramInt);
      GMTrace.o(17679293349888L, 131721);
      return str;
    }
    
    public final int getCount()
    {
      GMTrace.i(17679159132160L, 131720);
      int i = this.jaC.size();
      GMTrace.o(17679159132160L, 131720);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(17679427567616L, 131722);
      long l = paramInt;
      GMTrace.o(17679427567616L, 131722);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(17679561785344L, 131723);
      View localView;
      if (paramView == null)
      {
        localView = View.inflate(paramViewGroup.getContext(), p.g.ivu, null);
        paramView = new a();
        paramView.jaE = ((TextView)localView.findViewById(p.f.title));
        localView.setTag(paramView);
        paramViewGroup = paramView;
      }
      for (;;)
      {
        paramViewGroup.jaE.setText(iD(paramInt));
        paramViewGroup.jaE.setTextColor(this.jaD);
        GMTrace.o(17679561785344L, 131723);
        return localView;
        paramViewGroup = (a)paramView.getTag();
        localView = paramView;
      }
    }
    
    private static final class a
    {
      TextView jaE;
      
      public a()
      {
        GMTrace.i(18242605154304L, 135918);
        GMTrace.o(18242605154304L, 135918);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/i/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */