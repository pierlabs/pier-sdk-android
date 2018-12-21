package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Represents the request of the feature to include issuer integration
 **/
@ApiModel(description = "Represents the request of the feature to include issuer integration")
public class IntegracaoEmissorPropostaPersist  {
  
  @SerializedName("observacao")
  private String observacao = null;
  @SerializedName("idProposta")
  private Long idProposta = null;

  
  /**
   * Registration  Note
   **/
  @ApiModelProperty(value = "Registration  Note")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da proposta externa
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da proposta externa")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegracaoEmissorPropostaPersist {\n");
    
    sb.append("  observacao: ").append(observacao).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
