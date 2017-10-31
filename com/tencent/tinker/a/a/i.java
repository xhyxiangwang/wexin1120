package com.tencent.tinker.a.a;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import java.util.zip.Adler32;

public final class i
{
  static final short[] xEl = new short[0];
  public final t xEm = new t();
  public final f xEn = new f((byte)0);
  private final g xEo = new g((byte)0);
  private final h xEp = new h((byte)0);
  private final d xEq = new d((byte)0);
  private final b xEr = new b((byte)0);
  private final c xEs = new c((byte)0);
  private final a xEt = new a((byte)0);
  public ByteBuffer xEu;
  private int xEv = 0;
  private byte[] xEw = null;
  
  public i(int paramInt)
  {
    this.xEu = ByteBuffer.wrap(new byte[paramInt]);
    this.xEu.order(ByteOrder.LITTLE_ENDIAN);
    this.xEm.fileSize = paramInt;
  }
  
  public i(InputStream paramInputStream)
  {
    this.xEu = ByteBuffer.wrap(com.tencent.tinker.a.a.b.d.b(paramInputStream, 0));
    this.xEu.order(ByteOrder.LITTLE_ENDIAN);
    paramInputStream = this.xEm;
    e locale = a(paramInputStream.xEI);
    byte[] arrayOfByte = locale.EI(8);
    int i = j;
    if (arrayOfByte.length == 8)
    {
      i = j;
      if (arrayOfByte[0] == 100)
      {
        i = j;
        if (arrayOfByte[1] == 101)
        {
          i = j;
          if (arrayOfByte[2] == 120)
          {
            i = j;
            if (arrayOfByte[3] == 10)
            {
              if (arrayOfByte[7] == 0) {
                break label263;
              }
              i = j;
            }
          }
        }
      }
    }
    while (i != 13)
    {
      throw new j("Unexpected magic: " + Arrays.toString(arrayOfByte));
      label263:
      String str = (char)arrayOfByte[4] + (char)arrayOfByte[5] + (char)arrayOfByte[6];
      if (str.equals("036"))
      {
        i = 14;
      }
      else
      {
        i = j;
        if (str.equals("035")) {
          i = 13;
        }
      }
    }
    paramInputStream.xFb = locale.xEu.getInt();
    paramInputStream.xEw = locale.EI(20);
    paramInputStream.fileSize = locale.xEu.getInt();
    i = locale.xEu.getInt();
    if (i != 112) {
      throw new j("Unexpected header: 0x" + Integer.toHexString(i));
    }
    i = locale.xEu.getInt();
    if (i != 305419896) {
      throw new j("Unexpected endian tag: 0x" + Integer.toHexString(i));
    }
    paramInputStream.xFc = locale.xEu.getInt();
    paramInputStream.xFd = locale.xEu.getInt();
    paramInputStream.xEP.dpq = locale.xEu.getInt();
    if (paramInputStream.xEP.dpq == 0) {
      throw new j("Cannot merge dex files that do not contain a map");
    }
    paramInputStream.xEJ.size = locale.xEu.getInt();
    paramInputStream.xEJ.dpq = locale.xEu.getInt();
    paramInputStream.xEK.size = locale.xEu.getInt();
    paramInputStream.xEK.dpq = locale.xEu.getInt();
    paramInputStream.xEL.size = locale.xEu.getInt();
    paramInputStream.xEL.dpq = locale.xEu.getInt();
    paramInputStream.xEM.size = locale.xEu.getInt();
    paramInputStream.xEM.dpq = locale.xEu.getInt();
    paramInputStream.xEN.size = locale.xEu.getInt();
    paramInputStream.xEN.dpq = locale.xEu.getInt();
    paramInputStream.xEO.size = locale.xEu.getInt();
    paramInputStream.xEO.dpq = locale.xEu.getInt();
    paramInputStream.xFe = locale.xEu.getInt();
    paramInputStream.xFf = locale.xEu.getInt();
    paramInputStream.a(ED(paramInputStream.xEP.dpq));
    paramInputStream.cnk();
  }
  
