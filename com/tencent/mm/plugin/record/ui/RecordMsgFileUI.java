package com.tencent.mm.plugin.record.ui;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Base64;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.a.i.a;
import com.tencent.mm.plugin.record.a.j;
import com.tencent.mm.plugin.record.a.s;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.tools.a;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.protocal.c.sp;
import com.tencent.mm.protocal.c.ss;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.o.c;
import com.tencent.mm.ui.base.o.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.y;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RecordMsgFileUI
  extends MMActivity
  implements i.a
{
  private sp fBc;
  private long fxK;
  private ae ham;
  private ProgressBar jUz;
  private TextView jjS;
  private TextView kIZ;
  private com.tencent.mm.pluginsdk.ui.tools.f kwz;
  private Button lVf;
  private Button lVg;
  private Button lVh;
  private MMImageView lVi;
  private TextView lVj;
  private View lVk;
  private View lVl;
  private boolean lVp;
  private boolean lVt;
  private boolean lVu;
  private String mediaId;
  private j oVa;
  
  public RecordMsgFileUI()
  {
    GMTrace.i(7536056991744L, 56148);
    this.kwz = null;
    this.lVp = false;
    this.lVu = false;
    this.lVt = false;
    GMTrace.o(7536056991744L, 56148);
  }
  
  private void aZv()
  {
    GMTrace.i(7537130733568L, 56156);
    if ((getType() == 15) && (this.fBc.tPx != null) && (!bg.mZ(this.fBc.tPx.hdc)) && (!bg.mZ(this.fBc.tPx.hdg)))
    {
      this.lVu = true;
      this.lVi.setVisibility(8);
      this.lVk.setVisibility(8);
      this.lVh.setVisibility(8);
      this.lVf.setVisibility(8);
      this.lVg.setVisibility(8);
      this.jjS.setVisibility(8);
      String str = com.tencent.mm.plugin.record.a.m.c(this.fBc, this.fxK);
      w.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.tG() + " initView: fullpath:" + str);
      ViewGroup localViewGroup = (ViewGroup)findViewById(R.h.cEe);
      this.kwz = n.dX(this.vov.voR);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams.addRule(13);
      localViewGroup.addView((View)this.kwz, 0, localLayoutParams);
      this.kwz.a(new f.a()
      {
        public final void Xd()
        {
          GMTrace.i(7561692577792L, 56339);
          w.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.tG() + " onPrepared");
          RecordMsgFileUI.i(RecordMsgFileUI.this).ch(true);
          RecordMsgFileUI.i(RecordMsgFileUI.this).start();
          GMTrace.o(7561692577792L, 56339);
        }
        
        public final int bL(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(7562095230976L, 56342);
          GMTrace.o(7562095230976L, 56342);
          return 0;
        }
        
        public final void br(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(7562229448704L, 56343);
          GMTrace.o(7562229448704L, 56343);
        }
        
        public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(7561826795520L, 56340);
          RecordMsgFileUI.i(RecordMsgFileUI.this).stop();
          if (RecordMsgFileUI.j(RecordMsgFileUI.this))
          {
            GMTrace.o(7561826795520L, 56340);
            return;
          }
          RecordMsgFileUI.k(RecordMsgFileUI.this);
          final Bitmap localBitmap = RecordMsgFileUI.l(RecordMsgFileUI.this).b(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this));
          final String str = RecordMsgFileUI.i(RecordMsgFileUI.this).Nx();
          b.q(Base64.encodeToString((com.tencent.mm.plugin.sight.base.d.beu() + "[RecordMsgFileUI] on play sight error, what=" + paramAnonymousInt1 + ", extra=" + paramAnonymousInt2 + ", path=" + bg.ap(str, "")).getBytes(), 2), "FullScreenPlaySight");
          af.u(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7534446379008L, 56136);
              Object localObject = (ImageView)RecordMsgFileUI.this.findViewById(R.h.cEP);
              ((ImageView)localObject).setImageBitmap(localBitmap);
              ((ImageView)localObject).setVisibility(0);
              localObject = new Intent();
              ((Intent)localObject).setAction("android.intent.action.VIEW");
              ((Intent)localObject).setDataAndType(Uri.fromFile(new File(str)), "video/*");
              try
              {
                RecordMsgFileUI.this.startActivity(Intent.createChooser((Intent)localObject, RecordMsgFileUI.this.getString(R.l.dYl)));
                GMTrace.o(7534446379008L, 56136);
                return;
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.RecordMsgFileUI", "startActivity fail, activity not found");
                h.h(RecordMsgFileUI.this.vov.voR, R.l.dXl, R.l.dXm);
                GMTrace.o(7534446379008L, 56136);
              }
            }
          });
          GMTrace.o(7561826795520L, 56340);
        }
        
        public final void qq()
        {
          GMTrace.i(7561961013248L, 56341);
          GMTrace.o(7561961013248L, 56341);
        }
      });
      w.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.tG() + " initView :" + str);
      if (str != null)
      {
        this.kwz.stop();
        this.kwz.setVideoPath(str);
      }
      w.d("MicroMsg.RecordMsgFileUI", com.tencent.mm.compatible.util.g.tG() + " initView");
      if (ap.pF() != null) {
        ap.pF().rn();
      }
    }
    if ((getType() == 15) || (getType() == 4))
    {
      if (!this.lVu)
      {
        this.lVk.setVisibility(8);
        this.lVh.setVisibility(8);
        this.lVf.setVisibility(8);
        this.lVg.setVisibility(0);
        this.lVg.setText(R.l.dXb);
        this.jjS.setVisibility(8);
        ayg();
        GMTrace.o(7537130733568L, 56156);
      }
    }
    else
    {
      this.lVk.setVisibility(8);
      this.lVh.setVisibility(4);
      if (!bg.mZ(this.fBc.tOE)) {
        break label481;
      }
      this.lVf.setVisibility(8);
    }
    for (;;)
    {
      this.lVg.setVisibility(0);
      this.jjS.setVisibility(0);
      GMTrace.o(7537130733568L, 56156);
      return;
      label481:
      this.lVf.setVisibility(0);
    }
  }
  
  private String aZw()
  {
    GMTrace.i(7537801822208L, 56161);
    Object localObject = new File(com.tencent.mm.plugin.record.a.m.f(this.fBc, this.fxK));
    if (((File)localObject).exists()) {}
    for (localObject = ((File)localObject).getAbsolutePath();; localObject = com.tencent.mm.x.c.zj() + "web/" + com.tencent.mm.a.g.n(bg.ap(this.fBc.fwl, "").getBytes()))
    {
      GMTrace.o(7537801822208L, 56161);
      return (String)localObject;
      localObject = new StringBuilder();
      ap.AS();
    }
  }
  
  private void ayd()
  {
    GMTrace.i(7536728080384L, 56153);
    this.lVh.setVisibility(8);
    this.lVf.setVisibility(8);
    this.lVg.setVisibility(8);
    this.lVk.setVisibility(8);
    this.jjS.setVisibility(0);
    if (this.fBc.aHe == 4)
    {
      this.jjS.setGravity(17);
      this.jjS.setText(R.l.dXr);
      GMTrace.o(7536728080384L, 56153);
      return;
    }
    this.jjS.setGravity(17);
    this.jjS.setText(R.l.dXq);
    GMTrace.o(7536728080384L, 56153);
  }
  
  private void aye()
  {
    GMTrace.i(7536862298112L, 56154);
    this.lVh.setVisibility(8);
    this.lVf.setVisibility(8);
    this.lVg.setVisibility(8);
    this.jjS.setVisibility(8);
    this.lVk.setVisibility(0);
    b(s.aZh().EG(this.mediaId));
    GMTrace.o(7536862298112L, 56154);
  }
  
  private void ayf()
  {
    GMTrace.i(7536996515840L, 56155);
    this.lVk.setVisibility(8);
    this.lVg.setVisibility(8);
    if (bg.mZ(this.fBc.tOE)) {
      this.lVf.setVisibility(8);
    }
    for (;;)
    {
      this.lVh.setVisibility(0);
      this.lVh.setText(R.l.dXa);
      this.jjS.setVisibility(8);
      GMTrace.o(7536996515840L, 56155);
      return;
      this.lVf.setVisibility(0);
    }
  }
  
  private void ayg()
  {
    GMTrace.i(7538204475392L, 56164);
    if (this.lVt)
    {
      GMTrace.o(7538204475392L, 56164);
      return;
    }
    this.lVt = true;
    Intent localIntent = new Intent();
    localIntent.putExtra("key_detail_fav_path", com.tencent.mm.plugin.record.a.m.c(this.fBc, this.fxK));
    localIntent.putExtra("key_detail_fav_thumb_path", com.tencent.mm.plugin.record.a.m.f(this.fBc, this.fxK));
    localIntent.putExtra("key_detail_fav_video_duration", this.fBc.duration);
    localIntent.putExtra("key_detail_statExtStr", this.fBc.fMi);
    localIntent.putExtra("key_detail_fav_video_scene_from", 1);
    com.tencent.mm.bi.d.b(this, "favorite", ".ui.detail.FavoriteVideoPlayUI", localIntent);
    finish();
    GMTrace.o(7538204475392L, 56164);
  }
  
  private void b(com.tencent.mm.plugin.record.a.g paramg)
  {
    final int i = 0;
    GMTrace.i(7537936039936L, 56162);
    final int j;
    final int k;
    if (paramg != null)
    {
      j = (int)(paramg.field_offset / Math.max(1, paramg.field_totalLen) * 100.0F);
      i = paramg.field_offset;
      k = paramg.field_totalLen;
    }
    for (;;)
    {
      this.ham.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7558471352320L, 56315);
          RecordMsgFileUI.n(RecordMsgFileUI.this).setProgress(j);
          RecordMsgFileUI.o(RecordMsgFileUI.this).setText(RecordMsgFileUI.this.getString(R.l.dWp, new Object[] { bg.ab(i), bg.ab(k) }));
          GMTrace.o(7558471352320L, 56315);
        }
      });
      GMTrace.o(7537936039936L, 56162);
      return;
      k = (int)this.fBc.tOS;
      j = 0;
    }
  }
  
  private int getType()
  {
    GMTrace.i(7536593862656L, 56152);
    int i = this.fBc.aHe;
    if (i == 15)
    {
      GMTrace.o(7536593862656L, 56152);
      return 4;
    }
    GMTrace.o(7536593862656L, 56152);
    return i;
  }
  
  protected final int Qb()
  {
    GMTrace.i(7536325427200L, 56150);
    GMTrace.o(7536325427200L, 56150);
    return 1;
  }
  
  public final void a(int paramInt, com.tencent.mm.plugin.record.a.g paramg)
  {
    GMTrace.i(7538070257664L, 56163);
    if (paramg == null)
    {
      w.w("MicroMsg.RecordMsgFileUI", "on cdn info changed, but cdn info is null");
      GMTrace.o(7538070257664L, 56163);
      return;
    }
    w.v("MicroMsg.RecordMsgFileUI", "cur mediaid[%s], notify mediaid[%s]", new Object[] { this.mediaId, paramg.field_mediaId });
    if (!this.mediaId.equals(paramg.field_mediaId))
    {
      GMTrace.o(7538070257664L, 56163);
      return;
    }
    switch (paramg.field_status)
    {
    default: 
      b(paramg);
      GMTrace.o(7538070257664L, 56163);
      return;
    case 2: 
      this.ham.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7559679311872L, 56324);
          RecordMsgFileUI.this.kS(true);
          RecordMsgFileUI.p(RecordMsgFileUI.this);
          GMTrace.o(7559679311872L, 56324);
        }
      });
      GMTrace.o(7538070257664L, 56163);
      return;
    case 4: 
      this.ham.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7551626248192L, 56264);
          RecordMsgFileUI.q(RecordMsgFileUI.this);
          GMTrace.o(7551626248192L, 56264);
        }
      });
      GMTrace.o(7538070257664L, 56163);
      return;
    }
    this.ham.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7542633660416L, 56197);
        RecordMsgFileUI.g(RecordMsgFileUI.this);
        h.bl(RecordMsgFileUI.this.vov.voR, RecordMsgFileUI.this.getString(R.l.dQj));
        GMTrace.o(7542633660416L, 56197);
      }
    });
    GMTrace.o(7538070257664L, 56163);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7536191209472L, 56149);
    int i = R.i.cUE;
    GMTrace.o(7536191209472L, 56149);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(7537667604480L, 56160);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    a.a(this, paramInt1, paramInt2, paramIntent, true, R.l.dQm, R.l.dQn, 5);
    if (paramInt2 != -1)
    {
      GMTrace.o(7537667604480L, 56160);
      return;
    }
    if (paramInt1 == 1001)
    {
      if (paramIntent == null)
      {
        localObject1 = null;
        if (paramIntent != null) {
          break label151;
        }
      }
      final Object localObject2;
      label151:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        localObject2 = h.a(this.vov.voR, getString(R.l.dWT), false, null);
        w.d("MicroMsg.RecordMsgFileUI", "do share msg, fav msg type %d", new Object[] { Integer.valueOf(getType()) });
        localObject2 = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7520219299840L, 56030);
            localObject2.dismiss();
            GMTrace.o(7520219299840L, 56030);
          }
        };
        if (!bg.mZ((String)localObject1)) {
          break label162;
        }
        GMTrace.o(7537667604480L, 56160);
        return;
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
      label162:
      final Object localObject1 = bg.f(((String)localObject1).split(","));
      if ((getType() == 4) || (getType() == 15))
      {
        ap.xC().C(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7557129175040L, 56305);
            File localFile = new File(com.tencent.mm.plugin.record.a.m.c(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this)));
            Iterator localIterator = localObject1.iterator();
            if (localIterator.hasNext())
            {
              String str1 = (String)localIterator.next();
              Object localObject1;
              if (localFile.exists())
              {
                localObject1 = RecordMsgFileUI.m(RecordMsgFileUI.this);
                w.d("MicroMsg.RecordMsgFileUI", "sendVideo::data path[%s] thumb path[%s]", new Object[] { localFile.getAbsolutePath(), localObject1 });
                if (RecordMsgFileUI.c(RecordMsgFileUI.this) == 15) {
                  com.tencent.mm.plugin.messenger.a.d.aNb().a(RecordMsgFileUI.this.vov.voR, str1, localFile.getAbsolutePath(), (String)localObject1, 62, RecordMsgFileUI.a(RecordMsgFileUI.this).duration, "");
                }
              }
              for (;;)
              {
                com.tencent.mm.plugin.messenger.a.d.aNb().cM(paramIntent, str1);
                break;
                com.tencent.mm.plugin.messenger.a.d.aNb().a(RecordMsgFileUI.this.vov.voR, str1, localFile.getAbsolutePath(), (String)localObject1, 1, RecordMsgFileUI.a(RecordMsgFileUI.this).duration, "");
                continue;
                Object localObject2 = RecordMsgFileUI.a(RecordMsgFileUI.this).tOE;
                if (!bg.mZ((String)localObject2))
                {
                  localObject1 = new WXVideoObject();
                  ((WXVideoObject)localObject1).videoUrl = ((String)localObject2);
                  localObject2 = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject1);
                  String str2 = bg.ap(RecordMsgFileUI.a(RecordMsgFileUI.this).title, RecordMsgFileUI.this.vov.voR.getResources().getString(R.l.dYl));
                  ((WXMediaMessage)localObject2).mediaObject = ((WXMediaMessage.IMediaObject)localObject1);
                  ((WXMediaMessage)localObject2).title = str2;
                  ((WXMediaMessage)localObject2).description = RecordMsgFileUI.a(RecordMsgFileUI.this).desc;
                  ((WXMediaMessage)localObject2).thumbData = bg.readFromFile(com.tencent.mm.plugin.record.a.m.f(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this)));
                  if (((WXMediaMessage)localObject2).thumbData == null)
                  {
                    localObject1 = new StringBuilder();
                    ap.AS();
                    ((WXMediaMessage)localObject2).thumbData = bg.readFromFile(com.tencent.mm.x.c.zj() + "web/" + com.tencent.mm.a.g.n(bg.ap(RecordMsgFileUI.a(RecordMsgFileUI.this).fwl, "").getBytes()));
                  }
                  l.a((WXMediaMessage)localObject2, "", "", str1, 3, null);
                }
              }
            }
            af.u(localObject2);
            GMTrace.o(7557129175040L, 56305);
          }
          
          public final String toString()
          {
            GMTrace.i(7557263392768L, 56306);
            String str = super.toString() + "|onActivityResult1";
            GMTrace.o(7557263392768L, 56306);
            return str;
          }
        });
        GMTrace.o(7537667604480L, 56160);
        return;
      }
      ap.xC().C(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7542902095872L, 56199);
          Object localObject1 = com.tencent.mm.plugin.record.a.m.c(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this));
          Object localObject2 = new WXFileObject();
          ((WXFileObject)localObject2).setFilePath((String)localObject1);
          localObject1 = new WXMediaMessage();
          ((WXMediaMessage)localObject1).mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
          ((WXMediaMessage)localObject1).title = RecordMsgFileUI.a(RecordMsgFileUI.this).title;
          ((WXMediaMessage)localObject1).description = RecordMsgFileUI.a(RecordMsgFileUI.this).desc;
          ((WXMediaMessage)localObject1).thumbData = bg.readFromFile(com.tencent.mm.plugin.record.a.m.f(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this)));
          localObject2 = localObject1.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            String str = (String)((Iterator)localObject2).next();
            l.a((WXMediaMessage)localObject1, "", "", str, 3, null);
            com.tencent.mm.plugin.messenger.a.d.aNb().cM(paramIntent, str);
          }
          af.u(localObject2);
          GMTrace.o(7542902095872L, 56199);
        }
        
        public final String toString()
        {
          GMTrace.i(7543036313600L, 56200);
          String str = super.toString() + "|onActivityResult2";
          GMTrace.o(7543036313600L, 56200);
          return str;
        }
      });
    }
    GMTrace.o(7537667604480L, 56160);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(7536459644928L, 56151);
    super.onCreate(paramBundle);
    this.ham = new ae();
    this.oVa = new j();
    this.fxK = getIntent().getLongExtra("message_id", -1L);
    paramBundle = getIntent().getStringExtra("record_data_id");
    Object localObject = com.tencent.mm.plugin.record.a.m.EH(getIntent().getStringExtra("record_xml"));
    if (localObject == null)
    {
      w.w("MicroMsg.RecordMsgFileUI", "get record msg data error, empty");
      finish();
      GMTrace.o(7536459644928L, 56151);
      return;
    }
    localObject = ((com.tencent.mm.protocal.b.a.c)localObject).hdL.iterator();
    while (((Iterator)localObject).hasNext())
    {
      sp localsp = (sp)((Iterator)localObject).next();
      if (localsp.lUP.equals(paramBundle)) {
        this.fBc = localsp;
      }
    }
    if (this.fBc == null)
    {
      w.w("MicroMsg.RecordMsgFileUI", "get data error, empty");
      finish();
      GMTrace.o(7536459644928L, 56151);
      return;
    }
    this.mediaId = com.tencent.mm.plugin.record.a.m.d(this.fBc.lUP, this.fxK, true);
    this.lVf = ((Button)findViewById(R.h.cko));
    this.lVg = ((Button)findViewById(R.h.chE));
    this.lVh = ((Button)findViewById(R.h.bCx));
    this.lVi = ((MMImageView)findViewById(R.h.bOX));
    this.kIZ = ((TextView)findViewById(R.h.ceD));
    this.jjS = ((TextView)findViewById(R.h.cBu));
    this.lVl = findViewById(R.h.bCP);
    this.lVk = findViewById(R.h.bCL);
    this.jUz = ((ProgressBar)findViewById(R.h.bCK));
    this.lVj = ((TextView)findViewById(R.h.bCM));
    if (4 == getType())
    {
      oC(R.l.dYl);
      if (getType() != 4) {
        break label589;
      }
      this.lVi.setImageResource(R.k.dlh);
      label365:
      this.kIZ.setText(this.fBc.title);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7530688282624L, 56108);
          RecordMsgFileUI.this.finish();
          GMTrace.o(7530688282624L, 56108);
          return true;
        }
      });
      this.lVg.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7523172089856L, 56052);
          paramAnonymousView = com.tencent.mm.plugin.record.a.m.c(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this));
          new Intent().setAction("android.intent.action.VIEW");
          if (4 == RecordMsgFileUI.c(RecordMsgFileUI.this))
          {
            RecordMsgFileUI.d(RecordMsgFileUI.this);
            RecordMsgFileUI.e(RecordMsgFileUI.this);
            GMTrace.o(7523172089856L, 56052);
            return;
          }
          RecordMsgFileUI.a(RecordMsgFileUI.this, paramAnonymousView);
          GMTrace.o(7523172089856L, 56052);
        }
      });
      paramBundle = this.fBc.tOE;
      if (!bg.mZ(paramBundle)) {
        this.lVf.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7526795968512L, 56079);
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("rawUrl", paramBundle);
            com.tencent.mm.bi.d.b(RecordMsgFileUI.this.vov.voR, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
            GMTrace.o(7526795968512L, 56079);
          }
        });
      }
      this.lVh.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7522232565760L, 56045);
          if (!com.tencent.mm.compatible.util.f.tD())
          {
            h.h(RecordMsgFileUI.this.vov.voR, R.l.dXn, R.l.dxm);
            GMTrace.o(7522232565760L, 56045);
            return;
          }
          com.tencent.mm.plugin.record.a.m.a(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this), true);
          RecordMsgFileUI.f(RecordMsgFileUI.this);
          GMTrace.o(7522232565760L, 56045);
        }
      });
      this.lVl.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(7559947747328L, 56326);
          RecordMsgFileUI.g(RecordMsgFileUI.this);
          GMTrace.o(7559947747328L, 56326);
        }
      });
      if ((getType() != 15) || (bg.RF(com.tencent.mm.k.g.uz().getValue("SightForwardEnable")) == 1)) {
        break label609;
      }
      w.w("MicroMsg.RecordMsgFileUI", "can not retransmit sight msg");
      label500:
      if ((!bg.mZ(this.fBc.tOx)) && (!bg.mZ(this.fBc.tOz))) {
        break label628;
      }
      ayd();
    }
    for (;;)
    {
      s.aZh().a(this);
      GMTrace.o(7536459644928L, 56151);
      return;
      if (15 == getType())
      {
        oC(R.l.dXT);
        findViewById(R.h.cEe).setBackgroundResource(R.e.black);
        break;
      }
      oC(R.l.dWR);
      break;
      label589:
      this.lVi.setImageResource(com.tencent.mm.pluginsdk.c.Nd(this.fBc.tOM));
      break label365;
      label609:
      a(0, R.g.baG, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(7558202916864L, 56313);
          paramAnonymousMenuItem = new com.tencent.mm.ui.widget.e(RecordMsgFileUI.this.vov.voR, com.tencent.mm.ui.widget.e.wSP, false);
          paramAnonymousMenuItem.qQS = new o.c()
          {
            public final void a(com.tencent.mm.ui.base.m paramAnonymous2m)
            {
              GMTrace.i(7527332839424L, 56083);
              paramAnonymous2m.e(0, RecordMsgFileUI.this.getString(R.l.dXS));
              GMTrace.o(7527332839424L, 56083);
            }
          };
          paramAnonymousMenuItem.qQT = new o.d()
          {
            public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
            {
              GMTrace.i(7525453791232L, 56069);
              switch (paramAnonymous2MenuItem.getItemId())
              {
              }
              for (;;)
              {
                GMTrace.o(7525453791232L, 56069);
                return;
                if (RecordMsgFileUI.c(RecordMsgFileUI.this) == 8)
                {
                  paramAnonymous2MenuItem = com.tencent.mm.plugin.record.a.m.c(RecordMsgFileUI.a(RecordMsgFileUI.this), RecordMsgFileUI.b(RecordMsgFileUI.this));
                  if (!com.tencent.mm.a.e.aZ(paramAnonymous2MenuItem))
                  {
                    w.e("MicroMsg.RecordMsgFileUI", "share file failed, file not exists");
                    Toast.makeText(RecordMsgFileUI.this, RecordMsgFileUI.this.getString(R.l.dXQ), 1).show();
                    GMTrace.o(7525453791232L, 56069);
                    return;
                  }
                  if (new File(paramAnonymous2MenuItem).length() > 10485760L)
                  {
                    w.e("MicroMsg.RecordMsgFileUI", "share file failed, file too large");
                    Toast.makeText(RecordMsgFileUI.this, RecordMsgFileUI.this.getString(R.l.dXR), 1).show();
                    GMTrace.o(7525453791232L, 56069);
                    return;
                  }
                }
                RecordMsgFileUI.h(RecordMsgFileUI.this);
              }
            }
          };
          paramAnonymousMenuItem.bCV();
          GMTrace.o(7558202916864L, 56313);
          return true;
        }
      });
      break label500;
      label628:
      if (!com.tencent.mm.plugin.record.a.m.d(this.fBc, this.fxK)) {
        break label654;
      }
      kS(true);
      aZv();
    }
    label654:
    paramBundle = s.aZh().EG(this.mediaId);
    if ((paramBundle == null) || (2 == paramBundle.field_status)) {
      ayf();
    }
    for (;;)
    {
      kS(false);
      break;
      if (4 == paramBundle.field_status)
      {
        ayd();
      }
      else if ((paramBundle.field_status == 0) || (1 == paramBundle.field_status))
      {
        aye();
      }
      else
      {
        w.w("MicroMsg.RecordMsgFileUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        ayf();
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7537264951296L, 56157);
    if (this.kwz != null)
    {
      this.kwz.a(null);
      this.kwz.stop();
      this.kwz.onDetach();
      if (ap.pF() != null) {
        ap.pF().rm();
      }
    }
    super.onDestroy();
    s.aZh().b(this);
    this.oVa.destory();
    GMTrace.o(7537264951296L, 56157);
  }
  
  protected void onPause()
  {
    GMTrace.i(7537533386752L, 56159);
    super.onPause();
    if (this.kwz != null) {
      this.kwz.stop();
    }
    GMTrace.o(7537533386752L, 56159);
  }
  
  protected void onResume()
  {
    GMTrace.i(7537399169024L, 56158);
    super.onResume();
    if (this.kwz != null) {
      this.kwz.start();
    }
    GMTrace.o(7537399169024L, 56158);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/record/ui/RecordMsgFileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */