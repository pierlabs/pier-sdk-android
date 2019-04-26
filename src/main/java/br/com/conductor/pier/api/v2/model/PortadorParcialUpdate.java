package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de atualiza\u00E7\u00E3o parcial do Portador
 **/
@ApiModel(description = "Objeto de atualiza\u00E7\u00E3o parcial do Portador")
public class PortadorParcialUpdate  {
  
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("observacao")
  private String observacao = null;
  @SerializedName("dataHoraCancelamento")
  private String dataHoraCancelamento = null;
  @SerializedName("parentesco")
  private String parentesco = null;
  @SerializedName("idParentesco")
  private Long idParentesco = null;
  @SerializedName("ativo")
  private Boolean ativo = null;

  
  /**
   * Nome impresso
   **/
  @ApiModelProperty(value = "Nome impresso")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Observa\u00E7\u00F5es do portador
   **/
  @ApiModelProperty(value = "Observa\u00E7\u00F5es do portador")
  public String getObservacao() {
    return observacao;
  }
  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
  /**
   * Data e hora de cancelamento
   **/
  @ApiModelProperty(value = "Data e hora de cancelamento")
  public String getDataHoraCancelamento() {
    return dataHoraCancelamento;
  }
  public void setDataHoraCancelamento(String dataHoraCancelamento) {
    this.dataHoraCancelamento = dataHoraCancelamento;
  }

  
  /**
   * Parentesco do portador
   **/
  @ApiModelProperty(value = "Parentesco do portador")
  public String getParentesco() {
    return parentesco;
  }
  public void setParentesco(String parentesco) {
    this.parentesco = parentesco;
  }

  
  /**
   * C\u00F3digo identificador do parentesco
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do parentesco")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * Flag que indica se o portador est\u00E1 ativo
   **/
  @ApiModelProperty(value = "Flag que indica se o portador est\u00E1 ativo")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortadorParcialUpdate {\n");
    
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  observacao: ").append(observacao).append("\n");
    sb.append("  dataHoraCancelamento: ").append(dataHoraCancelamento).append("\n");
    sb.append("  parentesco: ").append(parentesco).append("\n");
    sb.append("  idParentesco: ").append(idParentesco).append("\n");
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
