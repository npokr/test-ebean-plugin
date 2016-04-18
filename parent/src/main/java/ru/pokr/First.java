package ru.pokr;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class First {
    @Id
    private Long id;
    private String code;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof First)) return false;
        final First other = (First) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$code = this.code;
        final Object other$code = other.code;
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $code = this.code;
        result = result * PRIME + ($code == null ? 0 : $code.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof First;
    }
}
