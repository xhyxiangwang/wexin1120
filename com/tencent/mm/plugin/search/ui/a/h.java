package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.modelfriend.ae;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.modelfriend.k;
import com.tencent.mm.modelfriend.l;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.friend.InviteFriendUI;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;

public final class h
  extends b
{
  public boolean poj;
  public ad pom;
  private a pon;
  
  public h(int paramInt)
  {
    super(paramInt);
    GMTrace.i(11853170212864L, 88313);
    this.pon = new a();
    GMTrace.o(11853170212864L, 88313);
  }
  
  public final a.b Vk()
  {
    GMTrace.i(16469857402880L, 122710);
    a locala = this.pon;
    GMTrace.o(16469857402880L, 122710);
    return locala;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16469723185152L, 122709);
    this.username = this.iOg.mkj;
    ap.AS();
    this.jqN = c.yL().SL(this.username);
    this.pom = af.Ih().ak(this.iOg.mkG);
    boolean bool6 = false;
    boolean bool3 = false;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool7 = false;
    String str = this.pom.getDisplayName();
    int j = 0;
    int i = j;
    if (this.pom.HX() != null)
    {
      i = j;
      if (this.pom.HX().length() > 0) {
        i = 1;
      }
    }
    switch (this.iOg.hJy)
    {
    default: 
      bool1 = false;
      i = 0;
      j = 0;
      parama = null;
      paramVarArgs = null;
      bool2 = bool7;
      if (j != 0) {
        this.klY = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, str, com.tencent.mm.bq.a.U(paramContext, R.f.aSh));
      }
      break;
    }
    for (this.klY = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.klY, this.fIW, this.iOh, bool1, bool2)).mok;; this.klY = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, str, com.tencent.mm.bq.a.U(paramContext, R.f.aSh)))
    {
      if (i != 0)
      {
        this.klZ = com.tencent.mm.pluginsdk.ui.d.h.c(paramContext, parama, com.tencent.mm.bq.a.U(paramContext, R.f.aSh));
        this.klZ = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.klZ, this.fIW, this.iOh, bool1, bool2)).mok;
        this.klZ = TextUtils.concat(new CharSequence[] { paramVarArgs, this.klZ });
      }
      GMTrace.o(16469723185152L, 122709);
      return;
      bool1 = true;
      bool3 = true;
      bool2 = bool1;
      if (i != 0) {}
      int k;
      for (i = 0;; i = 1)
      {
        parama = this.pom.hwh;
        paramVarArgs = paramContext.getString(R.l.eEt);
        k = 0;
        j = i;
        bool1 = bool3;
        i = k;
        break;
      }
      parama = this.pom.hwh;
      paramVarArgs = paramContext.getString(R.l.eEt);
      i = 1;
      bool1 = false;
      j = 0;
      bool2 = bool7;
      break;
      bool4 = true;
      bool6 = true;
      bool5 = bool4;
      if (i != 0) {}
      for (i = 0;; i = 1)
      {
        parama = this.pom.hwh;
        paramVarArgs = paramContext.getString(R.l.eEt);
        k = 0;
        j = i;
        bool1 = bool6;
        bool2 = bool5;
        i = k;
        break;
      }
    }
  }
  
  public final class a
    extends b.b
  {
    public a()
    {
      super();
      GMTrace.i(11845922455552L, 88259);
      GMTrace.o(11845922455552L, 88259);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16472810192896L, 122732);
      paramVarArgs = (h)paramVarArgs;
      if (paramVarArgs.pom == null)
      {
        GMTrace.o(16472810192896L, 122732);
        return true;
      }
      if ((paramVarArgs.pom.hwi == 1) || (paramVarArgs.pom.hwi == 2))
      {
        paramVarArgs = new Intent();
        paramVarArgs.putExtra("Contact_User", h.this.pom.getUsername());
        paramVarArgs.putExtra("Contact_Nick", h.this.pom.HT());
        paramVarArgs.putExtra("Contact_Uin", h.this.pom.hwh);
        paramVarArgs.putExtra("Contact_QQNick", h.this.pom.getDisplayName());
        paramVarArgs.putExtra("Contact_Scene", 12);
        paramVarArgs.putExtra("Contact_RemarkName", h.this.pom.HX());
        k localk = af.Ie().jE(h.this.pom.getUsername());
        if (localk != null) {
          paramVarArgs.putExtra("Contact_Sex", localk.gbM);
        }
        if (h.this.poj) {
          paramVarArgs.putExtra("add_more_friend_search_scene", 1);
        }
        paramVarArgs.putExtra("Contact_ShowUserName", false);
        com.tencent.mm.plugin.c.a.ifM.d(paramVarArgs, paramContext);
        GMTrace.o(16472810192896L, 122732);
        return true;
      }
      if (h.this.pom.hwi == 0)
      {
        paramVarArgs = new Intent(paramContext, InviteFriendUI.class);
        paramVarArgs.putExtra("friend_type", 0);
        paramVarArgs.putExtra("friend_user_name", h.this.pom.getUsername());
        paramVarArgs.putExtra("friend_num", h.this.pom.hwh);
        paramVarArgs.putExtra("friend_nick", h.this.pom.getDisplayName());
        paramVarArgs.putExtra("friend_weixin_nick", h.this.pom.HT());
        paramVarArgs.putExtra("friend_scene", 12);
        paramContext.startActivity(paramVarArgs);
        GMTrace.o(16472810192896L, 122732);
        return true;
      }
      GMTrace.o(16472810192896L, 122732);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */