package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object POS
 **/
@ApiModel(description = "Object POS")
public class MaquinetaPersist  {
  
  @SerializedName("idTerminal")
  private Long idTerminal = null;
  @SerializedName("idTipoMaquineta")
  private Long idTipoMaquineta = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("dataHoraImplantacao")
  private String dataHoraImplantacao = null;

  
  /**
   * Identification Code of the Terminal (id)
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the Terminal (id)")
  public Long getIdTerminal() {
    return idTerminal;
  }
  public void setIdTerminal(Long idTerminal) {
    this.idTerminal = idTerminal;
  }

  
  /**
   * Identification Code of the POS type (id)
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the POS type (id)")
  public Long getIdTipoMaquineta() {
    return idTipoMaquineta;
  }
  public void setIdTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
  }

  
  /**
   * Value of the POS maintenance
   **/
  @ApiModelProperty(required = true, value = "Value of the POS maintenance")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Deploy date of the POS, Insert in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'
   **/
  @ApiModelProperty(required = true, value = "Deploy date of the POS, Insert in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  public String getDataHoraImplantacao() {
    return dataHoraImplantacao;
  }
  public void setDataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaquinetaPersist {\n");
    
    sb.append("  idTerminal: ").append(idTerminal).append("\n");
    sb.append("  idTipoMaquineta: ").append(idTipoMaquineta).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  dataHoraImplantacao: ").append(dataHoraImplantacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
