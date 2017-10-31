package com.tencent.mm.plugin.game.gamewebview.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.k.d.b;
import com.tencent.mm.plugin.game.gamewebview.ipc.AddShortcutTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameKeepPageTopTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.plugin.game.gamewebview.model.FavUrlTask;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.o.a;
import com.tencent.mm.ui.base.o.b;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.snackbar.b.b;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.e;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

public class i
{
  public static b.b myp;
  private boolean mEnable;
  protected GameWebViewUI mww;
  protected b mxV;
  private com.tencent.mm.plugin.webview.modeltools.a myl;
  public HashSet<Integer> mym;
  public Map<String, Integer> myn;
  public HashSet<Integer> myo;
  
  static
  {
    GMTrace.i(16995588243456L, 126627);
    myp = new b.b()
    {
      public final void aDU()
      {
        GMTrace.i(17990946914304L, 134043);
        FavUrlTask localFavUrlTask = new FavUrlTask();
        localFavUrlTask.actionType = 2;
        GameWebViewMainProcessService.a(localFavUrlTask);
        GMTrace.o(17990946914304L, 134043);
      }
    };
    GMTrace.o(16995588243456L, 126627);
  }
  
  public i(b paramb)
  {
    GMTrace.i(18010140049408L, 134186);
    this.mym = new HashSet();
    this.myn = new HashMap();
    this.myo = new HashSet();
    this.mEnable = false;
    this.mxV = paramb;
    this.mww = ((GameWebViewUI)paramb.getContext());
    this.myn.clear();
    this.myn.put("menuItem:share:brand", Integer.valueOf(0));
    this.myn.put("menuItem:share:appMessage", Integer.valueOf(1));
    this.myn.put("menuItem:share:dataMessage", Integer.valueOf(23));
    this.myn.put("menuItem:share:timeline", Integer.valueOf(2));
    this.myn.put("menuItem:favorite", Integer.valueOf(3));
    this.myn.put("menuItem:profile", Integer.valueOf(5));
    this.myn.put("menuItem:addContact", Integer.valueOf(5));
    this.myn.put("menuItem:copyUrl", Integer.valueOf(6));
    this.myn.put("menuItem:openWithSafari", Integer.valueOf(7));
    this.myn.put("menuItem:share:email", Integer.valueOf(8));
    this.myn.put("menuItem:delete", Integer.valueOf(9));
    this.myn.put("menuItem:exposeArticle", Integer.valueOf(10));
    this.myn.put("menuItem:setFont", Integer.valueOf(11));
    this.myn.put("menuItem:editTag", Integer.valueOf(12));
    this.myn.put("menuItem:readMode", Integer.valueOf(14));
    this.myn.put("menuItem:originPage", Integer.valueOf(14));
    this.myn.put("menuItem:share:qq", Integer.valueOf(20));
    this.myn.put("menuItem:share:weiboApp", Integer.valueOf(21));
    this.myn.put("menuItem:share:QZone", Integer.valueOf(22));
    this.myn.put("menuItem:share:enterprise", Integer.valueOf(24));
    this.myn.put("menuItem:refresh", Integer.valueOf(28));
    this.myn.put("menuItem:share:wework", Integer.valueOf(25));
    this.myn.put("menuItem:share:weread", Integer.valueOf(26));
    this.myn.put("menuItem:keepTop", Integer.valueOf(30));
    this.myn.put("menuItem:cancelKeepTop", Integer.valueOf(32));
    this.myn.put("menuItem:addShortcut", Integer.valueOf(29));
    this.myn.put("menuItem:search", Integer.valueOf(31));
    this.myo.clear();
    this.myo.add(Integer.valueOf(28));
    this.myo.add(Integer.valueOf(6));
    this.myo.add(Integer.valueOf(27));
    this.myo.add(Integer.valueOf(30));
    this.myo.add(Integer.valueOf(32));
    GMTrace.o(18010140049408L, 134186);
  }
  
  public static boolean aDT()
  {
    GMTrace.i(16995319808000L, 126625);
    FavUrlTask localFavUrlTask = new FavUrlTask();
    localFavUrlTask.actionType = 3;
    GameWebViewMainProcessService.b(localFavUrlTask);
    boolean bool = localFavUrlTask.mvL;
    GMTrace.o(16995319808000L, 126625);
    return bool;
  }
  
