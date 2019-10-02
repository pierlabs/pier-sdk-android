package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto para altera\u00E7\u00E3o de contas. Nenhum dos campos s\u00E3o obrigat\u00F3rios. Devem ser informados apenas os campos que deseja modificar
 **/
@ApiModel(description = "Objeto para altera\u00E7\u00E3o de contas. Nenhum dos campos s\u00E3o obrigat\u00F3rios. Devem ser informados apenas os campos que deseja modificar")
public class ContaPartialUpdate  {
  
  @SerializedName("funcaoAtiva")
  private String funcaoAtiva = null;
  @SerializedName("idContaEmissor")
  private Long idContaEmissor = null;
  @SerializedName("dataCadastro")
  private String dataCadastro = null;
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("possuiOverLimit")
  private Boolean possuiOverLimit = null;
  @SerializedName("usuarioModificacao")
  private String usuarioModificacao = null;
  @SerializedName("behaviorScore")
  private Integer behaviorScore = null;

  
  /**
   * Fun\u00E7\u00E3o ativa da conta. Representa a fun\u00E7\u00E3o na qual a conta encontra-se habilitada. Propriedade s\u00F3 deve ser informada caso o emissor fa\u00E7a uso de fun\u00E7\u00F5es para contas. As fun\u00E7\u00F5es dispon\u00EDveis para contas podem ser visualizadas em api/contas/tipos-funcoes
   **/
  @ApiModelProperty(value = "Fun\u00E7\u00E3o ativa da conta. Representa a fun\u00E7\u00E3o na qual a conta encontra-se habilitada. Propriedade s\u00F3 deve ser informada caso o emissor fa\u00E7a uso de fun\u00E7\u00F5es para contas. As fun\u00E7\u00F5es dispon\u00EDveis para contas podem ser visualizadas em api/contas/tipos-funcoes")
  public String getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * Identificador da conta de controle interno criado pelo emissor
   **/
  @ApiModelProperty(value = "Identificador da conta de controle interno criado pelo emissor")
  public Long getIdContaEmissor() {
    return idContaEmissor;
  }
  public void setIdContaEmissor(Long idContaEmissor) {
    this.idContaEmissor = idContaEmissor;
  }

  
  /**
   * dataCadastro
   **/
  @ApiModelProperty(value = "dataCadastro")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * valorRenda
   **/
  @ApiModelProperty(value = "valorRenda")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * Sinaliza se o OverLimit da conta est\u00E1 ativo
   **/
  @ApiModelProperty(value = "Sinaliza se o OverLimit da conta est\u00E1 ativo")
  public Boolean getPossuiOverLimit() {
    return possuiOverLimit;
  }
  public void setPossuiOverLimit(Boolean possuiOverLimit) {
    this.possuiOverLimit = possuiOverLimit;
  }

  
  /**
   * usuarioModificacao
   **/
  @ApiModelProperty(value = "usuarioModificacao")
  public String getUsuarioModificacao() {
    return usuarioModificacao;
  }
  public void setUsuarioModificacao(String usuarioModificacao) {
    this.usuarioModificacao = usuarioModificacao;
  }

  
  /**
   * Valor da pontua\u00E7\u00E3o de comportamento (behavior score).
   **/
  @ApiModelProperty(value = "Valor da pontua\u00E7\u00E3o de comportamento (behavior score).")
  public Integer getBehaviorScore() {
    return behaviorScore;
  }
  public void setBehaviorScore(Integer behaviorScore) {
    this.behaviorScore = behaviorScore;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaPartialUpdate {\n");
    
    sb.append("  funcaoAtiva: ").append(funcaoAtiva).append("\n");
    sb.append("  idContaEmissor: ").append(idContaEmissor).append("\n");
    sb.append("  dataCadastro: ").append(dataCadastro).append("\n");
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  possuiOverLimit: ").append(possuiOverLimit).append("\n");
    sb.append("  usuarioModificacao: ").append(usuarioModificacao).append("\n");
    sb.append("  behaviorScore: ").append(behaviorScore).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
