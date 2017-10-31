package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.friend.InviteFriendUI;
import com.tencent.mm.x.ap;

public final class g
  extends b
{
  public com.tencent.mm.modelfriend.b poi;
  public boolean poj;
  private a pok;
  
  public g(int paramInt)
  {
    super(paramInt);
    GMTrace.i(11848741027840L, 88280);
    this.pok = new a();
    GMTrace.o(11848741027840L, 88280);
  }
  
  public final a.b Vk()
  {
    GMTrace.i(16475226112000L, 122750);
    a locala = this.pok;
    GMTrace.o(16475226112000L, 122750);
    return locala;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16475091894272L, 122749);
    this.username = this.iOg.mkj;
    ap.AS();
    this.jqN = com.tencent.mm.x.c.yL().SL(this.username);
    this.poi = af.Ic().aj(this.iOg.mkG);
    Object localObject1 = null;
    Object localObject2 = null;
    int k = 0;
    int m = 0;
    boolean bool5 = false;
    boolean bool8 = false;
    boolean bool9 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool6 = false;
    boolean bool7 = false;
    boolean bool10 = false;
    String str = this.poi.GR();
    boolean bool1 = bool10;
    boolean bool2 = bool9;
    int i = m;
    int j = k;
    parama = (a.a)localObject2;
    paramVarArgs = (Object[])localObject1;
    switch (this.iOg.hJy)
    {
    default: 
      paramVarArgs = (Object[])localObject1;
      parama = (a.a)localObject2;
      j = k;
      i = m;
      bool2 = bool9;
      bool1 = bool10;
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 15: 
      if (j != 0) {
        this.klY = h.c(paramContext, str, com.tencent.mm.bq.a.U(paramContext, R.f.aSh));
      }
      break;
    }
    for (this.klY = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.klY, this.fIW, this.iOh, bool2, bool1)).mok;; this.klY = h.c(paramContext, str, com.tencent.mm.bq.a.U(paramContext, R.f.aSh)))
    {
      if (i != 0)
      {
        this.klZ = h.c(paramContext, parama, com.tencent.mm.bq.a.U(paramContext, R.f.aSh));
        this.klZ = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.klZ, this.fIW, this.iOh, bool2, bool1)).mok;
        this.klZ = TextUtils.concat(new CharSequence[] { paramVarArgs, this.klZ });
      }
      GMTrace.o(16475091894272L, 122749);
      return;
      bool3 = true;
      bool5 = true;
      bool4 = bool3;
      j = 1;
      parama = this.poi.GX();
      paramVarArgs = paramContext.getString(R.l.eEq);
      bool1 = bool4;
      bool2 = bool5;
      i = m;
      break;
      i = 1;
      parama = this.poi.GX();
      paramVarArgs = paramContext.getString(R.l.eEq);
      bool1 = bool10;
      bool2 = bool9;
      j = k;
      break;
      bool6 = true;
      bool8 = true;
      bool7 = bool6;
      i = 1;
      parama = this.poi.GU();
      paramVarArgs = paramContext.getString(R.l.eEw);
      bool1 = bool7;
      bool2 = bool8;
      j = k;
      break;
    }
  }
  
  public final class a
    extends b.b
  {
    public a()
    {
      super();
      GMTrace.i(11853572866048L, 88316);
      GMTrace.o(11853572866048L, 88316);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16474286587904L, 122743);
      paramVarArgs = (g)paramVarArgs;
      if (paramVarArgs.poi == null)
      {
        GMTrace.o(16474286587904L, 122743);
        return true;
      }
      if ((paramVarArgs.poi.status == 1) || (paramVarArgs.poi.status == 2))
      {
        w.d("MicroMsg.FTS.FTSMobileContactDataItem", "Click Mobile Contact Weixin On Or Weixin Friend");
        paramVarArgs = new Intent();
        paramVarArgs.putExtra("Contact_User", g.this.poi.getUsername());
        paramVarArgs.putExtra("Contact_Nick", g.this.poi.GU());
        paramVarArgs.putExtra("Contact_Mobile_MD5", g.this.poi.GP());
        paramVarArgs.putExtra("Contact_Alias", g.this.poi.huO);
        paramVarArgs.putExtra("Contact_Sex", g.this.poi.huJ);
        paramVarArgs.putExtra("Contact_Signature", g.this.poi.huM);
        paramVarArgs.putExtra("Contact_RegionCode", RegionCodeDecoder.ae(g.this.poi.huS, g.this.poi.huK, g.this.poi.huL));
        paramVarArgs.putExtra("Contact_Scene", 13);
        paramVarArgs.putExtra("Contact_ShowUserName", false);
        if (g.this.poj) {
          paramVarArgs.putExtra("add_more_friend_search_scene", 1);
        }
        com.tencent.mm.plugin.c.a.ifM.d(paramVarArgs, paramContext);
        GMTrace.o(16474286587904L, 122743);
        return true;
      }
      if (g.this.poi.status == 0)
      {
        w.d("MicroMsg.FTS.FTSMobileContactDataItem", "Click Mobile Contact Weixin Off");
        paramVarArgs = new Intent(paramContext, InviteFriendUI.class);
        paramVarArgs.putExtra("friend_type", 1);
        paramVarArgs.putExtra("friend_user_name", g.this.poi.getUsername());
        paramVarArgs.putExtra("friend_num", g.this.poi.GX());
        paramVarArgs.putExtra("friend_nick", g.this.poi.GR());
        paramVarArgs.putExtra("friend_weixin_nick", g.this.poi.GU());
        paramVarArgs.putExtra("friend_scene", 13);
        paramContext.startActivity(paramVarArgs);
        GMTrace.o(16474286587904L, 122743);
        return true;
      }
      w.d("MicroMsg.FTS.FTSMobileContactDataItem", "Click Mobile Contact Weixin status unknown");
      GMTrace.o(16474286587904L, 122743);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */