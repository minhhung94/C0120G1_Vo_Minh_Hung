import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class YoutubeService {
  playlist = [
    {id: 'g7wo2lZvTrY', song: 'EM KHÔNG SAI CHÚNG TA SAI - ERIK | CHU DUYÊN'},
    {id: 'n9AcpNUpxfM', song: 'TRÚC XINH - MINH VƯƠNG M4U ft. VIỆT | THẢO PHẠM COVER'},
    {id: 'A-MoF126Fsg', song: 'TÌNH SẦU THIÊN THU MUÔN LỐI - DOÃN HIẾU ft LONGDRAE | THẢO PHẠM COVER'},
    {id: 'PbpfVWMf-FQ', song: 'Đau Vì Yêu (Tỏ tình thời @ OST) - Như Hexi (Official MV)'},
    {id: 'WpYeekQkAdc', song: 'The Black Eyed Peas - Where Is The Love?'}
  ];

  constructor() { }

  find(id: string) {
    return this.playlist.find(item => item.id === id);
  }
}
