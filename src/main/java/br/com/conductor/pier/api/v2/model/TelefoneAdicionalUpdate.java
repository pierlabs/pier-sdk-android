package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto Telefone
 **/
@ApiModel(description = "Objeto Telefone")
public class TelefoneAdicionalUpdate  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoTelefone")
  private Long idTipoTelefone = null;
  @SerializedName("ddd")
  private String ddd = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("ramal")
  private String ramal = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Telefone.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Telefone.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Telefone.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Tipo do Telefone.")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * C\u00C3\u00B3digo DDD do telefone.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo DDD do telefone.")
  public String getDdd() {
    return ddd;
  }
  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  
  /**
   * N\u00C3\u00BAmero do telefone.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do telefone.")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * N\u00C3\u00BAmero do ramal.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do ramal.")
  public String getRamal() {
    return ramal;
  }
  public void setRamal(String ramal) {
    this.ramal = ramal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelefoneAdicionalUpdate {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoTelefone: ").append(idTipoTelefone).append("\n");
    sb.append("  ddd: ").append(ddd).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  ramal: ").append(ramal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

