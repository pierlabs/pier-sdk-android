package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa a requisi\u00E7\u00E3o do recurso lista de tipos de boletos
 **/
@ApiModel(description = "Representa a requisi\u00E7\u00E3o do recurso lista de tipos de boletos")
public class AjustePersist  {
  
  @SerializedName("idTipoAjuste")
  private Long idTipoAjuste = null;
  @SerializedName("dataAjuste")
  private String dataAjuste = null;
  @SerializedName("valorAjuste")
  private BigDecimal valorAjuste = null;
  @SerializedName("identificadorExterno")
  private String identificadorExterno = null;
  @SerializedName("idTransacaoOriginal")
  private Long idTransacaoOriginal = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("flagAtendimento")
  private Boolean flagAtendimento = null;
  @SerializedName("mensagemAtendimento")
  private String mensagemAtendimento = null;

  
  /**
   * C\u00F3digo identificador do tipo de ajuste
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo identificador do tipo de ajuste")
  public Long getIdTipoAjuste() {
    return idTipoAjuste;
  }
  public void setIdTipoAjuste(Long idTipoAjuste) {
    this.idTipoAjuste = idTipoAjuste;
  }

  
  /**
   * Data do ajuste no formato yyyy-MM-dd'T'HH:mm:ss.SSSZ
   **/
  @ApiModelProperty(required = true, value = "Data do ajuste no formato yyyy-MM-dd'T'HH:mm:ss.SSSZ")
  public String getDataAjuste() {
    return dataAjuste;
  }
  public void setDataAjuste(String dataAjuste) {
    this.dataAjuste = dataAjuste;
  }

  
  /**
   * Valor do ajuste
   **/
  @ApiModelProperty(required = true, value = "Valor do ajuste")
  public BigDecimal getValorAjuste() {
    return valorAjuste;
  }
  public void setValorAjuste(BigDecimal valorAjuste) {
    this.valorAjuste = valorAjuste;
  }

  
  /**
   * Identificador Externo
   **/
  @ApiModelProperty(value = "Identificador Externo")
  public String getIdentificadorExterno() {
    return identificadorExterno;
  }
  public void setIdentificadorExterno(String identificadorExterno) {
    this.identificadorExterno = identificadorExterno;
  }

  
  /**
   * Identificador da transa\u00E7\u00E3o original (estorno)
   **/
  @ApiModelProperty(value = "Identificador da transa\u00E7\u00E3o original (estorno)")
  public Long getIdTransacaoOriginal() {
    return idTransacaoOriginal;
  }
  public void setIdTransacaoOriginal(Long idTransacaoOriginal) {
    this.idTransacaoOriginal = idTransacaoOriginal;
  }

  
  /**
   * Identificador do estabelecimento quando o pagamento for efetuado em loja
   **/
  @ApiModelProperty(value = "Identificador do estabelecimento quando o pagamento for efetuado em loja")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Flag para lan\u00E7ar o atendimento
   **/
  @ApiModelProperty(value = "Flag para lan\u00E7ar o atendimento")
  public Boolean getFlagAtendimento() {
    return flagAtendimento;
  }
  public void setFlagAtendimento(Boolean flagAtendimento) {
    this.flagAtendimento = flagAtendimento;
  }

  
  /**
   * Mensagem enviada no atendimento
   **/
  @ApiModelProperty(value = "Mensagem enviada no atendimento")
  public String getMensagemAtendimento() {
    return mensagemAtendimento;
  }
  public void setMensagemAtendimento(String mensagemAtendimento) {
    this.mensagemAtendimento = mensagemAtendimento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AjustePersist {\n");
    
    sb.append("  idTipoAjuste: ").append(idTipoAjuste).append("\n");
    sb.append("  dataAjuste: ").append(dataAjuste).append("\n");
    sb.append("  valorAjuste: ").append(valorAjuste).append("\n");
    sb.append("  identificadorExterno: ").append(identificadorExterno).append("\n");
    sb.append("  idTransacaoOriginal: ").append(idTransacaoOriginal).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  flagAtendimento: ").append(flagAtendimento).append("\n");
    sb.append("  mensagemAtendimento: ").append(mensagemAtendimento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
