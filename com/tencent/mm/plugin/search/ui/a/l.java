package com.tencent.mm.plugin.search.ui.a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.d.a.a.a;
import com.tencent.mm.plugin.fts.d.a.a.b;
import com.tencent.mm.plugin.fts.d.d.b;
import com.tencent.mm.plugin.fts.d.f;
import com.tencent.mm.plugin.fts.d.f.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import com.tencent.mm.x.n;

public final class l
  extends b
{
  private a poB;
  
  public l(int paramInt)
  {
    super(paramInt);
    GMTrace.i(11851425382400L, 88300);
    this.poB = new a();
    GMTrace.o(11851425382400L, 88300);
  }
  
  public final a.b Vk()
  {
    GMTrace.i(16474555023360L, 122745);
    a locala = this.poB;
    GMTrace.o(16474555023360L, 122745);
    return locala;
  }
  
  public final void a(Context paramContext, a.a parama, Object... paramVarArgs)
  {
    GMTrace.i(16474420805632L, 122744);
    this.username = this.iOg.mkj;
    ap.AS();
    this.jqN = c.yL().SL(this.username);
    boolean bool6 = false;
    boolean bool3 = false;
    boolean bool2 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool1 = false;
    String str = n.fc(this.username);
    int j;
    int i;
    switch (this.iOg.hJy)
    {
    case 8: 
    case 9: 
    case 10: 
    case 12: 
    case 13: 
    case 14: 
    default: 
      bool1 = false;
      j = 0;
      parama = null;
      paramVarArgs = null;
      bool2 = false;
      i = 0;
    case 3: 
    case 2: 
    case 1: 
    case 7: 
    case 6: 
    case 5: 
    case 4: 
    case 15: 
    case 16: 
      for (;;)
      {
        if (i != 0)
        {
          this.klY = h.c(paramContext, str, com.tencent.mm.bq.a.U(paramContext, R.f.aSh));
          this.klY = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.klY, this.fIW, this.iOh, bool1, bool2, f.a.mnc, d.b.mmW)).mok;
          label234:
          if (j != 0)
          {
            this.klZ = h.c(paramContext, parama, com.tencent.mm.bq.a.U(paramContext, R.f.aSh));
            this.klZ = f.b(com.tencent.mm.plugin.fts.d.b.a.a(this.klZ, this.fIW, this.iOh, bool1, bool2, f.a.mnc, d.b.mmY)).mok;
            this.klZ = TextUtils.concat(new CharSequence[] { paramVarArgs, this.klZ });
          }
          GMTrace.o(16474420805632L, 122744);
          return;
          bool1 = true;
          bool3 = true;
          bool2 = bool1;
          j = 0;
          parama = null;
          paramVarArgs = null;
          i = 1;
          bool1 = bool3;
          continue;
          bool4 = true;
          bool6 = true;
          bool5 = bool4;
          parama = this.jqN.field_nickname;
          paramVarArgs = paramContext.getString(R.l.eEr);
          j = 1;
          bool1 = bool6;
          bool2 = bool5;
          i = 0;
          continue;
          parama = this.jqN.gcf;
          paramVarArgs = paramContext.getString(R.l.eEn);
          j = 1;
          bool1 = false;
          bool2 = false;
          i = 0;
          continue;
          paramVarArgs = this.jqN.qV();
          parama = paramVarArgs;
          if (bg.mZ(paramVarArgs)) {
            parama = this.jqN.field_username;
          }
          paramVarArgs = paramContext.getString(R.l.eEv);
          j = 1;
          bool1 = false;
          bool2 = false;
          i = 0;
          continue;
          parama = this.iOg.content;
          if (bg.mZ(parama)) {
            break label673;
          }
          String[] arrayOfString = parama.split("​");
          j = arrayOfString.length;
          i = 0;
          label502:
          if (i >= j) {
            break label673;
          }
          paramVarArgs = arrayOfString[i];
          if (paramVarArgs.startsWith(this.fIW)) {
            parama = paramVarArgs;
          }
        }
      }
    }
    label673:
    for (;;)
    {
      paramVarArgs = paramContext.getString(R.l.eEq);
      j = 1;
      bool1 = false;
      bool2 = false;
      i = 0;
      break;
      i += 1;
      break label502;
      parama = this.iOg.content;
      paramVarArgs = paramContext.getString(R.l.eEs);
      j = 1;
      bool1 = false;
      bool2 = false;
      i = 0;
      break;
      parama = this.iOg.content;
      paramVarArgs = paramContext.getString(R.l.eEm);
      j = 1;
      bool1 = false;
      bool2 = false;
      i = 0;
      break;
      parama = this.iOg.mkK;
      paramVarArgs = paramContext.getString(R.l.eEu);
      j = 1;
      bool1 = false;
      bool2 = false;
      i = 0;
      break;
      this.klY = h.c(paramContext, str, com.tencent.mm.bq.a.U(paramContext, R.f.aSh));
      break label234;
    }
  }
  
  public final class a
    extends b.b
  {
    public a()
    {
      super();
      GMTrace.i(11853841301504L, 88318);
      GMTrace.o(11853841301504L, 88318);
    }
    
    public final boolean a(Context paramContext, com.tencent.mm.plugin.fts.d.a.a paramVarArgs)
    {
      GMTrace.i(16471065362432L, 122719);
      paramVarArgs = (l)paramVarArgs;
      a(l.this.fIW, paramVarArgs.iOg);
      d.a(paramContext, ".ui.chatting.En_5b8fbb1e", new Intent().putExtra("Chat_User", paramVarArgs.username).putExtra("finish_direct", true));
      GMTrace.o(16471065362432L, 122719);
      return true;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */