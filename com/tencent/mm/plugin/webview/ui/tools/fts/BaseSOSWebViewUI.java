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
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.compatible.util.h;
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
import com.tencent.mm.ui.fts.widget.SOSEditTextView;
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

public class BaseSOSWebViewUI
  extends BaseSearchWebviewUI
  implements FTSEditTextView.a
{
  String fwy;
  protected ImageButton ogo;
  int scene;
  View suU;
  protected SOSEditTextView suV;
  protected View suW;
  List<c> suX;
  protected int suY;
  protected int suZ;
  private boolean sux;
  private b sva;
  boolean svb;
  boolean svc;
  int type;
  
  public BaseSOSWebViewUI()
  {
    GMTrace.i(16213367324672L, 120799);
    this.suZ = 0;
    GMTrace.o(16213367324672L, 120799);
  }
  
  protected static boolean bCF()
  {
    GMTrace.i(16215246372864L, 120813);
    GMTrace.o(16215246372864L, 120813);
    return true;
  }
  
  protected static boolean bCG()
  {
    GMTrace.i(16215380590592L, 120814);
    GMTrace.o(16215380590592L, 120814);
    return true;
  }
  
  public void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    GMTrace.i(16893985423360L, 125870);
    w.i("MicroMsg.FTS.BaseSOSWebViewUI", "onEditTextChange %s %s %s", new Object[] { paramString1, paramString2, paramb });
    if ((paramb == FTSEditTextView.b.wGg) || (paramb == FTSEditTextView.b.wGh)) {
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16221688823808L, 120861);
          if (BaseSOSWebViewUI.h(BaseSOSWebViewUI.this) != null) {
            BaseSOSWebViewUI.i(BaseSOSWebViewUI.this).a(BaseSOSWebViewUI.this.bCI(), BaseSOSWebViewUI.this.bCK(), BaseSOSWebViewUI.this.bCL(), null);
          }
          GMTrace.o(16221688823808L, 120861);
        }
      });
    }
    GMTrace.o(16893985423360L, 125870);
  }
  
  public boolean aaj()
  {
    GMTrace.i(16215112155136L, 120812);
    this.suV.vNy.clearFocus();
    aKl();
    if (this.suV.bCI().length() > 0)
    {
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17832435777536L, 132862);
          if (BaseSOSWebViewUI.l(BaseSOSWebViewUI.this) != null)
          {
            HashMap localHashMap1 = new HashMap();
            if (BaseSOSWebViewUI.this.bCD() != 0)
            {
              localHashMap1.put("sugClickType", Integer.valueOf(BaseSOSWebViewUI.this.bCD()));
              localHashMap1.put("sugId", BaseSOSWebViewUI.this.bCC());
            }
            com.tencent.mm.plugin.webview.ui.tools.jsapi.d locald = BaseSOSWebViewUI.m(BaseSOSWebViewUI.this);
            String str1 = BaseSOSWebViewUI.this.bCI();
            String str2 = BaseSOSWebViewUI.this.bCK();
            JSONArray localJSONArray = BaseSOSWebViewUI.this.bCL();
            HashMap localHashMap2 = new HashMap();
            localHashMap2.putAll(localHashMap1);
            localHashMap2.put("query", str1);
            localHashMap2.put("custom", str2);
            localHashMap2.put("tagList", localJSONArray);
            locald.a("onSearchInputConfirm", localHashMap2, null);
          }
          GMTrace.o(17832435777536L, 132862);
        }
      });
      aKl();
      this.svb = true;
      GMTrace.o(16215112155136L, 120812);
      return true;
    }
    GMTrace.o(16215112155136L, 120812);
    return true;
  }
  
  protected void aal()
  {
    GMTrace.i(16213769977856L, 120802);
    super.aal();
    this.type = getIntent().getIntExtra("ftsType", 0);
    this.suY = this.type;
    this.scene = getIntent().getIntExtra("ftsbizscene", 3);
    this.sux = getIntent().getBooleanExtra("ftsneedkeyboard", false);
    this.fwy = getIntent().getStringExtra("ftssessionid");
    this.suU = findViewById(R.h.ctA);
    this.suV = ((SOSEditTextView)findViewById(R.h.cyG));
    this.suV.wGd = this;
    this.suV.Il(getHint());
    this.suW = findViewById(R.h.bov);
    this.suW.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16212159365120L, 120790);
        BaseSOSWebViewUI.this.bCA();
        GMTrace.o(16212159365120L, 120790);
      }
    });
    this.ogo = ((ImageButton)findViewById(R.h.bjy));
    this.ogo.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(16212964671488L, 120796);
        BaseSOSWebViewUI.this.bCx();
        GMTrace.o(16212964671488L, 120796);
      }
    });
    this.oKv.setWebViewClient(new b());
    this.oKv.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(16229473452032L, 120919);
        BaseSOSWebViewUI.this.bCE().vNy.clearFocus();
        BaseSOSWebViewUI.this.aKl();
        GMTrace.o(16229473452032L, 120919);
        return false;
      }
    });
    if (this.ssT != null) {
      this.ssT.jp(true);
    }
    this.oKv.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(16226789097472L, 120899);
        GMTrace.o(16226789097472L, 120899);
        return true;
      }
    });
    if ((com.tencent.mm.compatible.util.d.et(23)) && (!h.tJ()))
    {
      View localView = getWindow().getDecorView();
      localView.setSystemUiVisibility(localView.getSystemUiVisibility() | 0x2000);
    }
    this.sva.sjk = this.sjk;
    GMTrace.o(16213769977856L, 120802);
  }
  
  protected final int bBJ()
  {
    GMTrace.i(16213635760128L, 120801);
    int i = this.jsW;
    GMTrace.o(16213635760128L, 120801);
    return i;
  }
  
  protected final void bBQ()
  {
    GMTrace.i(16215649026048L, 120816);
    bCx();
    GMTrace.o(16215649026048L, 120816);
  }
  
  protected final boolean bBU()
  {
    GMTrace.i(16214441066496L, 120807);
    GMTrace.o(16214441066496L, 120807);
    return false;
  }
  
  protected void bCA()
  {
    GMTrace.i(16214038413312L, 120804);
    this.suV.r("", null);
    aKl();
    this.handler.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(16211622494208L, 120786);
        if (BaseSOSWebViewUI.e(BaseSOSWebViewUI.this) != null)
        {
          com.tencent.mm.plugin.webview.ui.tools.jsapi.d locald = BaseSOSWebViewUI.g(BaseSOSWebViewUI.this);
          int i = BaseSOSWebViewUI.f(BaseSOSWebViewUI.this);
          HashMap localHashMap = new HashMap();
          localHashMap.put("isCancelButtonClick", Integer.valueOf(1));
          localHashMap.put("isInputChange", Integer.valueOf(1));
          localHashMap.put("scene", Integer.valueOf(i));
          locald.a("onSearchInputChange", localHashMap, null);
        }
        GMTrace.o(16211622494208L, 120786);
      }
    });
    this.suX = null;
    this.svb = false;
    this.sva.onDestroy();
    GMTrace.o(16214038413312L, 120804);
  }
  
  protected void bCB()
  {
    GMTrace.i(19407749251072L, 144599);
    GMTrace.o(19407749251072L, 144599);
  }
  
  protected String bCC()
  {
    GMTrace.i(16265846456320L, 121190);
    GMTrace.o(16265846456320L, 121190);
    return "";
  }
  
  protected int bCD()
  {
    GMTrace.i(16265980674048L, 121191);
    GMTrace.o(16265980674048L, 121191);
    return 0;
  }
  
  public final SOSEditTextView bCE()
  {
    GMTrace.i(16894119641088L, 125871);
    SOSEditTextView localSOSEditTextView = this.suV;
    GMTrace.o(16894119641088L, 125871);
    return localSOSEditTextView;
  }
  
  protected final b bCH()
  {
    GMTrace.i(19407883468800L, 144600);
    b localb = this.sva;
    GMTrace.o(19407883468800L, 144600);
    return localb;
  }
  
  protected final String bCI()
  {
    GMTrace.i(16894253858816L, 125872);
    String str = this.suV.bCI();
    GMTrace.o(16894253858816L, 125872);
    return str;
  }
  
  protected final int bCJ()
  {
    GMTrace.i(19408017686528L, 144601);
    int i = this.suZ;
    GMTrace.o(19408017686528L, 144601);
    return i;
  }
  
  protected final String bCK()
  {
    GMTrace.i(16894388076544L, 125873);
    String str = this.suV.bCK();
    GMTrace.o(16894388076544L, 125873);
    return str;
  }
  
  public final JSONArray bCL()
  {
    GMTrace.i(16216051679232L, 120819);
    Object localObject = this.suV.qOG;
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
    GMTrace.o(16216051679232L, 120819);
    return localJSONArray;
  }
  
  public boolean bCM()
  {
    GMTrace.i(18123285594112L, 135029);
    GMTrace.o(18123285594112L, 135029);
    return false;
  }
  
  protected final boolean bCd()
  {
    GMTrace.i(16214172631040L, 120805);
    GMTrace.o(16214172631040L, 120805);
    return true;
  }
  
  protected final boolean bCi()
  {
    GMTrace.i(16215514808320L, 120815);
    GMTrace.o(16215514808320L, 120815);
    return false;
  }
  
  protected final void bCx()
  {
    GMTrace.i(16213904195584L, 120803);
    aKl();
    if ((this.suX != null) && (this.suX.size() > 1))
    {
      this.suX.remove(0);
      final c localc = (c)this.suX.get(0);
      this.suV.r(localc.svl, localc.qOG);
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16221957259264L, 120863);
          if (BaseSOSWebViewUI.a(BaseSOSWebViewUI.this) != null)
          {
            BaseSOSWebViewUI.this.bCy();
            int i = BaseSOSWebViewUI.this.suY;
            BaseSOSWebViewUI.this.suY = localc.type;
            BaseSOSWebViewUI.this.bCz();
            Bundle localBundle = new Bundle();
            localBundle.putInt("type", BaseSOSWebViewUI.this.suY);
            localBundle.putBoolean("isHomePage", true);
            if (BaseSOSWebViewUI.this.suY != 0) {
              localBundle.putInt("scene", 22);
            }
            try
            {
              for (;;)
              {
                localBundle = BaseSOSWebViewUI.b(BaseSOSWebViewUI.this).m(4, localBundle);
                HashMap localHashMap = new HashMap();
                localHashMap.put("isBackButtonClick", "1");
                localHashMap.put("custom", BaseSOSWebViewUI.this.bCK());
                if (BaseSOSWebViewUI.this.suY == i) {
                  break;
                }
                BaseSOSWebViewUI.c(BaseSOSWebViewUI.this).a(localBundle.getString("scene", "0"), localBundle.getString("type", "0"), localBundle.getString("isSug", "0"), localBundle.getString("isLocalSug", "0"), BaseSOSWebViewUI.this.fwy, localHashMap, localc.svm);
                GMTrace.o(16221957259264L, 120863);
                return;
                localBundle.putInt("scene", 20);
              }
              BaseSOSWebViewUI.d(BaseSOSWebViewUI.this).a(BaseSOSWebViewUI.this.bCI(), BaseSOSWebViewUI.this.bCK(), BaseSOSWebViewUI.this.bCL(), 1, localc.svm);
              GMTrace.o(16221957259264L, 120863);
              return;
            }
            catch (RemoteException localRemoteException) {}
          }
          GMTrace.o(16221957259264L, 120863);
        }
      });
      GMTrace.o(16213904195584L, 120803);
      return;
    }
    if (this.svb)
    {
      bCA();
      GMTrace.o(16213904195584L, 120803);
      return;
    }
    finish();
    GMTrace.o(16213904195584L, 120803);
  }
  
  protected void bCy()
  {
    GMTrace.i(16893582770176L, 125867);
    GMTrace.o(16893582770176L, 125867);
  }
  
  protected void bCz()
  {
    GMTrace.i(16893716987904L, 125868);
    GMTrace.o(16893716987904L, 125868);
  }
  
  public final void bbV()
  {
    GMTrace.i(16214843719680L, 120810);
    if (this.suV != null)
    {
      if (!this.suV.vNy.hasFocus())
      {
        this.suV.cez();
        aKp();
      }
      this.suV.Il(getHint());
    }
    GMTrace.o(16214843719680L, 120810);
  }
  
  public final void bbZ()
  {
    GMTrace.i(16893851205632L, 125869);
    if (!this.suV.vNy.hasFocus())
    {
      this.suV.cez();
      aKp();
    }
    GMTrace.o(16893851205632L, 125869);
  }
  
  protected void g(final int paramInt, final Bundle paramBundle)
  {
    GMTrace.i(16215917461504L, 120818);
    final Object localObject1;
    Object localObject2;
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
        GMTrace.o(16215917461504L, 120818);
        return;
        paramBundle.getString("fts_key_json_data");
        paramBundle.getBoolean("fts_key_new_query", true);
        localObject1 = new HashMap();
        localObject2 = paramBundle.keySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (String)((Iterator)localObject2).next();
          ((Map)localObject1).put(localObject3, paramBundle.get((String)localObject3));
        }
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16213233106944L, 120798);
            if (BaseSOSWebViewUI.p(BaseSOSWebViewUI.this) != null) {
              BaseSOSWebViewUI.q(BaseSOSWebViewUI.this).ab(localObject1);
            }
            GMTrace.o(16213233106944L, 120798);
          }
        });
        GMTrace.o(16215917461504L, 120818);
        return;
        localObject1 = paramBundle.getString("fts_key_json_data");
        final boolean bool = paramBundle.getBoolean("fts_key_new_query", true);
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16222494130176L, 120867);
            if (BaseSOSWebViewUI.r(BaseSOSWebViewUI.this) != null) {
              BaseSOSWebViewUI.s(BaseSOSWebViewUI.this).aD(localObject1, bool);
            }
            GMTrace.o(16222494130176L, 120867);
          }
        });
        GMTrace.o(16215917461504L, 120818);
        return;
        paramInt = paramBundle.getInt("fts_key_ret", 0);
        paramBundle = paramBundle.getString("fts_key_data");
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16207327526912L, 120754);
            if (BaseSOSWebViewUI.t(BaseSOSWebViewUI.this) != null) {
              BaseSOSWebViewUI.u(BaseSOSWebViewUI.this).az(paramInt, paramBundle);
            }
            GMTrace.o(16207327526912L, 120754);
          }
        });
        GMTrace.o(16215917461504L, 120818);
        return;
        localObject1 = paramBundle.getString("fts_key_json_data");
        paramInt = paramBundle.getInt("fts_key_teach_request_type", 0);
        final int i = paramBundle.getInt("fts_key_is_cache_data", 0);
        this.handler.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(16229741887488L, 120921);
            if (BaseSOSWebViewUI.v(BaseSOSWebViewUI.this) != null) {
              BaseSOSWebViewUI.w(BaseSOSWebViewUI.this).d(paramInt, localObject1, i);
            }
            GMTrace.o(16229741887488L, 120921);
          }
        });
        GMTrace.o(16215917461504L, 120818);
        return;
        localObject1 = paramBundle.getString("fts_key_new_query");
        localObject2 = paramBundle.getString("fts_key_custom_query");
        bool = paramBundle.getBoolean("fts_key_need_keyboard", false);
        Object localObject3 = paramBundle.getString("fts_key_tag_list");
        w.i("MicroMsg.FTS.BaseSOSWebViewUI", "onFTSSearchQueryChange: totalQuery: %s isInputChange %b", new Object[] { localObject1, Boolean.valueOf(bool) });
        paramBundle = new ArrayList();
        try
        {
          if (!bg.mZ((String)localObject3))
          {
            localObject3 = new JSONArray((String)localObject3);
            paramInt = 0;
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
          if (this.suV == null) {}
        }
        catch (Exception localException)
        {
          if (this.suV != null)
          {
            if (paramBundle.size() <= 0) {
              break label648;
            }
            this.suV.r((String)localObject2, paramBundle);
          }
          while (bool)
          {
            this.handler.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(16206790656000L, 120750);
                if (BaseSOSWebViewUI.x(BaseSOSWebViewUI.this) != null) {
                  BaseSOSWebViewUI.y(BaseSOSWebViewUI.this).a(BaseSOSWebViewUI.this.bCI(), BaseSOSWebViewUI.this.bCK(), BaseSOSWebViewUI.this.bCL(), null);
                }
                GMTrace.o(16206790656000L, 120750);
              }
            });
            if (this.suV != null) {
              this.suV.cez();
            }
            bCk();
            GMTrace.o(16215917461504L, 120818);
            return;
            this.suV.r((String)localObject1, paramBundle);
          }
        }
      }
      this.suV.vNy.clearFocus();
      GMTrace.o(16215917461504L, 120818);
      return;
    case 124: 
      paramBundle = paramBundle.getString("fts_key_json_data");
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16220346646528L, 120851);
          if (BaseSOSWebViewUI.z(BaseSOSWebViewUI.this) != null) {
            BaseSOSWebViewUI.A(BaseSOSWebViewUI.this).LB(paramBundle);
          }
          GMTrace.o(16220346646528L, 120851);
        }
      });
      GMTrace.o(16215917461504L, 120818);
      return;
    case 125: 
      localObject1 = paramBundle.getString("fts_key_sns_id");
      paramInt = paramBundle.getInt("fts_key_status", 0);
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16910896857088L, 125996);
          if (BaseSOSWebViewUI.B(BaseSOSWebViewUI.this) != null) {
            BaseSOSWebViewUI.C(BaseSOSWebViewUI.this).ct(localObject1, paramInt);
          }
          GMTrace.o(16910896857088L, 125996);
        }
      });
      GMTrace.o(16215917461504L, 120818);
      return;
    case 60: 
      if (!bCM())
      {
        w.w("MicroMsg.FTS.BaseSOSWebViewUI", "current state is not search");
        GMTrace.o(16215917461504L, 120818);
        return;
      }
      this.sva.a(paramBundle, this.scene);
      GMTrace.o(16215917461504L, 120818);
      return;
    case 100001: 
      this.sva.K(paramBundle);
      GMTrace.o(16215917461504L, 120818);
      return;
    case 61: 
      this.sva.L(paramBundle);
      GMTrace.o(16215917461504L, 120818);
      return;
    case 62: 
      this.sva.M(paramBundle);
      GMTrace.o(16215917461504L, 120818);
      return;
    case 135: 
      label648:
      paramInt = paramBundle.getInt("FTS_KEY_onStartWebSearch_type", 0);
      localObject1 = paramBundle.getString("FTS_KEY_onStartWebSearch_query");
      paramBundle = (Map)paramBundle.getSerializable("FTS_KEY_onStartWebSearch_params");
      w.v("MicroMsg.FTS.BaseSOSWebViewUI", "adding history cgi params type %d, inEditQuery %s, params %s", new Object[] { Integer.valueOf(paramInt), localObject1, paramBundle });
      if (this.suX == null) {
        this.suX = new ArrayList();
      }
      c localc;
      if (bCI().length() > 0)
      {
        localObject2 = new c();
        ((c)localObject2).type = this.suY;
        ((c)localObject2).qOG = new ArrayList(this.suV.qOG);
        ((c)localObject2).svl = this.suV.bCK();
        ((c)localObject2).svk = this.suV.bCI();
        if (this.suX.size() == 0) {
          this.suX.add(localObject2);
        }
      }
      else if ((this.suX != null) && (!this.suX.isEmpty()))
      {
        localObject2 = (c)this.suX.get(0);
        localc = new c();
        localc.type = paramInt;
        localc.svk = ((String)localObject1);
        localc.svm = paramBundle;
        if (localObject2 != null)
        {
          if (localObject2 != localc) {
            break label1175;
          }
          paramInt = 1;
        }
      }
      for (;;)
      {
        if (paramInt != 0) {
          ((c)localObject2).svm = paramBundle;
        }
        GMTrace.o(16215917461504L, 120818);
        return;
        if (((c)localObject2).equals((c)this.suX.get(0))) {
          break;
        }
        this.suX.add(0, localObject2);
        break;
        label1175:
        localObject1 = (c)localc;
        if ((((c)localObject1).type == ((c)localObject2).type) && (((c)localObject1).svk.trim().equals(((c)localObject2).svk.trim()))) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
      }
    }
    paramBundle = paramBundle.getString("fts_key_data");
    if (!bg.mZ(paramBundle))
    {
      if ("index".equals(paramBundle))
      {
        this.suZ = 1;
        GMTrace.o(16215917461504L, 120818);
        return;
      }
      if ("result".equals(paramBundle))
      {
        this.suZ = 2;
        GMTrace.o(16215917461504L, 120818);
        return;
      }
      if ("suggestion".equals(paramBundle))
      {
        this.suZ = 3;
        GMTrace.o(16215917461504L, 120818);
        return;
      }
      if ("teach".equals(paramBundle))
      {
        this.suZ = 4;
        GMTrace.o(16215917461504L, 120818);
        return;
      }
      if ("local".equals(paramBundle))
      {
        this.suZ = 5;
        GMTrace.o(16215917461504L, 120818);
        return;
      }
      this.suZ = 0;
      GMTrace.o(16215917461504L, 120818);
      return;
    }
    this.suZ = 0;
    GMTrace.o(16215917461504L, 120818);
  }
  
  protected String getHint()
  {
    GMTrace.i(16214977937408L, 120811);
    GMTrace.o(16214977937408L, 120811);
    return null;
  }
  
  public void hc(boolean paramBoolean)
  {
    GMTrace.i(16214709501952L, 120809);
    if ((paramBoolean) && (!bg.mZ(this.suV.bCI()))) {
      this.handler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16212427800576L, 120792);
          if (BaseSOSWebViewUI.j(BaseSOSWebViewUI.this) != null) {
            BaseSOSWebViewUI.k(BaseSOSWebViewUI.this).a(BaseSOSWebViewUI.this.bCI(), BaseSOSWebViewUI.this.bCK(), BaseSOSWebViewUI.this.bCL(), null);
          }
          GMTrace.o(16212427800576L, 120792);
        }
      });
    }
    GMTrace.o(16214709501952L, 120809);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(16894522294272L, 125874);
    bCx();
    GMTrace.o(16894522294272L, 125874);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(16213501542400L, 120800);
    super.onCreate(paramBundle);
    cO().cP().hide();
    this.sva = new b(this.vov.voR, this.oKv);
    GMTrace.o(16213501542400L, 120800);
  }
  
  public void onDestroy()
  {
    GMTrace.i(16215783243776L, 120817);
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
    GMTrace.o(16215783243776L, 120817);
  }
  
  protected void onPause()
  {
    GMTrace.i(17825188020224L, 132808);
    super.onPause();
    this.sva.onPause();
    GMTrace.o(17825188020224L, 132808);
  }
  
  protected void onResume()
  {
    GMTrace.i(17825053802496L, 132807);
    super.onResume();
    this.sva.onResume();
    GMTrace.o(17825053802496L, 132807);
  }
  
  public final class a
    implements a.b
  {
    String svi;
    int svj;
    String userName;
    
    public a()
    {
      GMTrace.i(16228668145664L, 120913);
      GMTrace.o(16228668145664L, 120913);
    }
    
    public final int compareTo(Object paramObject)
    {
      GMTrace.i(16228936581120L, 120915);
      if ((paramObject == null) || (!(paramObject instanceof FTSBaseWebViewUI.a)))
      {
        GMTrace.o(16228936581120L, 120915);
        return -1;
      }
      paramObject = (FTSBaseWebViewUI.a)paramObject;
      int i = this.svi.compareTo(((FTSBaseWebViewUI.a)paramObject).svi);
      GMTrace.o(16228936581120L, 120915);
      return i;
    }
    
    public final String getTagName()
    {
      GMTrace.i(16228802363392L, 120914);
      String str = this.svi;
      GMTrace.o(16228802363392L, 120914);
      return str;
    }
  }
  
  private final class b
    extends WebViewUI.i
  {
    public b()
    {
      super();
      GMTrace.i(16226923315200L, 120900);
      GMTrace.o(16226923315200L, 120900);
    }
    
    private static k Lv(String paramString)
    {
      GMTrace.i(19417815580672L, 144674);
      w.i("MicroMsg.FTS.BaseSOSWebViewUI", "url=%s | thread=%d", new Object[] { paramString, Long.valueOf(Thread.currentThread().getId()) });
      paramString = Uri.parse(paramString);
      try
      {
        paramString = FileOp.openRead(paramString.getQueryParameter("path"));
        if (paramString != null)
        {
          paramString = new k("image/*", "utf8", paramString);
          GMTrace.o(19417815580672L, 144674);
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          paramString = null;
        }
        GMTrace.o(19417815580672L, 144674);
      }
      return null;
    }
    
    public final k a(WebView paramWebView, j paramj)
    {
      GMTrace.i(19417547145216L, 144672);
      if ((paramj != null) && (paramj.getUrl() != null) && (paramj.getUrl().toString().startsWith("weixin://fts")))
      {
        k localk = Lv(paramj.getUrl().toString());
        if (localk != null)
        {
          GMTrace.o(19417547145216L, 144672);
          return localk;
        }
      }
      paramWebView = super.a(paramWebView, paramj);
      GMTrace.o(19417547145216L, 144672);
      return paramWebView;
    }
    
    public final k a(WebView paramWebView, j paramj, Bundle paramBundle)
    {
      GMTrace.i(19417412927488L, 144671);
      if ((paramj != null) && (paramj.getUrl() != null) && (paramj.getUrl().toString().startsWith("weixin://fts")))
      {
        paramBundle = Lv(paramj.getUrl().toString());
        if (paramBundle != null)
        {
          GMTrace.o(19417412927488L, 144671);
          return paramBundle;
        }
      }
      paramWebView = super.a(paramWebView, paramj);
      GMTrace.o(19417412927488L, 144671);
      return paramWebView;
    }
    
    public final void a(WebView paramWebView, String paramString)
    {
      GMTrace.i(19417144492032L, 144669);
      super.a(paramWebView, paramString);
      w.i("MicroMsg.FTS.BaseSOSWebViewUI", "scene %d, onPageFinished %s", new Object[] { Integer.valueOf(BaseSOSWebViewUI.f(BaseSOSWebViewUI.this)), paramString });
      BaseSOSWebViewUI.this.kT(false);
      if ((BaseSOSWebViewUI.this.suV != null) && (!BaseSOSWebViewUI.n(BaseSOSWebViewUI.this)))
      {
        BaseSOSWebViewUI.bCF();
        BaseSOSWebViewUI.this.suV.vNy.clearFocus();
        BaseSOSWebViewUI.this.aKl();
      }
      BaseSOSWebViewUI.o(BaseSOSWebViewUI.this);
      BaseSOSWebViewUI.this.bCB();
      GMTrace.o(19417144492032L, 144669);
    }
    
    public final void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      GMTrace.i(19417278709760L, 144670);
      super.b(paramWebView, paramString, paramBitmap);
      w.i("MicroMsg.FTS.BaseSOSWebViewUI", "onPageStarted %s", new Object[] { paramString });
      BaseSOSWebViewUI.this.kT(false);
      if ((BaseSOSWebViewUI.this.suV != null) && (!BaseSOSWebViewUI.n(BaseSOSWebViewUI.this)))
      {
        BaseSOSWebViewUI.bCG();
        BaseSOSWebViewUI.this.suV.vNy.clearFocus();
        BaseSOSWebViewUI.this.aKl();
      }
      GMTrace.o(19417278709760L, 144670);
    }
    
    public final k e(WebView paramWebView, String paramString)
    {
      GMTrace.i(19417681362944L, 144673);
      if (paramString.startsWith("weixin://fts"))
      {
        k localk = Lv(paramString);
        if (localk != null)
        {
          GMTrace.o(19417681362944L, 144673);
          return localk;
        }
      }
      paramWebView = super.e(paramWebView, paramString);
      GMTrace.o(19417681362944L, 144673);
      return paramWebView;
    }
  }
  
  protected final class c
  {
    List<a.b> qOG;
    String svk;
    String svl;
    Map<String, Object> svm;
    int type;
    
    protected c()
    {
      GMTrace.i(16206253785088L, 120746);
      this.svk = "";
      this.svl = "";
      this.svm = new HashMap();
      GMTrace.o(16206253785088L, 120746);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(16899085697024L, 125908);
      if (this == paramObject)
      {
        GMTrace.o(16899085697024L, 125908);
        return true;
      }
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if ((((c)paramObject).type == this.type) && (((c)paramObject).svl.equals(this.svl)))
        {
          GMTrace.o(16899085697024L, 125908);
          return true;
        }
        GMTrace.o(16899085697024L, 125908);
        return false;
      }
      GMTrace.o(16899085697024L, 125908);
      return false;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/fts/BaseSOSWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */