package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Parametros de requisi\u00C3\u00A7\u00C3\u00A3o da gera\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o embossing
 **/
@ApiModel(description = "Parametros de requisi\u00C3\u00A7\u00C3\u00A3o da gera\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o embossing")
public class CartaoEmbossingRequest  {
  
  @SerializedName("id_pessoa")
  private Long idPessoa = null;
  @SerializedName("id_tipo_plastico")
  private Long idTipoPlastico = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do TipoPlastico (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do TipoPlastico (id).")
  public Long getIdTipoPlastico() {
    return idTipoPlastico;
  }
  public void setIdTipoPlastico(Long idTipoPlastico) {
    this.idTipoPlastico = idTipoPlastico;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoEmbossingRequest {\n");
    
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idTipoPlastico: ").append(idTipoPlastico).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


