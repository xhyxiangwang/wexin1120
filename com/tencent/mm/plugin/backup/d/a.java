package com.tencent.mm.plugin.backup.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.k;
import com.tencent.mm.network.j;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.ac;
import com.tencent.mm.protocal.c.ef;
import com.tencent.mm.protocal.c.nh;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.j.a;
import com.tencent.mm.protocal.j.b;
import com.tencent.mm.protocal.k.a;
import com.tencent.mm.protocal.k.d;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.m;
import java.util.LinkedList;

public final class a
  extends k
  implements j
{
  private com.tencent.mm.ac.e gMF;
  public com.tencent.mm.network.p hne;
  
  public a(LinkedList<nh> paramLinkedList, String paramString1, String paramString2)
  {
    GMTrace.i(14845688676352L, 110609);
    this.hne = new a();
    final j.a locala = (j.a)this.hne.DC();
    locala.tpB = com.tencent.mm.plugin.backup.a.e.adK();
    locala.tpA.tyc = paramLinkedList.size();
    locala.tpA.tyd = paramLinkedList;
    locala.tpA.tye = com.tencent.mm.compatible.d.p.getDeviceID(ab.getContext());
    locala.tpA.tyf = m.zF();
    locala.tpA.ttY = 2;
    locala.tpA.jXk = 0L;
    locala.tpA.tyg = paramString1;
    locala.tpA.tyh = paramString2;
    locala.tpK = locala.tpB;
    locala.tpJ = new k.a()
    {
      public final boolean a(PByteArray paramAnonymousPByteArray, int paramAnonymousInt1, byte[] paramAnonymousArrayOfByte1, byte[] paramAnonymousArrayOfByte2, int paramAnonymousInt2)
      {
        GMTrace.i(16145855807488L, 120296);
        long l = locala.tpD;
        if ((b.bMv()) && (l == 0L)) {
          l = d.toW;
        }
        for (;;)
        {
          ac localac = locala.tpL;
          if (paramAnonymousInt1 == 1000)
          {
            byte[] arrayOfByte = locala.tpK;
            w.d("MicroMsg.BackupCreateQRCodeOfflineScene", "BakMove key:" + arrayOfByte);
            if (!localac.bLw()) {
              arrayOfByte = new byte[0];
            }
            if (bg.bp(arrayOfByte))
            {
              w.e("MicroMsg.BackupCreateQRCodeOfflineScene", "dksession jType %d session should not null", new Object[] { Integer.valueOf(paramAnonymousInt1) });
              GMTrace.o(16145855807488L, 120296);
              return false;
            }
            if (MMProtocalJni.pack(locala.Bb(), paramAnonymousPByteArray, arrayOfByte, paramAnonymousArrayOfByte1, locala.tpG, (int)l, 1000, localac.ver, localac.tqw.getBytes(), localac.tqx.getBytes(), paramAnonymousArrayOfByte2, paramAnonymousInt2))
            {
              w.d("MicroMsg.BackupCreateQRCodeOfflineScene", "reqToBuf using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(paramAnonymousPByteArray.value.length), Integer.valueOf(paramAnonymousInt2) });
              GMTrace.o(16145855807488L, 120296);
              return true;
            }
          }
          GMTrace.o(16145855807488L, 120296);
          return false;
        }
      }
    };
    GMTrace.o(14845688676352L, 110609);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ac.e parame1)
  {
    GMTrace.i(9574287409152L, 71334);
    this.gMF = parame1;
    int i = a(parame, this.hne, this);
    GMTrace.o(9574287409152L, 71334);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.p paramp, byte[] paramArrayOfByte)
  {
    GMTrace.i(9574421626880L, 71335);
    w.i("MicroMsg.BackupCreateQRCodeOfflineScene", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.gMF.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(9574421626880L, 71335);
      return;
    }
    w.i("MicroMsg.BackupCreateQRCodeOfflineScene", "onGYNetEnd QRCodeUrl:%s", new Object[] { ((j.b)paramp.Ba()).tpC.tyk });
    this.gMF.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9574421626880L, 71335);
  }
  
  public final int getType()
  {
    GMTrace.i(9574555844608L, 71336);
    GMTrace.o(9574555844608L, 71336);
    return 1000;
  }
  
  public static final class a
    extends i
  {
    private final j.b jOA;
    private final j.a jOz;
    
    public a()
    {
      GMTrace.i(9575226933248L, 71341);
      this.jOz = new j.a();
      this.jOA = new j.b();
      GMTrace.o(9575226933248L, 71341);
    }
    
    protected final k.d AZ()
    {
      GMTrace.i(9575361150976L, 71342);
      j.a locala = this.jOz;
      GMTrace.o(9575361150976L, 71342);
      return locala;
    }
    
    public final k.e Ba()
    {
      GMTrace.i(9575495368704L, 71343);
      j.b localb = this.jOA;
      GMTrace.o(9575495368704L, 71343);
      return localb;
    }
    
    public final int Dz()
    {
      GMTrace.i(9575898021888L, 71346);
      GMTrace.o(9575898021888L, 71346);
      return 1;
    }
    
    public final int getType()
    {
      GMTrace.i(9575629586432L, 71344);
      GMTrace.o(9575629586432L, 71344);
      return 1000;
    }
    
    public final String getUri()
    {
      GMTrace.i(9575763804160L, 71345);
      GMTrace.o(9575763804160L, 71345);
      return "/cgi-bin/micromsg-bin/bakchatcreateqrcodeoffline";
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/backup/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */