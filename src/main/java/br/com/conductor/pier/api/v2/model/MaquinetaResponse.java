package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * POS response object
 **/
@ApiModel(description = "POS response object")
public class MaquinetaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idTipoMaquineta")
  private Long idTipoMaquineta = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("dataHoraImplantacao")
  private String dataHoraImplantacao = null;
  @SerializedName("dataHoraCadastramento")
  private String dataHoraCadastramento = null;
  @SerializedName("terminal")
  private String terminal = null;
  @SerializedName("usuarioApl")
  private String usuarioApl = null;

  
  /**
   * Identification Code of the Card Machine
   **/
  @ApiModelProperty(value = "Identification Code of the Card Machine")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Identification Code of the Merchant
   **/
  @ApiModelProperty(value = "Identification Code of the Merchant")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * Identification Code of the Card Machine
   **/
  @ApiModelProperty(value = "Identification Code of the Card Machine")
  public Long getIdTipoMaquineta() {
    return idTipoMaquineta;
  }
  public void setIdTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
  }

  
  /**
   * Maintenance valeu of the card machine
   **/
  @ApiModelProperty(value = "Maintenance valeu of the card machine")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Deployment date of the card machine
   **/
  @ApiModelProperty(value = "Deployment date of the card machine")
  public String getDataHoraImplantacao() {
    return dataHoraImplantacao;
  }
  public void setDataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
  }

  
  /**
   * Registerment date of the Card Machine
   **/
  @ApiModelProperty(value = "Registerment date of the Card Machine")
  public String getDataHoraCadastramento() {
    return dataHoraCadastramento;
  }
  public void setDataHoraCadastramento(String dataHoraCadastramento) {
    this.dataHoraCadastramento = dataHoraCadastramento;
  }

  
  /**
   * Terminal number linked to the card machine
   **/
  @ApiModelProperty(value = "Terminal number linked to the card machine")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * User of the application
   **/
  @ApiModelProperty(value = "User of the application")
  public String getUsuarioApl() {
    return usuarioApl;
  }
  public void setUsuarioApl(String usuarioApl) {
    this.usuarioApl = usuarioApl;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaquinetaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idTipoMaquineta: ").append(idTipoMaquineta).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  dataHoraImplantacao: ").append(dataHoraImplantacao).append("\n");
    sb.append("  dataHoraCadastramento: ").append(dataHoraCadastramento).append("\n");
    sb.append("  terminal: ").append(terminal).append("\n");
    sb.append("  usuarioApl: ").append(usuarioApl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