  public static boolean h(MenuItem paramMenuItem)
  {
    GMTrace.i(16994917154816L, 126622);
    if (paramMenuItem.getItemId() >= 10000)
    {
      GMTrace.o(16994917154816L, 126622);
      return true;
    }
    GMTrace.o(16994917154816L, 126622);
    return false;
  }
  
  protected final boolean Od()
  {
    GMTrace.i(16995185590272L, 126624);
    if ((this.mxV.aDc()) || (this.mxV.mwy))
    {
      GMTrace.o(16995185590272L, 126624);
      return true;
    }
    GameKeepPageTopTask localGameKeepPageTopTask = new GameKeepPageTopTask();
    localGameKeepPageTopTask.type = 1;
    GameWebViewMainProcessService.b(localGameKeepPageTopTask);
    if (bg.mY(this.mxV.muE.mwd).equals(bg.mY(localGameKeepPageTopTask.url)))
    {
      GMTrace.o(16995185590272L, 126624);
      return true;
    }
    GMTrace.o(16995185590272L, 126624);
    return false;
  }
  
  public void aDE()
  {
    GMTrace.i(16995051372544L, 126623);
    final Object localObject = Boolean.valueOf(false);
    final e locale;
    if (((Boolean)localObject).booleanValue())
    {
      locale = new e(this.mww, e.wSP, false);
      locale.wKW = new o.a()
      {
        public final void a(ImageView paramAnonymousImageView, MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(18023964475392L, 134289);
          if (i.h(paramAnonymousMenuItem))
          {
            paramAnonymousImageView.setVisibility(8);
            GMTrace.o(18023964475392L, 134289);
            return;
          }
          GMTrace.o(18023964475392L, 134289);
        }
      };
      locale.wKX = new o.b()
      {
        public final void a(TextView paramAnonymousTextView, MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(17998060453888L, 134096);
          paramAnonymousMenuItem = paramAnonymousMenuItem.getTitle();
          if (paramAnonymousTextView != null) {
            paramAnonymousTextView.setText(paramAnonymousMenuItem);
          }
          GMTrace.o(17998060453888L, 134096);
        }
      };
      locale.qQT = new o.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(17987323035648L, 134016);
          if ((i.this.mww.isFinishing()) || (i.this.mww.vox))
          {
            GMTrace.o(17987323035648L, 134016);
            return;
          }
          if (i.h(paramAnonymousMenuItem))
          {
            paramAnonymousMenuItem.getMenuInfo();
            GMTrace.o(17987323035648L, 134016);
            return;
          }
          switch (paramAnonymousMenuItem.getItemId())
          {
          }
          for (;;)
          {
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aDH();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aDI();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aDJ();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aDP();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.refresh();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aDK();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aDL();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aDM();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aDN();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aDQ();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aDR();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aDO();
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.mxV.muE.eW(true);
            GMTrace.o(17987323035648L, 134016);
            return;
            i.this.aDS();
          }
        }
      };
      locale.qQS = new o.c()
      {
        public final void a(m paramAnonymousm)
        {
          GMTrace.i(17990678478848L, 134041);
          g.paX.a(480L, 0L, 1L, false);
          Object localObject1;
          Object localObject2;
          if (localObject.booleanValue())
          {
            int j = this.mys.size();
            int i = 0;
            while (i < j)
            {
              localObject1 = (d.b)this.mys.get(i);
              localObject2 = (n)paramAnonymousm.e(((d.b)localObject1).id, ((d.b)localObject1).title);
              ((n)localObject2).vHw = ((ContextMenu.ContextMenuInfo)localObject1);
              ((n)localObject2).setIcon(null);
              ((n)localObject2).setIcon(0);
              i += 1;
            }
            GMTrace.o(17990678478848L, 134041);
            return;
          }
          if ((i.this.mxV.muE.eS(21)) && (i.this.ov(1))) {
            paramAnonymousm.a(1, i.this.mww.getString(R.l.ewp), R.k.dmx);
          }
          if ((i.this.mxV.muE.eS(23)) && (i.this.ov(2))) {
            paramAnonymousm.a(2, i.this.mww.getString(R.l.ewq), R.k.dmn);
          }
          boolean bool1 = i.this.getBundle().getBoolean("is_favorite_item", false);
          if ((!bool1) && (i.aDT()) && (i.this.ov(3))) {
            paramAnonymousm.a(3, i.this.mww.getString(R.l.euj), R.k.dmg);
          }
          paramAnonymousm.a(31, i.this.mww.getString(R.l.fcL), R.k.dmv);
          if ((i.this.mxV.muE.eS(44)) && (i.this.ov(6))) {
            paramAnonymousm.a(6, i.this.mww.getString(R.l.fcj), R.k.dma);
          }
          boolean bool2 = i.this.getBundle().getBoolean("key_detail_can_delete", true);
          if ((bool1) && (bool2) && (i.aDT()))
          {
            if (i.this.ov(12)) {
              paramAnonymousm.a(12, i.this.mww.getString(R.l.dVZ), R.k.dlV);
            }
            if (i.this.ov(9)) {
              paramAnonymousm.a(9, i.this.mww.getString(R.l.duY), R.k.dmb);
            }
          }
          if (!i.this.Od()) {
            if (i.this.ov(30)) {
              paramAnonymousm.a(30, i.this.mww.getString(R.l.eww), R.k.dmz);
            }
          }
          for (;;)
          {
            if ((i.this.mxV.muE.eS(45)) && (i.this.ov(7))) {
              paramAnonymousm.a(7, i.this.mww.getString(R.l.fco), R.k.dlY);
            }
            if (i.this.ov(28)) {
              paramAnonymousm.a(28, i.this.mww.getString(R.l.faQ), R.k.dmt);
            }
            if (i.this.mxV.muE.jlg) {
              paramAnonymousm.a(27, i.this.mww.getString(R.l.ewv), R.k.dmf);
            }
            localObject1 = i.this.mxV.muE.aDq();
            localObject2 = i.this.getBundle().getString("shortcut_user_name");
            if ((!i.this.getBundle().getBoolean("from_shortcut", false)) && (!bg.mZ((String)localObject1)) && (!bg.mZ((String)localObject2)) && (i.this.mxV.muE.eS(255)) && (i.this.ov(29))) {
              paramAnonymousm.a(29, i.this.mww.getString(R.l.ewn), R.k.drK);
            }
            paramAnonymousm.a(10, i.this.mww.getString(R.l.dDo), R.k.dlZ);
            GMTrace.o(17990678478848L, 134041);
            return;
            if (i.this.ov(32)) {
              paramAnonymousm.a(32, i.this.mww.getString(R.l.ewr), R.k.dmy);
            }
          }
        }
      };
      localObject = this.mxV.muE.aDp();
      if (!bg.mZ((String)localObject))
      {
        localObject = Uri.parse((String)localObject).getHost();
        if (!bg.mZ((String)localObject)) {
          locale.d(this.mww.getString(R.l.fbt, new Object[] { localObject }), 1);
        }
      }
      if (!this.mxV.isFullScreen()) {
        break label232;
      }
      locale.sxT = true;
    }
    for (locale.sxU = true;; locale.sxU = false)
    {
      if (!this.mxV.muE.mwV.isShown()) {
        break label245;
      }
      this.mxV.muE.eW(false);
      af.i(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18020340596736L, 134262);
          locale.bCV();
          GMTrace.o(18020340596736L, 134262);
        }
      }, 100L);
      GMTrace.o(16995051372544L, 126623);
      return;
      locale = new e(this.mww, e.wSO, true);
      break;
      label232:
      locale.sxT = false;
    }
    label245:
    this.mww.aKl();
    af.i(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17012231241728L, 126751);
        locale.bCV();
        GMTrace.o(17012231241728L, 126751);
      }
    }, 100L);
    GMTrace.o(16995051372544L, 126623);
  }
  
  protected final void aDH()
  {
    GMTrace.i(18010408484864L, 134188);
    if (!this.mxV.muE.aDt()) {
      this.mxV.aDd();
    }
    GMTrace.o(18010408484864L, 134188);
  }
  
  protected final void aDI()
  {
    GMTrace.i(18010542702592L, 134189);
    com.tencent.mm.plugin.game.gamewebview.model.h.c(this.mxV.muE);
    GMTrace.o(18010542702592L, 134189);
  }
  
  protected final void aDJ()
  {
    GMTrace.i(18010676920320L, 134190);
    d locald = this.mxV.muE;
    if (locald.be("shareTimeline", 88))
    {
      locald.yW("shareTimeline");
      locald.ck("menu:share:timeline", "");
      GMTrace.o(18010676920320L, 134190);
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      String str = locald.KZ();
      localJSONObject.put("link", str);
      localJSONObject.put("desc", str);
      localJSONObject.put("title", locald.getTitle());
      locald.cl("shareTimeline", localJSONObject.toString());
      GMTrace.o(18010676920320L, 134190);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.GameWebViewShareController", localException, "", new Object[0]);
      }
    }
  }
  
  protected final void aDK()
  {
    GMTrace.i(18010811138048L, 134191);
    String str = this.mxV.muE.KZ();
    ClipboardManager localClipboardManager = (ClipboardManager)this.mww.getSystemService("clipboard");
    if (localClipboardManager != null) {}
    try
    {
      localClipboardManager.setText(str);
      Toast.makeText(this.mww, this.mww.getString(R.l.fck), 0).show();
      GMTrace.o(18010811138048L, 134191);
      return;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.OptionMenuBtnHelp", localException, "clip.setText error", new Object[0]);
      GMTrace.o(18010811138048L, 134191);
    }
    w.e("MicroMsg.OptionMenuBtnHelp", "clipboard manager is null");
    GMTrace.o(18010811138048L, 134191);
    return;
  }
  
  protected final void aDL()
  {
    GMTrace.i(18010945355776L, 134192);
    w.i("MicroMsg.OptionMenuBtnHelp", "doKeepPageTopLogic");
    Object localObject = getBundle().getString("custom_keep_top_url");
    String str1 = getBundle().getString("custom_keep_top_title");
    String str2 = getBundle().getString("shortcut_user_name");
    GameKeepPageTopTask localGameKeepPageTopTask = new GameKeepPageTopTask();
    localGameKeepPageTopTask.type = 2;
    if ((!bg.mZ(str1)) && (!bg.mZ((String)localObject)))
    {
      localGameKeepPageTopTask.url = ((String)localObject);
      localGameKeepPageTopTask.title = str1;
    }
    for (localGameKeepPageTopTask.username = str2;; localGameKeepPageTopTask.username = "")
    {
      GameWebViewMainProcessService.a(localGameKeepPageTopTask);
      localObject = this.mxV;
      ((b)localObject).mwy = true;
      ((SwipeBackLayout)localObject).mEnable = ((b)localObject).aDa();
      ((b)localObject).mwx.b((b)localObject);
      com.tencent.mm.ui.snackbar.a.e(this.mww, this.mww.getString(R.l.ewx));
      GMTrace.o(18010945355776L, 134192);
      return;
      localGameKeepPageTopTask.url = bg.mY(this.mxV.muE.mwd);
      localGameKeepPageTopTask.title = this.mxV.muE.getTitle();
    }
  }
  
  protected final void aDM()
  {
    GMTrace.i(18011079573504L, 134193);
    Object localObject = new GameKeepPageTopTask();
    ((GameKeepPageTopTask)localObject).type = 2;
    ((GameKeepPageTopTask)localObject).url = "";
    ((GameKeepPageTopTask)localObject).title = "";
    ((GameKeepPageTopTask)localObject).username = "";
    GameWebViewMainProcessService.a((GWMainProcessTask)localObject);
    localObject = this.mxV;
    ((b)localObject).mwy = false;
    ((SwipeBackLayout)localObject).mEnable = ((b)localObject).aDa();
    ((b)localObject).mwx.aDf();
    com.tencent.mm.ui.snackbar.a.e(this.mww, this.mww.getString(R.l.ews));
    GMTrace.o(18011079573504L, 134193);
  }
  
  protected final void aDN()
  {
    GMTrace.i(18011213791232L, 134194);
    String str = this.mxV.muE.KZ();
    if (this.myl == null) {
      this.myl = new com.tencent.mm.plugin.webview.modeltools.a();
    }
    com.tencent.mm.plugin.webview.modeltools.a.d(this.mww, str);
    GMTrace.o(18011213791232L, 134194);
  }
  
  protected final void aDO()
  {
    GMTrace.i(18011348008960L, 134195);
    String str1 = getBundle().getString("shortcut_user_name");
    String str2 = this.mxV.muE.aDq();
    if ((bg.mZ(str1)) || (bg.mZ(str2)))
    {
      w.e("MicroMsg.OptionMenuBtnHelp", "addShortcut,appid or username is null");
      GMTrace.o(18011348008960L, 134195);
      return;
    }
    final AddShortcutTask localAddShortcutTask = new AddShortcutTask();
    localAddShortcutTask.username = str1;
    localAddShortcutTask.appId = str2;
    localAddShortcutTask.iQi = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(17002299129856L, 126677);
        localAddShortcutTask.VE();
        d locald = i.this.mxV.muE;
        boolean bool = localAddShortcutTask.success;
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("success", bool);
          locald.ck("onAddShortcutStatus", localJSONObject.toString());
          if (localAddShortcutTask.success)
          {
            com.tencent.mm.ui.base.h.a(i.this.mww, R.l.fcg, R.l.dxm, false, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(17985712422912L, 134004);
                paramAnonymous2DialogInterface.dismiss();
                GMTrace.o(17985712422912L, 134004);
              }
            });
            GMTrace.o(17002299129856L, 126677);
            return;
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.GameWebviewJsLoader", "onGetAddShortcutStatus, e:" + localException.getMessage());
          }
          Toast.makeText(i.this.mww, i.this.mww.getString(R.l.fcf), 0).show();
          GMTrace.o(17002299129856L, 126677);
        }
      }
    };
    localAddShortcutTask.VD();
    GameWebViewMainProcessService.a(localAddShortcutTask);
    GMTrace.o(18011348008960L, 134195);
  }
  
  protected final void aDP()
  {
    GMTrace.i(18011616444416L, 134197);
    Object localObject1 = new Bundle();
    ((Bundle)localObject1).putLong("msg_id", getBundle().getLong("msg_id", Long.MIN_VALUE));
    ((Bundle)localObject1).putString("sns_local_id", getBundle().getString("sns_local_id"));
    ((Bundle)localObject1).putInt("news_svr_id", getBundle().getInt("news_svr_id", 0));
    ((Bundle)localObject1).putString("news_svr_tweetid", getBundle().getString("news_svr_tweetid"));
    ((Bundle)localObject1).putInt("message_index", getBundle().getInt("message_index", 0));
    String str = bg.mY(this.mxV.muE.mwd);
    ((Bundle)localObject1).putString("rawUrl", str);
    Object localObject2 = this.mxV.muE.aDp();
    if ((!bg.mZ(str)) && (str.endsWith("#rd")))
    {
      str = str.substring(0, str.length() - 3);
      if ((!bg.mZ((String)localObject2)) && (!((String)localObject2).startsWith(str)))
      {
        ((Bundle)localObject1).putString("rawUrl", (String)localObject2);
        ((Bundle)localObject1).putLong("msg_id", Long.MIN_VALUE);
      }
    }
    for (;;)
    {
      if (getBundle() != null)
      {
        ((Bundle)localObject1).putString("preChatName", getBundle().getString("preChatName"));
        ((Bundle)localObject1).putInt("preMsgIndex", getBundle().getInt("preMsgIndex", 0));
        ((Bundle)localObject1).putString("prePublishId", getBundle().getString("prePublishId"));
        ((Bundle)localObject1).putString("preUsername", getBundle().getString("preUsername"));
      }
      localObject2 = new FavUrlTask();
      ((FavUrlTask)localObject2).actionType = 1;
      ((FavUrlTask)localObject2).lRQ = ((Bundle)localObject1);
      GameWebViewMainProcessService.b((GWMainProcessTask)localObject2);
      if (!((FavUrlTask)localObject2).mvK) {
        break;
      }
      localObject1 = this.mxV.muE;
      com.tencent.mm.plugin.game.gamewebview.jsapi.biz.GameJsApiSendAppMessage.fRV = 1;
      com.tencent.mm.plugin.game.gamewebview.model.h.c((d)localObject1);
      w.i("MicroMsg.OptionMenuBtnHelp", "on favorite simple url");
      GMTrace.o(18011616444416L, 134197);
      return;
      if ((!bg.mZ((String)localObject2)) && (!((String)localObject2).startsWith(str)))
      {
        ((Bundle)localObject1).putString("rawUrl", (String)localObject2);
        ((Bundle)localObject1).putLong("msg_id", Long.MIN_VALUE);
        ((Bundle)localObject1).putString("sns_local_id", "");
      }
    }
    com.tencent.mm.pluginsdk.model.c.a(((FavUrlTask)localObject2).ret, 35, this.mww, myp);
    GMTrace.o(18011616444416L, 134197);
  }
  
  public final void aDQ()
  {
    GMTrace.i(18011750662144L, 134198);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_fav_scene", 2);
    localIntent.putExtra("key_fav_item_id", getBundle().getLong("fav_local_id", -1L));
    com.tencent.mm.bi.d.b(this.mww, "favorite", ".ui.FavTagEditUI", localIntent);
    GMTrace.o(18011750662144L, 134198);
  }
  
  protected final void aDR()
  {
    GMTrace.i(18011884879872L, 134199);
    com.tencent.mm.ui.base.h.a(this.mww, this.mww.getString(R.l.duZ), null, null, this.mww.getString(R.l.duY), new h.d()
    {
      public final void bQ(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(18012690186240L, 134205);
        switch (paramAnonymousInt2)
        {
        default: 
          w.i("MicroMsg.OptionMenuBtnHelp", "do del cancel");
        }
        FavUrlTask localFavUrlTask;
        do
        {
          GMTrace.o(18012690186240L, 134205);
          return;
          Bundle localBundle = new Bundle();
          localBundle.putLong("fav_local_id", i.this.getBundle().getLong("fav_local_id", -1L));
          localFavUrlTask = new FavUrlTask();
          localFavUrlTask.actionType = 4;
          localFavUrlTask.lRQ = localBundle;
          GameWebViewMainProcessService.b(localFavUrlTask);
        } while (!localFavUrlTask.ftR);
        w.i("MicroMsg.OptionMenuBtnHelp", "del fav web url ok, finish webview ui");
        i.this.mww.finish();
        GMTrace.o(18012690186240L, 134205);
      }
    });
    GMTrace.o(18011884879872L, 134199);
  }
  
  protected final void aDS()
  {
    Object localObject3 = null;
    GMTrace.i(18012019097600L, 134200);
    Object localObject1 = getBundle().getString("geta8key_username");
    String str = this.mxV.muE.aDp();
    Intent localIntent = new Intent(this.mww, GameWebViewUI.class);
    localIntent.putExtra("k_username", (String)localObject1);
    localIntent.putExtra("k_expose_url", str);
    localIntent.putExtra("showShare", false);
    if (!bg.mZ(str)) {}
    Object localObject2;
    for (localObject1 = Uri.parse(str).getHost();; localObject2 = null)
    {
      if ((!bg.mZ((String)localObject1)) && (((String)localObject1).startsWith("mp.weixin.qq.com"))) {}
      for (;;)
      {
        try
        {
          localObject1 = String.format("https://mp.weixin.qq.com/mp/infringement?url=%s#wechat_redirect", new Object[] { p.encode(str, "utf-8") });
          if (localObject1 != null) {
            localObject3 = localObject1;
          }
          localObject1 = localObject3;
          if (bg.mZ((String)localObject3)) {
            localObject1 = String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(34) });
          }
          localIntent.putExtra("rawUrl", (String)localObject1);
          this.mww.startActivity(localIntent);
          GMTrace.o(18012019097600L, 134200);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          w.e("MicroMsg.OptionMenuBtnHelp", localUnsupportedEncodingException.getMessage());
          localObject2 = null;
          continue;
        }
        localIntent.putExtra("k_expose_current_url", str);
      }
    }
  }
  
  protected final Bundle getBundle()
  {
    GMTrace.i(18012153315328L, 134201);
    if (this.mxV != null)
    {
      localBundle = this.mxV.un;
      GMTrace.o(18012153315328L, 134201);
      return localBundle;
    }
    Bundle localBundle = new Bundle();
    GMTrace.o(18012153315328L, 134201);
    return localBundle;
  }
  
  public final boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(18010274267136L, 134187);
    if ((this.myl != null) && (com.tencent.mm.plugin.webview.modeltools.a.a(this.mww, paramInt1, paramInt2, paramIntent)))
    {
      GMTrace.o(18010274267136L, 134187);
      return true;
    }
    GMTrace.o(18010274267136L, 134187);
    return false;
  }
  
  public final boolean ov(int paramInt)
  {
    GMTrace.i(16994782937088L, 126621);
    if (!this.mym.contains(Integer.valueOf(paramInt)))
    {
      GMTrace.o(16994782937088L, 126621);
      return true;
    }
    GMTrace.o(16994782937088L, 126621);
    return false;
  }
  
  protected final void refresh()
  {
    GMTrace.i(18011482226688L, 134196);
    if (this.mxV.muE.mwT != null) {
      this.mxV.muE.mwT.reload();
    }
    GMTrace.o(18011482226688L, 134196);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */