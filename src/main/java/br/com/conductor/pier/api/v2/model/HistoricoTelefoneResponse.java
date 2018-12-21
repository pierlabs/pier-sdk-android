package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object response for the telephone historic
 **/
@ApiModel(description = "Object response for the telephone historic")
public class HistoricoTelefoneResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("telefone")
  private String telefone = null;
  @SerializedName("idTipoTelefone")
  private Long idTipoTelefone = null;
  @SerializedName("tipoTelefone")
  private String tipoTelefone = null;
  @SerializedName("dataModificacao")
  private String dataModificacao = null;

  
  /**
   * Identification Code of the Telephone (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Telephone (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Show the telephone number
   **/
  @ApiModelProperty(value = "Show the telephone number")
  public String getTelefone() {
    return telefone;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  
  /**
   * Show the id type of the telephone
   **/
  @ApiModelProperty(value = "Show the id type of the telephone")
  public Long getIdTipoTelefone() {
    return idTipoTelefone;
  }
  public void setIdTipoTelefone(Long idTipoTelefone) {
    this.idTipoTelefone = idTipoTelefone;
  }

  
  /**
   * Show the description of the telephone type
   **/
  @ApiModelProperty(value = "Show the description of the telephone type")
  public String getTipoTelefone() {
    return tipoTelefone;
  }
  public void setTipoTelefone(String tipoTelefone) {
    this.tipoTelefone = tipoTelefone;
  }

  
  /**
   * Show the date which the telephone was updated
   **/
  @ApiModelProperty(value = "Show the date which the telephone was updated")
  public String getDataModificacao() {
    return dataModificacao;
  }
  public void setDataModificacao(String dataModificacao) {
    this.dataModificacao = dataModificacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricoTelefoneResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  telefone: ").append(telefone).append("\n");
    sb.append("  idTipoTelefone: ").append(idTipoTelefone).append("\n");
    sb.append("  tipoTelefone: ").append(tipoTelefone).append("\n");
    sb.append("  dataModificacao: ").append(dataModificacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
