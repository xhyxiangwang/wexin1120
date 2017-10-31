package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.ay.i;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.webview.c.b;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.i;
import com.tencent.mm.plugin.webview.ui.tools.f;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.fts.widget.FTSEditTextView;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.a;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.b;
import com.tencent.mm.ui.fts.widget.a;
import com.tencent.mm.ui.fts.widget.a.a;
import com.tencent.mm.ui.fts.widget.a.b;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.j;
import com.tencent.xweb.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FTSBaseWebViewUI
  extends BaseSearchWebviewUI
  implements FTSEditTextView.a, a.a
{
  public a pmg;
  int scene;
  private boolean sux;
  private b sva;
  private boolean svp;
  int type;
  
  public FTSBaseWebViewUI()
  {
    GMTrace.i(12306155044864L, 91688);
    GMTrace.o(12306155044864L, 91688);
  }
  
  protected static boolean bCF()
  {
    GMTrace.i(12308570963968L, 91706);
    GMTrace.o(12308570963968L, 91706);
    return true;
  }
  
  protected static boolean bCG()
  {
    GMTrace.i(12308705181696L, 91707);
    GMTrace.o(12308705181696L, 91707);
    return true;
  }
  
  private void bCx()
  {
    GMTrace.i(15640123408384L, 116528);
    aKl();
    finish();
    GMTrace.o(15640123408384L, 116528);
  }
  
  public void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    GMTrace.i(16912507469824L, 126008);
    w.i("MicroMsg.FTS.FTSBaseWebViewUI", "onEditTextChange %s %s %s", new Object[] { paramString1, paramString2, paramb });
    if ((paramb == FTSEditTextView.b.wGg) || (paramb == FTSEditTextView.b.wGh)) {
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12303068037120L, 91665);
          if (FTSBaseWebViewUI.a(FTSBaseWebViewUI.this) != null) {
            FTSBaseWebViewUI.b(FTSBaseWebViewUI.this).a(FTSBaseWebViewUI.this.bCI(), FTSBaseWebViewUI.this.bCK(), FTSBaseWebViewUI.this.bCL());
          }
          GMTrace.o(12303068037120L, 91665);
        }
      });
    }
    GMTrace.o(16912507469824L, 126008);
  }
  
  public boolean aaj()
  {
    GMTrace.i(12307765657600L, 91700);
    w.i("MicroMsg.FTS.FTSBaseWebViewUI", "onSearchKeyDown");
    if (bCI().length() > 0)
    {
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12302799601664L, 91663);
          if (FTSBaseWebViewUI.e(FTSBaseWebViewUI.this) != null) {
            FTSBaseWebViewUI.f(FTSBaseWebViewUI.this).a(FTSBaseWebViewUI.this.bCI(), FTSBaseWebViewUI.this.bCK(), FTSBaseWebViewUI.this.bCL(), 0, null);
          }
          GMTrace.o(12302799601664L, 91663);
        }
      });
      aKl();
    }
    GMTrace.o(12307765657600L, 91700);
    return false;
  }
  
  public void aal()
  {
    GMTrace.i(12306289262592L, 91689);
    super.aal();
    String str = bg.ap(getIntent().getStringExtra("ftsQuery"), "").trim();
    this.type = getIntent().getIntExtra("ftsType", 0);
    this.scene = getIntent().getIntExtra("ftsbizscene", 3);
    this.sux = getIntent().getBooleanExtra("ftsneedkeyboard", false);
    this.svp = getIntent().getBooleanExtra("ftscaneditable", true);
    this.oKv.setWebViewClient(new b());
    this.oKv.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(12301994295296L, 91657);
        FTSBaseWebViewUI.this.aKl();
        GMTrace.o(12301994295296L, 91657);
        return false;
      }
    });
    if (this.svp)
    {
      this.pmg = new a(this);
      this.pmg.wGx = this;
      this.pmg.wGw.Il(getHint());
      this.pmg.wGw.wGd = this;
      cO().cP().setCustomView(this.pmg);
      if (!bg.mZ(str)) {
        this.pmg.wGw.r(str, null);
      }
      if (this.sux)
      {
        this.pmg.wGw.cez();
        this.pmg.wGw.cey();
      }
    }
    kT(false);
    if (this.ssT != null) {
      this.ssT.jp(true);
    }
    this.oKv.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(12313000148992L, 91739);
        GMTrace.o(12313000148992L, 91739);
        return true;
      }
    });
    this.sva.sjk = this.sjk;
    GMTrace.o(12306289262592L, 91689);
  }
  
  protected final void bBQ()
  {
    GMTrace.i(12308973617152L, 91709);
    bCx();
    GMTrace.o(12308973617152L, 91709);
  }
  
  protected final int bBT()
  {
    GMTrace.i(12306423480320L, 91690);
    int i = R.g.aVv;
    GMTrace.o(12306423480320L, 91690);
    return i;
  }
  
  protected final boolean bBU()
  {
    GMTrace.i(12306960351232L, 91694);
    GMTrace.o(12306960351232L, 91694);
    return false;
  }
  
  protected final b bCH()
  {
    GMTrace.i(19409628299264L, 144613);
    b localb = this.sva;
    GMTrace.o(19409628299264L, 144613);
    return localb;
  }
  
  protected final String bCI()
  {
    GMTrace.i(12306691915776L, 91692);
    String str = this.pmg.wGw.bCI();
    GMTrace.o(12306691915776L, 91692);
    return str;
  }
  
  protected final String bCK()
  {
    GMTrace.i(12306826133504L, 91693);
    String str = this.pmg.wGw.bCK();
    GMTrace.o(12306826133504L, 91693);
    return str;
  }
  
  public final JSONArray bCL()
  {
    GMTrace.i(12307899875328L, 91701);
    Object localObject = this.pmg.wGw.qOG;
    JSONArray localJSONArray = new JSONArray();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("tagName", locala.svi);
        localJSONObject.put("tagType", locala.svj);
        localJSONObject.put("userName", locala.userName);
        localJSONArray.put(localJSONObject);
      }
      catch (JSONException localJSONException) {}
    }
    GMTrace.o(12307899875328L, 91701);
    return localJSONArray;
  }
  
  protected final boolean bCd()
  {
    GMTrace.i(12306557698048L, 91691);
    GMTrace.o(12306557698048L, 91691);
    return true;
  }
  
  protected final boolean bCi()
  {
    GMTrace.i(12308839399424L, 91708);
    GMTrace.o(12308839399424L, 91708);
    return false;
  }
  
  public final void bbV()
  {
    GMTrace.i(12307631439872L, 91699);
    if (this.pmg != null)
    {
      if (!this.pmg.wGw.vNy.hasFocus())
      {
        this.pmg.wGw.cez();
        aKp();
      }
      this.pmg.wGw.Il(getHint());
    }
    GMTrace.o(12307631439872L, 91699);
  }
  
  public final void bbY()
  {
    GMTrace.i(12307094568960L, 91695);
    bCx();
    GMTrace.o(12307094568960L, 91695);
  }
  
  public final void bbZ()
  {
    GMTrace.i(16912373252096L, 126007);
    if (!this.pmg.wGw.vNy.hasFocus())
    {
      this.pmg.wGw.cez();
      aKp();
    }
    GMTrace.o(16912373252096L, 126007);
  }
  
  public void g(final int paramInt, final Bundle paramBundle)
  {
    final int i = 0;
    GMTrace.i(12308034093056L, 91702);
    final Object localObject1;
    switch (paramInt)
    {
    default: 
      super.g(paramInt, paramBundle);
    case 128: 
    case 119: 
    case 120: 
    case 121: 
    case 122: 
      for (;;)
      {
        GMTrace.o(12308034093056L, 91702);
        return;
        paramBundle.getString("fts_key_json_data");
        paramBundle.getBoolean("fts_key_new_query", true);
        localObject1 = new HashMap();
        Object localObject2 = paramBundle.keySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (String)((Iterator)localObject2).next();
          ((Map)localObject1).put(localObject3, paramBundle.get((String)localObject3));
        }
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12304007561216L, 91672);
            if (FTSBaseWebViewUI.j(FTSBaseWebViewUI.this) != null) {
              FTSBaseWebViewUI.k(FTSBaseWebViewUI.this).ab(localObject1);
            }
            GMTrace.o(12304007561216L, 91672);
          }
        });
        GMTrace.o(12308034093056L, 91702);
        return;
        localObject1 = paramBundle.getString("fts_key_json_data");
        final boolean bool = paramBundle.getBoolean("fts_key_new_query", true);
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12303336472576L, 91667);
            if (FTSBaseWebViewUI.l(FTSBaseWebViewUI.this) != null) {
              FTSBaseWebViewUI.m(FTSBaseWebViewUI.this).aD(localObject1, bool);
            }
            GMTrace.o(12303336472576L, 91667);
          }
        });
        GMTrace.o(12308034093056L, 91702);
        return;
        paramInt = paramBundle.getInt("fts_key_ret", 0);
        paramBundle = paramBundle.getString("fts_key_data");
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15639318102016L, 116522);
            if (FTSBaseWebViewUI.n(FTSBaseWebViewUI.this) != null) {
              FTSBaseWebViewUI.o(FTSBaseWebViewUI.this).az(paramInt, paramBundle);
            }
            GMTrace.o(15639318102016L, 116522);
          }
        });
        GMTrace.o(12308034093056L, 91702);
        return;
        localObject1 = paramBundle.getString("fts_key_json_data");
        paramInt = paramBundle.getInt("fts_key_teach_request_type", 0);
        i = paramBundle.getInt("fts_key_is_cache_data", 0);
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(17830556729344L, 132848);
            if (FTSBaseWebViewUI.p(FTSBaseWebViewUI.this) != null) {
              FTSBaseWebViewUI.q(FTSBaseWebViewUI.this).d(paramInt, localObject1, i);
            }
            GMTrace.o(17830556729344L, 132848);
          }
        });
        GMTrace.o(12308034093056L, 91702);
        return;
        localObject1 = paramBundle.getString("fts_key_new_query");
        localObject2 = paramBundle.getString("fts_key_custom_query");
        bool = paramBundle.getBoolean("fts_key_need_keyboard", false);
        Object localObject3 = paramBundle.getString("fts_key_tag_list");
        w.i("MicroMsg.FTS.FTSBaseWebViewUI", "onFTSSearchQueryChange: totalQuery: %s isInputChange %b", new Object[] { localObject1, Boolean.valueOf(bool) });
        paramBundle = new ArrayList();
        try
        {
          if (!bg.mZ((String)localObject3))
          {
            localObject3 = new JSONArray((String)localObject3);
            paramInt = i;
            while (paramInt < ((JSONArray)localObject3).length())
            {
              JSONObject localJSONObject = ((JSONArray)localObject3).getJSONObject(paramInt);
              a locala = new a();
              locala.svi = localJSONObject.getString("tagName");
              locala.svj = localJSONObject.getInt("tagType");
              locala.userName = localJSONObject.getString("userName");
              paramBundle.add(locala);
              paramInt += 1;
            }
          }
          if (this.pmg == null) {}
        }
        catch (Exception localException)
        {
          if (this.pmg != null)
          {
            if (paramBundle.size() <= 0) {
              break label642;
            }
            this.pmg.wGw.r((String)localObject2, paramBundle);
          }
          while (bool)
          {
            this.handler.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(12312463278080L, 91735);
                if (FTSBaseWebViewUI.r(FTSBaseWebViewUI.this) != null) {
                  FTSBaseWebViewUI.s(FTSBaseWebViewUI.this).a(FTSBaseWebViewUI.this.bCI(), FTSBaseWebViewUI.this.bCK(), FTSBaseWebViewUI.this.bCL());
                }
                GMTrace.o(12312463278080L, 91735);
              }
            });
            if (this.pmg != null) {
              this.pmg.wGw.cez();
            }
            bCk();
            GMTrace.o(12308034093056L, 91702);
            return;
            this.pmg.wGw.r((String)localObject1, paramBundle);
          }
        }
      }
      this.pmg.wGw.vNy.clearFocus();
      GMTrace.o(12308034093056L, 91702);
      return;
    case 124: 
      paramBundle = paramBundle.getString("fts_key_json_data");
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12302531166208L, 91661);
          if (FTSBaseWebViewUI.t(FTSBaseWebViewUI.this) != null) {
            FTSBaseWebViewUI.u(FTSBaseWebViewUI.this).LB(paramBundle);
          }
          GMTrace.o(12302531166208L, 91661);
        }
      });
      GMTrace.o(12308034093056L, 91702);
      return;
    case 125: 
      localObject1 = paramBundle.getString("fts_key_sns_id");
      paramInt = paramBundle.getInt("fts_key_status", 0);
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16910359986176L, 125992);
          if (FTSBaseWebViewUI.v(FTSBaseWebViewUI.this) != null) {
            FTSBaseWebViewUI.w(FTSBaseWebViewUI.this).ct(localObject1, paramInt);
          }
          GMTrace.o(16910359986176L, 125992);
        }
      });
      GMTrace.o(12308034093056L, 91702);
      return;
    case 60: 
      this.sva.a(paramBundle, this.scene);
      GMTrace.o(12308034093056L, 91702);
      return;
    case 100001: 
      this.sva.K(paramBundle);
      GMTrace.o(12308034093056L, 91702);
      return;
    case 61: 
      label642:
      this.sva.L(paramBundle);
      GMTrace.o(12308034093056L, 91702);
      return;
    }
    this.sva.M(paramBundle);
    GMTrace.o(12308034093056L, 91702);
  }
  
  protected String getHint()
  {
    GMTrace.i(12308302528512L, 91704);
    GMTrace.o(12308302528512L, 91704);
    return null;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(12308436746240L, 91705);
    int i = R.i.cVL;
    GMTrace.o(12308436746240L, 91705);
    return i;
  }
  
  public final void hc(boolean paramBoolean)
  {
    GMTrace.i(12307497222144L, 91698);
    if (paramBoolean) {
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12312731713536L, 91737);
          if (FTSBaseWebViewUI.c(FTSBaseWebViewUI.this) != null) {
            FTSBaseWebViewUI.d(FTSBaseWebViewUI.this).a(FTSBaseWebViewUI.this.bCI(), FTSBaseWebViewUI.this.bCK(), FTSBaseWebViewUI.this.bCL());
          }
          GMTrace.o(12312731713536L, 91737);
        }
      });
    }
    GMTrace.o(12307497222144L, 91698);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(18936242372608L, 141086);
    super.onCreate(paramBundle);
    this.sva = new b(this.vov.voR, this.oKv);
    GMTrace.o(18936242372608L, 141086);
  }
  
  public void onDestroy()
  {
    GMTrace.i(12308168310784L, 91703);
    try
    {
      if (this.jeK != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putInt("webview_id", hashCode());
        this.jeK.g(1, localBundle);
      }
      this.sva.onDestroy();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
    aKl();
    super.onDestroy();
    GMTrace.o(12308168310784L, 91703);
  }
  
  protected void onPause()
  {
    GMTrace.i(17825456455680L, 132810);
    super.onPause();
    this.sva.onPause();
    GMTrace.o(17825456455680L, 132810);
  }
  
  protected void onResume()
  {
    GMTrace.i(17825322237952L, 132809);
    super.onResume();
    this.sva.onResume();
    GMTrace.o(17825322237952L, 132809);
  }
  
  public final class a
    implements a.b
  {
    String svi;
    int svj;
    String userName;
    
    public a()
    {
      GMTrace.i(12303470690304L, 91668);
      GMTrace.o(12303470690304L, 91668);
    }
    
    public final int compareTo(Object paramObject)
    {
      GMTrace.i(12303739125760L, 91670);
      if ((paramObject == null) || (!(paramObject instanceof a)))
      {
        GMTrace.o(12303739125760L, 91670);
        return -1;
      }
      paramObject = (a)paramObject;
      int i = this.svi.compareTo(((a)paramObject).svi);
      GMTrace.o(12303739125760L, 91670);
      return i;
    }
    
    public final String getTagName()
    {
      GMTrace.i(12303604908032L, 91669);
      String str = this.svi;
      GMTrace.o(12303604908032L, 91669);
      return str;
    }
  }
  
  private final class b
    extends WebViewUI.i
  {
    public b()
    {
      super();
      GMTrace.i(12305215520768L, 91681);
      GMTrace.o(12305215520768L, 91681);
    }
    
    private static k Lv(String paramString)
    {
      GMTrace.i(19410433605632L, 144619);
      w.i("MicroMsg.FTS.FTSBaseWebViewUI", "url=%s | thread=%d", new Object[] { paramString, Long.valueOf(Thread.currentThread().getId()) });
      paramString = Uri.parse(paramString);
      try
      {
        paramString = FileOp.openRead(paramString.getQueryParameter("path"));
        if (paramString != null)
        {
          paramString = new k("image/*", "utf8", paramString);
          GMTrace.o(19410433605632L, 144619);
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          paramString = null;
        }
        GMTrace.o(19410433605632L, 144619);
      }
      return null;
    }
    
    public final k a(WebView paramWebView, j paramj)
    {
      GMTrace.i(19410165170176L, 144617);
      if ((paramj != null) && (paramj.getUrl() != null) && (paramj.getUrl().toString().startsWith("weixin://fts")))
      {
        k localk = Lv(paramj.getUrl().toString());
        if (localk != null)
        {
          GMTrace.o(19410165170176L, 144617);
          return localk;
        }
      }
      paramWebView = super.a(paramWebView, paramj);
      GMTrace.o(19410165170176L, 144617);
      return paramWebView;
    }
    
    public final k a(WebView paramWebView, j paramj, Bundle paramBundle)
    {
      GMTrace.i(19410030952448L, 144616);
      if ((paramj != null) && (paramj.getUrl() != null) && (paramj.getUrl().toString().startsWith("weixin://fts")))
      {
        paramBundle = Lv(paramj.getUrl().toString());
        if (paramBundle != null)
        {
          GMTrace.o(19410030952448L, 144616);
          return paramBundle;
        }
      }
      paramWebView = super.a(paramWebView, paramj);
      GMTrace.o(19410030952448L, 144616);
      return paramWebView;
    }
    
    public final void a(WebView paramWebView, String paramString)
    {
      GMTrace.i(19409762516992L, 144614);
      super.a(paramWebView, paramString);
      w.i("MicroMsg.FTS.FTSBaseWebViewUI", "onPageFinished %s", new Object[] { paramString });
      FTSBaseWebViewUI.this.kT(false);
      if ((FTSBaseWebViewUI.g(FTSBaseWebViewUI.this) != null) && (!FTSBaseWebViewUI.h(FTSBaseWebViewUI.this)))
      {
        FTSBaseWebViewUI.bCF();
        FTSBaseWebViewUI.g(FTSBaseWebViewUI.this).wGw.vNy.clearFocus();
        FTSBaseWebViewUI.this.aKl();
      }
      GMTrace.o(19409762516992L, 144614);
    }
    
    public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(19409896734720L, 144615);
      super.b(paramWebView, paramString, paramBitmap);
      w.i("MicroMsg.FTS.FTSBaseWebViewUI", "onPageStarted %s", new Object[] { paramString });
      FTSBaseWebViewUI.this.kT(false);
      if ((FTSBaseWebViewUI.g(FTSBaseWebViewUI.this) != null) && (!FTSBaseWebViewUI.h(FTSBaseWebViewUI.this)))
      {
        FTSBaseWebViewUI.bCG();
        FTSBaseWebViewUI.g(FTSBaseWebViewUI.this).wGw.vNy.clearFocus();
        FTSBaseWebViewUI.this.aKl();
      }
      i.aW(FTSBaseWebViewUI.i(FTSBaseWebViewUI.this), 1);
      i.aX(FTSBaseWebViewUI.i(FTSBaseWebViewUI.this), 1);
      GMTrace.o(19409896734720L, 144615);
    }
    
    public final k e(WebView paramWebView, String paramString)
    {
      GMTrace.i(19410299387904L, 144618);
      if (paramString.startsWith("weixin://fts"))
      {
        k localk = Lv(paramString);
        if (localk != null)
        {
          GMTrace.o(19410299387904L, 144618);
          return localk;
        }
      }
      paramWebView = super.e(paramWebView, paramString);
      GMTrace.o(19410299387904L, 144618);
      return paramWebView;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/FTSBaseWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */