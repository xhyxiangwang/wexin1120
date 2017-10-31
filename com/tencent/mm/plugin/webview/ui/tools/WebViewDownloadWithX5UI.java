package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.n;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMFragmentActivity.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

@com.tencent.mm.ui.base.a(2)
public class WebViewDownloadWithX5UI
  extends MMActivity
{
  private Context mContext;
  private Button sqd;
  private final com.tencent.mm.plugin.webview.modeltools.a sqr;
  
  public WebViewDownloadWithX5UI()
  {
    GMTrace.i(16334700150784L, 121703);
    this.sqr = new com.tencent.mm.plugin.webview.modeltools.a();
    GMTrace.o(16334700150784L, 121703);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(16335102803968L, 121706);
    int i = R.i.djI;
    GMTrace.o(16335102803968L, 121706);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(16335237021696L, 121707);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (com.tencent.mm.plugin.webview.modeltools.a.a(this, paramInt1, paramInt2, paramIntent))
    {
      if (-1 == paramInt2) {
        finish();
      }
      GMTrace.o(16335237021696L, 121707);
      return;
    }
    GMTrace.o(16335237021696L, 121707);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(16334834368512L, 121704);
    super.onCreate(paramBundle);
    this.mContext = this;
    rV(getString(R.l.fbb));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(16336847634432L, 121719);
        WebViewDownloadWithX5UI.this.finish();
        GMTrace.o(16336847634432L, 121719);
        return true;
      }
    });
    overridePendingTransition(MMFragmentActivity.a.vqs, MMFragmentActivity.a.vqt);
    this.sqd = ((Button)findViewById(R.h.bCI));
    paramBundle = (ImageView)findViewById(R.h.bCR);
    TextView localTextView = (TextView)findViewById(R.h.bCT);
    String str1 = getIntent().getStringExtra("task_url");
    String str2 = getIntent().getStringExtra("title");
    final long l = getIntent().getLongExtra("task_size", 0L);
    final String str3 = getIntent().getStringExtra("page_url");
    String str4 = getIntent().getStringExtra("thumb_url");
    w.i("MicroMsg.WebViewDownloadWithX5UI", "onCreate: url=%s,taskSize=%d, thumbUrl=%s", new Object[] { str1, Long.valueOf(l), str4 });
    Object localObject;
    if (l > 0L)
    {
      localObject = bg.eG(l);
      this.sqd.setText(getString(R.l.faT, new Object[] { localObject }));
    }
    if (ap.AV())
    {
      localObject = n.Ja();
      c.a locala = new c.a();
      locala.hDe = R.k.drL;
      locala.hCP = true;
      ((com.tencent.mm.an.a.a)localObject).a(str4, paramBundle, locala.Jk());
      localTextView.setVisibility(0);
      if (bg.mZ(str2)) {
        break label361;
      }
      localTextView.setText(str2);
    }
    for (;;)
    {
      g.paX.i(14217, new Object[] { "", Integer.valueOf(1), str3, str1, Integer.valueOf(1) });
      this.sqd.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16336444981248L, 121716);
          if (!am.isNetworkConnected(WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this)))
          {
            Toast.makeText(WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this), WebViewDownloadWithX5UI.this.getString(R.l.edf), 0).show();
            w.i("MicroMsg.WebViewDownloadWithX5UI", "startDownload fail, network not ready");
            GMTrace.o(16336444981248L, 121716);
            return;
          }
          ap.AS();
          if (!c.isSDCardAvailable())
          {
            Toast.makeText(WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this), WebViewDownloadWithX5UI.this.getString(R.l.edh), 0).show();
            w.i("MicroMsg.WebViewDownloadWithX5UI", "startDownload fail, sdcard not ready");
            GMTrace.o(16336444981248L, 121716);
            return;
          }
          if ((l > 0L) && (!f.K(l)))
          {
            Toast.makeText(WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this), WebViewDownloadWithX5UI.this.getString(R.l.edg), 0).show();
            w.i("MicroMsg.WebViewDownloadWithX5UI", "startDownload fail, not enough space, require size = " + l);
            GMTrace.o(16336444981248L, 121716);
            return;
          }
          if (am.isWifi(WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this)))
          {
            WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this, str3, this.sqk);
            GMTrace.o(16336444981248L, 121716);
            return;
          }
          h.a(WebViewDownloadWithX5UI.this, WebViewDownloadWithX5UI.this.getString(R.l.faX), WebViewDownloadWithX5UI.this.getString(R.l.faY), WebViewDownloadWithX5UI.this.getString(R.l.faS), WebViewDownloadWithX5UI.this.getString(R.l.duP), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(18102750281728L, 134876);
              WebViewDownloadWithX5UI.a(WebViewDownloadWithX5UI.this, WebViewDownloadWithX5UI.2.this.val$url, WebViewDownloadWithX5UI.2.this.sqk);
              paramAnonymous2DialogInterface.dismiss();
              GMTrace.o(18102750281728L, 134876);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(18160195469312L, 135304);
              paramAnonymous2DialogInterface.dismiss();
              GMTrace.o(18160195469312L, 135304);
            }
          }, R.e.aQR);
          GMTrace.o(16336444981248L, 121716);
        }
      });
      GMTrace.o(16334834368512L, 121704);
      return;
      paramBundle.setImageResource(R.k.drL);
      break;
      label361:
      localTextView.setText(getString(R.l.fba));
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(16334968586240L, 121705);
    super.onDestroy();
    GMTrace.o(16334968586240L, 121705);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/WebViewDownloadWithX5UI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */