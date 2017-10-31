package com.tencent.mm.plugin.wear.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.g;
import com.tencent.mm.ac.g.a;
import com.tencent.mm.ac.g.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.LinkedList;

public final class i
{
  private g.a fAb;
  private g.b fAc;
  AudioManager gFp;
  public a shY;
  BroadcastReceiver shZ;
  
  public i()
  {
    GMTrace.i(9193377497088L, 68496);
    this.fAb = new g.a()
    {
      public final void qq()
      {
        GMTrace.i(9196867158016L, 68522);
        i.this.shY.lPs.a(null);
        i.this.shY.lPs.a(null);
        i.this.b(i.this.shY);
        GMTrace.o(9196867158016L, 68522);
      }
    };
    this.fAc = new g.b()
    {
      public final void onError()
      {
        GMTrace.i(9179821506560L, 68395);
        i.this.shY.lPs.a(null);
        i.this.shY.lPs.a(null);
        i.this.b(i.this.shY);
        GMTrace.o(9179821506560L, 68395);
      }
    };
    this.shZ = new BroadcastReceiver()
    {
      public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
      {
        GMTrace.i(9184519127040L, 68430);
        if ((paramAnonymousIntent.hasExtra("state")) && (paramAnonymousIntent.getIntExtra("state", 2) == 0)) {
          i.this.bzw();
        }
        GMTrace.o(9184519127040L, 68430);
      }
    };
    this.gFp = ((AudioManager)ab.getContext().getSystemService("audio"));
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.HEADSET_PLUG");
    ab.getContext().registerReceiver(this.shZ, localIntentFilter);
    GMTrace.o(9193377497088L, 68496);
  }
  
  private static a a(a parama)
  {
    GMTrace.i(9193645932544L, 68498);
    if (parama != null)
    {
      parama.lPs.stop();
      parama.lPs.a(null);
      parama.lPs.a(null);
      parama.sib.clear();
    }
    GMTrace.o(9193645932544L, 68498);
    return null;
  }
  
  public final void b(a parama)
  {
    GMTrace.i(9193780150272L, 68499);
    while (parama != null) {
      if (parama.sib.size() > 0)
      {
        au localau = (au)parama.sib.getLast();
        parama.sib.removeLast();
        q.D(localau);
        String str = q.getFullPath(localau.field_imgPath);
        w.i("MicroMsg.Wear.WearVoicePlayLogic", "play: msgid=%d, fullpath=%s", new Object[] { Long.valueOf(localau.field_msgId), str });
        if (parama.lPs.a(str, true, true, -1))
        {
          parama.lPs.a(this.fAb);
          parama.lPs.a(this.fAc);
          GMTrace.o(9193780150272L, 68499);
        }
      }
      else
      {
        a(parama);
      }
    }
    GMTrace.o(9193780150272L, 68499);
  }
  
  public final void bzw()
  {
    GMTrace.i(9193511714816L, 68497);
    a(this.shY);
    GMTrace.o(9193511714816L, 68497);
  }
  
  private final class a
  {
    g lPs;
    LinkedList<au> sib;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */