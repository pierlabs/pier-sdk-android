package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object AttendanceClient
 **/
@ApiModel(description = "Object AttendanceClient")
public class AtendimentoClienteResponse  {
  
  @SerializedName("idAtendimento")
  private Long idAtendimento = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoAtendimento")
  private Long idTipoAtendimento = null;
  @SerializedName("descricaoTipoAtendimento")
  private String descricaoTipoAtendimento = null;
  @SerializedName("conteudoAtendimento")
  private String conteudoAtendimento = null;
  @SerializedName("detalhesAtendimento")
  private String detalhesAtendimento = null;
  @SerializedName("nomeAtendente")
  private String nomeAtendente = null;
  @SerializedName("nomeSistema")
  private String nomeSistema = null;
  @SerializedName("dataHoraInicioAtendimento")
  private String dataHoraInicioAtendimento = null;
  @SerializedName("dataHoraFimAtendimento")
  private String dataHoraFimAtendimento = null;
  @SerializedName("dataAtendimento")
  private String dataAtendimento = null;
  @SerializedName("dataAgendamento")
  private String dataAgendamento = null;
  @SerializedName("dataProcessamento")
  private String dataProcessamento = null;
  @SerializedName("flagProcessamento")
  private Integer flagProcessamento = null;

  
  /**
   * Identification Code of the Attendance (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Attendance (id)")
  public Long getIdAtendimento() {
    return idAtendimento;
  }
  public void setIdAtendimento(Long idAtendimento) {
    this.idAtendimento = idAtendimento;
  }

  
  /**
   * Identification Code of the account which the attendance is associated
   **/
  @ApiModelProperty(value = "Identification Code of the account which the attendance is associated")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the type of attendance (id)
   **/
  @ApiModelProperty(value = "Identification Code of the type of attendance (id)")
  public Long getIdTipoAtendimento() {
    return idTipoAtendimento;
  }
  public void setIdTipoAtendimento(Long idTipoAtendimento) {
    this.idTipoAtendimento = idTipoAtendimento;
  }

  
  /**
   * Show the description of the Type of Attendance
   **/
  @ApiModelProperty(value = "Show the description of the Type of Attendance")
  public String getDescricaoTipoAtendimento() {
    return descricaoTipoAtendimento;
  }
  public void setDescricaoTipoAtendimento(String descricaoTipoAtendimento) {
    this.descricaoTipoAtendimento = descricaoTipoAtendimento;
  }

  
  /**
   * Show the information that were used to retrieve, register or update information related to the Attendance
   **/
  @ApiModelProperty(value = "Show the information that were used to retrieve, register or update information related to the Attendance")
  public String getConteudoAtendimento() {
    return conteudoAtendimento;
  }
  public void setConteudoAtendimento(String conteudoAtendimento) {
    this.conteudoAtendimento = conteudoAtendimento;
  }

  
  /**
   * Show the details launched by the system or by the attendant during the attendance
   **/
  @ApiModelProperty(value = "Show the details launched by the system or by the attendant during the attendance")
  public String getDetalhesAtendimento() {
    return detalhesAtendimento;
  }
  public void setDetalhesAtendimento(String detalhesAtendimento) {
    this.detalhesAtendimento = detalhesAtendimento;
  }

  
  /**
   * Show the name of the Attendant that registered the Attendance
   **/
  @ApiModelProperty(value = "Show the name of the Attendant that registered the Attendance")
  public String getNomeAtendente() {
    return nomeAtendente;
  }
  public void setNomeAtendente(String nomeAtendente) {
    this.nomeAtendente = nomeAtendente;
  }

  
  /**
   * Show the name of the System, Server, Module or Method REST that originated the register of the Attendance
   **/
  @ApiModelProperty(value = "Show the name of the System, Server, Module or Method REST that originated the register of the Attendance")
  public String getNomeSistema() {
    return nomeSistema;
  }
  public void setNomeSistema(String nomeSistema) {
    this.nomeSistema = nomeSistema;
  }

  
  /**
   * Show the date and time which the attendance was begun. Whe it is used, it serves to measure the performance of the attendances
   **/
  @ApiModelProperty(value = "Show the date and time which the attendance was begun. Whe it is used, it serves to measure the performance of the attendances")
  public String getDataHoraInicioAtendimento() {
    return dataHoraInicioAtendimento;
  }
  public void setDataHoraInicioAtendimento(String dataHoraInicioAtendimento) {
    this.dataHoraInicioAtendimento = dataHoraInicioAtendimento;
  }

  
  /**
   * Show the date and time which the attendance was begun. When it is used, it serves to measure the performance of the attendances
   **/
  @ApiModelProperty(value = "Show the date and time which the attendance was begun. When it is used, it serves to measure the performance of the attendances")
  public String getDataHoraFimAtendimento() {
    return dataHoraFimAtendimento;
  }
  public void setDataHoraFimAtendimento(String dataHoraFimAtendimento) {
    this.dataHoraFimAtendimento = dataHoraFimAtendimento;
  }

  
  /**
   * Present the date and time which the attendance was made
   **/
  @ApiModelProperty(value = "Present the date and time which the attendance was made")
  public String getDataAtendimento() {
    return dataAtendimento;
  }
  public void setDataAtendimento(String dataAtendimento) {
    this.dataAtendimento = dataAtendimento;
  }

  
  /**
   * When it is used, according to the type of attendance, show the date and time for the processing or the date to return the Attendance
   **/
  @ApiModelProperty(value = "When it is used, according to the type of attendance, show the date and time for the processing or the date to return the Attendance")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * When it is used, show the date and time which the request registered in the attendance
   **/
  @ApiModelProperty(value = "When it is used, show the date and time which the request registered in the attendance")
  public String getDataProcessamento() {
    return dataProcessamento;
  }
  public void setDataProcessamento(String dataProcessamento) {
    this.dataProcessamento = dataProcessamento;
  }

  
  /**
   * when applicable, according to the indication if the resquest processing has been made
   **/
  @ApiModelProperty(value = "when applicable, according to the indication if the resquest processing has been made")
  public Integer getFlagProcessamento() {
    return flagProcessamento;
  }
  public void setFlagProcessamento(Integer flagProcessamento) {
    this.flagProcessamento = flagProcessamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtendimentoClienteResponse {\n");
    
    sb.append("  idAtendimento: ").append(idAtendimento).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoAtendimento: ").append(idTipoAtendimento).append("\n");
    sb.append("  descricaoTipoAtendimento: ").append(descricaoTipoAtendimento).append("\n");
    sb.append("  conteudoAtendimento: ").append(conteudoAtendimento).append("\n");
    sb.append("  detalhesAtendimento: ").append(detalhesAtendimento).append("\n");
    sb.append("  nomeAtendente: ").append(nomeAtendente).append("\n");
    sb.append("  nomeSistema: ").append(nomeSistema).append("\n");
    sb.append("  dataHoraInicioAtendimento: ").append(dataHoraInicioAtendimento).append("\n");
    sb.append("  dataHoraFimAtendimento: ").append(dataHoraFimAtendimento).append("\n");
    sb.append("  dataAtendimento: ").append(dataAtendimento).append("\n");
    sb.append("  dataAgendamento: ").append(dataAgendamento).append("\n");
    sb.append("  dataProcessamento: ").append(dataProcessamento).append("\n");
    sb.append("  flagProcessamento: ").append(flagProcessamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