  public static void eR(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 >= paramInt2)) {
      throw new IndexOutOfBoundsException("index:" + paramInt1 + ", length=" + paramInt2);
    }
  }
  
  public final e ED(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.xEu.capacity())) {
      throw new IllegalArgumentException("position=" + paramInt + " length=" + this.xEu.capacity());
    }
    ByteBuffer localByteBuffer = this.xEu.duplicate();
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.position(paramInt);
    localByteBuffer.limit(this.xEu.capacity());
    return new e("temp-section", localByteBuffer);
  }
  
  public final int EE(int paramInt)
  {
    eR(paramInt, this.xEm.xEK.size);
    int i = this.xEm.xEK.dpq;
    return this.xEu.getInt(i + paramInt * 4);
  }
  
  public final e a(t.a parama)
  {
    int i = parama.dpq;
    if ((i < 0) || (i >= this.xEu.capacity())) {
      throw new IllegalArgumentException("position=" + i + " length=" + this.xEu.capacity());
    }
    ByteBuffer localByteBuffer = this.xEu.duplicate();
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.position(i);
    localByteBuffer.limit(i + parama.xFi);
    return new e("section", localByteBuffer);
  }
  
  public final void cmL()
  {
    ED(12).write(mQ(true));
    e locale = ED(8);
    Adler32 localAdler32 = new Adler32();
    byte[] arrayOfByte = new byte[' '];
    ByteBuffer localByteBuffer = this.xEu.duplicate();
    localByteBuffer.limit(localByteBuffer.capacity());
    localByteBuffer.position(12);
    while (localByteBuffer.hasRemaining())
    {
      int i = Math.min(8192, localByteBuffer.remaining());
      localByteBuffer.get(arrayOfByte, 0, i);
      localAdler32.update(arrayOfByte, 0, i);
    }
    locale.writeInt((int)localAdler32.getValue());
  }
  
  public final byte[] mQ(boolean paramBoolean)
  {
    if ((this.xEw != null) && (!paramBoolean)) {
      return this.xEw;
    }
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      byte[] arrayOfByte2 = new byte[' '];
      ByteBuffer localByteBuffer = this.xEu.duplicate();
      localByteBuffer.limit(localByteBuffer.capacity());
      localByteBuffer.position(32);
      while (localByteBuffer.hasRemaining())
      {
        int i = Math.min(8192, localByteBuffer.remaining());
        localByteBuffer.get(arrayOfByte2, 0, i);
        localMessageDigest.update(arrayOfByte2, 0, i);
      }
      arrayOfByte1 = localNoSuchAlgorithmException.digest();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new AssertionError();
    }
    byte[] arrayOfByte1;
    this.xEw = arrayOfByte1;
    return arrayOfByte1;
  }
  
  private final class a
    extends AbstractList<f>
    implements RandomAccess
  {
    private a() {}
    
    public final int size()
    {
      return i.this.xEm.xEO.size;
    }
  }
  
  private final class b
    extends AbstractList<n>
    implements RandomAccess
  {
    private b() {}
    
    public final int size()
    {
      return i.this.xEm.xEM.size;
    }
  }
  
  private final class c
    extends AbstractList<p>
    implements RandomAccess
  {
    private c() {}
    
    public final int size()
    {
      return i.this.xEm.xEN.size;
    }
  }
  
  private final class d
    extends AbstractList<r>
    implements RandomAccess
  {
    private d() {}
    
    public final int size()
    {
      return i.this.xEm.xEL.size;
    }
  }
  
  public final class e
    extends com.tencent.tinker.a.a.a.a
  {
    private final String name;
    
    public e(String paramString, ByteBuffer paramByteBuffer)
    {
      super();
      this.name = paramString;
    }
    
    private void a(t.a parama, boolean paramBoolean)
    {
      if (parama.xFh)
      {
        if (!paramBoolean) {
          break label87;
        }
        super.EH(((this.xEu.position() + 3 & 0xFFFFFFFC) - this.xEu.position()) * 1);
        while ((this.xEu.position() & 0x3) != 0) {
          this.xEu.put((byte)0);
        }
        if (this.xEu.position() > this.xFn) {
          this.xFn = this.xEu.position();
        }
      }
      return;
      label87:
      this.xEu.position(this.xEu.position() + 3 & 0xFFFFFFFC);
    }
    
    public final int a(a parama)
    {
      a(i.this.xEm.xEX, true);
      return super.a(parama);
    }
    
    public final int a(b paramb)
    {
      a(i.this.xEm.xES, true);
      return super.a(paramb);
    }
    
    public final int a(c paramc)
    {
      a(i.this.xEm.xER, true);
      return super.a(paramc);
    }
    
    public final int a(d paramd)
    {
      a(i.this.xEm.xEZ, true);
      return super.a(paramd);
    }
    
    public final int a(e parame)
    {
      a(i.this.xEm.xET, true);
      return super.a(parame);
    }
    
    public final int a(f paramf)
    {
      a(i.this.xEm.xEO, true);
      return super.a(paramf);
    }
    
    public final int a(g paramg)
    {
      a(i.this.xEm.xEU, true);
      return super.a(paramg);
    }
    
    public final int a(h paramh)
    {
      a(i.this.xEm.xEW, true);
      return super.a(paramh);
    }
    
    public final int a(k paramk)
    {
      a(i.this.xEm.xEY, true);
      return super.a(paramk);
    }
    
    public final int a(n paramn)
    {
      a(i.this.xEm.xEM, true);
      return super.a(paramn);
    }
    
    public final int a(p paramp)
    {
      a(i.this.xEm.xEN, true);
      return super.a(paramp);
    }
    
    public final int a(r paramr)
    {
      a(i.this.xEm.xEL, true);
      return super.a(paramr);
    }
    
    public final int a(s params)
    {
      a(i.this.xEm.xEV, true);
      return super.a(params);
    }
    
    public final int a(u paramu)
    {
      a(i.this.xEm.xEQ, true);
      return super.a(paramu);
    }
    
    public final s cmM()
    {
      a(i.this.xEm.xEV, false);
      return super.cmM();
    }
    
    public final u cmN()
    {
      a(i.this.xEm.xEQ, false);
      return super.cmN();
    }
    
    public final n cmO()
    {
      a(i.this.xEm.xEM, false);
      return super.cmO();
    }
    
    public final p cmP()
    {
      a(i.this.xEm.xEN, false);
      return super.cmP();
    }
    
    public final r cmQ()
    {
      a(i.this.xEm.xEL, false);
      return super.cmQ();
    }
    
    public final f cmR()
    {
      a(i.this.xEm.xEO, false);
      return super.cmR();
    }
    
    public final g cmS()
    {
      a(i.this.xEm.xEU, false);
      return super.cmS();
    }
    
    public final h cmT()
    {
      a(i.this.xEm.xEW, false);
      return super.cmT();
    }
    
    public final e cmU()
    {
      a(i.this.xEm.xET, false);
      return super.cmU();
    }
    
    public final a cmV()
    {
      a(i.this.xEm.xEX, false);
      return super.cmV();
    }
    
    public final b cmW()
    {
      a(i.this.xEm.xES, false);
      return super.cmW();
    }
    
    public final c cmX()
    {
      a(i.this.xEm.xER, false);
      return super.cmX();
    }
    
    public final d cmY()
    {
      a(i.this.xEm.xEZ, false);
      return super.cmY();
    }
    
    public final k cmZ()
    {
      a(i.this.xEm.xEY, false);
      return super.cmZ();
    }
  }
  
  private final class f
    extends AbstractList<String>
    implements RandomAccess
  {
    private f() {}
    
    public final String qN(int paramInt)
    {
      i.eR(paramInt, i.this.xEm.xEJ.size);
      paramInt = i.this.ED(i.this.xEm.xEJ.dpq + paramInt * 4).xEu.getInt();
      return i.this.ED(paramInt).cmM().value;
    }
    
    public final int size()
    {
      return i.this.xEm.xEJ.size;
    }
  }
  
  private final class g
    extends AbstractList<Integer>
    implements RandomAccess
  {
    private g() {}
    
    public final int size()
    {
      return i.this.xEm.xEK.size;
    }
  }
  
  private final class h
    extends AbstractList<String>
    implements RandomAccess
  {
    private h() {}
    
    public final int size()
    {
      return i.this.xEm.xEK.size;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/tinker/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */