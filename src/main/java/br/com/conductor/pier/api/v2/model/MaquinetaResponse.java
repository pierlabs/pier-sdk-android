package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de Resposta de Maquineta
 **/
@ApiModel(description = "Objeto de Resposta de Maquineta")
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
   * C\u00F3digo de Identifica\u00E7\u00E3o da Maquineta
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o da Maquineta")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do EStabelecimento
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do EStabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Tipo Maquineta
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Tipo Maquineta")
  public Long getIdTipoMaquineta() {
    return idTipoMaquineta;
  }
  public void setIdTipoMaquineta(Long idTipoMaquineta) {
    this.idTipoMaquineta = idTipoMaquineta;
  }

  
  /**
   * Valor de manuten\u00E7\u00E3o da Maquineta
   **/
  @ApiModelProperty(value = "Valor de manuten\u00E7\u00E3o da Maquineta")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Data de implanta\u00E7\u00E3o da Maquineta
   **/
  @ApiModelProperty(value = "Data de implanta\u00E7\u00E3o da Maquineta")
  public String getDataHoraImplantacao() {
    return dataHoraImplantacao;
  }
  public void setDataHoraImplantacao(String dataHoraImplantacao) {
    this.dataHoraImplantacao = dataHoraImplantacao;
  }

  
  /**
   * Data de cadastramento da Maquineta
   **/
  @ApiModelProperty(value = "Data de cadastramento da Maquineta")
  public String getDataHoraCadastramento() {
    return dataHoraCadastramento;
  }
  public void setDataHoraCadastramento(String dataHoraCadastramento) {
    this.dataHoraCadastramento = dataHoraCadastramento;
  }

  
  /**
   * N\u00FAmero do terminal vinculado a Maquineta
   **/
  @ApiModelProperty(value = "N\u00FAmero do terminal vinculado a Maquineta")
  public String getTerminal() {
    return terminal;
  }
  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }

  
  /**
   * Usu\u00E1rio da aplica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Usu\u00E1rio da aplica\u00E7\u00E3o")
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
